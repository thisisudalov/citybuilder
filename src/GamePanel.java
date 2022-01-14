import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    private final Thread gameThread;
    private final Timer moneyGivingTimer;
    private static final GameField GAME_FIELD = GameField.getInstance();
    private static final GraphicsWithDelta GRAPHICS_WITH_DELTA = new GraphicsWithDelta();
    private final PlayerMoney playerMoney;
    private static GamePanel instance;

    private GamePanel() {
        this.setPreferredSize(Constants.DIMENSION);
        this.setFocusable(true);
        this.addKeyListener(new KeyboardListener());
        this.addMouseListener(new MouseListener());

        playerMoney = PlayerMoney.getInstance();
        moneyGivingTimer = new Timer(1000, new MoneyGivingListener());
        moneyGivingTimer.start();
        gameThread = new Thread(this, "Game Thread");
        gameThread.start();
    }

    public static GamePanel getInstance() {
        if (instance == null) {
            instance = new GamePanel();
        }

        return instance;
    }

    public void paint(Graphics g) {
        draw(g);
    }

    public void draw(Graphics g) {
        g.drawRect(Constants.DIMENSION.width / 2, Constants.DIMENSION.height / 2, 0, 0);
        updateGraphicsDelta(g);
        GAME_FIELD.draw(GRAPHICS_WITH_DELTA);
        playerMoney.draw(g);
    }

    private void update() {

    }

    public void drawExceptionPanel(String msg, Point point) {
        ExceptionPanelDrawer.draw(msg, getGraphics(), point);
    }

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while (true) {
            sleep();
            update();
            repaint();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED");
        }
    }

    private void updateGraphicsDelta(Graphics g) {
        GRAPHICS_WITH_DELTA.setGraphics(g);
        GRAPHICS_WITH_DELTA.setDeltaX(CameraPosition.getDeltaX());
        GRAPHICS_WITH_DELTA.setDeltaY(CameraPosition.getDeltaY());
    }

}


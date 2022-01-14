import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter {

    private final GameField gameField = GameField.getInstance();;

    @Override
    public void mouseClicked(MouseEvent event) {
        super.mouseClicked(event);
        try {
            gameField.putNewUnit(ObjectCreatorUtil.createNewHouse(event.getX(), event.getY()));
        } catch (CollisionException exception) {
            GamePanel.getInstance().drawExceptionPanel("Objects cannot collide", event.getPoint());
        }

    }
}

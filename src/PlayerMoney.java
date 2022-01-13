import java.awt.*;

public class PlayerMoney {

    private static PlayerMoney instance;

    public static PlayerMoney getInstance() {
        if (instance == null) {
            instance = new PlayerMoney();
        }
        return instance;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void increaseValue(int amount) {
        value += amount;
    }

    public void draw(Graphics g) {
        g.drawString(String.valueOf(value), 100, 100);
    }
}

import java.awt.*;

public class ExceptionPanelDrawer {

    public static void draw(String msg, Graphics g, Point point) {
        var prevColor = g.getColor();
        g.setColor(Color.RED);
        g.drawString(msg, point.x, point.y);
        g.setColor(prevColor);
    }
}

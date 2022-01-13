import java.awt.*;

public class GraphicsWithDelta {

    private Graphics graphics;
    private int deltaX;
    private int deltaY;

    public GraphicsWithDelta() {
        this.deltaX = 0;
        this.deltaY = 0;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }
}

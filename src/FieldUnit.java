import java.awt.*;

public abstract class FieldUnit {

    private int xCoord;
    private int yCoord;
    private boolean isTransparent = true;

    public FieldUnit(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    protected FieldUnit(int xCoord, int yCoord, boolean isTransparent) {
        this(xCoord, yCoord);
        this.isTransparent = isTransparent;
    }

    public abstract Dimension getDimension();

    public void draw(GraphicsWithDelta graphicsWithDelta) {
        DrawingUtil.drawFieldUnit(graphicsWithDelta, this);
    }

    public boolean isTransparent() {
        return isTransparent;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

}

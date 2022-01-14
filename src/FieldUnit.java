import java.awt.*;

public abstract class FieldUnit {

    private int xCoord;
    private int yCoord;

    public FieldUnit(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public abstract boolean isDefaultView();

    public abstract Rectangle getForm();

    public void draw(GraphicsWithDelta graphicsWithDelta) {
        DrawingUtil.drawFieldUnit(graphicsWithDelta, this);
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

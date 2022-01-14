import java.awt.*;

public class Road extends FieldUnit{

    private static final Rectangle ROAD_DIMENSION = new Rectangle(50, 200);

    private boolean isHorizontal;

    public Road(int xCoord, int yCoord) {
        super(xCoord, yCoord);
    }

    public void setHorizontal(boolean horizontal) {
        isHorizontal = horizontal;
    }

    @Override
    public boolean isDefaultView() {
        return isHorizontal;
    }

    @Override
    public Rectangle getForm() {
        return ROAD_DIMENSION;
    }
}

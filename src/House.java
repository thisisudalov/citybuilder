import java.awt.*;

public class House extends FieldUnit {

    private Rectangle form;

    public House(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        form = new Rectangle(xCoord, yCoord, Constants.UNIT_SIDE_SIZE, Constants.UNIT_SIDE_SIZE);
    }

    @Override
    public boolean isDefaultView() {
        return false;
    }

    @Override
    public Rectangle getForm() {
        return form;
    }
}

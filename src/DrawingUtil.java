public class DrawingUtil {

    public static void drawFieldUnit(GraphicsWithDelta graphicsWithDelta, FieldUnit fieldUnit) {
        var g = graphicsWithDelta.getGraphics();
        var deltaX = graphicsWithDelta.getDeltaX();
        var deltaY = graphicsWithDelta.getDeltaY();

        g.drawRect(fieldUnit.getxCoord() + deltaX, fieldUnit.getyCoord() + deltaY,
                fieldUnit.getDimension().width, fieldUnit.getDimension().height);
    }

    public static void drawField(GraphicsWithDelta graphicsWithDelta) {
        var g = graphicsWithDelta.getGraphics();
        var deltaX = graphicsWithDelta.getDeltaX();
        var deltaY = graphicsWithDelta.getDeltaY();

        g.drawRect(deltaX, deltaY, Constants.DIMENSION.width, Constants.DIMENSION.height);
    }
}

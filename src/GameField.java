import java.util.HashSet;
import java.util.Set;

public class GameField {

    private final Set<FieldUnit> state = new HashSet<>();

    public void draw(GraphicsWithDelta graphicsWithDelta) {
        DrawingUtil.drawField(graphicsWithDelta);
        drawState(graphicsWithDelta);
    }

    private void drawState(GraphicsWithDelta graphicsWithDelta) {
        state.forEach(fieldUnit -> fieldUnit.draw(graphicsWithDelta));
    }

    public void putNewUnit(FieldUnit fieldUnit) {

    }
}

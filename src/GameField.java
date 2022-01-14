import java.util.HashSet;
import java.util.Set;

public class GameField {

    private GameField() {}

    private static GameField instance;

    public static GameField getInstance() {
        if (instance == null) {
            instance = new GameField();
        }

        return instance;
    }

    private final Set<FieldUnit> state = new HashSet<>();

    public void draw(GraphicsWithDelta graphicsWithDelta) {
        DrawingUtil.drawField(graphicsWithDelta);
        drawState(graphicsWithDelta);
    }

    private void drawState(GraphicsWithDelta graphicsWithDelta) {
        state.forEach(fieldUnit -> fieldUnit.draw(graphicsWithDelta));
    }

    public void putNewUnit(FieldUnit fieldUnit) {
        state.forEach(existingUnit -> {
                if (existingUnit.getForm().intersects(fieldUnit.getForm())) {
                    throw new CollisionException("Objects must not intersect");
                }
        });
        state.add(fieldUnit);
    }
}

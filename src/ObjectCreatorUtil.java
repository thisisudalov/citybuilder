public class ObjectCreatorUtil {

    public static FieldUnit createNewHouse(int x, int y) {
        return new House(x - CameraPosition.getDeltaX(), y - CameraPosition.getDeltaY());
    }

}

public class CameraPosition {

    private static int deltaX;
    private static int deltaY;

    public static int getDeltaX() {
        return deltaX;
    }

    public static int getDeltaY() {
        return deltaY;
    }

    public static void goRight() {
        deltaX -= 10;
    }

    public static void goLeft() {
        deltaX += 10;
    }

    public static void goTop() {
        deltaY += 10;
    }

    public static void goBot() {
        deltaY -= 10;
    }

}

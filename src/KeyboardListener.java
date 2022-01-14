import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class KeyboardListener extends KeyAdapter {

    private Map<Integer, Boolean> keysToIsPressed = new HashMap<>();

    public void keyPressed(KeyEvent e) {
        keysToIsPressed.put(e.getKeyCode(), true);
        update();
    }

    public void keyReleased(KeyEvent e) {
        keysToIsPressed.put(e.getKeyCode(), false);
        update();
    }

    public void update() {
        if (keysToIsPressed.get(KeyEvent.VK_UP)) {
            CameraPosition.goTop();
        }

        if (keysToIsPressed.get(KeyEvent.VK_DOWN)) {
            CameraPosition.goBot();
        }

        if (keysToIsPressed.get(KeyEvent.VK_LEFT)) {
            CameraPosition.goLeft();
        }

        if (keysToIsPressed.get(KeyEvent.VK_RIGHT)) {
            CameraPosition.goRight();
        }
    }
}

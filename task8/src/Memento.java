import java.util.ArrayList;
import java.util.List;

public class Memento {
    private final String content;
    private final int windowX;
    private final int windowY;

    public Memento(String content, int windowX, int windowY) {
        this.content = content;
        this.windowX = windowX;
        this.windowY = windowY;
    }

    public String getContent() {
        return content;
    }

    public int getWindowX() {
        return windowX;
    }

    public int getWindowY() {
        return windowY;
    }
}

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private StringBuffer content;
    private int windowX, windowY;

    public TextEditor() {
        content = new StringBuffer();
    }

    public void type(String text) {
        content.append(text);
        System.out.println("Typed: " + text);
    }

    public void setWindowPosition(int x, int y) {
        this.windowX = x;
        this.windowY = y;
        System.out.println("Window position set to: (" + x + ", " + y + ")");
    }

    public Memento save() {
        return new Memento(content.toString(), windowX, windowY);
    }

    public void restore(Memento memento) {
        this.content = new StringBuffer(memento.getContent());
        this.windowX = memento.getWindowX();
        this.windowY = memento.getWindowY();
        System.out.println("Restored to: " + memento.getContent());
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "content=" + content +
                ", windowX=" + windowX +
                ", windowY=" + windowY +
                '}';
    }
}

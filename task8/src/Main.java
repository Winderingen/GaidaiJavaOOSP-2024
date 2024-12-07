import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Первое состояние
        editor.type("Hello, ");
        editor.setWindowPosition(100, 200);
        caretaker.addMemento(editor.save());

        // Второе состояние
        editor.type("World!");
        editor.setWindowPosition(150, 250);
        caretaker.addMemento(editor.save());

        // Состояние после изменений
        System.out.println("Current state: " + editor);

        // Восстановление первого состояния
        editor.restore(caretaker.getMemento(0));
        System.out.println("After restoring first state: " + editor);

        // Восстановление второго состояния
        editor.restore(caretaker.getMemento(1));
        System.out.println("After restoring second state: " + editor);
    }
}
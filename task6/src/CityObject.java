public abstract class CityObject {
    // Шаблонный метод для отрисовки
    public final void draw() {
        prepareDrawing();
        actualDrawing();
        finalizeDrawing();
    }

    // Этапы отрисовки
    protected void prepareDrawing() {
        System.out.println("Подготовка к отрисовке " + getObjectName());
    }

    protected abstract void actualDrawing();

    protected void finalizeDrawing() {
        System.out.println("Завершение отрисовки " + getObjectName());
    }

    protected abstract String getObjectName(); // Имя объекта
}

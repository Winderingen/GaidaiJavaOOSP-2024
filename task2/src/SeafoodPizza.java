public class SeafoodPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Подготавливаем морскую пиццу...");
    }

    @Override
    public void bake() {
        System.out.println("Выпекаем морскую пиццу...");
    }

    @Override
    public void cut() {
        System.out.println("Режем морскую пиццу...");
    }

    @Override
    public void box() {
        System.out.println("Упаковываем мясную пиццу...");
    }
}

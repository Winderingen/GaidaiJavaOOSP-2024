public class MeatPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Подготавливаем мясную пиццу...");
    }

    @Override
    public void bake() {
        System.out.println("Выпекаем мясную пиццу...");
    }

    @Override
    public void cut() {
        System.out.println("Режем мясную пиццу...");
    }

    @Override
    public void box() {
        System.out.println("Упаковываем мясную пиццу...");
    }
}

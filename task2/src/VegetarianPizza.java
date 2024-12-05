public class VegetarianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Подготавливаем вегитарианскую пиццу...");
    }

    @Override
    public void bake() {
        System.out.println("Выпекаем вегитарианскую пиццу...");
    }

    @Override
    public void cut() {
        System.out.println("Режем вегитарианскую пиццу...");
    }

    @Override
    public void box() {
        System.out.println("Упаковываем вегитарианскую пиццу...");
    }
}

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new SimplePizzaStore();

        // Заказ мясовой пиццы
        Pizza meatPizza = pizzaStore.createPizza("Мясная");
        if (meatPizza != null) {
            meatPizza.prepare();
            meatPizza.bake();
            meatPizza.cut();
            meatPizza.box();
        }

        System.out.println();

        // Заказ вегетарианской пиццы
        Pizza vegetarianPizza = pizzaStore.createPizza("Вегитарианская");
        if (vegetarianPizza != null) {
            vegetarianPizza.prepare();
            vegetarianPizza.bake();
            vegetarianPizza.cut();
            vegetarianPizza.box();
        }

        System.out.println();

        // Заказ морской пиццы
        Pizza seafoodPizza = pizzaStore.createPizza("Морская");
        if (seafoodPizza != null) {
            seafoodPizza.prepare();
            seafoodPizza.bake();
            seafoodPizza.cut();
            seafoodPizza.box();
        }
    }
}
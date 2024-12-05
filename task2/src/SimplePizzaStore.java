import java.util.Scanner;

public class SimplePizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        System.out.println("Какую пиццу вы желатете?");
        Scanner PizzaType = new Scanner(System.in);

        switch (PizzaType.next()) {
            case "Мясная":
                return new MeatPizza();
            case "Вегитарианская":
                return new VegetarianPizza();
            case "Морская":
                return new SeafoodPizza();
            default:
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CityObject[] cityObjects = {
                new House(),
                new Road(),
                new Shop(),
                new House(),
                new Road(),
                new Shop()
        };

        for (CityObject cityObject : cityObjects) {
            cityObject.draw();
            System.out.println(); // Пустая строка для разделения вывода
        }
    }
}
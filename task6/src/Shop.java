public class Shop extends CityObject{
    @Override
    protected void actualDrawing() {
        System.out.println("Отрисовка магазина");
    }

    @Override
    protected String getObjectName() {
        return "Магазина";
    }
}

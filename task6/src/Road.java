public class Road extends CityObject{
    @Override
    protected void actualDrawing() {
        System.out.println("Отрисовка дороги");
    }

    @Override
    protected String getObjectName() {
        return "Дорога";
    }
}

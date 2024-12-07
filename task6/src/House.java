public class House extends CityObject{
    @Override
    protected void actualDrawing() {
        System.out.println("Отрисовка дома");
    }

    @Override
    protected String getObjectName() {
        return "Дома";
    }
}

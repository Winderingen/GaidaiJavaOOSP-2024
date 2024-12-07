import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WorldGenerator generator = new WorldGenerator();

        // Генерация нескольких карт
        for (int i = 0; i < 5; i++) {
            WorldMap map = generator.generateMap();
            System.out.println("Generated: " + map);
        }

        // Клонирование одной из сгенерированных карт
        WorldMap originalMap = generator.getGeneratedMaps().get(0);
        WorldMap clonedMap = generator.cloneMap(originalMap);

        // Вывод информации о клонированной карте
        System.out.println("Cloned: " + clonedMap);
    }
}
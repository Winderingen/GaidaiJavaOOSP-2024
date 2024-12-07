import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorldGenerator {
    private List<WorldMap> generatedMaps = new ArrayList<>();
    private Random random = new Random();

    public WorldMap generateMap() {
        // Генерация случайных параметров карты
        String[] terrains = {"Desert", "Forest", "Mountain", "Plains"};
        String terrain = terrains[random.nextInt(terrains.length)];
        int width = 10 + random.nextInt(20); // Ширина от 10 до 29
        int height = 10 + random.nextInt(20); // Высота от 10 до 29

        // Создание новой карты
        ConcreteWorldMap newMap = new ConcreteWorldMap(terrain, width, height);
        generatedMaps.add(newMap);
        return newMap;
    }

    public WorldMap cloneMap(WorldMap mapToClone) {
        return mapToClone.clone();
    }

    public List<WorldMap> getGeneratedMaps() {
        return generatedMaps;
    }
}

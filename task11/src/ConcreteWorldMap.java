import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcreteWorldMap extends WorldMap {
    public ConcreteWorldMap(String terrain, int width, int height) {
        this.terrain = terrain;
        this.width = width;
        this.height = height;
    }

    @Override
    public WorldMap clone() {
        return new ConcreteWorldMap(this.terrain, this.width, this.height);
    }
}

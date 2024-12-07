import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class WorldMap {
    protected String terrain;
    protected int width;
    protected int height;

    public abstract WorldMap clone();

    @Override
    public String toString() {
        return "WorldMap{" +
                "terrain='" + terrain + "'" +
        ", width=" + width +
                ", height=" + height +
                '}';
    }
}

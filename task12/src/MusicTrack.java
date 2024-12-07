import java.util.ArrayList;
import java.util.List;

public class MusicTrack extends MusicComponent {
    private String name;

    public MusicTrack(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Track: " + name);
    }
}

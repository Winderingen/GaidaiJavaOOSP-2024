import java.util.ArrayList;
import java.util.List;

public class MusicAlbum extends MusicComponent {
    private List<MusicComponent> components = new ArrayList<>();
    private String name;

    public MusicAlbum(String name) {
        this.name = name;
    }

    @Override
    public void add(MusicComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MusicComponent component) {
        components.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Album: " + name);
        for (MusicComponent component : components) {
            component.display();
        }
    }
}
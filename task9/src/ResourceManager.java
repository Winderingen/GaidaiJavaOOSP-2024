import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.HashMap;

public class ResourceManager {
    private static ResourceManager instance;
    private HashMap<String, BufferedImage> imageCache;
    private HashMap<String, Font> fontCache;
    private HashMap<String, Clip> soundCache;

    private ResourceManager() {
        imageCache = new HashMap<>();
        fontCache = new HashMap<>();
        soundCache = new HashMap<>();
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public BufferedImage loadImage(String path) throws IOException {
        if (imageCache.containsKey(path)) {
            return imageCache.get(path);
        }
        BufferedImage image = ImageIO.read(new File(path));
        imageCache.put(path, image);
        return image;
    }

    public Font loadFont(String path, float size) throws FontFormatException, IOException {
        if (fontCache.containsKey(path)) {
            return fontCache.get(path).deriveFont(size);
        }
        Font font = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(size);
        fontCache.put(path, font);
        return font;
    }

    public Clip loadSound(String path) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (soundCache.containsKey(path)) {
            return soundCache.get(path);
        }
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(path));
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        soundCache.put(path, clip);
        return clip;
    }
}
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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

public class Main {
    public static void main(String[] args) {
        try {
            ResourceManager resourceManager = ResourceManager.getInstance();

            // Загрузка изображения
            BufferedImage image = resourceManager.loadImage("path/to/image.png");

            // Загрузка шрифта
            Font font = resourceManager.loadFont("path/to/font.ttf", 24f);

            // Загрузка звука
            Clip sound = resourceManager.loadSound("path/to/sound.wav");
            sound.start();

            // Здесь можно добавить код для отрисовки изображения и работы с шрифтом

        } catch (IOException | FontFormatException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
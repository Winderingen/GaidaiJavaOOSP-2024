import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем треки
        MusicTrack track1 = new MusicTrack("Track 1");
        MusicTrack track2 = new MusicTrack("Track 2");
        MusicTrack track3 = new MusicTrack("Track 3");

        // Создаем альбом
        MusicAlbum album1 = new MusicAlbum("Album 1");
        album1.add(track1);
        album1.add(track2);

        // Создаем плейлист
        MusicAlbum playlist = new MusicAlbum("My Playlist");
        playlist.add(album1);
        playlist.add(track3);

        // Отображаем информацию о плейлисте
        playlist.display();
    }
}
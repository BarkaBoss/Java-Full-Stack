package generics;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<String> getAllSongs(){
        List<String> songs = new ArrayList<>();
        songs.add("King Kunta");
        songs.add("Humble");
        songs.add("DNA");
        return songs;
    }

    public static List<Song> getSongsList(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("King Kunta", "Kendrick Lamar", 232));
        songs.add(new Song("Humble", "Kendrick Lamar", 262));
        songs.add(new Song("DNA", "Kendrick Lamar", 192));
        return songs;
    }
}

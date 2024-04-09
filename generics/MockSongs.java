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
}

package generics;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go(){
        List<String> songList = MockSongs.getAllSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}

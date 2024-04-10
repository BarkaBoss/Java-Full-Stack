package generics;

import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }

    public void go(){
        List<Song> songList = MockSongs.getSongsList();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println("Comparable: "+songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println("Comparator: "+songList);
    }
}

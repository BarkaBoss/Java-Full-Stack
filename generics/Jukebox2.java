package generics;

import java.util.Collections;
import java.util.Comparator;
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

        songList.sort(new Comparator<Song>() {
            @Override
            public int compare(Song one, Song two) {
                return one.getArtist().compareTo(two.getArtist());
            }
        });

        // Using Lambdas
        songList.sort((one, two)-> one.getTitle().compareTo(two.getTitle()));

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println("Comparator: "+songList);
    }
}

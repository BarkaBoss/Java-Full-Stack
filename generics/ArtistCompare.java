package generics;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(Song one, Song two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}

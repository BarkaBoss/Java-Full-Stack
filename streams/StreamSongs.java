package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSongs {
    public static void main(String[] args) {
        Songs songs =  new Songs();
        List<Song> songList = songs.getSongs();
        Stream<Song> songStream= songList.stream().filter(song ->{
            return song.getGenre().contains("Country");
        });

        List<Song> songList1 = songStream.toList();
        for (Song song : songList1){
            System.out.println(song);
        }

        List<Song> songList2 = songs.getSongs().stream()
                .filter(song -> {
                    return song.getTimesPlayed() > 80;
                })
                .toList();

        for (Song song : songList2){
            System.out.println(song);
        }
    }
}

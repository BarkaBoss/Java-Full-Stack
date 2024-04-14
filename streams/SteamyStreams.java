package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamyStreams {

    public static void main(String[] args) {
        List<String> donutList = List.of("Milk", "Eggs", "Lele", "Flour", "Oil");
        Stream<String> stream = donutList.stream().limit(4);
        stream.toList().forEach(System.out::println);
//        List<String> list = stream.toList();
//
//        for(String item : list){
//            System.out.println(item);
//        }
    }
}

package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamyStreams {

    public static void main(String[] args) {
        List<String> donutList = List.of("Milk", "Eggs", "Lele", "Flour", "Oil");
        Stream<String> stream = donutList.stream();
        stream
                .sorted(String::compareToIgnoreCase)
                .skip(2).toList().forEach(System.out::println);


        //Array Streams
        int[] arr = new int[6];
        arr[0] = 56;
        arr[1] = 8;
        arr[2] = 4;
        arr[3] = 3;
        arr[4] = 3;
        arr[5] = 3;
        Arrays.stream(arr).distinct().forEach(System.out::println);
        int[] ages = {5, 9, 3, 8, 2, 1};
        Arrays.stream(ages).skip(2).sorted().forEach(System.out::println);
//        List<String> list = stream.toList();
//
//        for(String item : list){
//            System.out.println(item);
//        }
    }
}

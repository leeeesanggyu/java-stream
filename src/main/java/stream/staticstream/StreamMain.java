package stream.staticstream;

import java.util.List;

import static stream.staticstream.Stream.filter;
import static stream.staticstream.Stream.map;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(filter(numbers, n -> n % 2 == 0));

        List<String> strings = List.of("banana", "apple", "kiwi", "corn", "cute");
        System.out.println(filter(strings, s -> s.contains("a")));
        System.out.println(map(strings, s -> s.toUpperCase()));
        System.out.println(map(strings, s -> s.length()));
    }
}

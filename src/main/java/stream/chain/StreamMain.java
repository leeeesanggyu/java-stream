package stream.chain;

import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<String> strings = List.of("banana", "apple", "kiwi", "corn", "cute", "a");
        Stream.of(strings)
                .filter(string -> string.length() > 1)
                .map(String::length)
                .forEach(System.out::print);
    }
}

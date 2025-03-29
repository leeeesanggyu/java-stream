package stream.chain;

import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<String> strings = List.of("banana", "apple", "kiwi", "corn", "cute", "a");
        List<Integer> list = Stream.of(strings)
                .filter(string -> string.length() > 1)
                .map(string -> string.length())
                .toList();

        System.out.println(list);
    }
}

package stream.chain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream <T> {

    private List<T> elements;

    private Stream(List<T> elements) {
        this.elements = elements;
    }

    public static <T> Stream<T> of(List<T> elements) {
        return new Stream<>(elements);
    }

    public List<T> toList() {
        return elements;
    }

    public Stream<T> filter(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : elements) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return Stream.of(result);
    }

    public <R> Stream<R> map(Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : elements) {
            result.add(function.apply(element));
        }

        return Stream.of(result);
    }

    public void forEach(Consumer<T> consumer) {
        for (T element : elements) {
            consumer.accept(element);
        }
    }
}

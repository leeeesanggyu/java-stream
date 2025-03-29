package stream.staticstream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream {
    public static <T> List<T> filter(List<T> values, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T number : values) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }

    public static <T, R> List<R> map(List<T> values, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();

        for (T value : values) {
            result.add(mapper.apply(value));
        }

        return result;
    }
}

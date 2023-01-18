package smallerstuff;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {
        List<Integer> oldWay = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        List<Integer> newWay = Stream.of(1, 2, 3, 4, 5).toList();
        Set<Integer> integerSet = new HashSet<>(newWay);
    }
}

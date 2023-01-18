package patternmatching;

import java.time.*;

public class ExamplePatternMatching {
    public static void main(String[] args) {
        oldWay(LocalDate.now());
        oldWay(LocalDateTime.now());
        newWay(LocalDate.now());
        newWay(LocalDateTime.now());

    }
    public static void oldWay(Object o) {
        if (o instanceof LocalDate) {
            // Redundant casting
            LocalDate date = (LocalDate)o;
            System.out.println(date);
        }
        else if (o instanceof LocalDateTime) {
            // Redundant casting
            LocalDateTime date = (LocalDateTime)o;
            System.out.println(date);
        }
    }

    public static void newWay(Object o) {
        if (o instanceof LocalDate ld) {
            // No redundant casting
            System.out.println(ld);
        }
        else if (o instanceof LocalDateTime ldt) {
            // No redundant casting
            System.out.println(ldt);
        }
    }


}

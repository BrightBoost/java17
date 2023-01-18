package workingwithrecords;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Record record = new Record("Thunderstruck", "ACDC", LocalDate.of(1975, 1, 1));
        Record record1 = new Record("blabla", "bla");
        System.out.println(record.bandName());
    }
}

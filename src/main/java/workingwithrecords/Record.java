package workingwithrecords;

import java.time.LocalDate;

public record Record(String name, String bandName, LocalDate release) {
    public Record(String name, String bandName) {
        this(name, bandName, LocalDate.now());
    }

    public Record {
        if(name.length() < 3) {
             throw new IllegalStateException();
        }
    }
}

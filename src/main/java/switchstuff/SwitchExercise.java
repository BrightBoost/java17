package switchstuff;

import java.time.Month;

public class SwitchExercise {
    //    Write a switch statement that takes a Month enum (or String if you prefer) and sets the value of an int to the number of days a month has
//    Write a switch statement that checks whether a class is of a certain type (use the Vehicle subtypes) and then call the method move on it - check vehicle exercise for solution
    public static void main(String[] args) {
        Month m = Month.APRIL;
        int nrOfDays = switch(m) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            default -> 0;
        };

    }


}

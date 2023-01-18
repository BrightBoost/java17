package workingwithrecords;

import java.time.LocalDate;
import java.time.Period;

public class RecordExercise {
//    Create a record for User
//    Include the following fields: username, email and sign-up date
//    Add a constructor that only takes username and email and sets the date to current date if the date is not provided
//    Add a method for deciding whether the user signed up over a year ago

    public static void main(String[] args) {
        User user = new User("Maaike", "m@m.nl", LocalDate.of(2020,1, 1));
        System.out.println(user.isOldUser());
    }
}

record User(String userName, String email, LocalDate signup) {
    public User(String userName, String email) {
        this(userName, email, LocalDate.now());
    }

    public boolean isOldUser() {
        return LocalDate.now().minus(Period.of(1, 0, 0)).isAfter(this.signup);
    }
}
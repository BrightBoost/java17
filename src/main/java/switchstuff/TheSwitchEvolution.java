package switchstuff;

import java.time.LocalDate;

public class TheSwitchEvolution {
    public void java8Switch(String day) {
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("Week day");
                break;
            case "Friday":
                System.out.println("Almost weekend, but a week day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("That sounds like a cool day, please enlighten me");
        }
    }

//    public void java12NotSureSwitch(String day) {
//        String lala= switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//                System.out.println("Week day");
//                break "week day";
//            case "Friday":
//                System.out.println("Almost weekend, but a week day");
//                break "week day";
//            case "Saturday":
//            case "Sunday":
//                System.out.println("Weekend");
//                break "week day";
//            default:
//                System.out.println("That sounds like a cool day, please enlighten me");
//                break "week day";
//        }
//    }

    public void java13Switch(String day) {
        String s = switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                yield "Weekday";
            case "Friday":
                yield "Almost weekend, but a week day";
            case "Saturday":
            case "Sunday":
                yield "Weekend";
            default:
                yield "That sounds like a day to party";
        };
    }

    public void java13SwitchArrows(String day) {
        String s = switch (day) {
            case "Monday" -> "Week day";
            case "Tuesday" -> "Week day";
            case "Wednesday" -> "Week day";
            case "Thursday" -> "Week day";
            case "Friday" -> "Week day";
            case "Saturday" -> "Weekend";
            case "Sunday" -> "Weekend";
            default -> "Unknown";
        };
    }

    public void java13SwitchArrowsCommas(String day) {
        String s = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> "Week day";
            case "Friday" -> "Almost weekend, but a week day";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "What day?";
        };
    }

    public void java17SwitchPatternMatching(Object o) {
        String type = switch (o) {
            case Integer i -> "It is an integer";
            case String s -> "It is a string";
            case LocalDate ld -> "It is a date";
            default -> "It is none of the known data types";
        };
    }

    public void java17SwitchGuardedPattern(Object o) {
        String type = switch (o) {
            case Integer i -> "It is an integer";
            case String s -> "It is a string";
            //spoiler alert, didn't make it
            // case LocalDate ld && ld.isAfter(LocalDate.now())-> "It is a date";
            default -> "It is none of the known data types";
        };
    }

    public void java17SwitchNull(String day) {
        String s = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> "Week day";
            case "Friday" -> "Almost weekend, but a week day";
            case "Saturday", "Sunday" -> "Weekend";
            case null -> "no day";
            default -> "What day?";
        };

        int x = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> 4;
            case "Friday" -> 3;
            case "Saturday", "Sunday" -> 2;
            case null -> 1;
            default -> 7;
        };
    }
}

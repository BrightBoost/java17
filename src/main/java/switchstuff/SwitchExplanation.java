package switchstuff;

public class SwitchExplanation {
    public static void main(String[] args) {
        int x = 0;
        if(x == 0) {
            System.out.println("x is 0");
        } else if (x == 1) {
            System.out.println("x is 1");
        } else if(x == 2) {
            System.out.println("x is 2");
        } else {
            System.out.println("x is niet 0 1 2");
        }

        switch (x) {
            case 0 -> System.out.println("x is 0");
            case 1 -> System.out.println("x is 1");
            case 2 -> System.out.println("x is 2");
            default -> System.out.println("x is niet 0 1 2");
        }
    }
}

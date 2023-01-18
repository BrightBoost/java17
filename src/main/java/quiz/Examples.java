package quiz;

public class Examples {
    public static void main(String[] args) {
        String html = """
                <html>
                    <body>
                        <p>Very creative example</p>
                    </body>
                </html>""";

        System.out.println(html);
    }
}

sealed class Animal permits Cow, Cat {

}

non-sealed class Cow extends Animal {

}

final class Cat extends  Animal {

}

sealed class Huh {}

non-sealed class Wat extends Huh {}


record Rectangle(double length, double width) {
    // something should be added here
}


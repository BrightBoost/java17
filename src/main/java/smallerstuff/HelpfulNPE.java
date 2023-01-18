package smallerstuff;

import java.nio.charset.StandardCharsets;

public class HelpfulNPE {
    public static void main(String[] args) {
        Voorbeeld v = new Voorbeeld();
        System.out.println(v.s.getBytes(StandardCharsets.UTF_8).length);
    }
}


class Voorbeeld {
    String s;
}

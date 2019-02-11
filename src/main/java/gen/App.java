package gen;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        GFK gfkString = new GFK("This is string");

        System.out.println(gfkString.getob());

        GFK gfkNumber = new GFK(new Integer(1));

        System.out.println(gfkNumber.getob());


    }
}

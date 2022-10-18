import java.util.regex.Pattern;

public class Numbers {
    // the first solution
    public static void ifNumber(String str) {
        if(Pattern.matches("\\d+", str)) {
            System.out.println("Is number");
        }else {
            System.out.println("not a number");
        }
    }

    public static void main(String[] args) {
        ifNumber("admin");
        ifNumber("1 02 3");
        ifNumber("123");

    }
}
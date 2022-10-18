import java.util.Arrays;

public class RepeatSymbols {
    public static void main(String[] args) {
        String str = "it turns out something like this";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String s = String.valueOf(chars);
        for (int i = 0; i < chars.length;) {
            System.out.println(chars[i]+"("+(s.lastIndexOf(chars[i])-s.indexOf(chars[i])+1)+")");
            i+= (s.lastIndexOf(chars[i]) - s.indexOf(chars[i]) + 1);
        }
    }
}
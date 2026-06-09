import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java"};
        Function<String> toUpperCase = String::toUpperCase;

        String[] upperWords = ArrayMapper.arrayMapping(words, toUpperCase);

        System.out.println(Arrays.toString(upperWords)); // [HELLO, WORLD, JAVA]
    }
}
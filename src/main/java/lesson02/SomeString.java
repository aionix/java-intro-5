package lesson02;

public class SomeString {

    public static void main(String[] args) {

        System.out.println(eachNth("Miracle", 2));
        System.out.println(eachNth("abcdefg", 2));
        System.out.println(eachNth("abcdefg", 3));

    }

    private static String eachNth(String str, int k) {
        String newString = "";
        for (int i = 0; i < str.length(); i += k) {
            char c = str.charAt(i);
            newString+= c;
        }
        return newString;
    }
}

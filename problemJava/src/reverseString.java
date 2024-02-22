
public class reverseString {
    public static void main(String[] args) {
        String str = "CodeLoop";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
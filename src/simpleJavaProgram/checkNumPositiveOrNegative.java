package simpleJavaProgram;

public class checkNumPositiveOrNegative {
    public static void main(String[] args) {
        int num = 14;

        if(num > 0) {
            System.out.println("number is positive");
        } else if (num < 0) {
            System.out.println("number is negative");
        }else {
            System.out.println("number is zero");
        }
    }
}

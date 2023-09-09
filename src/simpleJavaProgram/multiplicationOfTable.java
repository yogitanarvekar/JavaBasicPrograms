package simpleJavaProgram;

public class multiplicationOfTable {
    public static void main(String[] args) {
        int number = 7;

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}

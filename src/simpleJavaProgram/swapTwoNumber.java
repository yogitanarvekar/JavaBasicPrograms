package simpleJavaProgram;

public class swapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;


        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        a = a + b;
//        b = a - b;
//        a = a - b;
        int c = a;
      a = b;
      b = c;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

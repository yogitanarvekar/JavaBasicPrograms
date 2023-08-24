package simpleJavaProgram;

public class checkEvenOdd {
//    public static void main(String[] args) {
//        int a=17;
//        if(a%2 == 0){
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//    }
public static void main(String[] args) {
    int a=104;
    String check = checkEvenOddNum(a);
    System.out.println(check);
    System.out.println(checkEvenOddNum(41));
}

    public static String checkEvenOddNum(int a) {
        if(a%2 == 0){
           return "even";
        } else {
            return "odd";
        }

    }
}

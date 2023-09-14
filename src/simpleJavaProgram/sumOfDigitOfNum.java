package simpleJavaProgram;

public class sumOfDigitOfNum {
    public static void main(String[] args) {
//        5648 -> 5+4+6+8=23
        int num = 12;
        int sum = 0;

        while (num!=0){ //true
            int temp = num%10; //temp = 8,6,4,5
            sum += temp; //sum = 8,14,18,23
            num = num/10; //num = 546,54,5,0
        }

        System.out.println("sum of all digit  : " + sum );
    }
}

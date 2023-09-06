package simpleJavaProgram;

import java.util.Scanner;

public class sumOfEvenOddNum {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        Scanner sc = new Scanner(System.in);// scanner object
        System.out.println("enter a number");
        int n = sc.nextInt();
        int evensum = 0;
        int oddSum = 0;
        String s;

        System.out.println("enter your name");
        s = sc.next();
        for(int i = 1; i<=n; i++){

            if(i%2 == 0){
                evensum = evensum + i;

            }else{
                oddSum = oddSum + i;

            }

        }
        System.out.println("totalsum =" +(evensum+oddSum));
        System.out.println("evensum = " +evensum);
        System.out.println("oddsum =" +oddSum);
        System.out.println("my name is " + s);
    }
}

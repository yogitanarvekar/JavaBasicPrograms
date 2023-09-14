package simpleJavaProgram;

public class ExtractDigitsFromNum {
    public static void main(String[] args) {
        int num = 12358;


        while (num!=0){ //true
            int temp = num%10; //temp = 8,6,4,5
            System.out.print(temp + " ");
            num = num/10; //num = 546,54,5,0
        }


    }
}


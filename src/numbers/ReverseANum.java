package numbers;

public class ReverseANum {
    public static void main(String[] args) {

        int num = 12;
        int rev = 0;

        while (num!=0){ //true
            int temp = num%10; //temp = 8,6,4,5
            rev = rev*10;
            rev += temp;
            num = num/10; //num = 546,54,5,0
        }
        System.out.println("Reverse a Num : " + rev);
    }
}

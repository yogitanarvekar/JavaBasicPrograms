package numbers;

public class CheckPalindromeNum {
    public static void main(String[] args) {
        //1234 --> not palindrome
        //1221 --> palindrome
        //12321 -->palindrome
        int num = 12321;
        int z = num;
        int rev = 0;

        while (num!=0){ //true
            int temp = num%10; //temp = 8,6,4,5
            rev = rev*10;
            rev += temp;
            num = num/10; //num = 546,54,5,0
        }

        if (rev == z){
            System.out.println("is a palendrome number");
        }else{
            System.out.println("is not a palendrome number");
        }
    }
}

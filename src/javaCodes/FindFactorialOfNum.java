package javaCodes;

public class FindFactorialOfNum {
    public static void main(String[] args) {
        int a = 5; //1*2*3*4*5
        int factorial = 1;
        for(int i=1; i<=a; i++){
            factorial = factorial*i;

        }
        System.out.println(factorial);
    }
}

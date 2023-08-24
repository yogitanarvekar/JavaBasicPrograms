package javaCodes;

public class PowerOfNum {
    public static void main(String[] args) {
        //2^4=16(2*2*2*2=16)
        int a = 4; // 3^5=3*3*3*3*3=243
        int b = 3;
        int power = 1;
        for(int i=0; i<a; i++){
            power = power*b;

        }
        System.out.println(power);

    }
}

package javaCodes;

public class AverageOfFiveSub {
    public static void main(String[] args) {
        int[] array = {1,2};    // 1+2/2=1
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum/array.length;
        System.out.println(average);
    }
}

package javaCodes;

public class CalculateTheAverageOfnNuminAnArray {
    public static void main(String[] args) {
        int[] array = {31,65,58,54,86,85};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum/array.length;
        System.out.println(average);
    }
}

package Giris;

public class DiziMaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 3, 8, 2, 11, 666, 84, -1, 85};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max:" + max +"\t"+ "min:" + min);
    }
}

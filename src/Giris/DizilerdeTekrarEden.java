package Giris;

import java.util.Arrays;

public class DizilerdeTekrarEden {
    public static void main(String[] args) {
        int[] list = {3, 2, 5, 8, 8, 86, 3, 1, 1, 8, 3, 9, 3, 7};
        int[] duplicate = new int[list.length];

        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    duplicate[startIndex++] = list[i];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}

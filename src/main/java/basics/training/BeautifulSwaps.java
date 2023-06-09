package basics.training;

import java.util.Arrays;


public class BeautifulSwaps {
    static int minimumMovesLogic(int[] array1, int[] array2, int i, int j) {

        if (Arrays.equals(array1,array2)) {
            return 0;
        }
        if (i >= array1.length || j >= array2.length) {
            return 0;
        }
        if (array1[i] < array2[j]) {

            return 1 + minimumMovesLogic(array1, array2,
                    i + 1, j + 1);
        }
        return Math.max(minimumMovesLogic(array1, array2,
                        i, j + 1),
                minimumMovesLogic(array1, array2,
                        i + 1, j));
    }

    static void minimumMovesRequired(int[] arr) {
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        Arrays.sort(copyArr);

        if (Arrays.equals(arr,copyArr)) {
            System.out.println("0");
        } else
            System.out.println(minimumMovesLogic(arr, copyArr,
                    0, 0));
    }

    public static void main(String[] args) {
        int[] arr = {7, 15, 12, 3};
        System.out.println(Arrays.toString(arr));
        minimumMovesRequired(arr);
    }
}
package ss4array;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 78, 9, 10};
        int index = minValue(array);
        System.out.println("gia tri nho nhat trong mang la: " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}

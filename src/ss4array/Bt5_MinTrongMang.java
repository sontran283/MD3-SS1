package ss4array;

import java.util.Scanner;

public class Bt5_MinTrongMang {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,89,20};
       int index = min(array);
        System.out.println(" gia tri nho nhat trong mang la: " + array[index]);
    }

    private static int min(int[] array) {
        int index= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]< array[index]){
                index = i;
            }
        }
        return index;
    }
}

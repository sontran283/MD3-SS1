package ss4array;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int[] mang = {1, 3, 19, 53, 4, 6};
        for (int i = 0, j = mang.length - 1; i < j; i++, j--) {
         int temp = mang[i];
         mang[i] = mang[j];
         mang[j] = temp;
        }
        // xuat mang
        System.out.println("mang sau khi dao nguoc la: ");
        System.out.println(Arrays.toString(mang));
    }
}

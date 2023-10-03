package ss4array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh5 {
    // viet chuong trinh tao 1 mang mot chieu, gom cac phan tu la so nguyen, co n phan tu, n do nguoi dung nhap tu ban phim
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao so phan tu toi da cua mang: ");
        int number = scanner.nextInt();

        // tao mang co n phan tu (cap phat bo nho cho mang)
        int[] mang = new int[number];

        // nhap giu lieu cho tung phan tu
        System.out.println("so phan tu cua mang " + mang.length);
        for (int i = 0; i < mang.length; i++) {
            System.out.println("mang[ "+i+" ]= ");
            mang[i] = scanner.nextInt();
        }
        // xuat mang
        System.out.println("mang duoc tao la: ");
        System.out.println(Arrays.toString(mang));
    }
}

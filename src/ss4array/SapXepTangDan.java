package ss4array;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mang1 = {8,9,23,45,12};
        Arrays.sort(mang1);
        System.out.println("mang sau khi sap xep tang dan la: ");
        System.out.println(Arrays.toString(mang1));

    }
}

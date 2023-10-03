package ss4array;

import java.util.Scanner;

public class Bt9_TimPhanTuLonThuHaiTrongMang {
    // Bước 1: Khai báo một mảng số nguyên bất kì.
    // Bước 2: Chỉ sử dụng một vòng lặp duy nhất để tìm số lớn đứng thứ 2. Sử dụng 2 biến
    // trung gian max và max2. Suy nghĩ tư duy logic để giải quyết vấn đề
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 6, 9};
        int sum = numbers[0];
        int sum1 = numbers[0];

        for (int number : numbers) {
            if (sum < number) {
                sum1 = sum;
                sum = number;

            } else if (sum1 < number && number != sum) {
                sum1 = number;
            }
        }
        System.out.println(" gia tri lon thu hai la: " + sum1);
    }
}

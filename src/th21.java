import java.util.Scanner;

public class th21 {
    //  Tìm số nguyên dương nhỏ nhất chia hết cho 5,7 và 11
    public static void main(String[] args) {
        // Khai báo biến N là giá trị bắt đầu kiểm tra ,có giá trị là 1.
        int n = 11;
        while (true){
            if (n % 5 == 0 && n % 7==0 && n % 11==0 ){
                System.out.println("so nho nhat chia het cho 5,7,11 la: "+ n);
                break;
            }
            n++;
        }
    }
}

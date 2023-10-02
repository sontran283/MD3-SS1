import java.util.Scanner;

public class th18 {
    // Hiển thị 20 số nguyên tố đầu tiên
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vap so nguyen");
        // Khai báo biến số nguyên numbers và nhập cho nó một giá trị từ bàn phím để lưu số lượng số nguyên tố cần in ra.
        int number = scanner.nextInt();
        // Khai báo biến count và gán cho nó giá trị 0, biến này để đếm xem số lượng lượng số nguyên tố cần in ra đã bằng numbers hay chưa.
        int count = 0;
        // Khai báo biến N và gán cho giá trị 2, biến này để kiểm tra xem các giá trị nó nhận được có phải là số nguyên tố không, mỗi lần lặp giá trị của biến sẽ được tăng lên 1.
        int N = 2;

        System.out.println("cac so nguyen to dau tien la: " + number);
        while (count < number) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

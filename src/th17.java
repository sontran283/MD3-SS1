public class th17 {
    // Hiển thị các số nguyên tố nhỏ hơn 100
    // Số nguyên tố là tập hợp các số tự nhiên >1, chia hết cho 1 và chính nó
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
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
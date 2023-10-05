import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("mời bạn nhập tên: ");  // viết tắt sout
        String name = scanner.nextLine();  //nextLine in ra chuỗi

        System.out.println("tên của bạn là: " + name);
    }
}

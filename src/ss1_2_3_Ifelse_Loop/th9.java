import java.util.Scanner;

public class th9 {
    // tim x, y khi biet tong va hieu cua chung
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi nhap vao tong 2 so :");
        float tong = scanner.nextFloat();
        System.out.println(" moi nhap vao hieu 2 so :");
        float hieu = scanner.nextFloat();

        // tinh toan:
        float x= (tong+hieu)/2;
        float y= tong-x;

        System.out.println("gia tri cua x la: " +x);
        System.out.println("gia tri cua x la: " +y);

    }
}

import java.util.Scanner;

public class th24 {
    // Xác thực dữ liệu sử dụng vòng lặp
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh a: ");
        int canha = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap canh b: ");
        int canhb = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap canh c: ");
        int canhc = Integer.parseInt(scanner.nextLine());

       while (true){
           if (canha > 0 && canhb > 0 && canhc > 0) {
               if (canha + canhb > canhc && canha + canhc > canhb && canhb + canhc > canha) {
                   double p = (canha + canhb + canhc) / 2;
                   double s = Math.sqrt(p * ((p - canha) + (p - canhb) + (p - canhc)));
                   System.out.println("chu vi hinh tam giac la: " + p * 2);
                   System.out.println("dien tich hinh tam giac la: " + s);
               } else {
                   System.out.println(" khong phai mot tam giac");
               }
           } else {
               System.out.println("nhap khong hop le");
           }
           break;
       }
    }

}

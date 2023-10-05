import java.util.Scanner;

public class th8 {
    // viet chuong trinh nhap vao tu ban phim ban kinh r cua hinh tron. tính diện tích và chu vi hình tròn
    // chuvi = 2* Math.PI * r
    // dientich = Math.PI * Math.pow(r,2)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ban kinh hinh tron: ");
        double bankinh = scanner. nextDouble();
        double chuvi = 2 * Math.PI * bankinh;
        double dientich = Math.PI * Math.pow(bankinh,2);

        System.out.println("chu vi cua hinh tron la: "+ chuvi);
        System.out.println("dien tich cua hinh tron la: "+ dientich);
    }
}

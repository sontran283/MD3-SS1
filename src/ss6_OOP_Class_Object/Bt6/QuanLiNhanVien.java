package ss6_OOP_Class_Object.Bt6;

import ss6_OOP_Class_Object.Bt5.QuanLiSinhVien;

import java.text.DecimalFormat;
import java.util.Scanner;
//  salary = rate * 1.300.000

public class QuanLiNhanVien {
    private int employeeId;
    private int age;
    private boolean gender;
    private double rate;
    private double salary;
    private String employeeName;
    private int Id;
    private static int count = 1;

    public int getId() {
        return Id;
    }

    // id tu tang
    public QuanLiNhanVien() {
        this.Id = QuanLiNhanVien.count++;
    }

    // nhap thong tin doi tuong bi tru luong
    public void inputData(Scanner scanner) {
        System.out.println("nhập vào toàn bộ thông tin của đối tượng trừ lương");

        System.out.println("nhap ten nhan vien: ");
        this.employeeName = scanner.nextLine();

        System.out.println("nhap tuoi: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.println("nhap gioi tinh: ");
        System.out.println("1.male ");
        System.out.println("2.female ");
        int g = Integer.parseInt(scanner.nextLine());
        this.gender = g == 1 ? true : false;

        System.out.println("nhap he so luong: ");
        this.rate = Integer.parseInt(scanner.nextLine());
    }

    // hien thi thong tin toan bo nhan vien
    public void displayData() {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        System.out.println(
                "ma sinh vien: " + Id + "\n"
                        + "tuoi: " + age + "\n"
                        + "gioi tinh: " + (gender ? "male" : "female") + "\n"
                        + "ten nhan vien: " + employeeName + "\n"
                        + "he so luong: " + rate + "\n"
                        + " luong: " + formatter.format(salary) + "vnd" + "\n"
        );
    }

    // tinh luong nhan vien
    public void calSalary() {
        salary = rate * 1300000;
    }
}


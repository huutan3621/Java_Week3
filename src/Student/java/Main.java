package Student.java;

import Student.java.ManagementStudent;

import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        ManagementStudent qlhs = new ManagementStudent();

        // Nhap
        qlhs.enterList(sc);

        // Hien thi
        System.out.println("Danh sach hoc sinh vua nhap la:");
        qlhs.displayList();

        System.out.println("Hoc sinh co diem toan cao nhat la:");
        qlhs.findStuMathMax();

        System.out.println("Hoc sinh co ho bat dau la Le la:");
        qlhs.displayStuFNLe();

        sc.close();
    }
}

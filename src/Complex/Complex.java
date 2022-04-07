package Complex;

import java.util.Scanner;

public class Complex {
	// Thuoc tinh
    private double a;
    private double b;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Complex() {
        a = 0;
        b = 0;
    }

    // Ham khoi tao co doi so
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Ham nhap so phuc
    public void nhap(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        a = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        b = sc.nextDouble();
    }

    // Ham hien thi so phuc
    public void hienThi() {
        if (b < 0) {
            System.out.println(a + " - " + Math.abs(b) + "*i");
        } else {
            System.out.println(a + " + " + b + "*i");
        }
    }

    // Ham cong 2 so phuc
    public Complex congSP(Complex sp2) {
        double thuc = a + sp2.a;
        double ao = b + sp2.b;
        return new Complex(thuc, ao);
    }

    // Ham tru 2 so phuc
    public Complex truSP(Complex sp2) {
        double thuc = a - sp2.a;
        double ao = b - sp2.b;
        return new Complex(thuc, ao);
    }

    // Ham nhan 2 so phuc
    public Complex nhanSP(Complex sp2) {
        double thuc = a * sp2.a - b * sp2.b;
        double ao = a * sp2.b + sp2.a * b;
        return new Complex(thuc, ao);
    }

    // Ham chia 2 so phuc
    public Complex chiaSP(Complex sp2) {
        double thuc = (a * sp2.a + b * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        double ao = (sp2.a * b - a * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        return new Complex(thuc, ao);
    }
}

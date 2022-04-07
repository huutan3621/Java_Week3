package MyMath;

import java.util.Scanner;

public class MyMath {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        int b = scanner.nextInt();

        System.out.println("USCLN cua " + a + " vs " + b
                + " ls: " + USCLN(a, b));

        System.out.println("BSCNN cua " + a + " vs " + b
                + " ls: " + BSCNN(a, b));
    }

    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
 
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}

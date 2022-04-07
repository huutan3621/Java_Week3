package Person.java;

import Person.java.ManagementWorker;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//khai bao doi tuong
		ManagementWorker qlnv = new ManagementWorker();
		
		//Nhap
		qlnv.enterList(sc);
		
		//hien thi
		System.out.println("Danh sach nhan vien vua nhap la: ");
		qlnv.displayList();
		System.out.println("Danh sach nhan vien sap xep theo luong tang dan: ");
		qlnv.sortLuongAsc();
	}
}

package Person.java;

import java.util.Scanner;

public class Worker extends Person{
	private double  luongCoBan, heSo, luong;
	
	//phuong thuc
	//ham khoi tao hong doi so
	public Worker() {
		
	}
	
	//ham kho tao khong co doi so
	public Worker(int id, String name, int age, String address, double luongCoBan, double heSo) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.luongCoBan = luongCoBan;
		this.heSo = heSo;
		luong = luongCoBan * heSo;
	}
	
	//getter cho luong
	public double getLuong() {
		return luong;
	}
	
	//getter cho luong co ban
	public double getLuongCoBan() {
		return luongCoBan;
	}
	
	//getter cho he so
	public double getHeSo() {
		return heSo;
	}
	
	//ham hien thi
	public void display() {
		super.display();
		System.out.println("\tLuong co ban: " + luongCoBan);
		System.out.println("\tHe so: " + heSo);
		System.out.println("\tLuong: " + luong);
	}
	
	//ham nhap thong tin
	public void enter(Scanner sc) {
		super.enter(sc);
		System.out.println("\tNhap luong co ban: ");
		luongCoBan = sc.nextDouble();
		System.out.println("\tNhap he so: ");
		heSo = sc.nextDouble();
		luong = luongCoBan * heSo;
	}

}

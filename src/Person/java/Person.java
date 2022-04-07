package Person.java;

import java.util.Scanner;

public class Person {
	
	//thuoc tinh
	protected int id;
	protected String name;
	protected int age;
	protected String address;
	
	//phuong thuc
	//ham khoi tao khong doi so
	public Person() {
		
	}
	
	//ham khoi tao co doi so
	public Person(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//cac ham getter va setter cho cac thuoc tibg
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//ham hien thi thong tin
	public void display() {
		System.out.println("\tId: " + id);
		System.out.println("\tHo va ten: " + name);
		System.out.println("\tTuoi: " + age);
		System.out.println("\tDia chi: " + address);
	}
	
	//ham nhap thong tin
	public void enter(Scanner sc) {
		System.out.print("\tNhap id: ");
		id = sc.nextInt();
		System.out.print("\tNhap ho ten: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("\tNhap tuoi: ");
		age = sc.nextInt();
		System.out.print("\tNhap dia chi: ");
		sc.nextLine();
		address = sc.nextLine();
	}	
}


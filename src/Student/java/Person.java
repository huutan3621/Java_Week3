package Student.java;

import java.util.Scanner;


public class Person {
	// Thuoc tinh
    protected int id;
    protected String name;
    protected int age;
    protected String address;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Person() {

    }

    // Ham khoi tao co doi so
    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Cac ham getter va setter cho cac thuoc tinh
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Ham hien thi thong tin
    public void display() {
        System.out.println("\tId: " + id);
        System.out.println("\tHo ten: " + name);
        System.out.println("\tTuoi: " + age);
        System.out.println("\tDia chi: " + address);
    }

    // Ham nhap thong tin
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

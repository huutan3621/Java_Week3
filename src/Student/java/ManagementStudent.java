package Student.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagementStudent {
	// Thuoc tinh
    private ArrayList<Student> ds;

    // Phuong thuc
    // Ham khoi tao
    public ManagementStudent() {
        ds = new ArrayList<Student>(10);
    }

    // Ham them student vao danh sach
    public void addStudent(Student student) {
        ds.add(student);
    }

    // Ham nhap danh sach
    public void enterList(Scanner sc) {
        Student student;
        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = sc.nextInt();
        System.out.println("Nhap vao danh sach hoc sinh:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hoc sinh thu " + (i + 1) + " la:");
            student = new Student();
            student.enter(sc);

            // Them hoc sinh vao danh sach
            addStudent(student);
        }
    }

    // Hien thi danh sach hoc sinh
    public void displayList() {
        int i = 1;
        for (Student student :
                ds) {
            System.out.println("Hoc sinh thu " + (i) + " la:");
            student.display();
            i++;
        }
    }

    // Ham sap xep tang dan diem trung binh
    public void sortAverageAsc() {
        Collections.sort(ds, new SortByAvera());
    }

    // Ham tim hoc sinh co diem toan cao nhat
    public void findStuMathMax() {
        int n = ds.size();
        double max = ds.get(0).getMath();
        for (int i = 1; i < n; i++) {
            if (max < ds.get(i).getMath()) {
                max = ds.get(i).getMath();
            }
        }
        for (Student student :
                ds) {
            if (max == student.getMath()) {
                student.display();
                System.out.println();
            }
        }
    }

    // Ham hien thi danh sach hoc sinh co tuoi > 23
    public void displayStuAge23() {
        for (Student student :
                ds) {
            if (23 >= student.getAge()) {
                student.display();
                System.out.println();
            }
        }
    }

    // Ham hien thi danh sach hoc sinh co ho la Le
    public void displayStuFNLe() {
        for (Student student :
                ds) {
            if (student.getName().startsWith("Le")) {
                student.display();
                System.out.println();
            }
        }
    }

    // Ham hien thi danh sach hoc sinh co dia chi o Ha Noi
    public void displayStuAddHaNoi() {
        for (Student student :
                ds) {
            if (student.getAddress().startsWith("Ha Noi")) {
                student.display();
                System.out.println();
            }
        }
    }
}

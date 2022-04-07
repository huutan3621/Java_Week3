package Person.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagementWorker {
	//thuoc tinh
	private ArrayList<Worker> list;
	
	//phuong thuc
	//ham khoi tao
	public ManagementWorker() {
		list = new ArrayList<Worker>(10);
	}
	
	//ham them worker vao danh sach
	public void addWorker(Worker worker) {
		list.add(worker);
	}
	
	//ham nhap danh sach
	public void enterList(Scanner sc) {
		Worker worker;
		System.out.print("\tNhap vao so luong nhan vien: ");
		int n = sc.nextInt();
		System.out.print("Nhap vao danh sach nhan vien");
		for (int i = 0; i < n; i++) {		
			System.out.println("Nhan vien thu " + (i+1) + " la: ");
			worker = new Worker();
			worker.enter(sc);
			
			//them nhan vien vao danh sach
			addWorker(worker);
		}
	}
	
	//hien thi danh sach nhan vien
	public void displayList() {
		int i = 1;
		for (Worker worker : list) {
			System.out.println("Nhan vien thu " + (i) + " la:");
			worker.display();
			i++;
		}
	}
	
	//sap xep tang dan theo luong
	public void sortLuongAsc() {
		Collections.sort(list, new SortByLuong());
	}
}
	
	

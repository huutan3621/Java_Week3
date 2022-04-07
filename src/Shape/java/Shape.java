package Shape.java;

public abstract class Shape {
	//Phuong thuc truu tuong tinh dien tich
	public abstract double area();
	
	//Phuong hien thi thong tin
	public String toString() {
		return "Dien tich la: " + area();
	}
}

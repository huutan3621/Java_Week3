package Shape.java;

public class Circle extends Shape {
	//thuoc tinh
	private double banKinh;
	
	//Phuong thuc
	//ham khoi tao khong doi so
	public Circle(double banKinh) {
		this.banKinh = banKinh;
	}
	
	//Ham tinh hcu vi hinh tron
	public double chuVi() {
		return 2 * Math.PI * this.banKinh;
	}
	
	// Viet lai ham tinh dien tich
    @Override
    public double area() {
        return Math.PI * this.banKinh * this.banKinh;
    }
}

package Shape.java;

public class Rectangle extends Shape{
	
	//thuoc tinh
	private double chieuDai;
	private double chieuRong;
	
	//phuong thuc
	//ham khoi tao khong doi so
	public Rectangle() {
		
	}
	
	//ham khoi tao khong co doi so
	public Rectangle(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	//Ham tinh chu vi hinh chu nhat
	public double chuVi() {
		return (this.chieuDai + this.chieuRong) * 2;
	}
	
	//Viet lai ham tinh dien tich
	@Override
	public double area() {
		return this.chieuDai * this.chieuRong;
	}
}

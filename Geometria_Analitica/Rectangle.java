import java.text.DecimalFormat;

public class Rectangle {
	private double width, height, area, perimeter;
	private DecimalFormat dc = new DecimalFormat("#.##");
	
	private void setArea() {
		this.area = this.width*this.height;
	}
	
	private void setPerimeter() {
		this.perimeter = ((2*this.width) + (2*this.height));
	}
	
	private double getArea() {
		return this.area;
	}
	
	private double getPerimeter() {
		return this.perimeter;
	}
	
	public void print() {
		System.out.println("A área do retângulo é: " + dc.format(this.area) + " e o seu perímetro é: " + dc.format(this.perimeter));
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.setArea();
		this.setPerimeter();
	}
}

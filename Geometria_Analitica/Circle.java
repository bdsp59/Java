import java.text.DecimalFormat;

public class Circle {
	private static double pi = 3.141592;
	private double radius, area, perimeter;
	private DecimalFormat dc = new DecimalFormat("#.##");
	
	private void setArea() {
		this.area = pi*Math.pow(this.radius,2);
	}
	
	private void setPerimeter() {
		this.perimeter = 2*pi*this.radius;
	}
	
	private double getArea() {
		return this.area;
	}
	
	private double getPerimeter() {
		return this.perimeter;
	}
	
	public void print() {
		System.out.println("A área do círculo é: " + dc.format(this.getArea()) + " e o perímetro é: " + dc.format(this.getPerimeter()));
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.setArea();
		this.setPerimeter();
	}
}

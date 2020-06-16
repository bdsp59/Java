import java.text.DecimalFormat;

public class CircularCrown {
	private static double pi = 3.141592;
	private double biggerRadius, smallerRadius, area;
	private DecimalFormat dc = new DecimalFormat("#.##");
	
	private void setArea() {
		this.area = pi*(Math.pow(this.biggerRadius,2) - Math.pow(this.smallerRadius,2));
	}
	
	private double getArea() {
		return this.area;
	}
	
	public void print() {
		System.out.println("A área da coroa circular é: " + dc.format(this.getArea()));
	}
	
	public CircularCrown(double biggerRadius, double smallerRadius) {
		this.biggerRadius = biggerRadius;
		this.smallerRadius = smallerRadius;
		this.setArea();
	}
}

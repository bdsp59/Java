import java.text.DecimalFormat;

public class Diamond {
	private double largerDiagonal, smallerDiagonal, area, perimeter;
	private DecimalFormat dc = new DecimalFormat("#.##");
	
	private void setArea() {
		this.area = (largerDiagonal*smallerDiagonal)/2;
	}
	
	private void setPerimeter() {
		double side;
		side = Math.sqrt(Math.pow((largerDiagonal/2),2) + (Math.pow((smallerDiagonal/2),2)));
		this.perimeter = 4*side;
	}
	
	private double getArea() {
		return this.area;
	}
	
	private double getPerimeter() {
		return this.perimeter;
	}
	
	public void print() {
		System.out.println("A área do losango é: " + dc.format(this.getArea()) + " e o seu perímetro é: " + dc.format(this.getPerimeter()));
	}
	
	public Diamond(double largerDiagonal, double smallerDiagonal) {
		this.largerDiagonal = largerDiagonal;
		this.smallerDiagonal = smallerDiagonal;
		this.setArea();
		this.setPerimeter();
	}
}

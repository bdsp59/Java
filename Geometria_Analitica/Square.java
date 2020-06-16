import java.text.DecimalFormat;

public class Square{
	private double side, area, perimeter;
	private DecimalFormat dc = new DecimalFormat("#.##");
	private void setArea(){
		this.area = (this.side*this.side);
	}

	private void setPerimeter(){
		this.perimeter = (4*this.side);
	}

	private double getArea(){
		return this.area;
	}
	private double getPerimeter(){
		return this.perimeter;
	}

	public void print(){
		System.out.println("A area do Quadrado é " + dc.format(getArea()) + " e o perimetro é " + dc.format(getPerimeter()));
	}

	public Square(double side){
		this.side = side;
		this.setArea();
		this.setPerimeter();
	}
}
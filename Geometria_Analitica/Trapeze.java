import java.text.DecimalFormat;
import java.util.Scanner;

public class Trapeze {
	private double largerBase, smallerBase, height, area, perimeter;
	private DecimalFormat dc = new DecimalFormat("#.##");
	
	private void setArea() {
		this.area = ((this.largerBase + this.smallerBase)*height)/2;
	}
	
	private void setPerimeterIsoscelesTrapezoid() {
		double side;
		side = Math.sqrt(Math.pow((largerBase-smallerBase)/2,2) + Math.pow(height,2));
		this.perimeter = (largerBase + smallerBase + (2*side));
	}
	
	private void setPerimeterTrapezoidRectangle() {
		double side;
		side = Math.sqrt(Math.pow((largerBase-smallerBase),2) + Math.pow(height,2));
		System.out.println(side);
		this.perimeter = (largerBase + smallerBase + height + side);
	}
	
	private void setPerimeterScaleneTrapezoid(){
		double side1, side2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o primeiro lado: ");
		side1 = sc.nextDouble();
		System.out.println("Entre com o segundo lado: ");
		side2 = sc.nextDouble();
		this.perimeter = largerBase + smallerBase + side1 + side2;
	}
	
	private void setPerimeter() {
		Scanner sc = new Scanner(System.in);
		int tipo;
		System.out.println("Entre com o tipo de trapezio que deseja calcular o perímetro: \n1-Isósceles; \n2-Retângulo; \n3-Escaleno;");
		tipo = sc.nextInt();
		if(tipo == 1) {
			this.setPerimeterIsoscelesTrapezoid();
		}else if(tipo == 2) {
			this.setPerimeterTrapezoidRectangle();
		}else if(tipo == 3) {
			this.setPerimeterScaleneTrapezoid();
		}
	}
	
	private double getArea() {
		return this.area;
	}
	
	private double getPerimeter() {
		return this.perimeter;
	}
	
	public void print() {
		System.out.println("A área do trapézio é: " + dc.format(this.getArea()) + " e o perímetro é: " + dc.format(this.getPerimeter()));
	}
	
	public Trapeze(double largerBase, double smallerBase, double height) {
		this.largerBase = largerBase;
		this.smallerBase = smallerBase;
		this.height = height;
		this.setArea();
		this.setPerimeter();
	}
}

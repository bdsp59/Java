import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle {
	private double base, height, area, perimeter;
	private DecimalFormat dc = new DecimalFormat("#.##");
	private Scanner sc = new Scanner(System.in);
	
	private void setArea() {
		this.area = (this.base*this.height)/2;
	}
	
	private void setAreaEquilateralTriangle() {
		this.area = ((Math.pow(this.base,2)*(Math.sqrt(3)))/4);
	}
	
	private void setPerimeterEquilateralTriangle() {
		this.perimeter = 3*this.base;
	}
	
	private void setPerimeterScaleneTriangle() {
		double side2, side3;
		System.out.println("Entre com o valor do segundo lado do triângulo: ");
		side2 = sc.nextDouble();
		System.out.println("Entre com o valor do terceiro lado do triângulo: ");
		side3 = sc.nextDouble();
		this.perimeter = this.base + side2 + side3;
	}
	
	private void setPerimeterIsoscelesTriangle() {
		double side2;
		side2 = Math.sqrt(Math.pow(this.base/2,2) + Math.pow(this.height,2));
		this.perimeter = 2*side2 + this.base;
	}
	
	private double getArea() {
		return this.area;
	}
	
	private double getPerimeter() {
		return this.perimeter;
	}
	
	public void print() {
		System.out.println("O valor da área do triângulo é: " + dc.format(this.getArea()) + " e seu perímetro é: " + dc.format(this.getPerimeter()));
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		int tipo;
		System.out.println("Podemos ter os sequintes tipos de triângulos: \n1-Equilatero;\n2-Isosceles;\n3-Escaleno;\nEntre com o tipo de triângulo que deseja calcular a área e o perímetro: ");
		tipo = sc.nextInt();
		if(tipo == 1) {
			this.setAreaEquilateralTriangle();
			this.setPerimeterEquilateralTriangle();
		}else if(tipo == 2) {
			this.setPerimeterIsoscelesTriangle();
			this.setArea();
		}else if(tipo == 3){
			this.setPerimeterScaleneTriangle();
			this.setArea();
		}
	}
}

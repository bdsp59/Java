import java.text.DecimalFormat;
import java.util.Scanner;

public class Circular {
	private static double pi = 3.141592;
	private double radius, angle, area, perimeterSec, perimeterSeg, areaT, areaSeg, base;
	private DecimalFormat dc = new DecimalFormat("#.##");
	
	private void setAreaCircularSector() {
		this.area = (this.pi*(Math.pow(this.radius,2))*this.angle)/360;
	}
	
	private void setPerimeterCircularSector() {
		this.perimeterSec = ((2*this.pi*this.radius*this.angle)/360) + 2*this.radius;
	}
	
	private void setTriangle() {
		double base, height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a base do triângulo: ");
		this.base = sc.nextDouble();
		height = Math.sqrt(Math.pow(this.radius,2) - Math.pow(this.base/2,2));
		this.areaT = (this.base * height)/2;
	}
	
	private void setAreaCircularSegment() {
		this.setAreaCircularSector();
		this.setTriangle();
		this.areaSeg = (this.area - this.areaT);
	}
	
	private void setPerimeterCircularSegment() {
		this.perimeterSeg = ((2*this.pi*this.radius*this.angle)/360) + this.base;
	}
	
	private double getAreaCircularSector() {
		return this.area;
	}
	
	private double getAreaCircularSegment() {
		return this.areaSeg;
	}
	
	private double getPerimeterCircularSector() {
		return this.perimeterSec;
	}
	
	private double getPerimeterCircularSegment() {
		return this.perimeterSeg;
	}
	
	public void printCircularSector() {
		System.out.println("A área do setor circular é: " + dc.format(this.getAreaCircularSector()) + " e o perímetro é: " + dc.format(this.getPerimeterCircularSector()));
	}
	
	public void printCircularSegment() {
		System.out.println("A área do segmento circular é: " +dc.format(this.getAreaCircularSegment()) + " e o perímetro é: " + dc.format(this.getPerimeterCircularSegment()));
	}
	
	public Circular(double radius, double angle) {
		this.radius = radius;
		this.angle = angle;
		int tipo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Temos duas opções para calcular a área.\n1-Setor circular;\n2-Segmento circular;\nEntre com a opção desejada: ");
		tipo = sc.nextInt();
		if(tipo == 1) {
			this.setAreaCircularSector();
			this.setPerimeterCircularSector();
			this.printCircularSector();
		}else if(tipo == 2) {
			this.setAreaCircularSegment();
			this.setPerimeterCircularSegment();
			this.printCircularSegment();
		}
	}
}

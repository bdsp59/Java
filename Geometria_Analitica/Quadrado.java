public class Quadrado{
	private double lado, area, perimetro;

	private void setArea(){
		this.area = (this.lado*this.lado);
	}

	private void setPerimetro(){
		this.perimetro = (4*this.lado);
	}

	private double getArea(){
		return this.area;
	}
	private double getPerimetro(){
		return this.perimetro;
	}

	public void imprimir(){
		System.out.println("A area do Quadrado é " + getArea() + " e o perimetro é " + getPerimetro());
	}

	public Quadrado(double lado){
		this.lado = lado;
		this.setArea();
		this.setPerimetro();
	}
}
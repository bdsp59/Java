import java.util.Scanner;

public class Areas{
	public Areas(){
		int caso;
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa tem como objetivo calcular áreas e perímetros dos poligonos. \nPara cada figura teremos um valor relacionado. Segue abaixo a lista: \n1-Quadrado;\n2-Retângulo;\n3-Losango;\n4-Trapézio;\n5-Triângulo;\n6-Círculo;\n7-Coroa circular;\n8-Circular;\nEntre com a figura que deseja calcular: ");
		caso = sc.nextInt();
		switch(caso) {
			case 1:
				double ladoQ;
				System.out.println("Entre com o valor do lado: ");
				ladoQ = sc.nextDouble();
				Square square = new Square(ladoQ);
				square.print();
				break;
			case 2:
				double baseR, alturaR;
				System.out.println("Entre com o valor da base: ");
				baseR = sc.nextDouble();
				System.out.println("Entre com o valor do altura: ");
				alturaR = sc.nextDouble();
				Rectangle rectangle = new Rectangle(baseR, alturaR);
				rectangle.print();
				break;
			case 3:
				double diagonalMaior, diagonalMenor;
				System.out.println("Entre com o valor da diagonal maior: ");
				diagonalMaior = sc.nextDouble();
				System.out.println("Entre com o valor da diagonal menor: ");
				diagonalMenor = sc.nextDouble();
				Diamond diamond = new Diamond(diagonalMaior, diagonalMenor);
				diamond.print();
				break;
			case 4:
				double baseMaior, baseMenor, alturaTp;
				System.out.println("Entre com a base maior: ");
				baseMaior = sc.nextDouble();
				System.out.println("Entre com a base menor: ");
				baseMenor = sc.nextDouble();
				System.out.println("Entre com a altura: ");
				alturaTp = sc.nextDouble();
				Trapeze trapeze = new Trapeze(baseMaior, baseMenor, alturaTp);
				trapeze.print();
				break;
			case 5:
				double baseT, alturaT;
				System.out.println("Entre com a base do triângulo: ");
				baseT = sc.nextDouble();
				System.out.println("Entre com a altura do triângulo: ");
				alturaT = sc.nextDouble();
				Triangle triangle = new Triangle(baseT, alturaT);
				triangle.print();
				break;
			case 6:
				double raio;
				System.out.println("Entre com o raio do círculo: ");
				raio = sc.nextDouble();
				Circle circle = new Circle(raio);
				circle.print();
				break;
			case 7:
				double raioMaior, raioMenor;
				System.out.println("Entre com o raio externo da coroa circular: ");
				raioMaior = sc.nextDouble();
				System.out.println("Entre com o raio interno da coroa circular: ");
				raioMenor = sc.nextDouble();
				CircularCrown circularC = new CircularCrown(raioMaior, raioMenor);
				circularC.print();
				break;
			case 8:
				double raioC, angulo;
				System.out.println("Entre com o valor do raio da circular: ");
				raioC = sc.nextDouble();
				System.out.println("Entre com o valor do ângulo da circular: ");
				angulo = sc.nextDouble();
				Circular circular = new Circular(raioC, angulo);
				break;
		}
	}
}
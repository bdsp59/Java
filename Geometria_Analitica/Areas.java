import java.util.Scanner;

public class Areas{
	public Areas(){
		int caso;
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa tem como objetivo calcular áreas dos poligonos. \nPara cada figura teremos um valor relacionado. Segue abaixo a lista: \n1-Quadrado;\n");
		caso = sc.nextInt();
		switch(caso) {
			case 1:
				double lado;
				System.out.println("Entre com o valor do lado: ");
				lado = sc.nextDouble();
				Quadrado square = new Quadrado(lado);
		}
	}
}
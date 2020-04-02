package cadastro;

import java.util.Scanner;

public class Cadastro_aplicacao {

	public static void main(String[] args) {
		int acao;
		Cadastro_back back = new Cadastro_back();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a opção para o programa fazer: \n1 - Adicionar cliente; \n2 - Ver lista de clientes:; \n3 - Sair");
		acao = sc.nextInt();
		
		while(acao<3) {
			switch(acao) {
				case 1:
					back.addCadastro();
				case 2:
					back.getTabela();
			}
			System.out.println("Entre com a opção para o programa fazer: \n1 - Adicionar cliente; \n2 - Ver lista de clientes:; \n3 - Sair");
			acao = sc.nextInt();
		}
		back.sair();
		sc.close();
		System.out.println("Encerrando o programa");
	}
}


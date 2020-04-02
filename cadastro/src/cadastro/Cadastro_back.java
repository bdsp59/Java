package cadastro;

import java.util.Scanner;

public class Cadastro_back {
	private Cadastro_banco banco = new Cadastro_banco();
	private String email, rua, numero, complemento, cep, municipio, estado, tipoPessoa, nome = null, cpf = null, nome_fantasia = null, cnpj = null, razao_social = null, tipo_telefone, telefone, tipoCliente, tabela;
	private boolean cliente = false, funcionario = false, fornecedor = false;
	private Scanner sc = new Scanner(System.in);	
	
	private 
	
	public Cadastro_back() {
		banco.connect();
	}
	
	public void addCadastro() {
		System.out.println("Para adicionar um novo cadastro vamos precisar de alguns dados.");
		System.out.println("Entre com o email: ");
		email = sc.next();
		System.out.println("Esse cadastro é de um cliente, de um fornecedor ou de um funcionário?");
		tipoCliente = sc.next();
		if(tipoCliente.equals("Cliente") || tipoCliente.equals("cliente")) {
			cliente = true;
			funcionario = false;
			fornecedor = false;
		}else if(tipoCliente.equals("funcionario") || tipoCliente.equals("Funcionario") || tipoCliente.equals("funcionário") || tipoCliente.equals("Funcionário")) {
			cliente = false;
			funcionario = true;
			fornecedor = false;
		}else if(tipoCliente.equals("fornecedor") || tipoCliente.equals("Fornecedor")) {
			cliente = false;
			funcionario = false;
			fornecedor = true;
		}
		banco.includeUser(email, cliente, funcionario, fornecedor);
		System.out.println("Entre com o rua: ");
		rua = sc.nextLine();
		rua = sc.nextLine();
		System.out.println("Entre com o número: ");
		numero = sc.next();
		System.out.println("Entre com o complemento: ");
		complemento = sc.next();
		System.out.println("Entre com o cep: ");
		cep = sc.next();
		System.out.println("Entre com o municipio: ");
		municipio = sc.nextLine();
		municipio = sc.nextLine();
		System.out.println("Entre com o estado: ");
		estado = sc.nextLine();
		System.out.println("É uma pessoa física ou jurídica: ");
		tipoPessoa = sc.next();
		if(tipoPessoa.equals("física") || tipoPessoa.equals("Física") || tipoPessoa.equals("fisica") || tipoPessoa.equals("Fisica")) {
			System.out.println("Entre com o seu Nome: ");
			nome = sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Entre com o CPF: ");
			cpf = sc.next();
			banco.includePersonal(nome, cpf);
		}else if(tipoPessoa.equals("jurídica") || tipoPessoa.equals("Jurídica") || tipoPessoa.equals("juridica") || tipoPessoa.equals("Juridica")) {
			System.out.println("Entre com o Nome Fantasia da empresa: ");
			nome_fantasia = sc.nextLine();
			nome_fantasia = sc.nextLine();
			System.out.println("Entre com o CNPJ: ");
			cnpj = sc.next();
			System.out.println("Entre com a Razão Social: ");
			razao_social = sc.nextLine();
			razao_social = sc.nextLine();
			banco.includeLegal(nome_fantasia, cnpj, razao_social);
		}
		System.out.println("Entre com o tipo do telefone(Residencial, Comercial ou Celular: ");
		tipo_telefone = sc.next();
		if(tipo_telefone.equals("Residencial") || tipo_telefone.equals("residencial")) {
			tipo_telefone = "res";
		}else if(tipo_telefone.equals("Comercial") || tipo_telefone.equals("comercial")) {
			tipo_telefone = "com";
		}else if(tipo_telefone.equals("celular") || tipo_telefone.equals("Celular")) {
			tipo_telefone = "cel";
		}
		System.out.println("Entre com o número de telefone: ");
		telefone = sc.next();
		banco.includeAdress(rua, numero, complemento, cep, municipio, estado);
		banco.includePhone(tipo_telefone, telefone);
	}
	
	public void getCadastro() {
		
	}
	
	public void getTabela() {
		System.out.println("Entre com a tabela que deseja visualizar: ");
		tabela = sc.next();
		banco.showAllTableData(tabela);
	}
	
	public void sair() {
		banco.disconnect();
	}
}
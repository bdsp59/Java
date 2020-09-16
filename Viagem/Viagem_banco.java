import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Viagem_banco {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private String query;
	private int idCombustivel, idCarro, idMarca;
	private float kmPorLitro;
	private String nomeCombustivel, modelo, anoFabricacao, nomeMarca;
	
	protected void connect() {//conecta no banco
		String server = "jdbc:mysql://localhost:3306/cadastro_java";
		String user = "bruno";
		String password = "Bruno*1000";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(server, user, password);
			this.statement = this.connection.createStatement();
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	protected boolean isConnect() {//verifica se está conectado
		if(this.connection != null) {
			return true;
		}else {
			return false;
		}
	}
	
	private void addCarro() {
		try {
			query = "INSERT INTO(idCarro, modelo, anoFabricacao, kmPorLitro, id_combustivel, id_marca) CARRO VALUES (NULL, '" + this.modelo + "', '" + this.anoFabricacao + "', " + this.kmPorLitro + ", " + this.idCombustivel + ", " + this.idMarca +  ");";                                              
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	private void addMarca() {
		try {
			query = "INSERT INTO (idMarca, nome) VALUES (NULL, '" + this.nomeMarca + "');";
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	private void setIdCombustivel() {
		try {
			query = "SELECT idCombustivel FROM COMBUSTIVEL WHERE nome = '" + this.nomeCombustivel + "';";
			this.resultSet = this.statement.executeQuery(query);
			while(this.resultSet.next()) {
				this.idCombustivel = Integer.parseInt(this.resultSet.getString("codigo"));
			}
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	private void setIdMarca() {
		try {
			query = "SELECT idMarca FROM MARCA WHERE nome = '" + this.nomeMarca + "';";
			this.resultSet = this.statement.executeQuery(query);
			while(this.resultSet.next()) {
				this.idMarca = Integer.parseInt(this.resultSet.getString("codigo"));
			}
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	private void includeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
		this.addMarca();
		this.setIdMarca();
	}
	
	private void setCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
		this.setIdCombustivel();
	}
	
	private void includeCarro(String modelo, String anoFabricacao, Float kmPorL) {
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.kmPorLitro = kmPorL;
		this.addCarro();
	}
	
	protected void registroCarro(String nomeMarca, String nomeCombustivel, String modelo, String anoFabricacao, Float kmPorL) {
		this.includeMarca(nomeMarca);
		this.setCombustivel(nomeCombustivel);
		this.includeCarro(modelo, anoFabricacao, kmPorL);
	}
	
	protected void listaCarro() {
		try {
			query = "SELECT CARRO.modelo, CARRO.anoFabricacao, CARRO.kmPorLitro, MARCA.nome, COMBUSTIVEL.nome FROM CARRO INNER JOIN MARCA ON CARRO.id_marca = MARCA.idMarca INNER JOIN COMBUSTIVEL ON CARRO.id_combustivel = COMBUSTIVEL.idCombustivel;";
			this.resultSet = this.statement.executeQuery(query);
			while(this.resultSet.next()) {
				System.out.println("Modelo: " + this.resultSet.getString("CARRO.modelo") + " - Ano de Fabricação: " + this.resultSet.getString("CARRO.anoFabricacao") + " - Km por Litro: " + this.resultSet.getString("CARRO.kmPorLitro") + " - Marca: " + this.resultSet.getString("MARCA.nome") + " - Combustivel: " + this.resultSet.getString("COMBUSTIVEL.nome"));
			}
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	protected void disconnect() {//Desconecta do banco
		try {
			this.connection.close();
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}

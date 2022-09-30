package dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	import db.SQLConnection;
	import model.Viagem;

	
public class ViagemDao implements CRUD {
	
	public static Connection connection = SQLConnection.createConnection();
	private static String sql;
	
	
	//CREATE
	public static void create(Viagem viagem) {
		sql = "INSERT INTO viagem VALUES (null,?,?,?,?,?,?,?)";
					
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, viagem.getOrigem());
			preparedStatement.setString(2, viagem.getDestino());
			preparedStatement.setString(3, viagem.getDataIda());
			preparedStatement.setString(4, viagem.getDataVolta());
			preparedStatement.setBigDecimal(5, viagem.getPreco());
						
			preparedStatement.executeUpdate();
			
			System.out.println("--correct insert on database");
			
		}catch (SQLException e) {
			System.out.println("--incorrect insert on database" + e.getMessage());
		}
			
				
	}
	
	//DELETE
	public static void delete(int idViagem) {
		
		sql = "DELETE FROM viagens WHERE idDestino = ?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, idViagem);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on viagem");
		
		} catch (SQLException e) {
			
			System.out.println("--incorrect delete on viagem" + e.getMessage());
		}
		
	}
	
	
	
	//SELECT
	public static List<Viagem> find (String pesquisa) {
		
		sql = String.format("SELECT * FROM viagens WHERE destino like '%s%%' ", pesquisa, pesquisa);
		List <Viagem> viagens = new ArrayList<Viagem>();	
		
		try {
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Viagem viagem = new Viagem();
				
				viagem.setIdDestino(resultSet.getInt("idDestino"));
				viagem.setOrigem(resultSet.getString("Origem"));
				viagem.setDestino(resultSet.getString("Destino"));
				viagem.setDataIda(resultSet.getString("DataIda"));
				viagem.setDataVolta(resultSet.getString("DataVolta"));
				viagem.setPreco(resultSet.getBigDecimal("Preco"));
				
				viagens.add(viagem);
			}
			
			System.out.println("--corret find Destinos");
			return viagens;
			
		} catch (SQLException e) {
			
			System.out.println("--incorret find Destinos" + e.getMessage());
			return null;			
		}
		
	}
	
	
	
	//FIND-UPDATE
	public static Viagem findByPk(int idDestino) {
		
		sql = String.format("SELECT * FROM viagens WHERE idDestino = %d", idDestino);
				
		try {
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Viagem viagem = new Viagem();
			
			while (resultSet.next()) {
				
				viagem.setIdDestino(resultSet.getInt("idDestino"));
				viagem.setOrigem(resultSet.getString("Origem"));
				viagem.setDestino(resultSet.getString("Destino"));
				viagem.setDataIda(resultSet.getString("DataIda"));
				viagem.setDataVolta(resultSet.getString("DataVolta"));
				viagem.setPreco(resultSet.getBigDecimal("Preco"));
				
			}
			
			System.out.println("--corret find Destinos");
			return viagem;
			
		} catch(SQLException e) {
			
			System.out.println("--incorrect find by pk Destinos. " + e.getMessage());
			return null;
		}
	}

	
	//UPDATE
	public static void update(Viagem viagem) {
		
		sql = "UPDATE viagem SET origem=?, destino=?, dataIda=?, dataVolta=?, preco=? WHERE idDestino=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, viagem.getOrigem());
			preparedStatement.setString(2, viagem.getDestino());
			preparedStatement.setString(3, viagem.getDataIda());
			preparedStatement.setString(4, viagem.getDataVolta());
			preparedStatement.setBigDecimal(5, viagem.getPreco());
						
			preparedStatement.executeUpdate();
			
			System.out.println("--correct update on database");
			
		}catch (SQLException e) {
			System.out.println("--incorrect update on database" + e.getMessage());
		}
	}
	

}

package dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.List;
	import db.SQLConnection;
	import model.Viagem;

	
public class ViagemDao implements CRUD {
	
	public static Connection connection = SQLConnection.createConnection();
	private static String sql;
	
	
	
	public static void create(Viagem viagem) {
		sql = "INSERT INTO viagem VALUES (null,?,?,?,?,?)";
					
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
	
	public static void delete(int clienteId) {
		
	}
	
	public static List<Viagem> find (String pesquisa) {
		return null;
		}
	
	public static Viagem findByPk(int idDestino) {
		return null;
		}
	
	public static void update(Viagem viagem) {};
	

}

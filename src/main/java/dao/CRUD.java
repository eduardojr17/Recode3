package dao;

	import java.util.List;
	import model.Viagem;

public interface CRUD {
	
	public static void create(Viagem viagem) {};
	public static void delete(int clienteId) {};
	public static List<Viagem> find (String pesquisa) {return null;}
	public static Viagem findByPk(int idDestino) {return null;}
	public static void update(Viagem viagem) {};
}

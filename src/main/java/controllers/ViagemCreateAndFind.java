package controllers;

	import java.io.IOException;
	import java.util.List;

	import dao.ViagemDao;
	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import model.Viagem;

	
public class ViagemCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ViagemCreateAndFind() {
        super();
    }

    
    //GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pesquisa = request.getParameter("pesquisa");
		
			if (pesquisa == null) {
				pesquisa="";
			}	
		
			List<Viagem> viagens = ViagemDao.find(pesquisa);
			
			request.setAttribute("viagens", viagens);
			RequestDispatcher requesDispatcher = request.getRequestDispatcher("lista.jsp");
			requesDispatcher.forward(request, response);
	}

	
	//POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Viagem viagem = new Viagem ();

		viagem.setOrigem(request.getParameter("origem"));
		viagem.setDestino(request.getParameter("destino"));
		viagem.setDataIda(request.getParameter("dataIda"));
		viagem.setDataVolta(request.getParameter("dataVolta"));
		viagem.setPreco(request.getParameter("preco"));
		
		ViagemDao.create(viagem);

		//doGet(request, response);
	}

}

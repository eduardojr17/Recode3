package controllers;

	import java.io.IOException;
	//import java.util.List;
	
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	import dao.ViagemDao;
	import model.Viagem;

/* Servlet implementation class ViagemCreateAndFind*/

@WebServlet("/VgCreateAndFind")
public class ViagemCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ViagemCreateAndFind() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


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

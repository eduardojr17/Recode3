package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Viagem;

import java.io.IOException;

import dao.ViagemDao;


public class ViagemFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ViagemFindAndUpdate() {
        super();
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int viagemId = Integer.parseInt(request.getParameter("viagemId"));
		Viagem viagem = ViagemDao.findByPk(viagemId);
		
		request.setAttribute("viagem", viagem);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	//POST UPDATE
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Viagem viagem = new Viagem();
		
		viagem.setIdDestino(Integer.parseInt(request.getParameter("idDestino")));
		viagem.setOrigem(request.getParameter("origem"));
		viagem.setDestino(request.getParameter("destino"));
		viagem.setDataIda(request.getParameter("dataIda"));
		viagem.setDataVolta(request.getParameter("dataVolta"));
		viagem.setPreco(request.getParameter("preco"));
		
		ViagemDao.update(viagem);
		
		ViagemCreateAndFind viagemCreateAndFind = new ViagemCreateAndFind();
		viagemCreateAndFind.doGet(request, response);
		
	}

}

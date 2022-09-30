package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.ViagemDao;


public class ViagemDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ViagemDelete() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ViagemId = Integer.parseInt(request.getParameter("viagemId"));
		ViagemDao.delete(ViagemId);
		
		
		ViagemCreateAndFind viagemCreateAndFind = new ViagemCreateAndFind();
		viagemCreateAndFind.doGet(request, response);
		
	}



}

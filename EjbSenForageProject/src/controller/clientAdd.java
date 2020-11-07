package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.client.dao.InterfaceClientLocal;
import sn.metier.entities.Client;

/**
 * Servlet implementation class clientAdd
 */
@WebServlet("/clientAdd")
public class clientAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private InterfaceClientLocal clientDao;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("villages", clientDao.listVillage());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/form-elements.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().print("Yesss");
		
		Client c = new Client();
		c.setNomComplet(request.getParameter("nomComplet"));
		c.setAdresse(request.getParameter("adresse"));
		c.setNumTelephone(request.getParameter("numTelephone"));
		c.setVillage(clientDao.getVillage(Integer.parseInt(request.getParameter("village"))));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/form-elements.jsp").forward(request, response);

	}

}

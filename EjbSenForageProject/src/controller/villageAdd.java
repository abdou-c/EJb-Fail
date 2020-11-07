package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.client.dao.InterfaceVillageLocal;
import sn.metier.entities.Village;

/**
 * Servlet implementation class villageAdd
 */
@WebServlet("/villageAdd")
public class villageAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private InterfaceVillageLocal villageDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public villageAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/form-validation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Village v = new Village();
		v.setLibelle(request.getParameter("libelle"));
		v.setLocalisation(request.getParameter("localisation"));
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/form-validation.jsp").forward(request, response);
		doGet(request, response);
	}

}

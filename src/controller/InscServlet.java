package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.InscBean;
import dao.InscDao;


@WebServlet("/InscServlet")
public class InscServlet extends HttpServlet {
	
    public InscServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         String Nom = request.getParameter("nom");
         String Prenom = request.getParameter("prenom");
         String Adresse = request.getParameter("adresse");
         String email = request.getParameter("email");
         String password = request.getParameter("password");
          
         InscBean inscBean = new InscBean();
        //Using Java Beans - An easiest way to play with group of related data
         InscBean.setNom(Nom);
         InscBean.setPrenom(Prenom);
         InscBean.setAdresse(Adresse);
         InscBean.setEmail(email);
         InscBean.setPassword(password); 
          
         InscDao inscDao = new InscDao();
          
        //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
         String userRegistered = inscDao.registerUser(inscBean);
          
         if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
         {
            request.getRequestDispatcher("/home.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/inscription.jsp").forward(request, response);
         }
     }
}
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.InscBean;
import models.Connect;



public class InscDao {
	public String registerUser(InscBean inscBean)
    {
        String nom = inscBean.getNom();
        String prenom = inscBean.getPreom();
        String email = inscBean.getEmail();
        String adresse = inscBean.getAdresse();
        String password = inscBean.getPassword();
         
        Connection con = null;
        PreparedStatement preparedStatement = null;         
        try
        {
            con = Connect.createConnection();
            String query = "insert into users(nom,prenom,adresse,email,password) values (?,?,?,?,?)"; //Insert user details into the table 
            preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
            preparedStatement.setString(1, nom);
            preparedStatement.setString(1, prenom);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, adresse);
            preparedStatement.setString(4, password);
             
            int i= preparedStatement.executeUpdate();
             
            if (i!=0)  //Just to ensure data has been inserted into the database
            return "SUCCESS"; 
        }
        catch(SQLException e)
        {
           e.printStackTrace();
        }       
        return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
    }
}

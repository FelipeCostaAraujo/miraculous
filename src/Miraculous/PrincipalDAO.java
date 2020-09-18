package Miraculous;

    
 /*=====================================================================================================================//
  *@felipe
  */
  

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class PrincipalDAO {
    
   private final String user="root";
   private final String passaword="";
   private final String url="jdbc:mysql://localhost:3306/empresa";
    
   Connection con;
         private Statement st;
         private ResultSet rs;
         
         public void conectar(){
    
        try {
            
       con=DriverManager.getConnection(url, user, passaword);
    System.out.println("Conexão realizada com Sucesso!");
         st=con.createStatement();
        } catch (SQLException e) {
            
            
        System.out.println ("Erro na conexão: "+e);    
        }
    
    }
    
    public void desconectar(){
        try{
        con.close();
        System.out.println("Desconetado!");
        }catch(SQLException e){
            System.out.println("Erro ao desconectar");
        }
    }
    
    // login 
    // Nlogin @felipe boolean para login validado
    public boolean checkLogin(String login, String senha) {

        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM senhap WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar !!");
        } 

        return check;

    }
    
    
}


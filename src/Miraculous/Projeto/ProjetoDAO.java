package Miraculous.Projeto;


import Miraculous.*;
import Miraculous.Projeto.jifConsuProj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
   
 /*=====================================================================================================================//
  *@felipe
  */

public class ProjetoDAO {
    
   private final String user="root";
   private final String passaword="";
   private final String url="jdbc:mysql://localhost:3306/empresa";
    
   Connection con;
         private Statement st;
         private ResultSet rs;
         List <Projeto> lista = new ArrayList<>();
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
 
    // executor de query sql
    // com captura para mensagem
public void executeSQlQuery(String query,String message){
    
    try{
        st = con.createStatement();
        if(st.executeUpdate(query) == 1){
           JOptionPane.showMessageDialog(null, "Dados "+message+" com Sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Dado não "+message+" ");
        }
        
    }catch(Exception ex){
        ex.printStackTrace();
    }
    
}
    
    //cadastro projeto 
     //inserir cadastro de projeto
    public void inserirP (int id_Proj, String nomeP,String nomeE,String cnpj,String dataInicio,String dataFim){
    
        
        try {
          
            st.executeUpdate("insert into Projeto (id_Proj,NomeP,NomeE,cnpj,dataInicio,dataFim) values("+id_Proj+",'"+nomeP+"','"+nomeE+"','"+cnpj+"','"+dataInicio+"','"+dataFim+"');");
                  
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso !!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Projeto ja existente !! Por favor escolha outro nome para o projeto!  ");
        }
        
    }
    
     // consulta projeto cnpj
   
   public String ConsultaP (String Cnpj){
         jifConsuProj C = new jifConsuProj ();
         
         String vCNPJ = "";
         try{
             rs=st.executeQuery("SELECT * FROM projeto WHERE Cnpj LIKE '%"+Cnpj+"%'");
            
             
             while(rs.next()){
                 vCNPJ+="id: "+rs.getInt("id_proj")+"\nCnpj: "+rs.getString("Cnpj")+
                         "\nNome da empresa: "+rs.getString("NomeE")
                         +"\nNome do projeto: "+rs.getString("NomeP")
                         +"\nData Inicial: "+rs.getString("DataInicio")
                         +"\nData Final: "+rs.getString("DataFim")
                         +"\n====================================\n";
                
                 
             }
         
     }catch(SQLException e){
             System.out.println("erro");
         
     }
       return vCNPJ;
     }
//metodo 2
   //consulta de projetos id
    
    public String ConsultaId (int id_proj){
         jifConsuProj C = new jifConsuProj ();
         
         String vCNPJ = "";
         try{
             rs=st.executeQuery("SELECT * FROM projeto WHERE id_proj LIKE '%"+id_proj+"%'");
            
             
             if(rs.next()){
                 vCNPJ+="id: "+rs.getInt("id_proj")+
                         "\nCnpj: "+rs.getString("Cnpj")+
                         "\nNome da empresa: "+rs.getString("NomeE")
                         +"\nNome do projeto: "+rs.getString("NomeP")
                         +"\nData Inicial: "+rs.getString("DataInicio")
                         +"\nData Final: "+rs.getString("DataFim");
                
                 
             }
         
     }catch(SQLException e){
             System.out.println("erro");
         
     }
       return vCNPJ;
     }
    
    //Deleta projeto
    public void DeletaProj(int id_proj) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM projeto WHERE id_proj = ?");
            stmt.setInt(1, id_proj);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }

    }
    // alteração de projetos
    
    
    
   
    //Inserção na table 
    //lista na tabela
    
    
    public List lista(){
        
        try {
            rs = st.executeQuery("SELECT * FROM projeto");
            while(rs.next()){
            Projeto p = new Projeto();
            p.setId_Proj(rs.getInt("id_proj")); 
            p.setNomeE(rs.getString("NomeE")); 
            p.setNomeP(rs.getString("NomeP")); 
            p.setCnpj(rs.getString("Cnpj")); 
            p.setDataInicio(rs.getString("dataInicio")); 
            p.setDataFim(rs.getString("DataFim")); 
            lista.add (p);
        }
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar");
        }
        return lista;
    }
    //listar todos personalizado 
    public List<Projeto> listarTodos(String id_proj){
    
    List<Projeto> listaTd = new ArrayList<Projeto>();
    
        try {
            
            String sql = "SELECT * FROM projeto WHERE id_proj LIKE ?";
            st = con.prepareStatement(sql);
            rs =     st.executeQuery(sql);
            while(rs.next()){
            Projeto p = new Projeto();
            p.setId_Proj(rs.getInt("id_proj")); 
            p.setNomeE(rs.getString("NomeE")); 
            p.setNomeP(rs.getString("NomeP")); 
            p.setCnpj(rs.getString("Cnpj")); 
            p.setDataInicio(rs.getString("dataInicio")); 
            p.setDataFim(rs.getString("DataFim")); 
            
            listaTd.add(p);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return  listaTd;
    
    }
    
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miraculous.Empresa;

/**
 *
 * @author Felipe
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class empresaDAO {
    
     private final String user="root";
   private final String passaword="";
   private final String url="jdbc:mysql://localhost:3306/empresa";
    List <Empresa> lista = new ArrayList<>();
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
    
    //inserção de dados no banco tbempresa
    public void inserirE(int id_empresa, String Nome,String Representante,int Telefone,String Cnpj,String Endereco , String Email){
    
        
        try {
          
            st.executeUpdate("insert into tbempresa (id_empresa,Nome,Representante,Telefone,Cnpj,Endereco,Email) values("+id_empresa+",'"+Nome+"','"+Representante+"','"+Telefone+"','"+Cnpj+"','"+Endereco+"','"+Email+"');");
                  
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso !!");      
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro Ao inserir !!");
        }
        
    }

    //lista de todas empresas cadastradas
    public List lista(){
        
        try {
            rs = st.executeQuery("SELECT * FROM tbEmpresa");
            while(rs.next()){
            Empresa p = new Empresa();
            p.setId_empresa(rs.getInt("id_empresa")); 
            p.setNome(rs.getString("Nome"));
            p.setRepresentante(rs.getString("Representante")); 
            p.setTelefone(rs.getInt("Telefone")); 
            p.setCnpj(rs.getString("Cnpj")); 
            p.setEndereco(rs.getString("Endereco")); 
            p.setEmail(rs.getString("Email")); 
            
            lista.add(p);
        }
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar");
        }
        return lista;
    }
       
    
    //listar todos personalizado 
    public List<Empresa> listarTodos(String nome){
        
    
    
    
        try {
            List<Empresa> listaTd = new ArrayList<Empresa>();
    
            String sql ="SELECT * FROM tbEmpresa WHERE nome =  ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                
                
            Empresa p = new Empresa();
            
            p.setId_empresa(rs.getInt("id_empresa")); 
            p.setNome(rs.getString("nome")); 
            p.setRepresentante(rs.getString("Representante")); 
            p.setTelefone(rs.getInt("Telefone")); 
            p.setCnpj(rs.getString("Cnpj")); 
            p.setEndereco(rs.getString("Endereco")); 
            p.setEmail(rs.getString("Email")); 
            
            listaTd.add(p);
            }
           
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
    
    
    }
    
    //executor de sql query com mensagem
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
    
    
    
}

package Miraculous.Funcionario;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class funcDAO {
    
   private final String user="root";
   private final String passaword="";
   private final String url="jdbc:mysql://localhost:3306/empresa";
   List <CadFunc> lista = new ArrayList<>();
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
    
    // inserir Funcionario
     // cadastro de funcionarios @gustavo
    public void inserir(int id_func, String nome,String cpf,String dtn, String cargo, float salario,String projeto){
    
        
        try {
          
            st.executeUpdate("INSERT INTO `funcionario`(`id_func`, `nome`, `cpf`, `dtn`, `cargo`, `salario`, `projeto`) VALUES("+id_func+",'"+nome+"','"+cpf+"','"+dtn+"','"+cargo+"',"+salario+",'"+projeto+"');");
                  
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso");        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar"); 
        }
        
    }
    // lista completa de todos funcionarios
    
        public List lista(){
        
        try {
            rs = st.executeQuery("SELECT * FROM funcionario");
            while(rs.next()){
            CadFunc p = new CadFunc();
            p.setId_func(rs.getInt("id_func")); 
            p.setNome(rs.getString("nome"));
            p.setCpf(rs.getString("cpf")); 
            p.setDtn(rs.getString("dtn"));  
            p.setCargo(rs.getString("cargo")); 
            p.setSalario(rs.getFloat("salario")); 
            p.setProjeto(rs.getString("projeto")); 
            
            lista.add(p);
        }
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar");
        }
        return lista;
    }
        //listar todos com where
     public List<CadFunc> listarTodos(String nome){
        
    
    
    
        try {
            List<CadFunc> listaTd = new ArrayList<CadFunc>();
    
            String sql ="SELECT * FROM tbEmpresa WHERE nome =  ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                
                
            CadFunc p = new CadFunc();
            
            p.setId_func(rs.getInt("id_func")); 
            p.setNome(rs.getString("nome"));
            p.setCpf(rs.getString("cpf")); 
            p.setDtn(rs.getString("dtn"));  
            p.setCargo(rs.getString("cargo")); 
            p.setSalario(rs.getFloat("salario")); 
            p.setProjeto(rs.getString("projeto")); 
            
            listaTd.add(p);
            }
           
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
    
    
    }
    //executor query sql
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
    
    // Consulta por Cpf do funcionario
    public String ConsultaCpf (String cpf){
         jifConsultaFuncionario C = new jifConsultaFuncionario ();
         
         String vCpf = "";
         try{
             rs=st.executeQuery("SELECT * FROM funcionario WHERE cpf LIKE '%"+cpf+"%'");
            
             
             while(rs.next()){
                 vCpf+="id: "+rs.getInt("id_func")+
                         "\nNome : "+rs.getString("nome")
                         +"\nCpf: "+rs.getString("cpf")
                         +"\nNascimento: "+rs.getString("dtn")
                         +"\nCargo: "+rs.getString("cargo")
                         +"\nSalario: "+rs.getFloat("salario")
                         +"\nProjeto: "+rs.getString("projeto")
                         +"\n====================================\n";
             }
             
         
     }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao Consultar");
         
     }
       return vCpf;
     }
    // consulta por id do funcionario
    public String ConsultaId (int id_func){
         jifConsultaFuncionario C = new jifConsultaFuncionario ();
         
         String vId = "";
         try{
             rs=st.executeQuery("SELECT * FROM funcionario WHERE id_func LIKE '%"+id_func+"%'");
            
             
             if(rs.next()){
                 vId+="id: "+rs.getInt("id_func")+
                         "\nNome : "+rs.getString("nome")
                         +"\nCpf: "+rs.getString("cpf")
                         +"\nNascimento: "+rs.getString("dtn")
                         +"\nCargo: "+rs.getString("cargo")
                         +"\nSalario: "+rs.getFloat("salario")
                         +"\nProjeto: "+rs.getString("projeto")
                         +"\n====================================\n";  
             }
             
           
     
         
     }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao consultar");
         
     }
       return vId;
     }
    
}


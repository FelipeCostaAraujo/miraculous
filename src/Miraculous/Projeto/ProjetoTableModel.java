/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miraculous.Projeto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe
 */
public class ProjetoTableModel extends AbstractTableModel{
     String [] coluna={"ID", "Empresa","Projeto","Cnpj", "Inicio","Fim"};
     List <Projeto> lista = new ArrayList<>();
   
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
    
        return coluna.length;
    }
 @Override
    public Object getValueAt(int linha, int coluna) {
        
      switch(coluna){
          
          case 0:
              return lista.get(linha).getId_Proj();
          case 1:
              return lista.get(linha).getNomeE();
          case 2:
              return lista.get(linha).getNomeP();
           
          case 3:
              return lista.get(linha).getCnpj();
          case 4:
              return lista.get(linha).getDataInicio();
          case 5:
              return lista.get(linha).getDataFim();
              
          default:
              return null;
           
           
          
      }
      
    }
      
    @Override
    public String getColumnName(int column){
      return  coluna[column];
    }
    
    public void addLinha(List lista){
    
    this.lista=lista;
    this.fireTableDataChanged();
    
    }
    public void atualizar(){
    List<Projeto>listaR=lista;
    listaR.clear();
    addLinha(listaR);
    
    }
    public void consulta(){
        
    }     
}

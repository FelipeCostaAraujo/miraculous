/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miraculous.Empresa;

import Miraculous.Empresa.Empresa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe
 */
public class EmpresaTableModel extends AbstractTableModel{
    String [] coluna={"ID", "Empresa","Representante","Telefone","Cnpj", "Endereço","Email"};
     List <Empresa> lista = new ArrayList<>();
   
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
              return lista.get(linha).getId_empresa();
          case 1:
              return lista.get(linha).getNome();
          case 2:
              return lista.get(linha).getRepresentante();
            
          case 3:
              return lista.get(linha).getTelefone();
              
          case 4:
              return lista.get(linha).getCnpj();
              
          case 5:
              return lista.get(linha).getEndereco();
          case 6:
              return lista.get(linha).getEmail();
              
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
    List<Empresa>listaR=lista;
    listaR.clear();
    addLinha(listaR);
    
    }
    public void consulta(){
        
    }     
}


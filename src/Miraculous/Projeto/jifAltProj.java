/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miraculous.Projeto;

import Miraculous.Projeto.Projeto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Felipe
 */
public class jifAltProj extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifAltProj
     */
     
    ProjetoDAO fd = new ProjetoDAO();
    Projeto p = new Projeto();
    ProjetoTableModel pt = new ProjetoTableModel();  
      
    public jifAltProj() {
        initComponents();
        fd.conectar();
        setSize(1020,600);
        Tabela.setModel(pt);
    }
    public void Tabela(String id_proj){
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        modelo.setNumRows(0);
        ProjetoDAO ad = new ProjetoDAO();
        
        for(Projeto c : ad.listarTodos(id_proj)){
            
            modelo.addRow(new Object[]{
            c.getId_Proj(),
            c.getNomeE(),
            c.getNomeP(),
            c.getCnpj(),
            c.getDataInicio(),
            c.getDataFim()
            
        });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNovo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        btnList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDataFim = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Atualização de Projetos");
        getContentPane().setLayout(null);

        jLabel1.setText("Digite o \"ID\" do projeto que sera alterado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 310, 40);

        txtID.setEditable(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(70, 90, 230, 30);
        getContentPane().add(txtNovo);
        txtNovo.setBounds(70, 170, 230, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Alterar ");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 130, 150, 30);

        jLabel2.setText("Novo nome do projeto :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 130, 250, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Projetos não podem ter o mesmo nome !");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 260, 40);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 300, 870, 260);

        btnList.setText("Listar Todos");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });
        getContentPane().add(btnList);
        btnList.setBounds(350, 250, 140, 30);

        jLabel3.setText("Nova \"Data\" de termino do projeto: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 210, 200, 20);

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFimActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataFim);
        txtDataFim.setBounds(140, 250, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Icone.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 0, 1145, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       fd.conectar();
       String query = "UPDATE projeto SET NomeP = '"+txtNovo.getText()+"',DataFim = '"+txtDataFim.getText()+"'  WHERE id_proj = "+txtID.getText()+"";
       fd.executeSQlQuery(query,"Alterado");
        
      pt.atualizar();
      List<Projeto> lista = fd.lista();
      pt.addLinha(lista);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        fd.conectar();
        pt.atualizar();
        List<Projeto> lista = fd.lista();
        pt.addLinha(lista);
        
        
    }//GEN-LAST:event_btnListActionPerformed

    private void txtDataFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFimActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        // TODO add your handling code here:
         int i = Tabela.getSelectedRow();
        TableModel model = Tabela.getModel();
        txtID.setText(model.getValueAt(i,0).toString());
        txtNovo.setText(model.getValueAt(i,2).toString());
        txtDataFim.setText(model.getValueAt(i,5).toString());
        
        
    }//GEN-LAST:event_TabelaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNovo;
    // End of variables declaration//GEN-END:variables
}
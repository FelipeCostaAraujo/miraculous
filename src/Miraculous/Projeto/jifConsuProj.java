/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miraculous.Projeto;

import Miraculous.Projeto.Projeto;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.Toolkit;
/**
 *
 * @author Felipe
 */
public class jifConsuProj extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifConsuProj
     */
    ProjetoDAO fd = new ProjetoDAO();
    Projeto p = new Projeto();
    
    
    public jifConsuProj() {
        initComponents();
        fd.conectar();
        setSize(890,525);
        
        
    }
    
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaB = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RdId = new javax.swing.JRadioButton();
        RdCnpj = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta de Projetos Cadastrados");
        getContentPane().setLayout(null);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(280, 150, 77, 30);

        jLabel1.setText("Escola o metodo de busca :");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 180, 50);
        getContentPane().add(txtBusca);
        txtBusca.setBounds(10, 150, 258, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dados da pesquisa");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 290, 118, 21);

        txtAreaB.setEditable(false);
        txtAreaB.setColumns(20);
        txtAreaB.setRows(5);
        jScrollPane2.setViewportView(txtAreaB);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 330, 583, 152);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/LOGO.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 25));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 10, 860, 520);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(RdId);
        RdId.setText("Id");
        RdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdIdActionPerformed(evt);
            }
        });

        buttonGroup1.add(RdCnpj);
        RdCnpj.setText("Cnpj");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RdId)
                .addGap(38, 38, 38)
                .addComponent(RdCnpj)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdId)
                    .addComponent(RdCnpj))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 100, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        //metodo 1
        if(RdCnpj.isSelected()){
        String Cnpj=(txtBusca.getText());
        txtAreaB.setText(fd.ConsultaP(Cnpj));
        }else if(RdId.isSelected()){
        int id_proj=Integer.parseInt(txtBusca.getText());
        txtAreaB.setText(fd.ConsultaId(id_proj));
        }
        
        
        //metodo 2
      // int readJTableForCnpj=Integer.parseInt(txtBusca.getText());
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void RdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RdIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdCnpj;
    private javax.swing.JRadioButton RdId;
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaB;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}

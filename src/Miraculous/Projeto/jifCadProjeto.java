/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miraculous.Projeto;

import Miraculous.Projeto.Projeto;
import java.awt.event.KeyEvent;

/**
 *
 * @author Felipe
 */
public class jifCadProjeto extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifCadProjeto
     */
    ProjetoDAO ad = new ProjetoDAO();
    Projeto a = new Projeto();
    public jifCadProjeto() {
        initComponents();
        ad.conectar();
        setSize(850,570);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeP = new javax.swing.JTextField();
        txtNomeE = new javax.swing.JTextField();
        BtnCadP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataFim = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadFuncP = new javax.swing.JMenuItem();
        ConsuCad = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuProj = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jConsuProj = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Projetos");
        getContentPane().setLayout(null);

        jLabel3.setText("Data de inicio");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 100, 20);

        jLabel4.setText("Nome da Empresa");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 110, 30);

        jLabel6.setText("Data de Termino");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 100, 30);

        txtNomeP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomePKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomeP);
        txtNomeP.setBounds(120, 30, 194, 30);

        txtNomeE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeEKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomeE);
        txtNomeE.setBounds(120, 70, 194, 30);

        BtnCadP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCadP.setText("Cadastrar");
        BtnCadP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnCadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadPActionPerformed(evt);
            }
        });
        BtnCadP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnCadPKeyPressed(evt);
            }
        });
        getContentPane().add(BtnCadP);
        BtnCadP.setBounds(210, 360, 101, 30);

        jLabel1.setText("Nome do Projeto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 100, 30);

        jLabel2.setText("CNPJ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 120, 40, 30);

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioActionPerformed(evt);
            }
        });
        txtDataInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataInicioKeyPressed(evt);
            }
        });
        getContentPane().add(txtDataInicio);
        txtDataInicio.setBounds(140, 170, 88, 30);

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataFimKeyPressed(evt);
            }
        });
        getContentPane().add(txtDataFim);
        txtDataFim.setBounds(140, 220, 88, 30);

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCnpjKeyPressed(evt);
            }
        });
        getContentPane().add(txtCnpj);
        txtCnpj.setBounds(120, 120, 182, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Miraculous/Icone.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 0, 600, 520);

        jMenu1.setText("Funcionario");

        CadFuncP.setText("Cadastrar Funcionario");
        CadFuncP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncPActionPerformed(evt);
            }
        });
        jMenu1.add(CadFuncP);

        ConsuCad.setText("Consultar Cadastros");
        jMenu1.add(ConsuCad);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Serviços");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        MenuProj.setText("Projeto");

        jMenuItem5.setText("Cadastrar novo Projeto");
        MenuProj.add(jMenuItem5);

        jConsuProj.setText("Consultar Projetos");
        MenuProj.add(jConsuProj);

        jMenuBar1.add(MenuProj);

        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadPActionPerformed
        // Cadastro de projetos
        try{
            a.setNomeP(txtNomeP.getText());
            a.setNomeE(txtNomeE.getText());
            a.setCnpj((txtCnpj.getText()));
            a.setDataInicio((txtDataInicio.getText()));
            a.setDataFim((txtDataFim.getText()));

            //ag.setGraduacao(txt_graduacao.getText());
            System.out.println("\n"+a.getNomeP()+"\n"+a.getNomeE()+"\n"+a.getDataInicio()+"\n"+a.getDataFim()+"\n"+a.getCnpj()+"\n");
            ad.conectar();
            ad.inserirP(a.getId_Proj(),a.getNomeP(),a.getNomeE(),a.getCnpj(),a.getDataInicio(),a.getDataFim());
            txtNomeP.setText("");
            txtNomeE.setText("");
            txtCnpj.setText("");
            txtDataInicio.setText("");
            txtDataFim.setText("");

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro: " + e);
        }

    }//GEN-LAST:event_BtnCadPActionPerformed

    private void txtNomePKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtNomeE.grabFocus();
        }
    }//GEN-LAST:event_txtNomePKeyPressed

    private void txtNomeEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtCnpj.grabFocus();
        }
    }//GEN-LAST:event_txtNomeEKeyPressed

    private void BtnCadPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnCadPKeyPressed
       if(evt.getKeyCode () == KeyEvent.VK_ENTER){
           BtnCadP.doClick();
       }
    }//GEN-LAST:event_BtnCadPKeyPressed

    private void txtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDataInicioActionPerformed

    private void txtDataInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataInicioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
           txtDataFim.grabFocus();
        }
    }//GEN-LAST:event_txtDataInicioKeyPressed

    private void txtDataFimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataFimKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
           BtnCadP.grabFocus();
        }
    }//GEN-LAST:event_txtDataFimKeyPressed

    private void CadFuncPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncPActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CadFuncPActionPerformed

    private void txtCnpjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnpjKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
           txtDataInicio.grabFocus();
        }
    }//GEN-LAST:event_txtCnpjKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadP;
    private javax.swing.JMenuItem CadFuncP;
    private javax.swing.JMenuItem ConsuCad;
    private javax.swing.JMenu MenuProj;
    private javax.swing.JMenuItem jConsuProj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtNomeE;
    private javax.swing.JTextField txtNomeP;
    // End of variables declaration//GEN-END:variables
}

package Miraculous.Funcionario;

import Miraculous.Funcionario.CadFunc;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stavo
 */
public class jifCadfunc extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifCadFunc
     */
   funcDAO ad = new funcDAO();
   CadFunc a = new CadFunc();
    public jifCadfunc() {
        initComponents();
          ad.conectar(); 
          setSize(800,639);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtProj = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnCadastrar3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtDataN = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Funcionarios");
        getContentPane().setLayout(null);

        jLabel22.setText("Nome: ");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 60, 60, 30);

        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnometxtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtnome);
        txtnome.setBounds(78, 63, 247, 30);

        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCargotxtCargoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCargo);
        txtCargo.setBounds(90, 230, 200, 30);

        txtSal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaltxtSalKeyPressed(evt);
            }
        });
        getContentPane().add(txtSal);
        txtSal.setBounds(90, 280, 197, 30);

        jLabel23.setText("Cargo: ");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(30, 230, 60, 30);

        jLabel24.setText("Salario: ");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 280, 50, 30);

        txtProj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProjtxtProjKeyPressed(evt);
            }
        });
        getContentPane().add(txtProj);
        txtProj.setBounds(90, 330, 194, 30);

        jLabel25.setText("Projeto: ");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(30, 330, 60, 30);

        jLabel26.setText("CPF: ");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 110, 50, 30);

        jLabel28.setText("Data de Nascimento: ");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(10, 170, 103, 30);

        btnCadastrar3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrar3.setText("Cadastrar");
        btnCadastrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar3btnCadastrarActionPerformed(evt);
            }
        });
        btnCadastrar3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrar3btnCadastrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastrar3);
        btnCadastrar3.setBounds(300, 430, 147, 36);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/LOGO.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(200, 0, 590, 600);

        try {
            txtDataN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNActionPerformed(evt);
            }
        });
        txtDataN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataNKeyPressed(evt);
            }
        });
        getContentPane().add(txtDataN);
        txtDataN.setBounds(130, 170, 88, 30);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(80, 110, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnometxtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnometxtNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnometxtNomeKeyPressed

    private void txtCargotxtCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargotxtCargoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargotxtCargoKeyPressed

    private void txtSaltxtSalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaltxtSalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaltxtSalKeyPressed

    private void txtProjtxtProjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProjtxtProjKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProjtxtProjKeyPressed

    private void btnCadastrar3btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar3btnCadastrarActionPerformed
  
            a.setNome(txtnome.getText());
            a.setCpf(txtCpf.getText());
            a.setDtn(txtDataN.getText());
            a.setCargo(txtCargo.getText()); 
            a.setSalario(Float.parseFloat(txtSal.getText()));
            a.setProjeto(txtProj.getText());
            
            System.out.println(a.getId_func()+"\n"+a.getNome()+"\n"+a.getCpf()+"\n"+a.getCargo()+"\n"+a.getDtn()+"\n"+a.getSalario()+"\n"+a.getProjeto());
            ad.conectar();
            ad.inserir(a.getId_func(),a.getNome(),a.getCpf(),a.getDtn(),a.getCargo(),a.getSalario(),a.getProjeto());
            txtnome.setText("");
            txtCpf.setText("");
            txtDataN.setText("");
            txtCargo.setText(""); 
            txtSal.setText("");
            txtProj.setText("");
        
        
    }//GEN-LAST:event_btnCadastrar3btnCadastrarActionPerformed

    private void btnCadastrar3btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrar3btnCadastrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrar3btnCadastrarKeyPressed

    private void txtDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDataNActionPerformed

    private void txtDataNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataNKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDataNKeyPressed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar3;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataN;
    private javax.swing.JTextField txtProj;
    private javax.swing.JTextField txtSal;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
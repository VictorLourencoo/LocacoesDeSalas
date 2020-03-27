package view;

import Controller.Alugar_SalaController;
import Controller.LoginController;
import DAO.AlugarSalaDAO;
import Model.Aluno;

import javax.swing.JOptionPane;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaLogin_1 extends javax.swing.JFrame {
 
    
              LoginController loginC = new LoginController();      
              TelaAluno tl = new TelaAluno();
 public TelaLogin_1() throws SQLException, ClassNotFoundException {
        initComponents();
        
}
 
    Alugar_SalaController as = new Alugar_SalaController();
 public void login() throws SQLException, ParseException, ClassNotFoundException{
     String matricula = txtLogin.getText();
     String senha = txtSenha.getText();
     
long matriculaL=  Long.parseLong(matricula);
     
     if(matricula.equals("") || senha.equals("")){
         JOptionPane.showMessageDialog(null, "Login em branco");
         
     } 
            as.verificad();
     Aluno aluno = loginC.loginC(matriculaL, senha);
    
     TelaAluno ff = new TelaAluno();
     
             
     if(aluno != null){
         dispose();
          TelaAluno tela_aluno = new TelaAluno();
          tela_aluno.setVisible(true);
        //AlunoModel.addrow(aluno);
         
     }else{
          JOptionPane.showMessageDialog(null, "Acesso negado");
             
         TelaLogin_1 tl = new TelaLogin_1();
            tl.setVisible(true);
         dispose();
      
     }
     
     
 }
 
 
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        txtLogin = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        CriarConta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Login");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mages/Sem título-1333.png"))); // NOI18N

        txtLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "MATRÍCULA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(40, 40, 40))); // NOI18N
        try {
            txtLogin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SENHA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(40, 40, 40))); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(242, 242, 242));
        Login.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Login.setText("LOGIN");
        Login.setBorder(null);
        Login.setName(""); // NOI18N
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        CriarConta.setBackground(new java.awt.Color(255, 255, 255));
        CriarConta.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        CriarConta.setText("CRIAR CONTA");
        CriarConta.setBorder(null);
        CriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarContaActionPerformed(evt);
            }
        });

        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(icon)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(icon)
                .addGap(28, 28, 28)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarContaActionPerformed
      
        TelaCadastro_1 tc;
                  try {
                      tc = new TelaCadastro_1();
                       tc.setVisible(true);
                        dispose();
                  } catch (SQLException ex) {
                      Logger.getLogger(TelaLogin_1.class.getName()).log(Level.SEVERE, null, ex);
                  }
       
        
    }//GEN-LAST:event_CriarContaActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
  try {
      try {
          try {
              login();
              
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TelaLogin_1.class.getName()).log(Level.SEVERE, null, ex);
          }
      } catch (ParseException ex) {
          Logger.getLogger(TelaLogin_1.class.getName()).log(Level.SEVERE, null, ex);
      }
         
     } catch (SQLException ex) {
         Logger.getLogger(TelaLogin_1.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_LoginActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CriarConta;
    private javax.swing.JButton Login;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}

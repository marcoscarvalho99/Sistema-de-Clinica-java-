package visão;

import javax.swing.JOptionPane;
import modeloBeans.BeansCadastrar;
import modeloDAO.DaoCadastrar;

public class TelaLogin extends javax.swing.JFrame {
    public TelaLogin() {
        
        //setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonCad = new javax.swing.JButton();
        jLabelFundoIcon = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Marcos-logo-640x460.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(674, 460));
        jLabel1.setVerifyInputWhenFocusTarget(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(83, 270, 100, 23);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(210, 270, 80, 23);

        jLabelUsuario.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(240, 240, 240));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(10, 120, 80, 30);

        jLabelSenha.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(240, 240, 240));
        jLabelSenha.setText("Senha:");
        jLabelSenha.setToolTipText("");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(10, 150, 80, 30);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(89, 130, 210, 20);

        jPasswordField.setBorder(null);
        jPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jPasswordField.setHighlighter(null);
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(90, 160, 210, 14);

        jButtonCad.setText("Cadastrar  Usuario");
        jButtonCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCad);
        jButtonCad.setBounds(320, 270, 170, 23);

        jLabelFundoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/unnamed.png"))); // NOI18N
        getContentPane().add(jLabelFundoIcon);
        jLabelFundoIcon.setBounds(80, 80, 450, 420);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, -50, 610, 440);

        setSize(new java.awt.Dimension(627, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        BeansCadastrar cad = new BeansCadastrar();
        DaoCadastrar c = new DaoCadastrar();
        String temp= pegarValor();
        c.setUsuario(temp);
        c.Buscar(cad);
        
        
        if(jTextFieldUsuario.getText().equals(c.getUsuario()) && jPasswordField.getText().equals(c.getSenha())){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
        }
       
        else if((jTextFieldUsuario.getText() == null ? c.getUsuario() != null : !jTextFieldUsuario.getText().equals(c.getUsuario())) && jPasswordField.getText().equals(c.getSenha())){
        JOptionPane.showMessageDialog(rootPane, "Usuario invalido!");
        }
        else if((jPasswordField.getText() == null ? c.getSenha() != null : !jPasswordField.getText().equals(c.getSenha())) && jTextFieldUsuario.getText().equals(c.getUsuario())){
        JOptionPane.showMessageDialog(rootPane, "senha invalida!");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Campo de usuario e senha invalido");
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed
public String pegarValor(){
    
    return jTextFieldUsuario.getText();
}
    private void jButtonCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadActionPerformed
        TelaCadastrarUsuario tela = new TelaCadastrarUsuario();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonCad;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundoIcon;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}

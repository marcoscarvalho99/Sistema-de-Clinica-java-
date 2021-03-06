/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;
import modeloDAO.DAOMedico;

/**
 *
 * @author lenovo
 */
public class TelaEditar extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditarmedico
     */
    public TelaEditar() {
        initComponents();
      this.setLocationRelativeTo(null);//centraliza a tela
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeMedico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEspecialidadeMedico = new javax.swing.JTextField();
        jTextFieldIdadeMedico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonConcluir = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jTextFieldNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeMedico);
        jTextFieldNomeMedico.setBounds(140, 140, 350, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Novo Nome:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 144, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Nova Especialidade:");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 204, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Nova Idade:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 264, 120, 30);
        getContentPane().add(jTextFieldEspecialidadeMedico);
        jTextFieldEspecialidadeMedico.setBounds(210, 200, 280, 30);
        getContentPane().add(jTextFieldIdadeMedico);
        jTextFieldIdadeMedico.setBounds(140, 260, 350, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-voltar-16.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setName(""); // NOI18N
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 40, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Id do medico:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 92, 150, 30);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(150, 90, 340, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMedico.png"))); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, -50, 100, 250);

        jButtonConcluir.setText("Concluir");
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConcluir);
        jButtonConcluir.setBounds(250, 300, 120, 23);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 600, 350);

        setBounds(0, 0, 613, 385);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMedicoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaMedicos tela = new TelaMedicos();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
      //  JOptionPane.showMessageDialog(null, "entrou no botao concluir");
        BeansMedico m = new BeansMedico();
       
       m.setNomeMedico(jTextFieldNomeMedico.getText());
       m.setEspecialização(jTextFieldEspecialidadeMedico.getText());
       m.setIdadeMedico(jTextFieldIdadeMedico.getText());
       m.setCodigoMedico(Integer.parseInt(jTextFieldId.getText()));
       DAOMedico edit = new DAOMedico();
       edit.Editar(m);
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JTextField jTextFieldEspecialidadeMedico;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdadeMedico;
    private javax.swing.JTextField jTextFieldNomeMedico;
    // End of variables declaration//GEN-END:variables
}

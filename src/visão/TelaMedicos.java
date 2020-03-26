/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import modeloConexao.ConexaoBd;
import modeloDAO.DAOMedico;
import modeloBeans.BeansMedico;

/**
 *
 * @author lenovo
 */
public class TelaMedicos extends javax.swing.JFrame {

    
    DAOMedico daomedico = new DAOMedico();
    ConexaoBd con = new ConexaoBd();
    BeansMedico mod = new BeansMedico();
    /**
     * Creates new form Medicos
     */
    public TelaMedicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEspecialização = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPesquisaNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPesquisaEpecializacao = new javax.swing.JTextField();
        jTextFieldPesquisaIdade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPesquisaCodigo = new javax.swing.JTextField();
        jLabelBackgd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        getContentPane().setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelNome.setText("Nome completo:");
        jLabelNome.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(60, 120, 110, 17);

        jLabelTitulo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabelTitulo.setText("Cadastrar Médico");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(180, 30, 340, 40);
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(170, 180, 70, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Especialização:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 150, 100, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Idade:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 180, 60, 17);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(170, 120, 360, 20);

        jTextFieldEspecialização.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEspecializaçãoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEspecialização);
        jTextFieldEspecialização.setBounds(170, 150, 360, 20);

        jButtonAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAdicionar.setFont(new java.awt.Font("Times New Roman", 1, 8)); // NOI18N
        jButtonAdicionar.setForeground(new java.awt.Color(0, 0, 153));
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.setBorder(null);
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionar);
        jButtonAdicionar.setBounds(250, 180, 40, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Pesquisar:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 180, 70, 14);

        jTextFieldPesquisar.setToolTipText("");
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisar);
        jTextFieldPesquisar.setBounds(370, 180, 140, 20);

        jButtonPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisa-paga-12.png"))); // NOI18N
        jButtonPesquisar.setBorder(null);
        jButtonPesquisar.setBorderPainted(false);
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(510, 180, 20, 20);

        jTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablePesquisa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 290, 130);

        jButtonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-voltar-16.png"))); // NOI18N
        jButtonVoltar.setToolTipText("Voltar para tela anterior");
        jButtonVoltar.setAutoscrolls(true);
        jButtonVoltar.setBorder(null);
        jButtonVoltar.setBorderPainted(false);
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(49, 20));
        jButtonVoltar.setRequestFocusEnabled(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(-20, 0, 70, 40);

        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 230, 60, 14);
        getContentPane().add(jTextFieldPesquisaNome);
        jTextFieldPesquisaNome.setBounds(360, 230, 210, 20);

        jLabel5.setText("Especialização");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 260, 100, 14);

        jLabel6.setText("Idade");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 290, 60, 14);

        jTextFieldPesquisaEpecializacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaEpecializacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisaEpecializacao);
        jTextFieldPesquisaEpecializacao.setBounds(410, 260, 160, 20);
        getContentPane().add(jTextFieldPesquisaIdade);
        jTextFieldPesquisaIdade.setBounds(370, 290, 60, 20);

        jLabel7.setText("codigo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 290, 80, 14);
        getContentPane().add(jTextFieldPesquisaCodigo);
        jTextFieldPesquisaCodigo.setBounds(520, 290, 59, 20);

        jLabelBackgd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/maxresdefault.jpg"))); // NOI18N
        jLabelBackgd.setText("jLabelFundo");
        jLabelBackgd.setToolTipText("");
        getContentPane().add(jLabelBackgd);
        jLabelBackgd.setBounds(-10, 10, 600, 360);

        setSize(new java.awt.Dimension(616, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEspecializaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEspecializaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEspecializaçãoActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
      
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        mod.setNomeMedico(jTextFieldNome.getText());
        mod.setEspecialização(jTextFieldEspecialização.getText());
        mod.setIdadeMedico(jTextFieldIdade.getText());
        //System.out.println(mod.getEspecialização() + mod.getIdadeMedico()+ mod.getNomeMedico());
        
        daomedico.Salvar(mod);
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
       TelaPrincipal tela = new TelaPrincipal();
       tela.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldPesquisaEpecializacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaEpecializacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaEpecializacaoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisar.getText());
       BeansMedico model = daomedico.buscarmedico(mod);
        jTextFieldPesquisaNome.setText(mod.getNomeMedico());
         jTextFieldPesquisaEpecializacao.setText(mod.getEspecialização());
         jTextFieldPesquisaCodigo.setText(String.valueOf(mod.getCodigoMedico()));
         jTextFieldPesquisaIdade.setText(mod.getIdadeMedico());

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBackgd;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisa;
    private javax.swing.JTextField jTextFieldEspecialização;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisaCodigo;
    private javax.swing.JTextField jTextFieldPesquisaEpecializacao;
    private javax.swing.JTextField jTextFieldPesquisaIdade;
    private javax.swing.JTextField jTextFieldPesquisaNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}

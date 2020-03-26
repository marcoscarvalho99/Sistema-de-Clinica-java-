
package visão;

import modeloConexao.ConexaoBd;
import javax.swing.JMenuItem;


public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBd conect= new ConexaoBd();
    public TelaPrincipal() {
        initComponents();
        
        conect.conexao();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadMedicos = new javax.swing.JButton();
        jButtonPacientes = new javax.swing.JButton();
        jButtonEnfermeiras = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelBackgroud = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemMedicos = new javax.swing.JMenuItem();
        jMenuItemPaciente = new javax.swing.JMenuItem();
        jMenuItemEnfermeira = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuConfiguração = new javax.swing.JMenu();
        jMenuItemVoltar = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonCadMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMedico.png"))); // NOI18N
        jButtonCadMedicos.setToolTipText("cadastrar medico");
        jButtonCadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadMedicos);
        jButtonCadMedicos.setBounds(50, 300, 70, 70);

        jButtonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPaciente.png"))); // NOI18N
        jButtonPacientes.setToolTipText("cadastrar pacientes");
        jButtonPacientes.setMaximumSize(new java.awt.Dimension(40, 40));
        jButtonPacientes.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonPacientes.setName(""); // NOI18N
        jButtonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPacientes);
        jButtonPacientes.setBounds(260, 300, 70, 70);

        jButtonEnfermeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconEnfermeira.png"))); // NOI18N
        jButtonEnfermeiras.setToolTipText("Cadastrar enfermeiras");
        jButtonEnfermeiras.setMaximumSize(new java.awt.Dimension(40, 40));
        jButtonEnfermeiras.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonEnfermeiras.setName(""); // NOI18N
        jButtonEnfermeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnfermeirasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnfermeiras);
        jButtonEnfermeiras.setBounds(160, 300, 70, 70);

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(240, 240, 240));
        jLabelTitulo.setText("Menu Principal");
        jLabelTitulo.setToolTipText("");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(250, 10, 240, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Seja Ben-Vindo ao nosso App de Cadastro, fique avontade para usufluir de nosso sistema!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 100, 630, 100);

        jLabelBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/maxresdefault.jpg"))); // NOI18N
        jLabelBackgroud.setText("jLabelBackgroud");
        jLabelBackgroud.setToolTipText("");
        jLabelBackgroud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelBackgroud.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        getContentPane().add(jLabelBackgroud);
        jLabelBackgroud.setBounds(0, 0, 710, 420);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-voltar-16.png"))); // NOI18N
        jMenu1.setToolTipText("Voltar para pagina anterior");
        jMenu1.setContentAreaFilled(false);
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuCadastrar.setText("Novo Cadastro");

        jMenuItemMedicos.setText("Medicos");
        jMenuItemMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMedicosActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemMedicos);

        jMenuItemPaciente.setText("Pacientes");
        jMenuItemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacienteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemPaciente);

        jMenuItemEnfermeira.setText("Enfermeiras(o)");
        jMenuCadastrar.add(jMenuItemEnfermeira);

        jMenuItemUsuario.setText("Úsuarios");
        jMenuCadastrar.add(jMenuItemUsuario);

        jMenuBar1.add(jMenuCadastrar);

        jMenuConfiguração.setText("Configuração");

        jMenuItemVoltar.setText("Voltar");
        jMenuItemVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVoltarActionPerformed(evt);
            }
        });
        jMenuConfiguração.add(jMenuItemVoltar);

        jMenuBar1.add(jMenuConfiguração);

        jMenuOpcoes.setText("Opções");
        jMenuOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpcoesActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("Saiir");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemSair);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleParent(jLabelBackgroud);

        setSize(new java.awt.Dimension(733, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMedicosActionPerformed
        TelaMedicos medico = new TelaMedicos();
        medico.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemMedicosActionPerformed

    private void jButtonCadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicosActionPerformed
        // TODO add your handlhuing code here:
         TelaMedicos medico = new TelaMedicos();
        medico.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadMedicosActionPerformed
    
    private void jButtonEnfermeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnfermeirasActionPerformed
        
         TelaMedicos medico = new TelaMedicos();
        medico.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEnfermeirasActionPerformed

    private void jMenuOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpcoesActionPerformed
//        System.exit(0);
//         conect.desconexao();
//        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuOpcoesActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVoltarActionPerformed
        // TODO add your handling code here:
         
        TelaLogin tela1 = new TelaLogin();
        tela1.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItemVoltarActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        conect.desconexao();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacientesActionPerformed
        TelaPacientes P = new TelaPacientes();
        P.setVisible(true);
    }//GEN-LAST:event_jButtonPacientesActionPerformed

    private void jMenuItemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPacienteActionPerformed
        // TODO add your handling code here:
         TelaPacientes P = new TelaPacientes();
        P.setVisible(true);
    }//GEN-LAST:event_jMenuItemPacienteActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadMedicos;
    private javax.swing.JButton jButtonEnfermeiras;
    private javax.swing.JButton jButtonPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBackgroud;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenu jMenuConfiguração;
    private javax.swing.JMenuItem jMenuItemEnfermeira;
    private javax.swing.JMenuItem jMenuItemMedicos;
    private javax.swing.JMenuItem jMenuItemPaciente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenuItem jMenuItemVoltar;
    private javax.swing.JMenu jMenuOpcoes;
    // End of variables declaration//GEN-END:variables
}

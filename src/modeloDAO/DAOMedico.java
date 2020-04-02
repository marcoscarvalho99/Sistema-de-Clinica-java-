/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import modeloConexao.ConexaoBd;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;
import visão.TelaMedicos;

/**
 *
 * @author lenovo
 */
public class DAOMedico {
    ConexaoBd conect = new ConexaoBd(); 
    BeansMedico mod = new BeansMedico();
   private boolean t=false;
   static boolean n=false;
    
    
    
    public void Editar( BeansMedico mod){
        conect.conexao();
        
        try {
           // JOptionPane.showMessageDialog(null,"entrou no editar");
            PreparedStatement pst=conect.con.prepareStatement("update newmedico set namemedico=?,especialidade=?,idademedico=? where idmedico=?");
            pst.setString(1, mod.getNomeMedico());
            pst.setString(2, mod.getEspecialização());
            pst.setString(3, mod.getIdadeMedico());
            pst.setInt(4,mod.getCodigoMedico());
            pst.execute();
            JOptionPane.showMessageDialog(null,"concluiu a edição com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro no editar "+ ex);
        }
        
        conect.desconexao();
    }
    //finção para aparecer o botão excluir quando necessario.
    public boolean testar(){
        if(n==true){
            t=true;        
        }else{
            t=false;
        }
    return t;
    }
    
    public void Salvar(BeansMedico mod){
      
        try {
             conect.conexao();
           // PreparedStatement pst=conect.con.prepareStatement("INSERT INTO medico(nome_medico,especialidade,idade_medico) values (?,?,?)");
           PreparedStatement pst=conect.con.prepareStatement("INSERT INTO newmedico(namemedico,especialidade,idademedico) VALUES (?,?,?)"); 
           pst.setString(1,(String)mod.getNomeMedico());
            pst.setString(2,(String) mod.getEspecialização());
            pst.setString(3,(String)mod.getIdadeMedico());
            pst.execute();
            JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(DAOMedico.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"erro ao inserir dados "+ ex.getMessage());
        }
        
        conect.desconexao();
    }
    
    public BeansMedico buscarmedico(BeansMedico mod){
       conect.conexao();
       
       conect.executaSql("SELECT *FROM newmedico where namemedico like '%"+mod.getPesquisa()+"%'");
       
       try {
            conect.rs.first();
            mod.setCodigoMedico(conect.rs.getInt("idmedico"));
            mod.setNomeMedico(conect.rs.getString("namemedico"));
            mod.setEspecialização(conect.rs.getString("especialidade"));
            mod.setIdadeMedico(conect.rs.getString("idademedico"));
            n=true;
            testar();
        } catch (SQLException ex) {
            n=false;
            testar();
            JOptionPane.showMessageDialog(null, "Está pessoa não existe no nosso banco de dados"+ex);
        }
       conect.desconexao();
        return mod;
    }
    
    public void excluir(BeansMedico m){
        conect.conexao();
        try { 
            PreparedStatement pst=conect.con.prepareStatement("DELETE FROM newmedico WHERE idmedico=?");
             pst.setInt(1,m.getCodigoMedico());
             pst.execute(); //sempre esqueço que ao finl é pra colocar o execute.
             JOptionPane.showMessageDialog(null,"excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro no excluir"+ ex);
        }
        
        
        conect.desconexao();
    }
}

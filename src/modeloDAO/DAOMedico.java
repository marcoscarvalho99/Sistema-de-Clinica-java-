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

/**
 *
 * @author lenovo
 */
public class DAOMedico {
    ConexaoBd conect = new ConexaoBd(); 
    BeansMedico mod = new BeansMedico();
    
    
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
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Está pessoa não existe no nosso banco de dados"+ex);
        }
       conect.desconexao();
       
        
        return mod;
        
    }
}

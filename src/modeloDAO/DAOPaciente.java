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
import modeloBeans.BeansPaciente;

/**
 *
 * @author lenovo
 */
public class DAOPaciente {
    
    ConexaoBd conect = new ConexaoBd();
    BeansPaciente paciente= new BeansPaciente();
    
    
     public void Salvar(BeansPaciente mod){
      
        try {
             conect.conexao();
          
           PreparedStatement pst=conect.con.prepareStatement("INSERT INTO paciente(namepaciente,cpf,idadepaciente) VALUES (?,?,?)"); 
           pst.setString(1,(String)mod.getNomePaciente());
            pst.setString(2,(String) mod.getCpf());
            pst.setString(3,(String)mod.getIdade());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(DAOMedico.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"erro ao inserir dados "+ ex.getMessage());
        }
        
        conect.desconexao();
    }
}


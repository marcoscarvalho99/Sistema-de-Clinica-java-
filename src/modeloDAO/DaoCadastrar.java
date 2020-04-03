
package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansCadastrar;
import modeloConexao.ConexaoBd;

public class DaoCadastrar {
     ConexaoBd conect = new ConexaoBd();
     BeansCadastrar cad =new BeansCadastrar();



public void SalvarDados(BeansCadastrar cad){
 try {
             conect.conexao();
           
           PreparedStatement pst=conect.con.prepareStatement("INSERT INTO cred(usuario,senha) VALUES (?,?)"); 
           pst.setString(1,cad.getUsuario());
            pst.setString(2,cad.getSenha());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"erro ao inserir dados "+ ex.getMessage());
        }
        
        conect.desconexao();

}

public BeansCadastrar Buscar(BeansCadastrar cad){
     conect.conexao();
       
       conect.executaSql("SELECT *FROM cred");
       
       try {
            conect.rs.first();
            cad.setUsuario(conect.rs.getString("usuario"));
            cad.setSenha(conect.rs.getString("senha"));
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Está pessoa não existe no nosso banco de dados"+ex);
        }
       conect.desconexao();
        return cad;
    
}
}




package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansCadastrar;
import modeloConexao.ConexaoBd;
import visão.TelaCadastrarUsuario;
import visão.TelaLogin;

public class DaoCadastrar {
     ConexaoBd conect = new ConexaoBd();
     BeansCadastrar cad =new BeansCadastrar();
     private String senha;
     private String Usuario;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }



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
       TelaLogin usuario =new TelaLogin(); 
       //essa linha de codigo elecion na tabela apenas o campo que no caso é o de usuario que seja existente se for salva na linha 64 e 65
       conect.executaSql("SELECT *FROM cred where usuario like '%"+getUsuario()+"%'");
       
       try {
            conect.rs.first();
            setUsuario(conect.rs.getString("usuario"));
            setSenha(conect.rs.getString("senha"));
            
            //System.out.println("senha: " + getSenha()+"usuario"+ getUsuario()+ usuario.pegarValor());
            
        } catch (SQLException ex) {
            
            //JOptionPane.showMessageDialog(null, "Está pessoa não existe no nosso banco de dados"+ex);
        }
       conect.desconexao();
        return cad;
    
}
}



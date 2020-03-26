/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConexao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class ConexaoBd {
    
    
   public  Statement stm;//pesquisa no banco de dados  usa ele
   public ResultSet rs; //armazena o resultado da pesquisa
   private String driver= "org.postgresql.Driver"; // identifica o banco de dados
   private String caminho="jdbc:postgresql://localhost/postgres"; //qual caminho do bd
   private String usuario="postgres"; // usuario do banco de dados
   private String senha="marcos"; //senha do bancodedados
   public Connection con=null; //conexão
   
       
   
   
   public void conexao(){
//setar a propriedade do drive de conexão
       try {
           System.setProperty("jdbc.Drivers",driver);
           con=DriverManager.getConnection(caminho, usuario,senha);
           //JOptionPane.showMessageDialog(null, "conexao com bd sucefull");
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro conexao com bd sucefull\n" + ex.getMessage() );
       }
   }
   public void desconexao(){
       try {
          //JOptionPane.showMessageDialog(null, "desconexão realizada com sucefull\n");
           con.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro ao desconexao com bd \n" + ex.getMessage() );
       }
   
   }
   
   public void executaSql(String sql){
       try {
           stm= con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
       rs = stm.executeQuery(sql);
       }catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "erro ao executar Sql"+ ex.getMessage());
       }
   }
   
}

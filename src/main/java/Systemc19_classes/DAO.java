package Systemc19_classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

//classe para obter dados da DB


public class DAO {
    
    public Usuario checarUsuario(String usuario, String senha ) throws Exception{
        //cria comando sql
        String sql = "SELECT * FROM usuarios_tb  WHERE usuario = ? AND senha = ?";
        
        try
        {

            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery(); // procura pelo usuario e senha na db
            
            while (rs.next()){
                //caso rs.next nao for false,  cria um novo Usuario que sera usado no resto da aplicação
                
                int id = rs.getInt("id");
                String tempUsuario = rs.getString("usuario");
                String tempSenha = rs.getString("senha");
                boolean tagAdm = rs.getBoolean("tagAdm");
                System.out.println("Usuario " + id + " Encontrado");
                String tipoUsuario = tagAdm ? "Admin" : "Atendente" ;
                JOptionPane.showMessageDialog(null,"Bem vindo" + tipoUsuario);
                return new Usuario(id, tempUsuario, tempSenha, tagAdm);                            
            }
            
            
            

        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Erro ao encontrar usuario no BD");
        }
        System.out.println("Erro ao encontrar usuario");
        JOptionPane.showMessageDialog(null,"Usuario invalido" ,"Erro", JOptionPane.ERROR_MESSAGE);
        return null;

    }   
}


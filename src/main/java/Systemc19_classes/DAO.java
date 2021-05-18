package Systemc19_classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

//classe para obter dados da DB


public class DAO {
    
    public static Usuario checarUsuario(String usuario, String senha ) throws Exception{
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
                //caso rs.next nao for false,  retorna um novo Usuario que sera usado no resto da aplicação
                int id = rs.getInt("id");
                String tempUsuario = rs.getString("usuario");
                String tempSenha = rs.getString("senha");
                boolean tagAdm = rs.getBoolean("tagAdm");
                System.out.println("Usuario " + id + " Encontrado");
                return new Usuario(id, tempUsuario, tempSenha, tagAdm);                            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Erro ao encontrar usuario no BD");
        }
        System.out.println("Erro ao encontrar usuario");
        return null;

    }
    
    public static void cadastrarUsuario(String usuario, String senha, boolean tagAdm){
        //definir comando sql que sera utilizado
        String sql ="INSERT INTO usuarios_tb (usuario, senha, tagAdm) VALUES(?,?,?)";
        
        ConnectionFactory conexao = new ConnectionFactory();
        try (Connection  c = conexao.getConnection())    {
            //pré-compilar o comando sql
            PreparedStatement ps = c.prepareStatement(sql);
            
            //Preenche os dados da query
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ps.setBoolean(3, tagAdm);
            
            //Executa o comando
            ps.execute();
            System.out.println("Novo usuario cadastrado, adm: " + tagAdm );
            
        }
        catch(Exception e){
            System.out.println("Erro ao cadastrar novo us");
            e.printStackTrace();
        }
    }
    
    //metodos aualizarUsuario usam overload para caso caixa é adm for chechada
    public static void atualizarUsuario(int id ,String novoUsuario, String novaSenham, boolean tagAdm){
        
        String sql = "UPDATE usuarios_tb SET usuario = ?, senha = ?, tagAdm = ? WHERE id = ?" ;
        ConnectionFactory conexao = new ConnectionFactory();
        
        try (Connection  c = conexao.getConnection()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, novoUsuario);
            ps.setString(2, novaSenham);
            ps.setBoolean(3,tagAdm);
            ps.setInt(4, id);
            ps.execute();
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO att");
        }
    }
    
    public static void excluirUsuario(int id){
        String sql = "DELETE FROM usuarios_tb WHERE id = ?";
        ConnectionFactory conexao = new ConnectionFactory();
        try (Connection  c = conexao.getConnection()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO del");
        }
    }
    
    public static void cadastrarPessoa(String nome, int idade, boolean tagProf, String endereco){
        //definir comando sql que sera utilizado
        String sql ="INSERT INTO pessoas_tb (nome, idade, tagProf, endereco) VALUES(?,?,?,?)";
        
        ConnectionFactory conexao = new ConnectionFactory();
        try (Connection  c = conexao.getConnection())    {
            //pré-compilar o comando sql
            PreparedStatement ps = c.prepareStatement(sql);
            
            //Preenche os dados da query
            ps.setString(1, nome);
            ps.setInt(2, idade);
            ps.setBoolean(3, tagProf);
            ps.setString(4, endereco);
            
            //Executa o comando
            ps.execute();
            System.out.println("Nova pessoa cadastrada, nome: " + nome );
            
        }
        catch(Exception e){
            System.out.println("Erro ao cadastrar novo us");
            e.printStackTrace();
        }
    }
    

}


// package Systemc19_classes;


// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import javax.swing.JOptionPane;

// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */

// /**
//  *
//  * @author jhoni
//  */
// public class AdmControleDeDados {
    
//     private String usuario;
//     private String senha;
//     private int codigo;

//     public AdmControleDeDados(String usuario, String senha) {
//         this.usuario = usuario;
//         this.senha = senha;

//     }
    

//     public AdmControleDeDados(int codigo, String usuario, String senha) {
//         this(usuario,senha);
//         this.codigo = codigo;
        
//     }
    

//     public String getUsuario() {
//         return usuario;
//     }

//     public String getSenha() {
//         return senha;
//     }

//     public void setUsuario(String usuario) {
//         this.usuario = usuario;
//     }

//     public void setSenha(String senha) {
//         this.senha = senha;
//     }
//     public void inserir(){
//         //definir comando sql que sera utilizado
//         String sql ="INSERT INTO tb_usuarios(usuario, senha) VALUES(?,?)";
//         ConexaoBD conexao = new ConexaoBD();
//         try (Connection  c = conexao.obterConexao())    {
//             //pré-compilar o comando sql
//             PreparedStatement ps = c.prepareStatement(sql);
//             //Preenche os dados faltantes
//             ps.setString(1, usuario);
//             ps.setString(2, senha);
//             //Executa o comando
//             ps.execute();
//             JOptionPane.showMessageDialog(null, "Cadastro efetuado");
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }
//     public void atualizar(){
//         String sql = "UPDATE tb_usuarios SET usuario = ?, senha = ? WHERE id = ?" ;
//         ConexaoBD conexao = new ConexaoBD();
//         try (Connection c = conexao.obterConexao()){
//             PreparedStatement ps = c.prepareStatement(sql);
//             ps.setString(1, usuario);
//             ps.setString(2, senha);
//             ps.setInt(3, codigo);
//             ps.execute();
//             JOptionPane.showMessageDialog(null, "Usuário Atualizado com Sucesso!");
//         }
//         catch(Exception e){
//             e.printStackTrace();
//             JOptionPane.showMessageDialog(null, "ERRO");
//         }
//     }
//     public void excluir(){
//         String sql = "DELETE FROM tb_usuarios WHERE id = ?";
//         ConexaoBD conexao = new ConexaoBD();
//         try(Connection c = conexao.obterConexao()){
//             PreparedStatement ps = c.prepareStatement(sql);
//             ps.setInt(1,codigo);
//             ps.execute();
//             JOptionPane.showMessageDialog(null,"Usuário Deletado com Sucesso!");
//         }
//         catch (Exception e){
//             e.printStackTrace();
//             JOptionPane.showMessageDialog(null,"ERRO");
//         }
//     } 
// }

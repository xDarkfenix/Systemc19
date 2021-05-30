/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systemc19_telas;

import Systemc19_classes.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jhoni
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuarioLogado;
    
    public TelaPrincipal() {
        initComponents();
    }

    TelaPrincipal(Usuario usuarioLogado) {
        
        this.usuarioLogado = usuarioLogado;
        System.out.println(usuarioLogado.isTagAdm());
        initComponents();
        definirAcesso();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menuAdm = new javax.swing.JMenu();
        menuGerenciarUsuarios = new javax.swing.JMenu();
        cadUsuarioItem = new javax.swing.JMenuItem();
        altUsuarioItem = new javax.swing.JMenuItem();
        remUsuarioItem = new javax.swing.JMenuItem();
        menuGerenciarPessoas = new javax.swing.JMenu();
        flCadAdmjMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        grGerarRelatoriosAdmMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAtendente = new javax.swing.JMenu();
        menufila = new javax.swing.JMenu();
        itemFilaPrimeira = new javax.swing.JMenuItem();
        itemFilaSegunda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        itemDeslogar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(204, 0, 0));
        jDesktopPane1.setForeground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(85, 78, 164));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuAdm.setForeground(new java.awt.Color(0, 0, 0));
        menuAdm.setText("Administrador");
        menuAdm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                menuAdmStateChanged(evt);
            }
        });
        menuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmActionPerformed(evt);
            }
        });

        menuGerenciarUsuarios.setText("Gerenciar usuarios");

        cadUsuarioItem.setForeground(new java.awt.Color(0, 0, 0));
        cadUsuarioItem.setText("Cadastrar");
        cadUsuarioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUsuarioItemActionPerformed(evt);
            }
        });
        menuGerenciarUsuarios.add(cadUsuarioItem);

        altUsuarioItem.setForeground(new java.awt.Color(0, 0, 0));
        altUsuarioItem.setText("Alterar");
        altUsuarioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altUsuarioItemActionPerformed(evt);
            }
        });
        menuGerenciarUsuarios.add(altUsuarioItem);

        remUsuarioItem.setForeground(new java.awt.Color(0, 0, 0));
        remUsuarioItem.setText("Remover");
        remUsuarioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remUsuarioItemActionPerformed(evt);
            }
        });
        menuGerenciarUsuarios.add(remUsuarioItem);

        menuAdm.add(menuGerenciarUsuarios);

        menuGerenciarPessoas.setText("Gerenciar pessoas");

        flCadAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        flCadAdmjMenuItem.setText("Cadastrar");
        flCadAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flCadAdmjMenuItemActionPerformed(evt);
            }
        });
        menuGerenciarPessoas.add(flCadAdmjMenuItem);

        menuAdm.add(menuGerenciarPessoas);

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        menuAdm.add(jSeparator1);

        grGerarRelatoriosAdmMenuItem.setText("Gerar Relatórios");
        grGerarRelatoriosAdmMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grGerarRelatoriosAdmMenuItemActionPerformed(evt);
            }
        });
        menuAdm.add(grGerarRelatoriosAdmMenuItem);

        jMenuItem1.setText("Pessoas Vacinadas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAdm.add(jMenuItem1);

        barraMenu.add(menuAdm);

        menuAtendente.setText("Atendente");

        menufila.setText("Fila de Vacinação");

        itemFilaPrimeira.setText("Primeira dose");
        itemFilaPrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFilaPrimeiraActionPerformed(evt);
            }
        });
        menufila.add(itemFilaPrimeira);

        itemFilaSegunda.setText("Segunda dose");
        itemFilaSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFilaSegundaActionPerformed(evt);
            }
        });
        menufila.add(itemFilaSegunda);

        menuAtendente.add(menufila);

        barraMenu.add(menuAtendente);

        menuSair.setText("Sair");

        itemDeslogar.setText("Deslogar");
        itemDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeslogarActionPerformed(evt);
            }
        });
        menuSair.add(itemDeslogar);

        barraMenu.add(menuSair);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setSize(new java.awt.Dimension(1088, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
        private void definirAcesso() {
          
        if(!usuarioLogado.isTagAdm())
        { 
            menuAdm.setEnabled(false);
        }
    }
    
    private void grGerarRelatoriosAdmMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grGerarRelatoriosAdmMenuItemActionPerformed
        TelaGerarRelatorios telaGerarRelatorios = new TelaGerarRelatorios();
        jDesktopPane1.add(telaGerarRelatorios);
        telaGerarRelatorios.setVisible(true);
    }//GEN-LAST:event_grGerarRelatoriosAdmMenuItemActionPerformed

    private void flCadAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flCadAdmjMenuItemActionPerformed
        TelaCadPessoa telaAdmCadUser = new TelaCadPessoa();
        jDesktopPane1.add(telaAdmCadUser);
        telaAdmCadUser.setVisible(true);
    }//GEN-LAST:event_flCadAdmjMenuItemActionPerformed

    private void menuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmActionPerformed
        new TelaCadUsuario().setVisible(true);
    }//GEN-LAST:event_menuAdmActionPerformed

    private void remUsuarioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remUsuarioItemActionPerformed
        TelaRemUsuario telaRemUsuario = new TelaRemUsuario();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaRemUsuario.setLocation(this.getWidth()/2-telaRemUsuario.getWidth()/2, 0);
        jDesktopPane1.add(telaRemUsuario);
        telaRemUsuario.setVisible(true);
    }//GEN-LAST:event_remUsuarioItemActionPerformed

    private void altUsuarioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altUsuarioItemActionPerformed
        TelaAltUsuario telaAdmAlt = new TelaAltUsuario();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaAdmAlt.setLocation(this.getWidth()/2-telaAdmAlt.getWidth()/2, 0);
        jDesktopPane1.add(telaAdmAlt);
        telaAdmAlt.setVisible(true);
    }//GEN-LAST:event_altUsuarioItemActionPerformed

    private void cadUsuarioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUsuarioItemActionPerformed
        
        TelaCadUsuario telaCadUsuario = new TelaCadUsuario();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadUsuario.setLocation(this.getWidth()/2-telaCadUsuario.getWidth()/2, 0);
        jDesktopPane1.add(telaCadUsuario);
        telaCadUsuario.setVisible(true);

    }//GEN-LAST:event_cadUsuarioItemActionPerformed

    private void itemDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeslogarActionPerformed
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemDeslogarActionPerformed

    private void menuAdmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_menuAdmStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAdmStateChanged

    private void itemFilaPrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFilaPrimeiraActionPerformed
        TelaFilaDeVacinacao telaVacinacao = new TelaFilaDeVacinacao(false);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaVacinacao.setLocation(this.getWidth()/2-telaVacinacao.getWidth()/2, 0);
        jDesktopPane1.add(telaVacinacao);
        telaVacinacao.setVisible(true);
    }//GEN-LAST:event_itemFilaPrimeiraActionPerformed

    private void itemFilaSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFilaSegundaActionPerformed
        TelaFilaDeVacinacao telaVacinacao = new TelaFilaDeVacinacao(true);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaVacinacao.setLocation(this.getWidth()/2-telaVacinacao.getWidth()/2, 0);
        jDesktopPane1.add(telaVacinacao);
        telaVacinacao.setVisible(true);
    }//GEN-LAST:event_itemFilaSegundaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaMostrarTbPessoasVacinadas telaPessoasVac = new TelaMostrarTbPessoasVacinadas();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaPessoasVac.setLocation(this.getWidth()/2-telaPessoasVac.getWidth()/2, 0);
        jDesktopPane1.add(telaPessoasVac);
        telaPessoasVac.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altUsuarioItem;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem cadUsuarioItem;
    private javax.swing.JMenuItem flCadAdmjMenuItem;
    private javax.swing.JMenuItem grGerarRelatoriosAdmMenuItem;
    private javax.swing.JMenuItem itemDeslogar;
    private javax.swing.JMenuItem itemFilaPrimeira;
    private javax.swing.JMenuItem itemFilaSegunda;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAdm;
    private javax.swing.JMenu menuAtendente;
    private javax.swing.JMenu menuGerenciarPessoas;
    private javax.swing.JMenu menuGerenciarUsuarios;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menufila;
    private javax.swing.JMenuItem remUsuarioItem;
    // End of variables declaration//GEN-END:variables


}

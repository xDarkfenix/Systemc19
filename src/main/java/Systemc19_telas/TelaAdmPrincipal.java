/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Systemc19_telas;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jhoni
 */
public class TelaAdmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmPrincipal
     */
    public TelaAdmPrincipal() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        admAdmPri = new javax.swing.JMenu();
        cadAdmjMenuItem = new javax.swing.JMenuItem();
        altAdmjMenuItem = new javax.swing.JMenuItem();
        remAdmjMenuItem = new javax.swing.JMenuItem();
        atendenteAdmPrijMenu = new javax.swing.JMenu();
        atdCadAdmjMenuItem = new javax.swing.JMenuItem();
        atdAltAdmjMenuItem = new javax.swing.JMenuItem();
        atdRemAdmjMenuItem = new javax.swing.JMenuItem();
        gerarRelatoriosAdmPrijMenu = new javax.swing.JMenu();
        grGerarRelatoriosAdmMenuItem = new javax.swing.JMenuItem();
        filaDeVacinacaoAdmPrijMenu = new javax.swing.JMenu();
        flCadAdmjMenuItem = new javax.swing.JMenuItem();
        flVisuAdmjMenuItem = new javax.swing.JMenuItem();
        flConfirmarAdmjMenuItem = new javax.swing.JMenuItem();
        sobreAdmPrijMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        admAdmPri.setForeground(new java.awt.Color(0, 0, 0));
        admAdmPri.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_gray.png")); // NOI18N
        admAdmPri.setText("Administrador");
        admAdmPri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admAdmPriActionPerformed(evt);
            }
        });

        cadAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        cadAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_add.png")); // NOI18N
        cadAdmjMenuItem.setText("Cadastrar");
        cadAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAdmjMenuItemActionPerformed(evt);
            }
        });
        admAdmPri.add(cadAdmjMenuItem);

        altAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        altAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_edit.png")); // NOI18N
        altAdmjMenuItem.setText("Alterar");
        altAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altAdmjMenuItemActionPerformed(evt);
            }
        });
        admAdmPri.add(altAdmjMenuItem);

        remAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        remAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_delete.png")); // NOI18N
        remAdmjMenuItem.setText("Remover");
        remAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remAdmjMenuItemActionPerformed(evt);
            }
        });
        admAdmPri.add(remAdmjMenuItem);

        jMenuBar1.add(admAdmPri);

        atendenteAdmPrijMenu.setForeground(new java.awt.Color(0, 0, 0));
        atendenteAdmPrijMenu.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_green.png")); // NOI18N
        atendenteAdmPrijMenu.setText("Atendente");

        atdCadAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        atdCadAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_add.png")); // NOI18N
        atdCadAdmjMenuItem.setText("Cadastrar");
        atdCadAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atdCadAdmjMenuItemActionPerformed(evt);
            }
        });
        atendenteAdmPrijMenu.add(atdCadAdmjMenuItem);

        atdAltAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        atdAltAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_edit.png")); // NOI18N
        atdAltAdmjMenuItem.setText("Alterar");
        atdAltAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atdAltAdmjMenuItemActionPerformed(evt);
            }
        });
        atendenteAdmPrijMenu.add(atdAltAdmjMenuItem);

        atdRemAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        atdRemAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_delete.png")); // NOI18N
        atdRemAdmjMenuItem.setText("Remover");
        atdRemAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atdRemAdmjMenuItemActionPerformed(evt);
            }
        });
        atendenteAdmPrijMenu.add(atdRemAdmjMenuItem);

        jMenuBar1.add(atendenteAdmPrijMenu);

        gerarRelatoriosAdmPrijMenu.setForeground(new java.awt.Color(0, 0, 0));
        gerarRelatoriosAdmPrijMenu.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\layout_add.png")); // NOI18N
        gerarRelatoriosAdmPrijMenu.setText("Gerar Relatórios");
        gerarRelatoriosAdmPrijMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatoriosAdmPrijMenuActionPerformed(evt);
            }
        });

        grGerarRelatoriosAdmMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\application_view_detail.png")); // NOI18N
        grGerarRelatoriosAdmMenuItem.setText("Gerar Relatórios");
        grGerarRelatoriosAdmMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grGerarRelatoriosAdmMenuItemActionPerformed(evt);
            }
        });
        gerarRelatoriosAdmPrijMenu.add(grGerarRelatoriosAdmMenuItem);

        jMenuBar1.add(gerarRelatoriosAdmPrijMenu);

        filaDeVacinacaoAdmPrijMenu.setForeground(new java.awt.Color(0, 0, 0));
        filaDeVacinacaoAdmPrijMenu.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\calendar_view_day.png")); // NOI18N
        filaDeVacinacaoAdmPrijMenu.setText("Fila De Vacinação");

        flCadAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        flCadAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\user_add.png")); // NOI18N
        flCadAdmjMenuItem.setText("Cadastrar");
        flCadAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flCadAdmjMenuItemActionPerformed(evt);
            }
        });
        filaDeVacinacaoAdmPrijMenu.add(flCadAdmjMenuItem);

        flVisuAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        flVisuAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\application_view_detail.png")); // NOI18N
        flVisuAdmjMenuItem.setText("Visualizar");
        flVisuAdmjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flVisuAdmjMenuItemActionPerformed(evt);
            }
        });
        filaDeVacinacaoAdmPrijMenu.add(flVisuAdmjMenuItem);

        flConfirmarAdmjMenuItem.setForeground(new java.awt.Color(0, 0, 0));
        flConfirmarAdmjMenuItem.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\accept.png")); // NOI18N
        flConfirmarAdmjMenuItem.setText("Confirmar");
        filaDeVacinacaoAdmPrijMenu.add(flConfirmarAdmjMenuItem);

        jMenuBar1.add(filaDeVacinacaoAdmPrijMenu);

        sobreAdmPrijMenu.setForeground(new java.awt.Color(0, 0, 0));
        sobreAdmPrijMenu.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\information.png")); // NOI18N
        sobreAdmPrijMenu.setText("Sobre");

        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\icon projeto final\\door_out.png")); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        sobreAdmPrijMenu.add(jMenuItem1);

        jMenuBar1.add(sobreAdmPrijMenu);

        setJMenuBar(jMenuBar1);

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

    private void cadAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAdmjMenuItemActionPerformed
        TelaCadAdm telaCadAdm = new TelaCadAdm();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaCadAdm.setLocation(this.getWidth()/2-telaCadAdm.getWidth()/2, 0);
        jDesktopPane1.add(telaCadAdm);
        telaCadAdm.setVisible(true);
       
    }//GEN-LAST:event_cadAdmjMenuItemActionPerformed

    private void altAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altAdmjMenuItemActionPerformed
        TelaAdmAlterar telaAdmAlt = new TelaAdmAlterar();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        telaAdmAlt.setLocation(this.getWidth()/2-telaAdmAlt.getWidth()/2, 0);
        jDesktopPane1.add(telaAdmAlt);
        telaAdmAlt.setVisible(true);
    }//GEN-LAST:event_altAdmjMenuItemActionPerformed

    private void admAdmPriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admAdmPriActionPerformed
       new TelaCadAdm().setVisible(true);
    }//GEN-LAST:event_admAdmPriActionPerformed

    private void atdAltAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atdAltAdmjMenuItemActionPerformed
        TelaAdmAlterar telaAdmAlterar = new TelaAdmAlterar();
        jDesktopPane1.add(telaAdmAlterar);
        telaAdmAlterar.setVisible(true);
    }//GEN-LAST:event_atdAltAdmjMenuItemActionPerformed

    private void remAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remAdmjMenuItemActionPerformed
       TelaAdmRemover telaAdmRemover = new TelaAdmRemover();
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       telaAdmRemover.setLocation(this.getWidth()/2-telaAdmRemover.getWidth()/2, 0);
       jDesktopPane1.add(telaAdmRemover);
       telaAdmRemover.setVisible(true);
    }//GEN-LAST:event_remAdmjMenuItemActionPerformed

    private void atdCadAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atdCadAdmjMenuItemActionPerformed
       TelaCadAdm telaCadAdm = new TelaCadAdm();
       jDesktopPane1.add(telaCadAdm);
       telaCadAdm.setVisible(true);
    }//GEN-LAST:event_atdCadAdmjMenuItemActionPerformed

    private void atdRemAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atdRemAdmjMenuItemActionPerformed
        TelaAdmRemover telaAdmRemover = new TelaAdmRemover();
        jDesktopPane1.add(telaAdmRemover);
        telaAdmRemover.setVisible(true);
    }//GEN-LAST:event_atdRemAdmjMenuItemActionPerformed

    private void gerarRelatoriosAdmPrijMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatoriosAdmPrijMenuActionPerformed
       
    }//GEN-LAST:event_gerarRelatoriosAdmPrijMenuActionPerformed

    private void grGerarRelatoriosAdmMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grGerarRelatoriosAdmMenuItemActionPerformed
        TelaGerarRelatorios telaGerarRelatorios = new TelaGerarRelatorios();
        jDesktopPane1.add(telaGerarRelatorios);
        telaGerarRelatorios.setVisible(true);
    }//GEN-LAST:event_grGerarRelatoriosAdmMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void flCadAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flCadAdmjMenuItemActionPerformed
        TelaAdmCadUser telaAdmCadUser = new TelaAdmCadUser();
        jDesktopPane1.add(telaAdmCadUser);
        telaAdmCadUser.setVisible(true);
    }//GEN-LAST:event_flCadAdmjMenuItemActionPerformed

    private void flVisuAdmjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flVisuAdmjMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flVisuAdmjMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admAdmPri;
    private javax.swing.JMenuItem altAdmjMenuItem;
    private javax.swing.JMenuItem atdAltAdmjMenuItem;
    private javax.swing.JMenuItem atdCadAdmjMenuItem;
    private javax.swing.JMenuItem atdRemAdmjMenuItem;
    private javax.swing.JMenu atendenteAdmPrijMenu;
    private javax.swing.JMenuItem cadAdmjMenuItem;
    private javax.swing.JMenu filaDeVacinacaoAdmPrijMenu;
    private javax.swing.JMenuItem flCadAdmjMenuItem;
    private javax.swing.JMenuItem flConfirmarAdmjMenuItem;
    private javax.swing.JMenuItem flVisuAdmjMenuItem;
    private javax.swing.JMenu gerarRelatoriosAdmPrijMenu;
    private javax.swing.JMenuItem grGerarRelatoriosAdmMenuItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem remAdmjMenuItem;
    private javax.swing.JMenu sobreAdmPrijMenu;
    // End of variables declaration//GEN-END:variables
}
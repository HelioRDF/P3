/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Paciente.*;
import Consultar.Buscar_C;
import java.util.logging.Level;
import java.util.logging.Logger;
import Atendimento.*;
import Usuarios.*;
import java.awt.GridLayout;
import javax.swing.JFrame;


/**
 *
 * @author Helio Franca
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */

    Cadastrar_P TelaCadastro = new Cadastrar_P();
    Buscar_P TelaBuscaCadastro = new Buscar_P();
    Buscar_C buscarConsulta = new Buscar_C();
    Buscar_atendimento buscarAtendimento = new Buscar_atendimento();
    Buscar_Usuario buscarUsuario = new Buscar_Usuario();
    Cadastrar_Usuario cadastrarUsuario = new Cadastrar_Usuario();
    
                    
    public Menu() throws ClassNotFoundException {
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
        JD_Tela = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_BuscaCadastro = new javax.swing.JMenu();
        jMenu_Novo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JM_NovaConsulta = new javax.swing.JMenuItem();
        atendimento = new javax.swing.JMenu();
        novo_Atendimento = new javax.swing.JMenuItem();
        Usuario = new javax.swing.JMenu();
        novo_Usuario = new javax.swing.JMenuItem();
        buscar_Usuario = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        javax.swing.GroupLayout JD_TelaLayout = new javax.swing.GroupLayout(JD_Tela);
        JD_Tela.setLayout(JD_TelaLayout);
        JD_TelaLayout.setHorizontalGroup(
            JD_TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
        );
        JD_TelaLayout.setVerticalGroup(
            JD_TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JD_Tela)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JD_Tela)
        );
        jDesktopPane1.setLayer(JD_Tela, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jM_BuscaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/contract11.png"))); // NOI18N
        jM_BuscaCadastro.setText("Cadastro      ");

        jMenu_Novo.setText("Novo");
        jMenu_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_NovoActionPerformed(evt);
            }
        });
        jM_BuscaCadastro.add(jMenu_Novo);

        jMenuItem1.setText("Buscar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jM_BuscaCadastro.add(jMenuItem1);

        jMenuBar1.add(jM_BuscaCadastro);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search102.png"))); // NOI18N
        jMenu2.setText("Consultar      ");

        JM_NovaConsulta.setText("Buscar");
        JM_NovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_NovaConsultaActionPerformed(evt);
            }
        });
        jMenu2.add(JM_NovaConsulta);

        jMenuBar1.add(jMenu2);

        atendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verification5.png"))); // NOI18N
        atendimento.setText("Atendimento      ");

        novo_Atendimento.setText("Novo");
        novo_Atendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_AtendimentoActionPerformed(evt);
            }
        });
        atendimento.add(novo_Atendimento);

        jMenuBar1.add(atendimento);

        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user168.png"))); // NOI18N
        Usuario.setText("Usuário                          ");

        novo_Usuario.setText("Novo");
        novo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_UsuarioActionPerformed(evt);
            }
        });
        Usuario.add(novo_Usuario);

        buscar_Usuario.setText("Buscar");
        buscar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_UsuarioActionPerformed(evt);
            }
        });
        Usuario.add(buscar_Usuario);

        jMenuBar1.add(Usuario);

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout7.png"))); // NOI18N
        sair.setText("Sair");

        jMenuItem2.setText("Mudar de usuário");
        sair.add(jMenuItem2);

        jMenuItem3.setText("Fechar");
        sair.add(jMenuItem3);

        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_NovoActionPerformed
        // TODO add your handling code here:
        
        TelaCadastro.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenu_NovoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TelaBuscaCadastro.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void JM_NovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_NovaConsultaActionPerformed
        // TODO add your handling code here:
        
           buscarConsulta.setVisible(true);
    }//GEN-LAST:event_JM_NovaConsultaActionPerformed

    private void novo_AtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_AtendimentoActionPerformed
        // TODO add your handling code here:
        
        buscarAtendimento.setVisible(true);
        
    }//GEN-LAST:event_novo_AtendimentoActionPerformed

    private void novo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_UsuarioActionPerformed
        // TODO add your handling code here:
        
        cadastrarUsuario.setVisible(true);
    }//GEN-LAST:event_novo_UsuarioActionPerformed

    private void buscar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_UsuarioActionPerformed
        // TODO add your handling code here:
        
        buscarUsuario.setVisible(true);
        
    }//GEN-LAST:event_buscar_UsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JD_Tela;
    private javax.swing.JMenuItem JM_NovaConsulta;
    private javax.swing.JMenu Usuario;
    private javax.swing.JMenu atendimento;
    private javax.swing.JMenuItem buscar_Usuario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jM_BuscaCadastro;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenu_Novo;
    private javax.swing.JMenuItem novo_Atendimento;
    private javax.swing.JMenuItem novo_Usuario;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables





}

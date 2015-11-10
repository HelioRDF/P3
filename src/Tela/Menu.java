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
import Realizar_exame.Cadastrar_Exame;
import javax.swing.JFrame;
import Medico.*;
import Realizar_exame.*;



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
    Novo_atendimento novoAtendimento = new Novo_atendimento();
    Buscar_Usuario buscarUsuario = new Buscar_Usuario();
    Cadastrar_Usuario cadastrarUsuario = new Cadastrar_Usuario();
    Cadastrar_Exame  novoExame = new Cadastrar_Exame();
    Buscar_Medico buscarMedico = new Buscar_Medico();
    Cadastrar_Medico cadastroMedico = new Cadastrar_Medico();
    Cadastrar_Exame cadastroExame = new Cadastrar_Exame();
    
    
    
    
    
                    
    public Menu() throws ClassNotFoundException {
        initComponents();
        
       setExtendedState(JFrame.MAXIMIZED_BOTH);
        
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
        Cadastrar_paciente = new javax.swing.JMenuItem();
        Cadastrar_usuario = new javax.swing.JMenuItem();
        jMedico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Visualizar_paciente = new javax.swing.JMenuItem();
        Visualizar_usuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Abrir_ficha = new javax.swing.JMenu();
        Nova_ficha = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Realizar_exame = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        JD_Tela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout JD_TelaLayout = new javax.swing.GroupLayout(JD_Tela);
        JD_Tela.setLayout(JD_TelaLayout);
        JD_TelaLayout.setHorizontalGroup(
            JD_TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 952, Short.MAX_VALUE)
        );
        JD_TelaLayout.setVerticalGroup(
            JD_TelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JD_Tela)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JD_Tela, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jDesktopPane1.setLayer(JD_Tela, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jM_BuscaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/contract11 (2).png"))); // NOI18N
        jM_BuscaCadastro.setText(" Cadastrar          ");
        jM_BuscaCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Cadastrar_paciente.setText("Paciente");
        Cadastrar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_pacienteActionPerformed(evt);
            }
        });
        jM_BuscaCadastro.add(Cadastrar_paciente);

        Cadastrar_usuario.setText("Usuário");
        Cadastrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_usuarioActionPerformed(evt);
            }
        });
        jM_BuscaCadastro.add(Cadastrar_usuario);

        jMedico.setText("Médico");
        jMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMedicoActionPerformed(evt);
            }
        });
        jM_BuscaCadastro.add(jMedico);

        jMenuBar1.add(jM_BuscaCadastro);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search102 (2).png"))); // NOI18N
        jMenu2.setText("Visualizar        ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Visualizar_paciente.setText("Paciente");
        Visualizar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Visualizar_pacienteActionPerformed(evt);
            }
        });
        jMenu2.add(Visualizar_paciente);

        Visualizar_usuario.setText("Usuário");
        Visualizar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Visualizar_usuarioActionPerformed(evt);
            }
        });
        jMenu2.add(Visualizar_usuario);

        jMenuItem1.setText("Médico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        Abrir_ficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verification5 (2).png"))); // NOI18N
        Abrir_ficha.setText("Atendimento           ");

        Nova_ficha.setText("Abrir Ficha");
        Nova_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nova_fichaActionPerformed(evt);
            }
        });
        Abrir_ficha.add(Nova_ficha);

        jMenuBar1.add(Abrir_ficha);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/medical59.png"))); // NOI18N
        jMenu3.setText("Exame");

        Realizar_exame.setText("Realizar exame");
        Realizar_exame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Realizar_exameActionPerformed(evt);
            }
        });
        jMenu3.add(Realizar_exame);

        jMenuBar1.add(jMenu3);

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

    private void Nova_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nova_fichaActionPerformed
        // TODO add your handling code here:
        novoAtendimento.setVisible(true);
        
    }//GEN-LAST:event_Nova_fichaActionPerformed

    private void Visualizar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Visualizar_usuarioActionPerformed
        // TODO add your handling code here:
        buscarUsuario.setVisible(true);
    }//GEN-LAST:event_Visualizar_usuarioActionPerformed

    private void Cadastrar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_pacienteActionPerformed
        // TODO add your handling code here:
        TelaCadastro.setVisible(true);
        
        
    }//GEN-LAST:event_Cadastrar_pacienteActionPerformed

    private void Cadastrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_usuarioActionPerformed
        // TODO add your handling code here:
        cadastrarUsuario.setVisible(true);
    }//GEN-LAST:event_Cadastrar_usuarioActionPerformed

    private void Visualizar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Visualizar_pacienteActionPerformed
        // TODO add your handling code here:
        TelaBuscaCadastro.setVisible(true);
    }//GEN-LAST:event_Visualizar_pacienteActionPerformed

    private void Realizar_exameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Realizar_exameActionPerformed
        // TODO add your handling code here:
        
        cadastroExame.setVisible(true);
    }//GEN-LAST:event_Realizar_exameActionPerformed

    private void jMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMedicoActionPerformed
        // TODO add your handling code here:
        cadastroMedico.setVisible(true);
    }//GEN-LAST:event_jMedicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        buscarMedico.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenu Abrir_ficha;
    private javax.swing.JMenuItem Cadastrar_paciente;
    private javax.swing.JMenuItem Cadastrar_usuario;
    private javax.swing.JDesktopPane JD_Tela;
    private javax.swing.JMenuItem Nova_ficha;
    private javax.swing.JMenuItem Realizar_exame;
    private javax.swing.JMenuItem Visualizar_paciente;
    private javax.swing.JMenuItem Visualizar_usuario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jM_BuscaCadastro;
    private javax.swing.JMenuItem jMedico;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables



    
    
    


}

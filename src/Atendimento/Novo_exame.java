/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atendimento;

/**
 *
 * @author hfranca
 */
public class Novo_exame extends javax.swing.JFrame {

    /**
     * Creates new form Novo_exame
     */
    public Novo_exame() {
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

        CampoBuscarNome = new javax.swing.JTextField();
        jLabel_Nome = new javax.swing.JLabel();
        CampoBuscarRegistro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        DataAtual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        Gravar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        CampoBuscarNome.setEnabled(false);
        CampoBuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBuscarNomeActionPerformed(evt);
            }
        });
        CampoBuscarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoBuscarNomeKeyReleased(evt);
            }
        });
        getContentPane().add(CampoBuscarNome);
        CampoBuscarNome.setBounds(130, 120, 330, 27);

        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_Nome.setText("Nome:");
        getContentPane().add(jLabel_Nome);
        jLabel_Nome.setBounds(50, 120, 60, 25);

        CampoBuscarRegistro.setEnabled(false);
        CampoBuscarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBuscarRegistroActionPerformed(evt);
            }
        });
        CampoBuscarRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoBuscarRegistroKeyTyped(evt);
            }
        });
        getContentPane().add(CampoBuscarRegistro);
        CampoBuscarRegistro.setBounds(600, 120, 60, 27);

        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 170, 120, 14);

        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(570, 160, 90, 30);

        jLabel7.setText("CPF: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 170, 40, 14);

        jTextField7.setEnabled(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(130, 160, 260, 30);

        jLabel8.setText("E-Mail:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 250, 50, 14);

        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 250, 60, 14);

        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 210, 60, 14);

        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 240, 230, 30);

        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(130, 200, 530, 30);

        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(470, 240, 190, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 300, 870, 10);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Registro:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(530, 120, 70, 25);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 153));
        jLabel23.setText("Solicitar novo exame:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(50, 30, 300, 50);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(160, 380, 70, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Consulta Nº:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(50, 390, 80, 20);

        DataAtual.setEnabled(false);
        DataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAtualActionPerformed(evt);
            }
        });
        getContentPane().add(DataAtual);
        DataAtual.setBounds(710, 320, 210, 30);

        jLabel11.setText("Data:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(670, 320, 50, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(370, 320, 230, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Nome do Médico:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(250, 330, 100, 20);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(370, 380, 230, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Observações:");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(50, 520, 90, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 480, 770, 96);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Tipo de exame:");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(250, 390, 100, 20);

        Gravar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Gravar.setForeground(new java.awt.Color(0, 0, 102));
        Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bold6.png"))); // NOI18N
        Gravar.setText(" Enviar Solicitação ");
        Gravar.setToolTipText("");
        Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarActionPerformed(evt);
            }
        });
        getContentPane().add(Gravar);
        Gravar.setBounds(40, 640, 170, 40);

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left176.png"))); // NOI18N
        Fechar.setToolTipText("");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(890, 640, 40, 39);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(160, 320, 70, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Exame Nº:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(50, 330, 80, 20);

        setSize(new java.awt.Dimension(1022, 761));
    }// </editor-fold>//GEN-END:initComponents

    private void CampoBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarNomeActionPerformed

    private void CampoBuscarNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoBuscarNomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarNomeKeyReleased

    private void CampoBuscarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscarRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarRegistroActionPerformed

    private void CampoBuscarRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoBuscarRegistroKeyTyped

    }//GEN-LAST:event_CampoBuscarRegistroKeyTyped

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void DataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAtualActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed

    }//GEN-LAST:event_GravarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

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
            java.util.logging.Logger.getLogger(Novo_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Novo_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Novo_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Novo_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Novo_exame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoBuscarNome;
    private javax.swing.JTextField CampoBuscarRegistro;
    private javax.swing.JTextField DataAtual;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Gravar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

/**
 *
 * @author Helio Franca
 */
public class Buscar_P extends javax.swing.JFrame {

    /**
     * Creates new form Buscar_P
     */
    public Buscar_P() {
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

        buttonGroup2_Sexo = new javax.swing.ButtonGroup();
        buttonGroup1_Busca = new javax.swing.ButtonGroup();
        Pesquisar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        BuscarNome = new javax.swing.JRadioButton();
        BuscaCod = new javax.swing.JRadioButton();
        CampoBuscarNome = new javax.swing.JTextField();
        jLabel_Nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoBuscarRegistro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
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
        jRadio_Masculino = new javax.swing.JRadioButton();
        jRadio_Feminino = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Pesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier13.png"))); // NOI18N
        Pesquisar.setText("  Pesquisar");
        Pesquisar.setToolTipText("");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(Pesquisar);
        Pesquisar.setBounds(670, 60, 130, 44);

        Excluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Excluir.setForeground(new java.awt.Color(255, 0, 0));
        Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close18.png"))); // NOI18N
        Excluir.setText("  Excluir");
        Excluir.setToolTipText("");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir);
        Excluir.setBounds(210, 540, 115, 40);

        Atualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh18.png"))); // NOI18N
        Atualizar.setText("Atualizar");
        Atualizar.setToolTipText("");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Atualizar);
        Atualizar.setBounds(40, 540, 130, 40);

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left176.png"))); // NOI18N
        Fechar.setToolTipText("");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(850, 540, 49, 39);

        buttonGroup1_Busca.add(BuscarNome);
        BuscarNome.setText("Buscar pelo nome");
        BuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarNome);
        BuscarNome.setBounds(480, 40, 130, 30);

        buttonGroup1_Busca.add(BuscaCod);
        BuscaCod.setText("Buscar pelo Registro");
        BuscaCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaCodActionPerformed(evt);
            }
        });
        getContentPane().add(BuscaCod);
        BuscaCod.setBounds(480, 80, 140, 30);

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
        CampoBuscarNome.setBounds(110, 40, 310, 27);

        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_Nome.setText("Nome:");
        getContentPane().add(jLabel_Nome);
        jLabel_Nome.setBounds(40, 40, 70, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Registro");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 70, 30);

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
        CampoBuscarRegistro.setBounds(110, 80, 60, 27);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "CPF", "Data de Nascimento", "Sexo", "Endereço", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 420, 860, 100);

        jLabel1.setText("Registro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(640, 160, 70, 20);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 160, 40, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(700, 150, 100, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(110, 150, 410, 30);

        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 200, 120, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(490, 200, 120, 30);

        jLabel7.setText("CPF: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 210, 30, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(110, 200, 240, 30);

        jLabel8.setText("E-Mail:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 290, 40, 20);

        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 290, 60, 20);

        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 250, 60, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(110, 280, 210, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(110, 240, 500, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(390, 280, 220, 30);

        buttonGroup2_Sexo.add(jRadio_Masculino);
        jRadio_Masculino.setText("Masculino");
        jRadio_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_MasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadio_Masculino);
        jRadio_Masculino.setBounds(630, 230, 100, 30);

        buttonGroup2_Sexo.add(jRadio_Feminino);
        jRadio_Feminino.setText("Feminino");
        getContentPane().add(jRadio_Feminino);
        jRadio_Feminino.setBounds(630, 260, 100, 30);

        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 200, 30, 20);

        Cadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(0, 0, 102));
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bold6.png"))); // NOI18N
        Cadastrar.setText("  Gravar");
        Cadastrar.setToolTipText("");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(40, 330, 130, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(40, 392, 860, 10);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 132, 860, 2);

        setSize(new java.awt.Dimension(1022, 646));
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed

    }//GEN-LAST:event_PesquisarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

    }//GEN-LAST:event_ExcluirActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtualizarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed

    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void BuscaCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaCodActionPerformed

    }//GEN-LAST:event_BuscaCodActionPerformed

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jRadio_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_MasculinoActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed

    }//GEN-LAST:event_CadastrarActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_P().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JRadioButton BuscaCod;
    private javax.swing.JRadioButton BuscarNome;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField CampoBuscarNome;
    private javax.swing.JTextField CampoBuscarRegistro;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Pesquisar;
    private javax.swing.ButtonGroup buttonGroup1_Busca;
    private javax.swing.ButtonGroup buttonGroup2_Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JRadioButton jRadio_Feminino;
    private javax.swing.JRadioButton jRadio_Masculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
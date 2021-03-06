/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultar;


/**
 *
 * @author Helio Franca
 */
public class Buscar_C extends javax.swing.JFrame {

    /**
     * Creates new form Buscar_C
     */
           
           
    public Buscar_C() {
        initComponents();
        
        Atualizar.setEnabled(false);
        Excluir.setEnabled(false);
        BuscaRegistro.setSelected(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Anamnese = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        BuscarNome = new javax.swing.JRadioButton();
        BuscaRegistro = new javax.swing.JRadioButton();
        CampoBuscarNome = new javax.swing.JTextField();
        jLabel_Nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoBuscarRegistro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Pesquisar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Exames = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar ficha");
        getContentPane().setLayout(null);

        Anamnese.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Anamnese.setForeground(new java.awt.Color(51, 0, 204));
        Anamnese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/documents54.png"))); // NOI18N
        Anamnese.setText("Listar Anamnese");
        Anamnese.setToolTipText("");
        Anamnese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnamneseActionPerformed(evt);
            }
        });
        getContentPane().add(Anamnese);
        Anamnese.setBounds(740, 330, 160, 30);

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
        Excluir.setBounds(199, 539, 115, 40);

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
        Atualizar.setBounds(39, 539, 130, 40);

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left176.png"))); // NOI18N
        Fechar.setToolTipText("");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(890, 530, 49, 39);

        buttonGroup1.add(BuscarNome);
        BuscarNome.setText("Buscar pelo nome");
        BuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarNome);
        BuscarNome.setBounds(29, 88, 130, 23);

        buttonGroup1.add(BuscaRegistro);
        BuscaRegistro.setText("Buscar pelo Registro");
        BuscaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(BuscaRegistro);
        BuscaRegistro.setBounds(29, 128, 140, 23);

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
        CampoBuscarNome.setBounds(259, 88, 310, 27);

        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_Nome.setText("Nome:");
        getContentPane().add(jLabel_Nome);
        jLabel_Nome.setBounds(189, 88, 52, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Registro");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(189, 128, 52, 25);

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
        CampoBuscarRegistro.setBounds(259, 128, 60, 27);

        jLabel1.setText("Registro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(29, 301, 60, 14);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 300, 50, 14);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(93, 291, 170, 30);

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(340, 290, 340, 30);

        Pesquisar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier13.png"))); // NOI18N
        Pesquisar1.setText("  Pesquisar");
        Pesquisar1.setToolTipText("");
        Pesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesquisar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Pesquisar1);
        Pesquisar1.setBounds(690, 90, 130, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "CPF", "Data de Nascimento", "Sexo", "Endereço", "Telefone", "E-mail", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 390, 910, 120);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(29, 250, 937, 12);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Buscar  Ficha do Paciente:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 10, 300, 50);

        Exames.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Exames.setForeground(new java.awt.Color(51, 0, 204));
        Exames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/medical9.png"))); // NOI18N
        Exames.setText("Listar Exames");
        Exames.setToolTipText("");
        Exames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamesActionPerformed(evt);
            }
        });
        getContentPane().add(Exames);
        Exames.setBounds(740, 290, 160, 30);

        setSize(new java.awt.Dimension(1086, 662));
    }// </editor-fold>//GEN-END:initComponents

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

    }//GEN-LAST:event_ExcluirActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AtualizarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed

        if(BuscarNome.isSelected()){
            CampoBuscarNome.setEnabled(true);
            CampoBuscarRegistro.setEnabled(false);}
        
    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void BuscaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaRegistroActionPerformed

        if(BuscaRegistro.isSelected()){
            CampoBuscarNome.setEnabled(false);
            CampoBuscarRegistro.setEnabled(true);}
    }//GEN-LAST:event_BuscaRegistroActionPerformed

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

    private void Pesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesquisar1ActionPerformed
        // TODO add your handling code here:
         Atualizar.setEnabled(true);
        Excluir.setEnabled(true);
    }//GEN-LAST:event_Pesquisar1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void AnamneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnamneseActionPerformed

      new Listar_anamnese().setVisible(true);

    }//GEN-LAST:event_AnamneseActionPerformed

    private void ExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamesActionPerformed
        // TODO add your handling code here:
        
        new Gerenciar_imagem().setVisible(true);
    }//GEN-LAST:event_ExamesActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anamnese;
    private javax.swing.JButton Atualizar;
    private javax.swing.JRadioButton BuscaRegistro;
    private javax.swing.JRadioButton BuscarNome;
    private javax.swing.JTextField CampoBuscarNome;
    private javax.swing.JTextField CampoBuscarRegistro;
    private javax.swing.JButton Exames;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Pesquisar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

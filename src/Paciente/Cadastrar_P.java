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
public class Cadastrar_P extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar_P
     */
    public Cadastrar_P() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fechar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jB_Atualizar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        jT_Registro = new javax.swing.JTextField();
        jT_Nome = new javax.swing.JTextField();
        jT_DataNasc = new javax.swing.JTextField();
        jT_Tel = new javax.swing.JTextField();
        jTEndereco = new javax.swing.JTextField();
        jT_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jT_CPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Tabela = new javax.swing.JTable();
        jRadio_Masculino = new javax.swing.JRadioButton();
        jRadio_Feminino = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Registro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 70, 20);

        jLabel2.setText("Data:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(780, 90, 40, 20);

        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 150, 120, 20);

        jLabel4.setText("E-Mail:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 260, 40, 20);

        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 260, 70, 20);

        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 200, 60, 20);

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left176.png"))); // NOI18N
        Fechar.setToolTipText("");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(910, 590, 49, 39);

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
        Excluir.setBounds(200, 570, 95, 40);

        jB_Atualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jB_Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh18.png"))); // NOI18N
        jB_Atualizar.setText("  Atualizar");
        jB_Atualizar.setToolTipText("");
        jB_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Atualizar);
        jB_Atualizar.setBounds(50, 570, 105, 40);

        Cadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(0, 0, 102));
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bold6.png"))); // NOI18N
        Cadastrar.setText("  Cadastrar");
        Cadastrar.setToolTipText("");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(50, 320, 150, 40);

        jT_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jT_Registro);
        jT_Registro.setBounds(130, 80, 100, 30);

        jT_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(jT_Nome);
        jT_Nome.setBounds(300, 80, 330, 30);
        getContentPane().add(jT_DataNasc);
        jT_DataNasc.setBounds(510, 140, 120, 30);

        jT_Tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_TelActionPerformed(evt);
            }
        });
        getContentPane().add(jT_Tel);
        jT_Tel.setBounds(130, 250, 210, 30);
        getContentPane().add(jTEndereco);
        jTEndereco.setBounds(130, 190, 500, 30);

        jT_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(jT_Email);
        jT_Email.setBounds(410, 250, 220, 30);

        jLabel7.setText("CPF: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 150, 30, 20);
        getContentPane().add(jT_CPF);
        jT_CPF.setBounds(130, 140, 240, 30);

        jT_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "CPF", "Data de Nascimento", "Sexo", "Endereço", "Telefone", "E-mail", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jT_Tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 440, 910, 120);

        buttonGroup1.add(jRadio_Masculino);
        jRadio_Masculino.setText("Masculino");
        jRadio_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_MasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadio_Masculino);
        jRadio_Masculino.setBounds(710, 170, 100, 30);

        buttonGroup1.add(jRadio_Feminino);
        jRadio_Feminino.setText("Feminino");
        getContentPane().add(jRadio_Feminino);
        jRadio_Feminino.setBounds(710, 200, 100, 30);

        jLabel8.setText("Sexo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(720, 140, 50, 30);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(830, 80, 120, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 390, 910, 2);

        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 90, 40, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Cadastro de Pacientes:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 10, 300, 50);

        setSize(new java.awt.Dimension(1070, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

    }//GEN-LAST:event_ExcluirActionPerformed

    private void jB_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AtualizarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jB_AtualizarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed

        
        
    }//GEN-LAST:event_CadastrarActionPerformed

    private void jT_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_RegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_RegistroActionPerformed

    private void jT_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NomeActionPerformed

    private void jT_TelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_TelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_TelActionPerformed

    private void jT_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_EmailActionPerformed

    private void jRadio_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_MasculinoActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_P().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Fechar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jB_Atualizar;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadio_Feminino;
    private javax.swing.JRadioButton jRadio_Masculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jT_CPF;
    private javax.swing.JTextField jT_DataNasc;
    private javax.swing.JTextField jT_Email;
    private javax.swing.JTextField jT_Nome;
    private javax.swing.JTextField jT_Registro;
    private javax.swing.JTable jT_Tabela;
    private javax.swing.JTextField jT_Tel;
    // End of variables declaration//GEN-END:variables


public void cadastrarPaciente(){
    
}

}

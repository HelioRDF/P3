/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultar;

/**
 *
 * @author hfranca
 */


import com.itextpdf.text.Document;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Listar_anamnese extends javax.swing.JFrame {

    /**
     * Creates new form Listar_anamnese
     */
    public Listar_anamnese() {
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

        Fechar = new javax.swing.JButton();
        CampoBuscarNome = new javax.swing.JTextField();
        jLabel_Nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Excluir1 = new javax.swing.JButton();
        DataAtual = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoBuscarNome1 = new javax.swing.JTextField();
        jLabel_Nome1 = new javax.swing.JLabel();
        CampoAnamneseN = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left176.png"))); // NOI18N
        Fechar.setToolTipText("");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(740, 550, 49, 39);

        CampoBuscarNome.setEditable(false);
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
        CampoBuscarNome.setBounds(130, 110, 310, 27);

        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_Nome.setText("Nome:");
        getContentPane().add(jLabel_Nome);
        jLabel_Nome.setBounds(70, 110, 52, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Registro:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 110, 70, 25);

        CampoBuscarRegistro.setEditable(false);
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
        CampoBuscarRegistro.setBounds(600, 110, 60, 27);

        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 160, 120, 14);

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(540, 150, 120, 30);

        jLabel7.setText("CPF: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 160, 40, 14);

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(130, 150, 240, 30);

        jLabel8.setText("E-Mail:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 240, 50, 14);

        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 240, 60, 14);

        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 200, 60, 14);

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 230, 210, 30);

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(130, 190, 530, 30);

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(490, 230, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Arquivo", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane1.setBounds(60, 420, 730, 110);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(60, 290, 730, 10);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Listar de Anamnese:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 30, 300, 50);

        Excluir1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Excluir1.setForeground(new java.awt.Color(51, 0, 204));
        Excluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bold6.png"))); // NOI18N
        Excluir1.setText("Abrir");
        Excluir1.setToolTipText("");
        Excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir1ActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir1);
        Excluir1.setBounds(620, 360, 80, 30);

        DataAtual.setEditable(false);
        DataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAtualActionPerformed(evt);
            }
        });
        getContentPane().add(DataAtual);
        DataAtual.setBounds(370, 360, 220, 30);

        jLabel2.setText("Data:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 370, 60, 20);

        CampoBuscarNome1.setEditable(false);
        CampoBuscarNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBuscarNome1ActionPerformed(evt);
            }
        });
        CampoBuscarNome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoBuscarNome1KeyReleased(evt);
            }
        });
        getContentPane().add(CampoBuscarNome1);
        CampoBuscarNome1.setBounds(150, 360, 160, 30);

        jLabel_Nome1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel_Nome1.setText("Arquivo:");
        getContentPane().add(jLabel_Nome1);
        jLabel_Nome1.setBounds(60, 370, 80, 20);
        getContentPane().add(CampoAnamneseN);
        CampoAnamneseN.setBounds(150, 310, 70, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Anamnese Nº:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(60, 320, 80, 20);

        setSize(new java.awt.Dimension(858, 669));
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

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

    private void Excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir1ActionPerformed
        try {
            // TODO add your handling code here:

            NF_PDF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Listar_anamnese.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Excluir1ActionPerformed

    private void DataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAtualActionPerformed

    private void CampoBuscarNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscarNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarNome1ActionPerformed

    private void CampoBuscarNome1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoBuscarNome1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarNome1KeyReleased

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
            java.util.logging.Logger.getLogger(Listar_anamnese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar_anamnese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar_anamnese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar_anamnese.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar_anamnese().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoAnamneseN;
    private javax.swing.JTextField CampoBuscarNome;
    private javax.swing.JTextField CampoBuscarNome1;
    private javax.swing.JTextField CampoBuscarRegistro;
    private javax.swing.JTextField DataAtual;
    private javax.swing.JButton Excluir1;
    private javax.swing.JButton Fechar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Nome1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables



    
    
    public  void NF_PDF () throws FileNotFoundException {
        // TODO code application logic here
        
        
    String anamneseN=CampoAnamneseN.getText().trim();
    Document documentoPDF = new Document();
    
     
    try{
        
        
    
        //abrir o documento
        documentoPDF.open();
        
           
        //Busca e abre o arquivo PDF.
         java.awt.Desktop.getDesktop().open( new File(anamneseN+"_anamnese.pdf" ) ); 
        
    }
                                        
            catch(IOException ioe){
            }     
            finally{
        documentoPDF.close();
    }        


 }
}



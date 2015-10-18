/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Paciente.*;
import java.util.Calendar;
import java.util.Date;
import javafx.scene.chart.PieChart.Data;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helio Franca
 */
public class Cadastrar_Usuario extends javax.swing.JFrame {
    
    Controle_P controle = new Controle_P();
    GetSet_P   getset = new GetSet_P();
    
    
    public Cadastrar_Usuario() {
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

        buttonGroup1_Sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fechar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Novo = new javax.swing.JButton();
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        DataAtual = new javax.swing.JTextField();
        Atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Paciente");
        getContentPane().setLayout(null);

        jLabel1.setText("Registro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 70, 20);

        jLabel2.setText("Data:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(710, 80, 60, 30);

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
        Excluir.setEnabled(false);
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir);
        Excluir.setBounds(210, 570, 95, 40);

        Novo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Novo.setForeground(new java.awt.Color(0, 0, 102));
        Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bold6.png"))); // NOI18N
        Novo.setText(" Novo");
        Novo.setToolTipText("");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });
        getContentPane().add(Novo);
        Novo.setBounds(60, 310, 110, 40);

        jT_Registro.setEnabled(false);
        jT_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_RegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jT_Registro);
        jT_Registro.setBounds(130, 80, 100, 30);

        jT_Nome.setEnabled(false);
        jT_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(jT_Nome);
        jT_Nome.setBounds(300, 80, 330, 30);

        jT_DataNasc.setEnabled(false);
        getContentPane().add(jT_DataNasc);
        jT_DataNasc.setBounds(510, 140, 120, 30);

        jT_Tel.setEnabled(false);
        jT_Tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_TelActionPerformed(evt);
            }
        });
        getContentPane().add(jT_Tel);
        jT_Tel.setBounds(130, 250, 210, 30);

        jTEndereco.setEnabled(false);
        getContentPane().add(jTEndereco);
        jTEndereco.setBounds(130, 190, 500, 30);

        jT_Email.setEnabled(false);
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

        jT_CPF.setEnabled(false);
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

        buttonGroup1_Sexo.add(jRadio_Masculino);
        jRadio_Masculino.setText("Masculino");
        jRadio_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_MasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadio_Masculino);
        jRadio_Masculino.setBounds(710, 170, 100, 30);

        buttonGroup1_Sexo.add(jRadio_Feminino);
        jRadio_Feminino.setText("Feminino");
        jRadio_Feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_FemininoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadio_Feminino);
        jRadio_Feminino.setBounds(710, 200, 100, 30);

        jLabel8.setText("Sexo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(720, 140, 50, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 390, 910, 2);

        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 90, 40, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Cadastro de Usuário:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 10, 300, 50);

        Cadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(0, 0, 102));
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/floppy.png"))); // NOI18N
        Cadastrar.setText("  Cadastrar");
        Cadastrar.setToolTipText("");
        Cadastrar.setEnabled(false);
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(210, 310, 130, 40);

        DataAtual.setEnabled(false);
        DataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAtualActionPerformed(evt);
            }
        });
        getContentPane().add(DataAtual);
        DataAtual.setBounds(750, 70, 210, 40);

        Atualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh18.png"))); // NOI18N
        Atualizar.setText("Atualizar");
        Atualizar.setToolTipText("");
        Atualizar.setEnabled(false);
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Atualizar);
        Atualizar.setBounds(50, 570, 130, 40);

        setSize(new java.awt.Dimension(1070, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
 //Apaga a linha selecionada da tabela.
        ((DefaultTableModel) jT_Tabela.getModel()).removeRow(jT_Tabela.getSelectedRow());
        
        
    }//GEN-LAST:event_ExcluirActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
         novo();
        Novo.setEnabled(false);
        Cadastrar.setEnabled(true);
       
        
        
    }//GEN-LAST:event_NovoActionPerformed

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

    private void jRadio_FemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_FemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_FemininoActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarPaciente();
        
        Cadastrar.setEnabled(false);
        Novo.setEnabled(true);
        Excluir.setEnabled(true);
        Atualizar.setEnabled(true);
 
    }//GEN-LAST:event_CadastrarActionPerformed

    private void DataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAtualActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField DataAtual;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Novo;
    private javax.swing.ButtonGroup buttonGroup1_Sexo;
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

//=====================================================================================
    
public void cadastrarPaciente(){ // Método utilizado para cadastrar novos pacientes.
    
//Verifica a seleção do Radio button sexo.
    String aux="";
   if(jRadio_Masculino.isSelected()){
      aux="Masculino";}
   if(jRadio_Feminino.isSelected()){
      aux="Feminino";
   }
   

String Registro =""+getset.getRegistro();
 
   
// Atribui os valores do jtext para os atributos;
//String Registro=jT_Registro.getText().trim();
String Nome=jT_Nome.getText().trim();
String CPF=jT_CPF.getText().trim();
String DataNasc=jT_DataNasc.getText().trim();
String Sexo=aux;
String Endereco=jTEndereco.getText().trim();
String  Telefone=jT_Tel.getText().trim();
String  Email=jT_Email.getText().trim();
String dataAtual = DataAtual.getText().trim();



//Passa os valores dos atributos para o array e salva o objeto.    

getset.setNome(Nome);
getset.setCPF(CPF);
getset.setData_Nasc(DataNasc);
getset.setSexo(Sexo);
getset.setEndereco(Endereco);
getset.setTelefone(Telefone);
getset.setEmail(Email);
getset.setData_Cadastro(dataAtual);
controle.Cadastrar(getset);
 


//Passa os valores dos jTexts para o jtable.
DefaultTableModel val = (DefaultTableModel) jT_Tabela.getModel();
val.addRow(new String[]{Registro,Nome,CPF,DataNasc,Sexo,Endereco,Telefone,Email,dataAtual });

jTextFalse();//jText desabilitado.
jTextApagar();//Limpa os campos jText.


//JOptionPane.showMessageDialog(this, "Falha no cadastro, Preencha todos os campos corretamente.");
    
}


//=====================================================================================
    
public void novo(){
    
jTextTrue();//jText habilitado
 Calendar data = Calendar.getInstance(); 
 DataAtual.setText(data.getTime().toString());
 
jRadio_Masculino.setSelected(true);
getset.setRegistro(WIDTH);
jT_Registro.setText(getset.getRegistro().toString());



Novo.setEnabled(false);
    
}


//=====================================================================================
    

public void jTextTrue (){//Habilita os campos jText 
//jT_Registro.setEnabled(true);
jT_Nome.setEnabled(true);
jT_CPF.setEnabled(true);
jT_DataNasc.setEnabled(true);
jTEndereco.setEnabled(true);
jT_Tel.setEnabled(true);
jT_Email.setEnabled(true);
 
}


//=====================================================================================
    
public void jTextFalse(){//Desabilita os campos JText
//jT_Registro.setEnabled(false);
jT_Nome.setEnabled(false);
jT_CPF.setEnabled(false);
jT_DataNasc.setEnabled(false);
jTEndereco.setEnabled(false);
jT_Tel.setEnabled(false);
jT_Email.setEnabled(false);

}


//=====================================================================================
    
public void jTextApagar(){//Apaga os textos dos jTexts

//Zera os campos JText.    
//jT_Registro.setText("");
jT_Nome.setText("");
jT_CPF.setText("");
jT_DataNasc.setText("");
jTEndereco.setText("");
jT_Tel.setText("");
jT_Email.setText("");
}



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Paciente.*;
import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helio Franca
 */
public class Cadastrar_Usuario extends javax.swing.JFrame {
    
    Controle_P controle = new Controle_P();
    GetSet_Usuario   getset = new GetSet_Usuario();
    
    
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
        Fechar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Novo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTCRM = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTSenha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTtipo = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Tabela = new javax.swing.JTable();
        jRadio_Masculino = new javax.swing.JRadioButton();
        jRadio_Feminino = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DataAtual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de usuário");
        getContentPane().setLayout(null);

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left176.png"))); // NOI18N
        Fechar.setToolTipText("");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(860, 540, 49, 39);

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
        Excluir.setBounds(50, 550, 95, 40);

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
        Novo.setBounds(50, 300, 110, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 360, 910, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Cadastro de Usuário:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 0, 300, 50);

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
        Cadastrar.setBounds(190, 300, 130, 40);

        jLabel1.setText("Login / CRM:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 90, 70, 20);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 140, 40, 20);

        jTCRM.setEnabled(false);
        jTCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCRMActionPerformed(evt);
            }
        });
        getContentPane().add(jTCRM);
        jTCRM.setBounds(120, 80, 130, 30);

        jTnome.setEnabled(false);
        jTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTnome);
        jTnome.setBounds(120, 130, 410, 30);

        jLabel7.setText("Senha: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 190, 50, 20);

        jTSenha.setEnabled(false);
        getContentPane().add(jTSenha);
        jTSenha.setBounds(120, 180, 150, 30);

        jLabel8.setText("E-Mail:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 250, 50, 20);

        jLabel6.setText("Tipo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 190, 60, 20);

        jTtipo.setEnabled(false);
        jTtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtipoActionPerformed(evt);
            }
        });
        getContentPane().add(jTtipo);
        jTtipo.setBounds(410, 180, 110, 30);

        jTEmail.setEnabled(false);
        jTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTEmail);
        jTEmail.setBounds(120, 240, 410, 30);

        jT_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "CRM", "Nome", "Senha", "Tipo", "Email", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jT_Tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 400, 860, 110);

        buttonGroup1_Sexo.add(jRadio_Masculino);
        jRadio_Masculino.setText("Masculino");
        jRadio_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_MasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadio_Masculino);
        jRadio_Masculino.setBounds(580, 210, 100, 30);

        buttonGroup1_Sexo.add(jRadio_Feminino);
        jRadio_Feminino.setText("Feminino");
        jRadio_Feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_FemininoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadio_Feminino);
        jRadio_Feminino.setBounds(580, 240, 100, 30);

        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(590, 180, 50, 30);

        jLabel3.setText("Data:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 80, 60, 30);

        DataAtual.setEditable(false);
        DataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAtualActionPerformed(evt);
            }
        });
        getContentPane().add(DataAtual);
        DataAtual.setBounds(650, 80, 170, 30);

        setSize(new java.awt.Dimension(984, 670));
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
         jTextApagar();
        Novo.setEnabled(false);
        Cadastrar.setEnabled(true);
       
        
        
    }//GEN-LAST:event_NovoActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarUsuario();
        jTextFalse();
        salvarXML();
        Cadastrar.setEnabled(false);
        Novo.setEnabled(true);
        Excluir.setEnabled(true);
        
 
    }//GEN-LAST:event_CadastrarActionPerformed

    private void jTCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCRMActionPerformed

    private void jTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomeActionPerformed

    private void jTtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtipoActionPerformed

    private void jTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmailActionPerformed

    private void jRadio_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_MasculinoActionPerformed

    private void jRadio_FemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_FemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_FemininoActionPerformed

    private void DataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAtualActionPerformed

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadio_Feminino;
    private javax.swing.JRadioButton jRadio_Masculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCRM;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTSenha;
    private javax.swing.JTable jT_Tabela;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTtipo;
    // End of variables declaration//GEN-END:variables

//=====================================================================================
    
public void cadastrarUsuario(){ // Método utilizado para cadastrar novos usuários.
    
//Verifica a seleção do Radio button sexo.
    String aux="";
   if(jRadio_Masculino.isSelected()){
      aux="Masculino";}
   if(jRadio_Feminino.isSelected()){
      aux="Feminino";
   }
   

   
// Atribui os valores do jtext para os atributos;
String CRM=jTCRM.getText().trim();
String Nome=jTnome.getText().trim();
String Sexo=aux;
String senha=jTSenha.getText().trim();
String Tipo=jTtipo.getText().trim();
String  Email=jTEmail.getText().trim();
String dataAtual = DataAtual.getText().trim();



//Passa os valores dos atributos para o array e salva o objeto.    


getset.setCRM(CRM);
getset.setNomeUsuário(Nome);
getset.setSexo(aux);
getset.setSenha(senha);
getset.setTipo(Tipo);
getset.setEmail(Email);
getset.setData(dataAtual);






//Passa os valores dos jTexts para o jtable.
DefaultTableModel val = (DefaultTableModel) jT_Tabela.getModel();
val.addRow(new String[]{dataAtual,CRM,Nome,senha,Tipo,Email,Sexo });









//JOptionPane.showMessageDialog(this, "Falha no cadastro, Preencha todos os campos corretamente.");
    
}


//=====================================================================================
    
public void novo(){
 jTextTrue();//jText habilitado
 Calendar data = Calendar.getInstance(); 
 DataAtual.setText(data.getTime().toString());
 
jRadio_Masculino.setSelected(true);


String aux= getset.getCRM();
jTCRM.setText(aux);

Novo.setEnabled(false);
    
}


//=====================================================================================
    

public void jTextTrue (){//Habilita os campos jText 
//jT_Registro.setEnabled(true);
    
    
jTCRM.setEnabled(true);    
jTnome.setEnabled(true);
jTtipo.setEnabled(true);
jTEmail.setEnabled(true);
jTSenha.setEnabled(true);
 
}


//=====================================================================================
    
public void jTextFalse(){//Desabilita os campos JText
//jT_Registro.setEnabled(false);
    jTCRM.setEnabled(false);
jTnome.setEnabled(false);
jTtipo.setEnabled(false);
jTEmail.setEnabled(false);
jTSenha.setEnabled(false);

}


//=====================================================================================
    
public void jTextApagar(){//Apaga os textos dos jTexts

jTCRM.setText("");
jTnome.setText("");
jTtipo.setText("");
jTEmail.setText("");
jTSenha.setText("");
}

  
//=====================================================================================
public void salvarXML(){//Salva as informações em XML.
                               
             String CRM= jTCRM.getText().trim();
             String nome=getset.getNomeUsuário();
             String senha=getset.getSenha();
             
             String sexo=getset.getSexo();
             String email=getset.getEmail();
             String data=getset.getData(); 
             String tipo=""+getset.getTipo();
                
                   
		//String nomeArq="Cadastro/"+registro+"_"+nome+".xml";
                String nomeArq="Cadastro/Usuario/"+CRM+".xml";
             
		String texto;
		//tentando criar arquivo
		try
		{
                try (Formatter saida = new Formatter(nomeArq)) {
                    texto="<?xml version='1.0' encoding='ISO-8859-1' ?>\n"+
                            "<cadastros>\n";
                                       
                    texto+=" <Usuario>\n";
                    texto+=" <Registro>"+CRM+"</Registro>\n";
                    texto+=" <Nome>"+nome+"</Nome>\n";
                    texto+=" <Senha>"+senha+"</Senha>\n";
                    texto+=" <Sexo>"+sexo+"</Sexo>\n";
                    texto+=" <E_mail>"+email+"</E_mail>\n";
                    texto+=" <Data>"+data+"</Data>\n";
                    texto+=" <Tipo>"+tipo+"</Tipo>\n";
                    texto+=" </Paciente>\n";
                    texto+="</Usuario>";
                    saida.format(texto);
                    
                }
			JOptionPane.showMessageDialog(null,"Arquivo '"+nomeArq+"' criado!","Arquivo",1);
		}
		//mostrando erro em caso se nao for possivel gerar arquivo
		catch(FileNotFoundException | HeadlessException erro){
			JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
                
        }
}
}
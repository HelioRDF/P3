/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medico;


import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import javax.swing.JOptionPane;


/**
 *
 * @author Helio Franca
 */
public class Buscar_Medico extends javax.swing.JFrame {

    /**
     * Creates new form Buscar_P
     */
    public Buscar_Medico() {
        initComponents();
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

        buttonGroup2_Sexo = new javax.swing.ButtonGroup();
        buttonGroup1_Busca = new javax.swing.ButtonGroup();
        Pesquisar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        BuscarNome = new javax.swing.JRadioButton();
        BuscaRegistro = new javax.swing.JRadioButton();
        CampoBuscarNome = new javax.swing.JTextField();
        CampoBuscarCRM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTSexo = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTDataNasc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTelefone = new javax.swing.JTextField();
        jTEndereco = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Gravar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jT_CRM = new javax.swing.JTextField();
        DataCadastro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Paciente");
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
        Pesquisar.setBounds(680, 90, 140, 40);

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Limpar.setForeground(new java.awt.Color(255, 0, 0));
        Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close18.png"))); // NOI18N
        Limpar.setText("Limpar");
        Limpar.setToolTipText("");
        Limpar.setEnabled(false);
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        getContentPane().add(Limpar);
        Limpar.setBounds(220, 580, 115, 40);

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
        Atualizar.setBounds(50, 580, 130, 40);

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/left176.png"))); // NOI18N
        Fechar.setToolTipText("");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(860, 570, 49, 39);

        buttonGroup1_Busca.add(BuscarNome);
        BuscarNome.setText("Buscar pelo nome");
        BuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarNome);
        BuscarNome.setBounds(50, 90, 130, 30);

        buttonGroup1_Busca.add(BuscaRegistro);
        BuscaRegistro.setText("Buscar pelo CRM");
        BuscaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(BuscaRegistro);
        BuscaRegistro.setBounds(50, 130, 140, 30);

        CampoBuscarNome.setEditable(false);
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
        CampoBuscarNome.setBounds(200, 90, 310, 27);

        CampoBuscarCRM.setEnabled(false);
        CampoBuscarCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBuscarCRMActionPerformed(evt);
            }
        });
        CampoBuscarCRM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoBuscarCRMKeyTyped(evt);
            }
        });
        getContentPane().add(CampoBuscarCRM);
        CampoBuscarCRM.setBounds(200, 130, 150, 27);

        jLabel1.setText("Desabilitado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 100, 70, 20);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 260, 40, 20);

        jTSexo.setEditable(false);
        jTSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSexoActionPerformed(evt);
            }
        });
        getContentPane().add(jTSexo);
        jTSexo.setBounds(710, 300, 100, 30);

        jTnome.setEditable(false);
        jTnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTnome);
        jTnome.setBounds(120, 250, 410, 30);

        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 300, 120, 30);

        jTDataNasc.setEditable(false);
        getContentPane().add(jTDataNasc);
        jTDataNasc.setBounds(500, 300, 120, 30);

        jLabel7.setText("CPF: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 310, 30, 20);

        jTCPF.setEditable(false);
        getContentPane().add(jTCPF);
        jTCPF.setBounds(120, 300, 240, 30);

        jLabel8.setText("E-Mail:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 390, 40, 20);

        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 390, 60, 20);

        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 350, 60, 20);

        jTTelefone.setEditable(false);
        jTTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTTelefone);
        jTTelefone.setBounds(120, 380, 210, 30);

        jTEndereco.setEditable(false);
        jTEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTEndereco);
        jTEndereco.setBounds(120, 340, 500, 30);

        jTEmail.setEditable(false);
        jTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTEmail);
        jTEmail.setBounds(400, 380, 220, 30);

        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(650, 300, 30, 20);

        Gravar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Gravar.setForeground(new java.awt.Color(0, 0, 102));
        Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bold6.png"))); // NOI18N
        Gravar.setText("  Gravar");
        Gravar.setToolTipText("");
        Gravar.setEnabled(false);
        Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarActionPerformed(evt);
            }
        });
        getContentPane().add(Gravar);
        Gravar.setBounds(50, 450, 130, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(50, 530, 860, 10);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 200, 860, 2);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Buscar  Médico:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 10, 300, 50);

        jT_CRM.setEditable(false);
        jT_CRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_CRMActionPerformed(evt);
            }
        });
        getContentPane().add(jT_CRM);
        jT_CRM.setBounds(710, 250, 100, 30);

        DataCadastro.setEditable(false);
        DataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(DataCadastro);
        DataCadastro.setBounds(690, 470, 220, 30);

        jLabel11.setText("Data:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(650, 470, 60, 30);

        jLabel4.setText("CRM:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(650, 260, 70, 20);

        setSize(new java.awt.Dimension(992, 696));
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        buscarXML();
        Atualizar.setEnabled(true);
        Limpar.setEnabled(true);
        
    }//GEN-LAST:event_PesquisarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
    jTextApagar();
    }//GEN-LAST:event_LimparActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        atualizar();
        Gravar.setEnabled(true);
    }//GEN-LAST:event_AtualizarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed

        if(BuscarNome.isSelected()){
            CampoBuscarNome.setEnabled(true);
            CampoBuscarCRM.setEnabled(false);

}
        
    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void BuscaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaRegistroActionPerformed

        

if(BuscaRegistro.isSelected()){
CampoBuscarCRM.setEnabled(true);
  CampoBuscarNome.setEnabled(false);
}


        
        
    }//GEN-LAST:event_BuscaRegistroActionPerformed

    private void CampoBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarNomeActionPerformed

    private void CampoBuscarNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoBuscarNomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarNomeKeyReleased

    private void CampoBuscarCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscarCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscarCRMActionPerformed

    private void CampoBuscarCRMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoBuscarCRMKeyTyped

    }//GEN-LAST:event_CampoBuscarCRMKeyTyped

    private void jTSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSexoActionPerformed

    private void jTnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnomeActionPerformed

    private void jTTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefoneActionPerformed

    private void jTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmailActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed
        salvarXML();
        jTeditablefalse();
         Atualizar.setEnabled(false);
    
        Gravar.setEnabled(false);
    }//GEN-LAST:event_GravarActionPerformed

    private void jTEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEnderecoActionPerformed

    private void jT_CRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_CRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_CRMActionPerformed

    private void DataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JRadioButton BuscaRegistro;
    private javax.swing.JRadioButton BuscarNome;
    private javax.swing.JTextField CampoBuscarCRM;
    private javax.swing.JTextField CampoBuscarNome;
    private javax.swing.JTextField DataCadastro;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Pesquisar;
    private javax.swing.ButtonGroup buttonGroup1_Busca;
    private javax.swing.ButtonGroup buttonGroup2_Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTDataNasc;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTSexo;
    private javax.swing.JTextField jTTelefone;
    private javax.swing.JTextField jT_CRM;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables


//=====================================================================================
  

public void atualizar(){
    
    jTnome.requestFocus();
    
    jTCPF.setEditable(true);
    jTDataNasc.setEditable(true);
    jTEmail.setEditable(true);
    jTEndereco.setEditable(true);
    jTTelefone.setEditable(true);
    jTnome.setEditable(true);
    
}

//=====================================================================================
  

public void buscarXML(){
    
    String registro="";
    
     
   if(BuscarNome.isSelected()){
      registro = CampoBuscarNome.getText().trim();
   }
   if(BuscaRegistro.isSelected()){
      registro = CampoBuscarCRM.getText().trim();
   }
           
    
             String nome;
             String cpf;
             String dataNasc;
             String sexo;
             String endereco;
             String telefone;
             String email;
             String data; 
  
    
    
            
             String mostra="";
	     String nomeArq="Cadastro/Medico/"+registro+".xml"; //Nome do arquivo, pode ser absoluto, ou pastas /dir/teste.txt
	     String linha="";
	     
		File arq = new File(nomeArq);
		
		//Arquivo existe
		if (arq.exists()){
		//	mostra="Arquivo - '"+nomeArq+"', aberto com sucesso!\n";
		//	mostra+="Tamanho do arquivo "+Long.toString(arq.length())+"\n";
		
                    //tentando ler arquivo
			try{
				
				FileReader reader = new FileReader(nomeArq); //abrindo arquivo para leitura
				BufferedReader leitor = new BufferedReader(reader); //leitor do arquivo
				
				leitor.readLine(); //<xml
				leitor.readLine(); //<cadastro
                                leitor.readLine(); //<Paciente
				while(true){
                                
					
                                        
                                        registro=leitor.readLine();
                                        registro=registro.substring(registro.indexOf(">")+1,registro.indexOf("/")-1); //pegando entre as tags
                                        jT_CRM.setText(registro);
                                        
					nome=leitor.readLine();
                                        nome=nome.substring(nome.indexOf(">")+1,nome.indexOf("/")-1); //pegando entre as tags
                                        jTnome.setText(nome);
                                       
                                        cpf=leitor.readLine();
                                        cpf=cpf.substring(cpf.indexOf(">")+1,cpf.indexOf("/")-1); //pegando entre as tags
                                        jTCPF.setText(cpf);
                                        			                
                                        dataNasc=leitor.readLine();
                                        dataNasc=dataNasc.substring(dataNasc.indexOf(">")+1,dataNasc.indexOf("/")-1); //pegando entre as tags
                                        jTDataNasc.setText(dataNasc);
                                        
                                        sexo=leitor.readLine();
                                        sexo=sexo.substring(sexo.indexOf(">")+1,sexo.indexOf("/")-1);
                                        jTSexo.setText(sexo);
                                                                                                                    
                                        endereco=leitor.readLine();
                                        endereco=endereco.substring(endereco.indexOf(">")+1,endereco.indexOf("/")-1);
                                        jTEndereco.setText(endereco);
                                        
                                        telefone=leitor.readLine();
                                        telefone=telefone.substring(telefone.indexOf(">")+1,telefone.indexOf("/")-1);
                                        jTTelefone.setText(telefone);
                                        
                                        email=leitor.readLine();
                                        email=email.substring(email.indexOf(">")+1,email.indexOf("/")-1);
                                        jTEmail.setText(email);
                                        
                                        data=leitor.readLine(); 
                                        data=data.substring(data.indexOf(">")+1,data.indexOf("/")-1);
                                        DataCadastro.setText(data);
                                        
                                         mostra+="Medico: "+nome+"\n\n";
                                        /* mostra+="Registro: "+registro
                                                +"\nNome: "+nome
                                                +"\nCPF: "+cpf
                                                +"\nData de Nascimento: "+dataNasc
                                                +"\nSexo: "+sexo
                                                +"\nEndereço: "+endereco
                                                +"\nTelefone: "+telefone
                                                +"\nE-mail: "+email
                                                +"\nData: "+data+"\n";   */                                                       
			             
					
                                     if(nome==null){break;}
				
                                }
                                        
			}
			catch(Exception erro) {
			//JOptionPane.showMessageDialog(null,mostra,"Arquivo (catch)",1);
		}}
		//Se nao existir
		else
			JOptionPane.showMessageDialog(null,"Arquivo nao existe!","Erro",0);
	
}

//=====================================================================================
  
public void salvarXML(){//Salva as informações em XML.
                               
             String registro= jT_CRM.getText().trim();
             String nome= jTnome.getText().trim();
             String cpf= jTCPF.getText().trim();
             String dataNasc= jTDataNasc.getText().trim();
             String sexo=jTSexo.getText().trim();
             String endereco=jTEndereco.getText().trim();
             String telefone=jTTelefone.getText().trim();
             String email=jTEmail.getText().trim();
             String data=DataCadastro.getText().trim(); 
                
                   
		//String nomeArq="Cadastro/"+registro+"_"+nome+".xml";
                String nomeArq="Cadastro/Medico/"+registro+".xml";
             
		String texto;
		//tentando criar arquivo
		try
		{
                try (Formatter saida = new Formatter(nomeArq)) {
                    texto="<?xml version='1.0' encoding='ISO-8859-1' ?>\n"+
                            "<cadastros>\n";
                                       
                    texto+=" <Medico>\n";
                    texto+=" <Registro>"+registro+"</Registro>\n";
                    texto+=" <Nome>"+nome+"</Nome>\n";
                    texto+=" <CPF>"+cpf+"</CPF>\n";
                    texto+=" <Data_de_Nascimento>"+dataNasc+"</Data_de_Nascimento>\n";
                    texto+=" <Sexo>"+sexo+"</Sexo>\n";
                    texto+=" <Endereco>"+endereco+"</Endereco>\n";
                    texto+=" <Telefone>"+telefone+"</Telefone>\n";
                    texto+=" <E_mail>"+email+"</E_mail>\n";
                    texto+=" <Data>"+data+"</Data>\n";
                    texto+=" </Medico>\n";
                    texto+="</Cadastros>";
                    saida.format(texto);
                    
                }
			JOptionPane.showMessageDialog(null,"Arquivo '"+nomeArq+"' criado!","Arquivo",1);
		}
		//mostrando erro em caso se nao for possivel gerar arquivo
		catch(FileNotFoundException | HeadlessException erro){
			JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
                
        }
}

//=====================================================================================
    
public void jTextApagar(){//Apaga os textos dos jTexts

//Zera os campos JText.    
//jT_Registro.setText("");
jTnome.setText("");
jTCPF.setText("");
jTEndereco.setText("");
jTDataNasc.setText("");
jTEmail.setText("");
jTSexo.setText("");
jTTelefone.setText("");
jT_CRM.setText("");
DataCadastro.setText("");


}


//=====================================================================================
    
public void jTeditablefalse(){//Apaga os textos dos jTexts

jTCPF.setEditable(false);
    jTDataNasc.setEditable(false);
    jTEmail.setEditable(false);
    jTEndereco.setEditable(false);
    jTTelefone.setEditable(false);
    jTnome.setEditable(false);}

}
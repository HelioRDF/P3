package criar_ler_xml;
import javax.swing.*;
import java.io.*;

public class leXML{
	
	public static void main(String[] args){
            
             String registro="003";
             String nome;
             String cpf;
             String dataNasc;
             String sexo;
             String endereco;
             String telefone;
             String email;
             String data; 
            
             String mostra="";
	     String nomeArq="Cadastro/"+registro+".xml"; //Nome do arquivo, pode ser absoluto, ou pastas /dir/teste.txt
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
		                                                              
					nome=leitor.readLine();
                                        nome=nome.substring(nome.indexOf(">")+1,nome.indexOf("/")-1); //pegando entre as tags
                                       
                                        cpf=leitor.readLine();
                                        cpf=cpf.substring(cpf.indexOf(">")+1,cpf.indexOf("/")-1); //pegando entre as tags
			                
                                        dataNasc=leitor.readLine();
                                        dataNasc=dataNasc.substring(dataNasc.indexOf(">")+1,dataNasc.indexOf("/")-1); //pegando entre as tags
                                                                                                                                                                
                                        sexo=leitor.readLine();
                                        sexo=sexo.substring(sexo.indexOf(">")+1,sexo.indexOf("/")-1);
                                                                              
                                        
                                        endereco=leitor.readLine();
                                        endereco=endereco.substring(endereco.indexOf(">")+1,endereco.indexOf("/")-1);
                                        
                                        telefone=leitor.readLine();
                                        telefone=telefone.substring(telefone.indexOf(">")+1,telefone.indexOf("/")-1);
                                        
                                        email=leitor.readLine();
                                        email=email.substring(email.indexOf(">")+1,email.indexOf("/")-1);
                                        
                                        data=leitor.readLine(); 
                                        data=data.substring(data.indexOf(">")+1,data.indexOf("/")-1);
                                         
                                        
                                         mostra+="Paciente: "+ nome+"\n\n";
                                         mostra+="Registro: "+registro
                                                +"\nNome: "+nome
                                                +"\nCPF: "+cpf
                                                +"\nData de Nascimento: "+dataNasc
                                                +"\nSexo: "+sexo
                                                +"\nEndereço: "+endereco
                                                +"\nTelefone: "+telefone
                                                +"\nE-mail: "+email
                                                +"\nData: "+data+"\n";
                                        
			             
					
                                     if(nome==null){break;}
				
                                }
                                        
                                                 
                                        
			}
			catch(Exception erro) {
			JOptionPane.showMessageDialog(null,mostra,"Erro ao ler arquivo (catch)",1);
		}}
		//Se nao existir
		else
			JOptionPane.showMessageDialog(null,"Arquivo nao existe!","Erro",0);
	}
}

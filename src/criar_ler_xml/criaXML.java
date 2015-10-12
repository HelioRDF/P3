

import javax.swing.*;
import java.util.Formatter; //para usar algo externo

public class criaXML{
	
	public static void main(String[] args){
            
            
             String registro="003";
             String nome="helio";
             String cpf="012";
             String dataNasc="23-03-89";
             String sexo="Masc";
             String endereco="224";
             String telefone="011";
             String email="jpfranca";
             String data="12-10-2015"; 
            
		String nomeArq="Cadastro/"+registro+"_"+nome+".xml";
		String texto="";
		//tentando criar arquivo
		try
		{
			Formatter saida = new Formatter(nomeArq);
			texto="<?xml version='1.0' encoding='ISO-8859-1' ?>\n"+
				  "<cadastros>\n";
    
                      
                        
			
				texto+=" <Paciente>\n";
				texto+=" <Registro>"+registro+"</Registro>\n";
                                texto+=" <Nome>"+nome+"</Nome>\n";
                                texto+=" <CPF>"+cpf+"</CPF>\n";
                                texto+=" <Data_de_Nascimento>"+dataNasc+"</Data_de_Nascimento>\n";
                                texto+=" <Sexo>"+sexo+"</Sexo>\n";
                                texto+=" <Endereco>"+endereco+"</Endereco>\n";
                                texto+=" <Telefone>"+telefone+"</Telefone>\n";
                                texto+=" <E_mail>"+email+"</E_mail>\n";
                                texto+=" <Data>"+data+"</Data>\n";
				texto+=" </Paciente>\n";
			
                                
			texto+="</Cadastros>";
			saida.format(texto);
			saida.close();
			JOptionPane.showMessageDialog(null,"Arquivo '"+nomeArq+"' criado!","Arquivo",1);
		}
		//mostrando erro em caso se nao for possivel gerar arquivo
		catch(Exception erro){
			JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
		}
	}
	
}

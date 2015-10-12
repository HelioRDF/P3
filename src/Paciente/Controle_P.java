package Paciente;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Helio Franca
 */
public class Controle_P {//Inicio da classe Paciente_Controle
    
    // Cria um array list de objetos do tipo paciente.
    ArrayList <GetSet_P> Controle; 
    
    // b) Implementar uma classe de gestão que tenha um atributo List do tipo paciente, contendo o CRUD:

     GetSet_P list;
     int i;
     
     //Construtor.
     public Controle_P (){
         Controle = new ArrayList();         }
    
//=============================================================================================================     
//1. Cadastrar Paciente.     
     
    public void Cadastrar(GetSet_P objeto){
      i++;  
     objeto.setRegistro(i);
     Controle.add(objeto);
        
    }
//=============================================================================================================   
//2.A Buscar Paciente pelo nome. Retorna o Objeto.
    
    public String buscarNome(String NomeB){//Inicio método buscar
    
        String imprimir="";
        boolean encontrou= false;
        int i =0;
        
        for (GetSet_P objeto:Controle){//Inicio for
            
            if(objeto.getNome().equalsIgnoreCase(NomeB)){
                encontrou=true;
                break; }                      }//Fim for.
    
//.................................................................................
        
        //For utilizado para capturar mais de um objeto com a mesma palavra chave.
        for (GetSet_P objeto:Controle){ //Inicio for 2. 
          i++;
          if(encontrou==false){//Inicio do If
              JOptionPane.showMessageDialog(null, "Paciente não encontrado");
              break;      }//Fim do If
          
          if(objeto.getNome().equalsIgnoreCase(NomeB)){// Inicia If
              imprimir += objeto.imprimirDados();
              JOptionPane.showMessageDialog(null, i+ " - Lista:\n"+imprimir);
              break;                                  }//Fim do If.
        }//Fim do for        
        
        return null;   
               
} // Fim método buscar por nome.
     
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//2.B Buscar Paciente pelo código. Retorna o objeto.
    
public String buscarCodigo(int registro){//Inicio do método de buscar por código
        
 String imprimir="";
 boolean encontrou=false;
 int i =0;
 
 
    for(GetSet_P objeto:Controle){//Inicio do for
     
     
     if(objeto.getRegistro()==registro){//Inicio do if.
         encontrou=true;
         break;                 }//fim do if
                                       }//Fim  do for
   
//.................................................................................
  //For utilizado para capturar mais de um objeto com a mesma palavra chave.
       
    for(GetSet_P objeto:Controle){//Inicio do for
        i++;
        
       if(encontrou==false){//Inicio do If
              JOptionPane.showMessageDialog(null, "Paciente não encontrado");
              break;      }//Fim do If
       
       if(objeto.getRegistro()==registro){
           JOptionPane.showMessageDialog(null, i+ " - Lista:\n"+imprimir);
              break;                                  }//Fim do If.
        }//Fim do for 
    
    return null;    
}    //Fim do método de buscar por código


//============================================================================================================= 
//3. Excluir paciente.

public void apagar(String deletar){//Inicio do método apagar.
    
 String Nome ="";
 boolean encontrou =false;
 int i=0;
 
 for (GetSet_P objeto:Controle){//Inicio do for.
     
     if(objeto.getNome().equalsIgnoreCase(Nome)){//Início do if
         encontrou=true;
         break;                                 }//Fim do if
         
 }//Fim do for
 //................................................................................. 
     
    for (GetSet_P objeto:Controle){//Inicio do for.
 i++;
 if(encontrou==false){//Inicio do If.
    JOptionPane.showMessageDialog(null,"Paciente não encontrado");
  break; }//fim do if.
 
  if(objeto.getNome().equalsIgnoreCase(Nome)){//Início do if
      Nome+=objeto.imprimirDados();
      JOptionPane.showMessageDialog(null,i+ " - Lista:\n"+Nome);
      Controle.remove(objeto);
      break;         }//fim do if
    }//Fim do for
     
}//Fim do método apagar.
 //============================================================================================================= 
//4.Atualizar dados do paciente. // 

public Integer atualizar (String atualizar){//Inicio do método atualizar.
    
    String nome="";
    boolean encontrou=false;
    Integer i=0;
    
    for(GetSet_P objeto:Controle){//Inicio For.
        
        if(objeto.getNome().equalsIgnoreCase(atualizar)){//inicio if.
            encontrou=true;
            break;                                      }//fim do if.
                                         }//Fim do for.
    
     //................................................................................. 
  
     
     for(GetSet_P objeto:Controle){//Inicio For.
      i++;
      if(encontrou==false){//inicio do if.
     JOptionPane.showMessageDialog(null,"Paciente não encontrado");
        break;             }//fim do if
         
      
       if(objeto.getNome().equalsIgnoreCase(atualizar)){//inicio if.
      
           nome+=objeto.imprimirDados();
            JOptionPane.showMessageDialog(null,i+ " -Alterando informações do Paciente:\n"+nome); 
  
         Controle.remove(objeto);// Testar esse comando  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
           
           
           break;                                      }//fim do if.
      
      
     }//fim do for.
    
    return i;
    
}//Fim do método atualizar.

//============================================================================================================= 
//5. Visualizar 

public String imprimir(){//Inicio do método.
       
 String info="";
 
 if(Controle.isEmpty()){//Inicio do if.
     JOptionPane.showMessageDialog(null,"Lista Vazia.");}//Fim do If.
else {//Inicio do else.
     for(GetSet_P obejeto:Controle){//Inicio do for
         
         info+=obejeto.imprimirDados()+"\n";
         
     }//fim do for
     
     
 }//Fim do else
 
 
    
    
    return info;
    
}//Fim do método imprimir.
//============================================================================================================= 



}//Fim da classe Paciente_Controle



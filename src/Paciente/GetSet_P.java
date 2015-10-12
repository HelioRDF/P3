/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 *
 * @author Helio Franca
 */
public class GetSet_P {
  
    
    
//Atributos.
    private  int Registro=0;
    private  int i = 1000;// Código Randomico.
    private  String Nome;
    private  int CPF;
    private  Date Data_Nasc;
    private  String Sexo; 
    private  String Endereco;
    private  int Telefone;
    private  String Email;
    private  Date Data_Cadastro;
    
    
    //=====================================================================
      //Contrutores

    public GetSet_P(String Nome, int CPF, Date Data_Nasc, String Sexo, String Endereco, int Telefone, String Email, Date Data_Cadastro) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Data_Nasc = Data_Nasc;
        this.Sexo = Sexo;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Data_Cadastro = Data_Cadastro;
    }
    
     
public GetSet_P(){}
    
   
    //=====================================================================
    // Metodos GET e SET.


  public int getRegistro() {
        return Registro;
    }
    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }
   
    public Date getData_Nasc() {
        return Data_Nasc;
    }
    public void setData_Nasc(Date Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Date getData_Cadastro() {
        return Data_Cadastro;
    }
    public void setData_Cadastro(Date Data_Cadastro) {
        this.Data_Cadastro = Data_Cadastro;
    }


public String getNome(){
return this.Nome;                  } 
public void setNome(String nome){
this.Nome=nome;                    }

public int getCPF(){
return this.CPF;                  } 
public void setCPF(int cpf){
    this.setTelefone(CPF);                    }

public Date getDate_Nasc(){
return  this.getData_Nasc();                  } 
public void setDate_Nasc(Date data_nasc){
    this.setData_Nasc(data_nasc);                    }


public String getEndereco(){
return this.Endereco;                  } 
public void setEndereco(String endereco){
this.Endereco=endereco;                    }


public int getTelefone(){
return this.Telefone;                  } 
public void setTelefone(int telefone){
this.Telefone = telefone;                    }


public String getEmail(){
return this.Email;                  } 
public void setEmail(String email){
this.Email=email;                    }


//=============================================================================

//Método de impressão. 
 //3. Definir um método para imprimir os dados do contato.
    public String imprimirDados(){
       
           
     String Dados = "\n"+"\nRegistro:  "+this.getRegistro()
        + "\nNome:  "+this.getNome()
        +"\n  CPF:  "+this.getCPF()
        +"\n  Data de Nascimento:  "+this.getDate_Nasc()
         +"\n  Sexo:  "+this.getSexo()
        +"\n  Endereço:  "+this.getEndereco()
        +"\n  Telefone:  "+this.getTelefone()
        +"\n  E-Mail:  "+this.getEmail()
        +"\n  Data de Cadastro:  "+this.getData_Cadastro();     ;
         
        return Dados;                                             }

   

    
}//Fim da Classe.

/**
    Registro
    Nome
    CPF
    DataNasc
    Sexo
    Endereco
    Telefone
    Email
    Data    **/

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
    private  Integer Registro=0;
    private  Integer i = 1000;// Código Randomico.
    private  String Nome;
    private  Integer CPF;
    private  String Data_Nasc;
    private  String Sexo; 
    private  String Endereco;
    private  Integer Telefone;
    private  String Email;
    private  String Data_Cadastro;
    
    
    //=====================================================================
      //Contrutores

    public GetSet_P(String Nome, int CPF, String Data_Nasc, String Sexo, String Endereco, int Telefone, String Email, String Data_Cadastro) {
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


  public Integer getRegistro() {
        return Registro;
    }
    public void setRegistro(Integer Registro) {
        this.Registro = Registro;
    }
   
    public String getData_Nasc() {
        return Data_Nasc;
    }
    public void setData_Nasc(String Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getData_Cadastro() {
        return Data_Cadastro;
    }
    public void setData_Cadastro(String Data_Cadastro) {
        this.Data_Cadastro = Data_Cadastro;
    }


public String getNome(){
return this.Nome;                  } 
public void setNome(String nome){
this.Nome=nome;                    }

public Integer getCPF(){
return this.CPF;                  } 
public void setCPF(Integer cpf){
    this.setTelefone(CPF);                    }

public String getDate_Nasc(){
return  this.getData_Nasc();                  } 
public void setDate_Nasc(String data_nasc){
    this.setData_Nasc(data_nasc);                    }


public String getEndereco(){
return this.Endereco;                  } 
public void setEndereco(String endereco){
this.Endereco=endereco;                    }


public Integer getTelefone(){
return this.Telefone;                  } 
public void setTelefone(Integer telefone){
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

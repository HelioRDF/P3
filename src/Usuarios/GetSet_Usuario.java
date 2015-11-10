package Usuarios;





public class GetSet_Usuario {

  

private String CRM;//
private String tipo;//cod tipo
private String nomeUsuário;//login
private String senha;//Senha do usuário
private String email;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
private String data;

    
    
   

    //=============================================================================
    //Get e set.


public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
private String sexo;

 public GetSet_Usuario() {
    }
    public String getCRM(){
       
           
        return CRM;       
        
}

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeUsuário() {
        return nomeUsuário;
    }

    public void setNomeUsuário(String nomeUsuário) {
        this.nomeUsuário = nomeUsuário;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //=============================================================================
//Método de impressão.
    //3. Definir um método para imprimir os dados do contato.
    public String imprimirDados() {
        String Dados = "\n"+"\nRegistro:  "+this.getCRM()
                + "\nNome:  "+this.getNomeUsuário()
                +"\n  CPF:  "+this.getTipo() ;
        
        return Dados;
    }
  
    
    
}
package Usuarios;





public class GetSet_Usuario {

  

private int CRM;//
private int tipo;//cod tipo
private String nomeUsuário;//login
private String senha;//Senha do usuário
private String email;
    
   

    //=============================================================================
    //Get e set.


 public GetSet_Usuario() {
    }
    public int getCRM(){
       
           
        return CRM;       
        
}

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
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
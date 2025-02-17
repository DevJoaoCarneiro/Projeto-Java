package br.com.devflix;

class CadastroUsuario {
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private String dataDeNascimento;

    public void setnome(String nome){
        this.nome = nome;
    }

    public void settelefone(String telefone){
        this.telefone = telefone;
    }

    public void setcpf (String cpf){
        this.cpf = cpf;
    }

    public void setemail (String email){
        this.email = email;
    }

    public void setdataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento= dataDeNascimento;
    }

    String getnome(){
        return nome;
    }

    String gettelefone(){
        return telefone;
    }

    String getcpf(){
        return cpf;
    }

    String getemail(){
        return email;
    }

    String getdataDeNascimento(){
        return dataDeNascimento;
    }
}

package br.com.devflix;

public class ContaBancaria {
    private int numeroConta;
    private float saldoConta;
    private String nomeTitular;

    public void setnumeroConta (int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setsaldoConta (float saldoConta){
        this.saldoConta = saldoConta;
    }

    public void setnomeTitular (String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    int getnumeroConta(){
        return numeroConta;
    }

    float getsaldoConta(){
        return saldoConta;
    }

    String getnomeTitular (){
        return nomeTitular;
    }
}

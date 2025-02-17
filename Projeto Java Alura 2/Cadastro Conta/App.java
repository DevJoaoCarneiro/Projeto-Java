package br.com.devflix;
/*Exercicio em Java
Criar um sistema de conta bancaria divido em
classe para treinar segurança de classe em java*/

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String nome;
        String telefone;
        String cpf;
        String email;
        String dataDeNascimento;

        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        contaBancaria.setnomeTitular("Roberto");
        contaBancaria.setnumeroConta(12313);
        contaBancaria.setsaldoConta(1232.4f);

        System.out.println("Insira seu nome");
        nome = scanner.nextLine();
        cadastroUsuario.setnome(nome);

        System.out.println("Insira seu telefone");
        telefone = scanner.nextLine();
        cadastroUsuario.settelefone(telefone);

        System.out.println("Insira seu cpf");
        cpf = scanner.nextLine();
        cadastroUsuario.setcpf(cpf);

        System.out.println("Insira seu email");
        email = scanner.nextLine();
        cadastroUsuario.setemail(email);

        System.out.println("Insira seu data de nascimento");
        dataDeNascimento = scanner.nextLine();
        cadastroUsuario.setdataDeNascimento(dataDeNascimento);

        System.out.format(
                "Nome.....%s\nTelefone......%s\nCpf.....%s\nEmail.....%s\nData de nascimento.....%s\nConta titular.....%s\nNumero Conta.....%d\nSaldo conta.....%.2f\n",
                cadastroUsuario.getnome(), cadastroUsuario.gettelefone(), cadastroUsuario.getcpf(),
                cadastroUsuario.getemail(), cadastroUsuario.getdataDeNascimento(), contaBancaria.getnomeTitular(),
                contaBancaria.getnumeroConta(), contaBancaria.getsaldoConta());
        scanner.close();
    }
}

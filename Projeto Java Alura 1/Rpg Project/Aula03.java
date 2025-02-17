package Exercicios;
import java.util.Random;

public class Aula03 {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Joao Victor";
        heroi.forca = 16;
        heroi.vida = 150;

        Inimigo vilao = new Inimigo();

        heroi.apresentacao();
        heroi.atacar(vilao);

    }
}

class Inimigo {
    String nome="Lord Walter";
    int forca= 20;
    int vida= 12;
}


class Personagem {
    String nome;
    int forca;
    int vida;

    void apresentacao() {
        System.out.format("Apresentacao do Personagem\n Heroi...%s\n Forca...%d\n Vida....%d\n", nome, forca, vida);
    }

    int calcAtaque() {
        Random gerador = new Random();
        int danoAplicado = 1 + gerador.nextInt(19);
        return danoAplicado;
    }

    void atacar(Inimigo vilao) {
        int danoCausado=calcAtaque();
        if(danoCausado>=vilao.vida){
        System.out.println("\nVoce venceu!!!");
        System.out.format("%s atacou %s e deu um dano de %d", nome, vilao.nome, danoCausado);
        }else{
        System.out.println("\nVoce errou o ataque");
        System.out.format("Deu apenas %d de dano e %s ainda esta vivo com %d de vida", danoCausado, vilao.nome, vilao.vida-danoCausado);
        }
    }
}
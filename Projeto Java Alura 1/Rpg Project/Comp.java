package Exercicios;
public class Comp {
    public static void main(String[] args) {
        Computador compA = new Computador();
        compA.placaDeVideo = "Gtx 1080ti";
        compA.sistemaOperacional = "i9-9840";
        compA.memoria = 16;

        Computador compB = new Computador();
        compB.placaDeVideo = "Amd 6600";
        compB.sistemaOperacional = "Ryzen 5 3600";
        compB.memoria = 32;

        

        if (compA.memoria > compB.memoria) {
            System.out.format(
                    "Especificacoes do computador \n Placa de video...%s\n Sistema Operacional...%s\n Memoria...%d \n\n\n",
                    compA.placaDeVideo, compA.sistemaOperacional, compA.memoria);
        } else {
            System.out.format(
                    "Especificacoes do computador \n Placa de video...%s\n Sistema Operacional...%s\n Memoria...%d \n\n\n",
                    compB.placaDeVideo, compB.sistemaOperacional, compB.memoria);
        }

    }
}

class Computador {
    String placaDeVideo;
    String sistemaOperacional;
    int memoria;
}
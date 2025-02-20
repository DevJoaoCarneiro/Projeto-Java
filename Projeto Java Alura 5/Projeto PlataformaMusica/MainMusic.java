import java.util.ArrayList;
import java.util.Scanner;

public class MainMusic {
    public static void main(String[] args) throws Exception {
        int escolha, i, opcao;

        Scanner scanner = new Scanner(System.in);
        Musicas musica = new Musicas(5.20f, 4543, 340, 5.0f, "Led zeppeling", "Dskt", "English");
        Musicas musica2 = new Musicas(3.20f, 9543, 1230, 4.5f, "Frank Sinatra", "Ag Producoes", "English");
        Musicas musica3 = new Musicas(2.30f, 2543, 140, 4.70f, "Alceu Valencia", "Abc Studio", "Portugues");
        Podcast podcast = new Podcast(120.30f, 450, 321, 4, "Modelagem de banco de dados", "Tecnologia");
        Podcast podcast2 = new Podcast(45.50f, 1450, 721, 4.96f, "Como Jogar defesa siciliana", "Xadrez");
        Podcast podcast3 = new Podcast(30.00f, 5465, 3221, 3.21f, "Smoke mapa mirage cs2", "Jogos");

        // Criando uma lista com ArrayList
        ArrayList<Musicas> listaMusicas = new ArrayList<>();
        ArrayList<Podcast> listaPodcast = new ArrayList<>();
        listaMusicas.add(musica);
        listaMusicas.add(musica2);
        listaMusicas.add(musica3);
        listaPodcast.add(podcast);
        listaPodcast.add(podcast2);
        listaPodcast.add(podcast3);

        System.out.println("Ouvir Musica (1) Ouvir Podcast(2)");
        escolha = scanner.nextInt();

        if (escolha == 1) {
            for (i = 0; i < listaMusicas.size(); i++) {
                System.out.println(listaMusicas.get(i).toString());
            }

            System.out.println("Qual artista voce deseja escutar?");
            opcao = scanner.nextInt();
            Musicas musicaescolhida = listaMusicas.get(opcao - 1);
            musicaescolhida.reproduzir();


        } else {
            for (i = 0; i < listaPodcast.size(); i++) {
                System.out.println(listaPodcast.get(i).toString());
            }
            System.out.println("Qual podcast voce deseja escutar?");
            opcao = scanner.nextInt();
            Podcast podcastescolhido = listaPodcast.get(opcao - 1);
            podcastescolhido.reproduzir();

        }

        scanner.close();
    }
}

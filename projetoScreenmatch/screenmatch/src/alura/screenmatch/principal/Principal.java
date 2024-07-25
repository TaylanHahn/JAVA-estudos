package alura.screenmatch.principal;

import alura.screenmatch.calculos.CalculadoraDeTempo;
import alura.screenmatch.calculos.FiltroRecomendacao;
import alura.screenmatch.modelos.Episodio;
import alura.screenmatch.modelos.Filme;
import alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972); //crio o objeto meuFilme, usando o modelo (classe)
        meuFilme.setDuracaoEmMinutos(175);

        System.out.println("\n");
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.pegaMedia());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos");
        System.out.println("\n");

        Serie minhaSerie = new Serie("The Mandalorian", 2021);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos() + " minutos");
        System.out.println("\n");

        Filme outroFilme = new Filme("Star Wars V", 1980);
        outroFilme.setDuracaoEmMinutos(124);
        outroFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + outroFilme.getDuracaoEmMinutos() + " minutos");
        System.out.println("\n");


        // calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).toString()
        );

    }
}



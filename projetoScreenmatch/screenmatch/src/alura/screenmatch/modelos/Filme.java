package alura.screenmatch.modelos;
import alura.screenmatch.calculos.Classificavel;

//classe
public class Filme extends Titulo implements Classificavel {
    // atributos exclusivo de Filme
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " +this.getNome() + " (" +this.getAnoDeLancamento() + ")";
    }
}
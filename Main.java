public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // média calculada por três notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun: Maverick
                Filme de aventura com Tom Cruise.
                Media: 8.13
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        // casting
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


    }
}
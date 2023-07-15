// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2020;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 5.1;

        double media = (9.5 + 6 + 8.3) / 3;
        System.out.println(media);

        String sinopse;


        sinopse = """
                Filme top:
                Filme de ação dos anos 80
                Ano de lançamento:
        """ + anoDeLancamento;

        System.out.println(sinopse);


        int classificacao = (int) (media / 2);
        System.out.println(classificacao);



    };
};
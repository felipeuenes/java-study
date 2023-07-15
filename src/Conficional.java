public class Conficional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 5.1;

        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("FIlme que as pessoas estão curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena assistir!");
        }


        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}

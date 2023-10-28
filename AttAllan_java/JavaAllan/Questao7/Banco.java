package Questao7;

public class Banco {
    private static double taxaPositiva = 0.08;

    private static double taxaNegativa = 0.20; 

    public static double calcularTaxaJuros(double saldo) {
        if (saldo >= 0) {
           
            return saldo * taxaPositiva;
        } else {
           
            return saldo * taxaNegativa;
        }
    }
}

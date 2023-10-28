package Questao7;

public class Principal {
    public static void main(String[] args) {
        double saldoPositivo = 1000.0;
        double saldoNegativo = -500.0;

        double jurosPositivos = Banco.calcularTaxaJuros(saldoPositivo);
        double jurosNegativos = Banco.calcularTaxaJuros(saldoNegativo);

        System.out.println("Taxa de juros para saldo positivo: " + jurosPositivos);
        System.out.println("Taxa de juros para saldo negativo: " + jurosNegativos);
    }
}

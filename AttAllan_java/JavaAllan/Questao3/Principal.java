package Questao3;

public class Principal {
    public static void main(String[] args) {
       
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.depositar(1500.0);
        System.out.println("Saldo atual: " + minhaConta.getSaldo());

        minhaConta.sacar(600.0);
        System.out.println("Saldo atual: " + minhaConta.getSaldo());

        minhaConta.sacar(300.0); 
        System.out.println("Saldo atual: " + minhaConta.getSaldo());

        minhaConta.depositar(-100.0); 
        System.out.println("Saldo atual: " + minhaConta.getSaldo());
    }
}

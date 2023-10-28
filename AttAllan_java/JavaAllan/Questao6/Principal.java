package Questao6;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        double area = circulo.calcularArea();
        System.out.println("A área do círculo é: " + area);
    }

    }

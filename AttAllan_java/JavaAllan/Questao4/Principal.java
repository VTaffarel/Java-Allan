package Questao4;


public class Principal {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 4.0);
        double area = triangulo.calcularArea();
        System.out.println("A área do triângulo é: " + area);
    }
    }


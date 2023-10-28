package Questao10;

public class Principal {
    
        public static void main(String[] args) {
            Shape circulo = new Circulo(5.0);
            Shape retangulo = new Retangulo(4.0, 6.0);
    
            System.out.println("Área do círculo: " + circulo.area());
            System.out.println("Perímetro do círculo: " + circulo.perimetro());
    
            System.out.println("Área do retângulo: " + retangulo.area());
            System.out.println("Perímetro do retângulo: " + retangulo.perimetro());
        }
    }
    


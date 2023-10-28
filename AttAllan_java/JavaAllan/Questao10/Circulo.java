package Questao10;

public class Circulo extends Shape {
        private double raio;
    
        public Circulo(double raio) {
            this.raio = raio;
        }
    
        @Override
        public double area() {
            return Math.PI * Math.pow(raio, 2);
        }
    
        @Override
        public double perimetro() {
            return 2 * Math.PI * raio;
        }
    }
    
   
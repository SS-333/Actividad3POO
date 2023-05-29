package pruebafiguras;

public class Trapecio {
    double baseMayor, baseMenor, altura;
    Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    double calcularArea() {
        return ((baseMayor + baseMenor) / 2.0)*altura;
    }
    double calcularPerimetro() {
        return baseMenor + baseMayor + 2*Math.sqrt(Math.pow((baseMayor-baseMenor)/2.0,2) + Math.pow(altura,2)) ;
    }
}

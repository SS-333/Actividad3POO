package pruebafiguras;

public class Rombo {
    double lado, diametroMayor, diametroMenor;
    Rombo(double lado, double diametroMayor, double diametroMenor) {
        this.lado = lado;
        this.diametroMayor = diametroMayor;
        this.diametroMenor = diametroMenor;
    }
    double calcularArea() {
        return (diametroMayor * diametroMenor) / 2.0;
    }
    double calcularPerimetro() {
        return (4*lado);
    }
}

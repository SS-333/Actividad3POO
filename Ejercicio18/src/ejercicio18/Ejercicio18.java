package ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        Interfaz interfaz= new Interfaz();
        interfaz.setVisible(true); 
    }
    
    public static double calcularSalarioBruto(double horasTrabajadas, double valorHora) {
        return horasTrabajadas * valorHora;
    }
    
    public static double calcularSalarioNeto(double salarioBruto, double porcentajeReteFuente) {
        return salarioBruto - (salarioBruto * porcentajeReteFuente);
    }
}

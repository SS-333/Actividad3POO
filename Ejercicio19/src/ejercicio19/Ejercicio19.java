package ejercicio19;

public class Ejercicio19 {

    public static void main(String[] args) {
             Interfaz interfaz = new Interfaz();
             interfaz.setVisible(true);
          }
    public static double perimetro(double lado) {
        return lado * 3;
    }
    public static String altura(double lado) {
        return String.format("%.02f", (Math.sqrt(3)*lado) / 2);
    }
    public static  String area(double lado){
        return String.format("%.02f", (Math.sqrt(3)*(lado*lado)) / 4);
    }

}

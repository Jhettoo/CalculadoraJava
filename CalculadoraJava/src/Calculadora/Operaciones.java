package Calculadora;

public class Operaciones {
    private double numero1;
    private double numero2;

    public Operaciones() {
    }

//    public Operaciones(double numero1, double numero2) {
//        this.numero1 = numero1;
//        this.numero2 = numero2;
//    }
    
    public double suma(double num1, double num2){
        return num1+num2;
    }
    public double resta(double num1, double num2){
        return num1-num2;
    }
    public double multiplicacion(double num1, double num2){
        return num1*num2;
    }
    public double divisio(double num1, double num2){
        return num1/num2;
    }
    
}

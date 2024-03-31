package org.practices.rolando.services;

public class Matematica {

    public double calcularPotencia(double x, int n){
        double potencia = 1;
        for (int i = 0; i < n; i++){
            potencia *= x;
        }
        return potencia;
    }

    public long calcularFactorial(int n){
        long factorial = 1;
        for (int i = 1; i < n + 1; i++){
            factorial *= i;
        }
        return factorial;
    }

    public double calcularSerie(double x, int n){
        double serie = 1;
        for (int i = 1; i < n + 1; i++) {
            double elementoSerie = (calcularPotencia(x, 2 * i)/calcularFactorial(2*i));
            serie += (i % 2 == 1) ? -elementoSerie : elementoSerie;
        }
        return serie;
    }
    
}

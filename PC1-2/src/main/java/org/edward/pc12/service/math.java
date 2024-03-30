package org.edward.pc12.service;

public class math {
    public static double potencia(double x, int n) {
        double value = 1;
        if (n==0){
            return value;
        }
        else {
            for (int i = 1; i < n+1; i++) {
                value *=x;
            };
        }

        return value;
    }

    public static long factorial(int n){
        long resultado = 1;
        if(n ==0 || n ==1){
            return resultado;
        }
        else{
            for (int i = 0; i < n; i++) {
                resultado = resultado * (i+1);
            }
        };
        return resultado;
    }

    public static double serie(double x, int n){
        double  valor = 1;
        if (n==1){
            return valor;
        }
        else {
            for (int i = 1; i < n+1; i++) {
                valor = 1 + math.potencia(-1,i)*(math.potencia(x,2*i)/math.factorial(2*i));
            }
        }

        return valor;
    }
}

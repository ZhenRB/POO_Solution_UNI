package org.practices.edward.services;

public class formulaGeneral {

    public double calcDiscriminante(double a, double b, double c) {
        double discriminante;
        discriminante = Math.pow(b,2)- 4*a*c;

        return discriminante;
    }

    public double calcX1(double d,double b, double a){
        double x1;
        x1=(-b+Math.sqrt(d))/2*a;
        return x1;
    }
    public double calcX2(double discriminante,double b, double a){
        double x2;
        x2=(-b+Math.sqrt(discriminante))/2*a;
        return x2;
    }

    public String calcCondicion(double d){
        String condicion="Sí tiene raíces";
        condicion = (d>=0)? condicion : "No tiene raíces";

        return condicion;
    }
}

package ejecutable;

import modelo.Coordenada;

public class Test{
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1.3,5.3);
        Coordenada c3 = c1;
        Coordenada c4 = c2;

        System.out.println("Coordenada c1: " + c1.toString());
        System.out.println("Coordenada c2:" + c2.toString());

        System.out.println("\n");
    if(c1.equals(c2)){
        System.out.println("Las coordenadas son iguales");
        }
        else{
            System.out.println("Las coordenadas son diferentes");
        }
        System.out.println("\n");
        System.out.println("La distancia entre c1: " + c1 + " y c2: " + c2 + " es: " + c1.calcularDistancia(c2));

    }
}
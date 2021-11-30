/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase donde se muestran los resultados de los calculos de las diferentes 
 * figuras
 * @author javier
 * @version 2.0
 * @since 30/11/2021
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas 
        
        /**
         * Creamos un objeto "Cuadrado" y le damos el valor de 10, despues
         * definimos que es el area, con un Syso se muestra por pantalla una 
         * cadena y lo concatenamos llamando al consultor de l clase cuadrado
         * 
         */
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        
        /**
         * Creamos un objeto "Irculo" y le damos el valor de 200, despues
         * definimos que es el area, con un Syso se muestra por pantalla una 
         * cadena y lo concatenamos llamando al consultor de la clase circulo
         * 
         */
        
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        
        /**
         * Creamos un objeto "Rectangulo" y le damos el valor de 100 y 20, 
         * despues definimos que es el area, con un Syso se muestra por pantalla una 
         * cadena y lo concatenamos llamando al consultor de la clase rectangulo
         * 
         */
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());
        
        /**
         * Creamos un objeto "Triangulo" y le damos el valor de 5 y 10, despues
         * definimos que es el area, con un Syso se muestra por pantalla una 
         * cadena y lo concatenamos llamando al consultor de l clase triangulo
         * 
         */
        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}

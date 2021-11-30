/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Cuadrado implements FiguraGeometrica
{
    /*Atributo que define el lado del cuadrado*/
    private double lado;
    
    /*Atributo que define el area del cuadrado*/
    private double areaCuadrado;

    /**
     * Metodo constructor de la clase que define el lado del cuadrado
     * @param lado Lado del Cuadrado
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    /**
     * Metodo consultor que devuelve el lado del cuadrado
     * @return Devuelve Lado del cuadrado
     */
    public double getLado() 
    {
        return lado;
    }
    
    /**
     * Metodo modificador del atributo lado
     * @param lado Lado del cuadrado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    
    /**
     * Metodo consultor que devuelve el area del cuadrado
     * @return Devuelve area del cuadrado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}
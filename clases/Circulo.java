package clases;

import clases.Figura;
/**
* Clase que representa la figura geometrica circulo
* @author Beatriz Rodriguez Bejarano
 */
public class Circulo extends Figura{
    
    final double pi=3.1416;
    private double radio;
/**
*metodo que calcula el area del circulo
* @return double area del circulo
 */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
/**
*metodo que obtiene el radio del circulo
* @return radio
 */
    public double getRadio() {
        return radio;
    }
/**
* metodo que coloca el radio del circulo
* @param radio double radio del circulo
 */
    public void setRadio(double radio) {

        this.radio = radio;
    }
    
}

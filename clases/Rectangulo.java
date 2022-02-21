package clases;
/**
* Clase que impelementa la figura rectangulo
* @author Beatriz Rodriguez Bejarano
 */
public class Rectangulo extends Figura{
 
    private double base;
    private double altura;
/***
*metodo que clacula el area de la figura
*@return double area del rectangulo
 */
    public double CalcularArea() {        
        return this.area=(base*altura);
     }
/**
* metodo que obtiene la base de la figura
*@return base de circulo
 */
    public double getBase() {
        return base;
    }
/**
* metodo que coloca la base una vez se ha calculado
* @param base double base del rectangulo
 */
    public void setBase(double base) {
        this.base = base;
    }
/**
* metodo que obtiene la altura de la figura
*@return altura
 */
    public double getAltura() {
        return altura;
    }
/**
* metodo que coloca la altura una vez calculada
* @param altura double altura del rectangulo
 */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}

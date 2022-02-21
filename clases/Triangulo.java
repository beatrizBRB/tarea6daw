package clases;
/**
* Clase que implementa la figura triangulo
* @author Beatriz Rodriguez Bejarano
 */
public class Triangulo extends Figura{
    
    private double base;
    private double altura;
/**
* metodo que calcula el area de la figura
*@return double area del triangulo
 */
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }
/**
* metodo que obtiene la base de la figura
*@return base
 */
    public double getBase() {
        return base;
    }
/**
* mertodo que coloca la base de la figura una vez se ha calculado
* @param base double base del triangulo
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
* @param altura double altura del triangulo
 */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}

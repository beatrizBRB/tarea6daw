import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;
/**
* Esta es la clase principal que crea objetos de tres tipos, circulo, rectangulo y triangulo
* @author Beatriz Rodriguez Bejarano
 */
public class Main {
/**
* metodo que crea los objetos y los pinta por pantalla
 */
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
    /**
    *metodo que calcula el area de la figura f
     */
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo
        
        return f.CalcularArea();
    }
}

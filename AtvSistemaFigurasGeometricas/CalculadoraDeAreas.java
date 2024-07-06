import java.util.ArrayList;


public class CalculadoraDeAreas {
  public static void main(String[] args) {

    
    ArrayList<Figura> figuras = new ArrayList<Figura>();
    figuras.add(new Circulo(5.0));
    figuras.add(new Retangulo(4.0, 6.0));
    figuras.add(new Triangulo(3.0, 8.0));

    
    for (Figura figura : figuras) {
        figura.calcularArea();
    }

    
  }
}
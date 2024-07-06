public class Circulo extends Figura{

  Double raio;
  public Circulo(Double raio){
    this.raio = raio;
  }
@Override
  public void calcularArea(){
    System.out.println("Area do circulo: " + (3.14 * (raio * raio)));
  }
  
}
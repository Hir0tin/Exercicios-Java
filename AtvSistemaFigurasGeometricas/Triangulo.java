public class Triangulo extends Figura{

  Double base;
  Double altura;

  public Triangulo(Double base, Double altura){
    this.base = base;
    this.altura = altura;
  }

  @Override
  public void calcularArea(){
    System.out.println("Area do triangulo: " + ((base * altura) / 2));
  }

  
}
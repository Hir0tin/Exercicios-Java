public class Retangulo extends Figura{

  Double largura;
  Double altura;

  public Retangulo(Double largura, Double altura){
    this.largura = largura;
    this.altura = altura;
  }

  @Override
  public void calcularArea(){
    System.out.println("Area do retangulo: " + (largura * altura));
  }

  
}
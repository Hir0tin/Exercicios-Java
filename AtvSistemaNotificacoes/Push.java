public class Push extends Notificao{

  String idDispositivo;
  String mensagem;

  public Push(String idDispositivo, String mensagem){
    this.idDispositivo = idDispositivo;
    this.mensagem = mensagem;
  }

  @Override
  public void enviar(){
    System.out.println("Mensagem enviada para: " + idDispositivo);
    System.out.println("Mensagem: " + mensagem);
  }
}
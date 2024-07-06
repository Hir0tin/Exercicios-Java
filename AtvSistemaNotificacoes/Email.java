public class Email extends Notificao{

  String emailDestinatario;
  String mensagem;

  public Email(String emailDestinatario, String mensagem){
    this.emailDestinatario = emailDestinatario;
    this.mensagem = mensagem;
  }
  @Override
  public void enviar(){
    System.out.println("Mensagem enviada para: " + emailDestinatario);
    System.out.println("Mensagem: " + mensagem);
  }
}
public class SMS extends Notificao {

  String numeroTelefone;
  String mensagem;

  public SMS(String numeroTelefone, String mensagem) {
    this.numeroTelefone = numeroTelefone;
    this.mensagem = mensagem;
  }

  @Override
  public void enviar() {
    System.out.println("Mensagem enviada para: " + numeroTelefone);
    System.out.println("Mensagem: " + mensagem);
  }

}
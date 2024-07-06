import java.util.ArrayList;

public class SistemaNotificacoes {
  public static void main(String[] args) {

  
    ArrayList<Notificao> notificacoes = new ArrayList<Notificao>();
    notificacoes.add(new Email("joaopereiradasilva@email.com", "Este é um email de teste"));
    notificacoes.add(new SMS("+1234567890", "Este é um SMS de teste"));
    notificacoes.add(new Push("123456", "Esta é uma notificação push de teste"));

    
    for (Notificao notificacao : notificacoes) {
        notificacao.enviar();
        System.out.println(); 
    }
    
  }
}
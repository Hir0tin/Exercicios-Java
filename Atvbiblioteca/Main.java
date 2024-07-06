import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
    Livro livro1 = new Livro("O Senhor dos Anéis", "Cleber", 1954);
    Livro livro2 = new Livro("Harry Potter", "Robson", 1954);

    
    Biblioteca biblioteca1 = new Biblioteca();
    biblioteca1.adicionarLivro("Sapiens","Tanenbaum",1983,2);
    biblioteca1.adicionarLivro("Diario de um banana","Antonio",1983,2);
    biblioteca1.adicionarLivro(livro1);
    biblioteca1.adicionarLivro(livro2);
    biblioteca1.ListarLivros();
   
    biblioteca1.consultarLivro(null);
    biblioteca1.consultarLivro("Sapiens");
    
    
  }

  
}
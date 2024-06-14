import java.util.Scanner;

public class Teste {

  public static void main(String[] args) throws Exception {

    String jogo;
    Scanner leitor = new Scanner(System.in);

    leitor.useDelimiter("[;\r\n]+");

    System.out.println("Qual o seu jogo do momento?");
    jogo = leitor.next();

    System.out.println("Jogo é " + jogo);

  }
}

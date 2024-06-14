import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.WindowEvent;

public class Janela extends JFrame implements WindowListener {
  private JTextArea texto;
  private String textoInicial;
  private static final String[] OPCOES = { "Salvar", "Não salvar", "Cancelar" };
  private static final int OPCAO_SALVAR = 0;
  private static final int OPCAO_CANCELAR = 2;

  public Janela(String textoInicial) {
    super("Devpad");
    this.textoInicial = textoInicial;
    texto = new JTextArea(textoInicial);

    this.add(texto);

    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Importante para não fechar
    this.setSize(800, 600);
    this.setVisible(true);
    this.addWindowListener(this);
  }

  private int confirmarFechamento() {
    String titulo = "DevNote";
    String descricao = "Você deseja salvar as alterações em arquivo.txt?";

    int resposta = JOptionPane.showOptionDialog(null, descricao, titulo,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null, OPCOES, OPCOES[0]);

    return resposta;
  }

  private void salvarConteudo() {
    String conteudo = texto.getText();
    Arquivo.salvar(conteudo);
  }

  private boolean contemAlteracoes() {
    String conteudo = texto.getText();
    if (conteudo.equals(this.textoInicial)) {
      return false;
    }

    return true;
  }

  @Override
  public void windowOpened(WindowEvent e) {

  }

  @Override
  public void windowClosing(WindowEvent e) {
    System.out.println("Fechando a janela...");

    // Não houve alterações, fechar sem confirmação
    if (!contemAlteracoes()) {
      System.exit(0);
      return;
    }

    int resposta = confirmarFechamento();

    if (resposta == OPCAO_CANCELAR) {
      return;
    }

    if (resposta == OPCAO_SALVAR) {
      System.out.println("Salvando antes...");
      salvarConteudo();
    }

    System.exit(0);
  }

  @Override
  public void windowClosed(WindowEvent e) {
  }

  @Override
  public void windowIconified(WindowEvent e) {
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
  }

  @Override
  public void windowActivated(WindowEvent e) {
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
  }

}

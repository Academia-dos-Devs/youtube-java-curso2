import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "usuarios.txt";

        Arquivo arquivo = new Arquivo();

        try {
            System.out.println(arquivo.lerRapido(caminhoArquivo));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um problema na leitura do arquivo");
        }

    }
}
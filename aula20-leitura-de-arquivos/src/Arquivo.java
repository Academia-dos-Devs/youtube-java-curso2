import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Arquivo {
  // o método ler pode disparar exceções do tipo Exception
  public String ler(String caminhoArquivo) throws Exception {
    String conteudo = "";

    try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
      String linha = leitor.readLine();

      while (linha != null) {
        conteudo += linha;
        linha = leitor.readLine();

        if (linha != null) {
          conteudo += "\n";
        }
      }
    } catch (Exception erro) {
      // System.out.println("Houve um problema ao ler o arquivo");
      throw erro;
    }

    return conteudo;
  }

  public String lerRapido(String caminhoArquivo) throws Exception {
    try {
      Path caminhos = Paths.get(caminhoArquivo);
      List<String> resultadoLista = Files.readAllLines(caminhos);

      return String.join("\n", resultadoLista);
    } catch (Exception erro) {
      throw erro;
    }
  }
}

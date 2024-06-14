import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Arquivo {
  public static final String NOME_ARQUIVO = "arquivo.txt";

  public static void salvar(String conteudo) {
    try {
      FileWriter fileWriter = new FileWriter(NOME_ARQUIVO);

      BufferedWriter escritor = new BufferedWriter(fileWriter);

      escritor.write("Hello World");

      escritor.close(); // Fechar as coisas dele, e ir embora
    } catch (Exception erro) {
      erro.printStackTrace();
    }
  }

  public static String lerRapido() throws Exception {
    try {
      Path caminhos = Paths.get(NOME_ARQUIVO);
      List<String> resultadoLista = Files.readAllLines(caminhos);

      return String.join("\n", resultadoLista);
    } catch (Exception erro) {
      throw erro;
    }
  }

  public static boolean existeArquivo() {
    File arquivo = new File(NOME_ARQUIVO);
    return arquivo.exists();
  }
}

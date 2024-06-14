
public class App {
    public static void main(String[] args) throws Exception {
        String conteudoArquivo = "";

        if (Arquivo.existeArquivo()) {
            System.out.println("Contém arquivo");
            conteudoArquivo = Arquivo.lerRapido();
        } else {
            System.out.println("Não contém arquivo");
        }

        // try (FileWriter writer = new FileWriter("arquivo.txt");
        // BufferedWriter bw = new BufferedWriter(writer)) {
        // bw.write("Texto a ser escrito no arquivo.\n");
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        new Janela(conteudoArquivo);
    }
}

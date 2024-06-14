

public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Mensagem antes da excecao");
            // int resultado = 10 / 0;
            System.out.println("Mensagem após a excecao");
        } catch (Exception erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally { // finalmente 
            // SEMPRE VAI SER EXECUTADO
            System.out.println("Vou ser executado independente se deu erro ou não");
        }

        System.out.println("Mensagem final");
    }
}

import java.util.Map;

public class HttpRequest {

    private String url;
    private String metodo;
    private String autenticacao;
    private int timeout;
    private Map<String, String> cabecalhos;


    public HttpRequest (String url, String metodo, String autenticacao, int timeout, Map<String, String> cabecalhos) {
        this.url = url;
        this.metodo = metodo;
        this.autenticacao = autenticacao;
        this.timeout = timeout;
        this.cabecalhos = cabecalhos;
    }

    public void enviar () {
        System.out.println("\nEnviando requisição " + metodo + " para " + url);
        System.out.println("Autenticação: " + (autenticacao != null ? autenticacao : "Nenhuma"));
        
        System.out.println("Timeout: " + timeout + "ms");
        System.out.println("Cabeçalhos: " + (cabecalhos.isEmpty() ? "Nenhum" : cabecalhos));
    }
}

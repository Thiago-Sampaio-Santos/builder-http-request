import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder {
    private String url;
    private String metodo;
    private String autenticacao;
    private int timeout = 5000;
    private Map<String, String> cabecalhos = new HashMap<>();


    public HttpRequestBuilder (String url, String metodo) {
        this.url = url;
        this.metodo = metodo;
    }

    public HttpRequestBuilder autenticacao(String autenticacao) {
        this.autenticacao = autenticacao;
        return this;
    }

    public HttpRequestBuilder timeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public HttpRequestBuilder adicionarCabecalho(String chave, String valor) {
        this.cabecalhos.put(chave, valor);
        return this;
    }

    public HttpRequest build () {
        if (url == null || metodo == null) {
            throw new IllegalArgumentException("URL e método são obrigatórios.");
        }
        return new HttpRequest(url, metodo, autenticacao, timeout, cabecalhos);
    }


}

public class MainBuilder {
    public static void main(String[] args) {

        HttpRequest requisicao1 = new HttpRequestBuilder("https://api.restaurante.com/pedidos", "POST")
        
                .autenticacao("Bearer token123")
                .timeout(10000)
                .adicionarCabecalho("Content-Type", "application/json")
                .adicionarCabecalho("Accept", "application/json")
                .build();
        requisicao1.enviar();


        HttpRequest requisicao2 = new HttpRequestBuilder("https://api.restaurante.com/mesas", "GET")
                .build();
        requisicao2.enviar();
    }

}

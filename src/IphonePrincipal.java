public class IphonePrincipal {
    public static void main(String[] args) {


        Iphone iphone = new Iphone();

        // testando o Reprodutor músical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Selecionando música");

        // testando o Aparelho  telefônico

        iphone.ligar("54545454");
        iphone.atender();


        // testando Naveador de internet

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();



    }
}
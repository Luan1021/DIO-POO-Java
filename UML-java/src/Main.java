public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        // Testando funcionalidades
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        meuIphone.ligar("123456789");
        meuIphone.atender();

        meuIphone.exibirPagina("https://www.apple.com");
    }
}

package iPhoneSimulation;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo m�sica...");
    }

    @Override
    public void pausar() {
        System.out.println("M�sica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a m�sica: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo p�gina da web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando p�gina da web.");
    }

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        // Testando as funcionalidades do iPhone
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("M�sica 1");
        
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

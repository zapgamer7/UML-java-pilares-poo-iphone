package multifuncional;

import ligação.telefonica.AparelhoTelefonico;
import navegador.internet.NavegadorInternet;
import reprodutor.musica.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA");

    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO");

    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");

    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    
}

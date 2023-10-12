package reprodutor.musica;

public class Mp3 implements ReprodutorMusical {

    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }
    
}

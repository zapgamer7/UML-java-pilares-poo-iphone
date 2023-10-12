package ligação.telefonica;

public class TelefoneFixo implements AparelhoTelefonico {

    public void ligar() {
        System.out.println("LIGANDO...");
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    
}

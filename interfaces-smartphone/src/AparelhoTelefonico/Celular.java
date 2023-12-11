package AparelhoTelefonico;

public class Celular implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando via celular");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação celular");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz via celular");

    }
    
}

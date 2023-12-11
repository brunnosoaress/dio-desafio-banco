package ReprodutorMusical;

public class Mp3 implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando a musica via mp3");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música via mp3");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música via mp3");
    }
}

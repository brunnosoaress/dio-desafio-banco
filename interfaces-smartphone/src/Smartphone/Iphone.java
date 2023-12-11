package Smartphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página na internet via Iphone");
    }

    @Override
    public void aduicionarNovaAba() {
        System.out.println("Adicionando nova aba na internet via Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página na internet via Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando via Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação via Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz via Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música via Iphone");
    }

    @Override
    public void pausar() {
       System.out.println("Pausando a música via Iphone");
    }

    @Override
    public void selecionarMusica() {
       System.out.println("Selecionando a música via Iphone");
    }

}

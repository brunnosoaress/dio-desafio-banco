package Estabelecimento;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;
import Smartphone.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        NavegadorInternet navegadorInternet = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        ReprodutorMusical reprodutorMusical = iphone;
        
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.aduicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    
    }
}

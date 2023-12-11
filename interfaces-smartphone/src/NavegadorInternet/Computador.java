package NavegadorInternet;

public class Computador implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página na internet via computador");  
    }

    @Override
    public void aduicionarNovaAba() {
        System.out.println("Adicionando a página na internet via computador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página na internet via computador");
    }
    
}

public class App {
    public static void main(String[] args) {
        Cliente Bruno = new Cliente();
        Bruno.setNome("Bruno");
        Conta cc = new ContaCorrente(Bruno);
        Conta contaPoupanca = new ContaPoupanca(Bruno);

        cc.depositar(1500);
        cc.tranferir(500, contaPoupanca);
        contaPoupanca.sacar(250);

        cc.imprimirInfos();
        contaPoupanca.imprimirInfos();

    }
}

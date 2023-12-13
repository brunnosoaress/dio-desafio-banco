public class Gerencia {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        cc.imprimirInfos();
        contaPoupanca.imprimirInfos();

    }
}

public class Main {
    public static void main(String[] args) {
        Cliente luan = new Cliente();
        luan.setNome("Luan");

        Conta corrente = new ContaCorrente(luan);
        Conta poupanca = new ContaPoupanca(luan);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}

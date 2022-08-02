public class Main {
  
  public static void main(String[] args) {
    Banco santander = new Banco();
    santander.setNome("Santander");

    Cliente venilton = new Cliente();
    venilton.setNome("Venilton");

    Conta cc = new ContaCorrente(venilton, santander);    
    Conta poupanca = new ContaPoupanca(venilton, santander);
    
    cc.depositar(100);
    cc.transferir(100, poupanca);
    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}

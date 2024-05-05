public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nome, int numeroConta, double saldo) {
        this.nome=nome;
        this.numeroConta=numeroConta;
        this.saldo=saldo;
    }
    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }public int getNumeroConta() {
        return numeroConta;
    }public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        System.out.println("-----------------------------------------------------");
    }public void sacar(double valor){
        if(valor>saldo){
            System.out.println("Saldo insuficiente para realizar a operação.");
            System.out.println("---------------------------------------------------");
        }else if(valor>5000){
            System.out.println("Valor do saque acima do permitido.");
            System.out.println("----------------------------------------------------");
        }else{
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println(".................VOLTE SEMPRE.................");            
        }
    }public double getSaldo(){
        return saldo;
    }
}

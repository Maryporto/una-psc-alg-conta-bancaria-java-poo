public class BancoApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria(" ", 0, 0);    

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        contaBancaria.setNome(nome);

        System.out.printf("Informe o numero da conta: ");
        int numConta = scanner.nextInt();
        contaBancaria.setNumeroConta(numConta);

        System.out.print("informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        contaBancaria.depositar(saldoInicial);

        System.out.println("Conta bancária criada com sucesso.");
        System.out.println("---------------------------------------------");

        char opcao;
        while(true){
            System.out.println("BEM VINDO AO BANCO");
            System.out.println("----ESCOLHA UMA OPERAÇÂO----");
            System.out.println("1..DEPÓSITO\n2..SACAR\n3..VER SALDO\n4..SAIR");
            opcao = scanner.next().charAt(0);

            switch (opcao){
                case '1':
                System.out.println(contaBancaria.getNome() + ", Informe o valor a depositar:");
                System.out.println();
                    double valorDeposito = scanner.nextDouble();
                    contaBancaria.depositar(valorDeposito);
                    break;
                case '2':
                    System.out.println(contaBancaria.getNome() + ", Informe o valor a sacar:");
                    double valorSaque = scanner.nextDouble();
                    contaBancaria.sacar(valorSaque);
                    break;
                case '3':                    
                    System.out.println("Saldo da conta de numero " + contaBancaria.getNumeroConta() + " disponível: R$" + contaBancaria.getSaldo());
                    System.out.println("--------------------------------------------------------------------");
                    break;

            }
            if (opcao=='4'){
                System.out.println("***SAINDO BANCO***");
                System.out.println("............VOLTE SEMPRE............");
                System.out.println("--------------------------------------------------------");
                System.out.println();                    
                break;
            }else if(opcao!='1' && opcao!='2' && opcao!='3'){
                System.out.println("*OPÇÃO INVÁLIDA*");
                System.out.println("--------------------------------------------------------");
                System.out.println();
                continue;
            }

    
        }
        scanner.close();
    }
}

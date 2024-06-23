package aprendaJunto.banking;

public class MainTransactions {
    public static void main(String[] args) {

        System.out.println("bem vindo ao banco");
        System.out.println("=============//========");

        Transactions transactions = new Transactions(500, "davi", 1234563);
        transactions.setSaldo(550);

        transactions.deposito(250.00);
        transactions.retirar(50);

        transactions.impriDados();


    }
}

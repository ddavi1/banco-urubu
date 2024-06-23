package aprendaJunto.banking;

public class Transactions {

    private double saldo;
    private String nome;
    private int cpf;



    public Transactions(double saldo, String nome, int cpf) {
        this.saldo = saldo;
        this.nome = nome;
        this.cpf = cpf;
    }


    public void impriDados() {

        System.out.println("saldo atual:" + saldo);
        System.out.println("conta do titular:" + nome);
        System.out.println("cpf do titular:" +cpf);


    }

   public void deposito(double saldo) {

       System.out.println("voce depositou:" + saldo);
       this.saldo += saldo;
   }

    public void retirar(double saldo) {

        if ( saldo > this.saldo ) {
            throw new RuntimeException("so pode retirar oque voce tem");
        } else {
            System.out.format("retirada de: %.2f\n", saldo);
            this.saldo -= saldo;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float novoSaldo) {
        this.saldo = novoSaldo;
    }
}

package ContaBancaria;

public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nome, int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;  
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean deposito(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean retirada(double valor){
        if(saldo > valor){
            saldo = saldo - valor;
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Conta Bancaria [ Nome: " + getNome() + " |Numero Conta Bancaria: " + getNumeroConta() +" |Saldo Atual: " + getSaldo() + " ]";
    }

    public boolean clientesComSaldoMaior2000(){
        return getSaldo() > 2000;
    }
}

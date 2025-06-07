package ContaBancaria;

public class ContaRemunerada extends ContaBancaria{
    private double porcentualRemuneracao = 0.0;
    public ContaRemunerada(String nome, int numeroConta, double saldo){
        super(nome, numeroConta, saldo);
    }

    public void definePercentualRemuneracao(double valor){
        if(valor <= 1 || valor >= 100 ){
            System.out.println("Valor invalido");
        } else{
            this.porcentualRemuneracao = valor;
        }
    }

    @Override
    public boolean deposito(double valor){
        if(valor > 0){
            double remuneracao = valor * (porcentualRemuneracao/100.0);
            return super.deposito(valor + remuneracao);
        }else{
            return false;
        }
    }   
}



package ContaBancaria;

public class ContaComLimite extends ContaBancaria{
    private double limite = 0.0;
    private double taxaJuros = 0.0;
    private double jurosAcumulados = 0.0;

    public ContaComLimite(String nome, int numeroConta, double saldo){
        super(nome, numeroConta, saldo);
    }

    public void defineLimite(double valor){
        this.limite = valor;
    }

    public void defineTaxaJuros(double valor){
        this.taxaJuros = valor;
    }

    @Override
    public boolean retirada(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            setSaldo(getSaldo() - valor);
            // Se ficou negativo, calcula juros sobre o valor negativo
            if (getSaldo() < 0) {
                double valorNegativo = Math.abs(getSaldo());
                double juros = valorNegativo * (taxaJuros / 100.0);
                jurosAcumulados += juros;
            }
            return true;
        } else {
            return false;
        }
    }

    public double getJuros() {
        return jurosAcumulados;
    }

    public boolean quitaJuros() {
        if (getSaldo() >= jurosAcumulados && jurosAcumulados > 0) {
            setSaldo(getSaldo() - jurosAcumulados);
            jurosAcumulados = 0.0;
            return true;
        } else {
            return false;
        }
    }

}

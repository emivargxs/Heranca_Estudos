package Passagem;

public class Economy extends Passagem {
    public Economy(String cpf, String nome, String assento, double custoPassagem){
    super(cpf, nome, assento, custoPassagem);
    }

    @Override
    public double custoBagagem(int qtd, int[] pesos) {
        double custoTotal = 0.0;
        double custoPorKg = 0.50;
        double adicionalPorBagagem = 10.00;

        for (int i = 0; i < qtd; i++) {
            custoTotal = custoTotal + (pesos[i] * custoPorKg) + adicionalPorBagagem;
        }
        return custoTotal;
    }

    @Override
    public String toString() {
        return "Economy{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", assento='" + getAssento() + '\'' +
                ", custoPassagem=" + getCustoPassagem() +
                '}';
    }

    
    public boolean buscarAssento(String nomeAssento){
        return this.getAssento().contains(nomeAssento);
    }
    public String buscarPorNome(String nomePassageiro){
       if(getNome().contains(nomePassageiro)){
         return getNome();
       }else{
        return null;
       }
    }
}

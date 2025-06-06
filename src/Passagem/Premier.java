package Passagem;

public class Premier extends Passagem {

    public Premier(String cpf, String nome, String assento, double custoPassagem, int milhas){
    super(cpf, nome, assento, custoPassagem);
    }

    @Override
    public double custoBagagem(int qtd, int [] pesos){
        double custo = 0.0;
        double custoPorKg = 0.50;
        for(int i = 2; i <qtd ; i++){
            custo = (custo + custoPorKg * pesos[i]) * 0.50;
        }
        return custo;

    }

    public int calculaMilhas(){
         return (int) (super.getCustoPassagem() * 0.20);
    }

    @Override
    public String toString() {
        return "Premier{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", assento='" + getAssento() + '\'' +
                ", custoPassagem=" + getCustoPassagem() +
                ", milhas=" + calculaMilhas() +
                '}';
    }
}

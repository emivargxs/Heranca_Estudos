package Passagem;

public class Executive extends Passagem{

    public Executive(String cpf, String nome, String assento, double custoPassagem, int milhas){
    super(cpf, nome, assento, custoPassagem);
    }

    @Override
    public double custoBagagem(int qtd, int[] pesos){
        double custo = 0.0;
        double custoPorKg = 0.50;
        // Começa do índice 2, pois as duas primeiras são isentas
        for(int i = 2; i < qtd; i++){
            custo = (custo + pesos[i] * custoPorKg);
        }
        return custo;
    }

    // Para calcular as milhas (10% do custo da passagem):
    public int calculaMilhas(){
        return (int)(super.getCustoPassagem() * 0.10);
    }

    @Override
    public String toString() {
        return "Executive{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", assento='" + getAssento() + '\'' +
                ", custoPassagem=" + getCustoPassagem() +
                ", milhas=" + calculaMilhas() +
                '}';
    }
}

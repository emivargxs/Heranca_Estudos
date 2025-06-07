package Passagem;

public class Passagem {
    private String cpf;
    private String nome;
    private String assento;
    private double custoPassagem;

    public Passagem(String cpf, String nome, String assento, double custoPassagem){
        this.cpf = cpf;
        this.nome = nome;
        this.assento = assento;
        this.custoPassagem = custoPassagem;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getAssento(){
        return assento;
    } 

    public double getCustoPassagem(){
        return custoPassagem;
    }

    public double custoBagagem(int qtd, int [] pesos){
        double custo = 0.0; //valor do custo inicia em 0
        double valorPorKg = 0.50; // valor por kg é 0.50
        for(int i = 0; i < qtd; i++){ //percorro quantas bagagens tenho
                custo = custo + pesos[i] * valorPorKg; //o custo total vai ser: pego a bagagem, o peso dela e multiplico pela quantidade de kg.... faço isso ate a ultima bagagem
        }
        return custo;
    }

    public double defineAssento(String a){
        return 5.00;
      
    }

    public boolean buscarAssento(String nomeAssento){
        return false;
    }

    public String buscarPorNome(String nomePassageiro){
        return null;
    }
    }


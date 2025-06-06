package ExercícioEmLaboratórioExPJPF;

public class PessoasFisicas extends Pessoas {
    private String nome;
    private String anoNasc;
    private String cpf;

    public PessoasFisicas(String nome, String anoNasc, String cpf){
        super();
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getAnoNasc(){
        return anoNasc;
    }

    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString(){
        return "Pessoa Fisica [ ID: " + getId() + ", Nome: " + getNome() + ", Ano Nascimento: " + getAnoNasc() + ", CPF: " + getCpf() + " ]";
    }


    @Override
    public boolean buscandoNome(String parteNome){
        return this.nome.contains(parteNome);
    
    }   
}

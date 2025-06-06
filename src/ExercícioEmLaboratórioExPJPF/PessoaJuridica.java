package ExercícioEmLaboratórioExPJPF;

public class PessoaJuridica extends Pessoas{
    public String razaoSocial;
    public String anoFundacao;
    public String cnpj;

    public PessoaJuridica(String razaoSocial, String anoFundacao, String cnpj){
        super();
        this.razaoSocial = razaoSocial;
        this.anoFundacao = anoFundacao;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial(){
        return razaoSocial;
    }

    public String getAnoFundacao(){
        return anoFundacao;
    }

    public String getCnpj(){
        return cnpj;
    }

    @Override
    public String toString(){
        return "Pessoa Juridica [ ID: " + getId() + ", Razao Social: " + getRazaoSocial() + ", Ano Fundancao: " + getAnoFundacao() + ", CNPJ: " + getCnpj() + " ]";
    }

    @Override
    public boolean localizaCNPJ(String cnpjBuscado){
        return this.cnpj.contains(cnpjBuscado);
    }

    @Override
    public boolean localizaAno(String anoBuscado){
      return this.anoFundacao.contains(anoBuscado);
    }
}

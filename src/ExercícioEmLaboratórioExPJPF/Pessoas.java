package ExercícioEmLaboratórioExPJPF;

public class Pessoas {
    private static int proximoId = 100;
    private int id;

    public Pessoas(){
        this.id = proximoId++;
    }

    public int getId(){
        return id;
    }

    public boolean buscandoNome(String parteNome){ //nao faz nada na classe pessoa pq vai ser chamado apenas em PessoasFisicas.
        return false; 
    }
    
    public boolean localizaCNPJ(String cnpjBuscado){ ////nao faz nada na classe pessoa pq vai ser chamado apenas em PessoasJuridicas.
        return false;
    }

    public boolean localizaAno(String anoBuscado){
        return false;
    }

}

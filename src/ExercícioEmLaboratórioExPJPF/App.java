package ExercícioEmLaboratórioExPJPF;

import java.util.ArrayList;

public class App {
        public static void main(String[] args) {
            
            PessoasFisicas pf1 = new PessoasFisicas("Joaozinho", "2002", "855-522-632-96"); //OBJETO PF1 CRIADO E PESSOAFisica Instanciada
            PessoasFisicas pf2 = new PessoasFisicas("Mariazinha", "2018", "522-569-963-98");

            PessoaJuridica pj1 = new PessoaJuridica("empresa1", "2015", "852254851214");
            PessoaJuridica pj2 = new PessoaJuridica("empresa2", "2020", "52335451254510");
        
            ArrayList<Pessoas> listaPessoas  = new ArrayList<>(); //criei um arrayList p guardar esses valores
            listaPessoas.add(pf1); //adicionei
            listaPessoas.add(pf2);
            listaPessoas.add(pj1);
            listaPessoas.add(pj2);

            for(Pessoas lista : listaPessoas){ //percorre todos os elementos do array chamado listaPessoas, para cada elemento da lista ele cria uma variavel chamada lista do tipo Pessoa e atribui a ela o elemento atual 
                System.out.println(lista);
            }

            for(Pessoas listaFisica : listaPessoas){ 
                if(listaFisica instanceof PessoasFisicas){ //verifico se lista eh uma instancia de PessoasFisicas, garantindo que só vai ser chamado o meotodo em objetos do tipo PessoaFisica
                    boolean resultadof = listaFisica.buscandoNome("Mariazinha");
                    int id = listaFisica.getId();
                    if(resultadof){
                        System.out.println("PESSOA FISICA \n");
                        System.out.println("Procurando Mariazinha");
                        System.out.println("ID: " + id + "NOME ENCONTRADO\n");
                    } 
                    
             
                }
            }

            for(Pessoas listaJuridica : listaPessoas){
                if(listaJuridica instanceof PessoaJuridica){
                    boolean cnpjEncontrado = ((PessoaJuridica)listaJuridica).localizaCNPJ("852254851214");
                    int id = listaJuridica.getId();
                    if(cnpjEncontrado){
                        System.out.println("PESSOA JURIDICA\n");
                        System.out.println("Procurando CNPJ 852254851214");
                        System.out.println("ID: " + id + " CNPJ ENCONTRADO\n");
                    }

                    boolean anoEncontrado = ((PessoaJuridica)listaJuridica).localizaAno("2020");
                    if(anoEncontrado){
                        System.out.println("Procurando ano 2020");
                        System.out.println("ID: " + id + "Ano encontrado");
                    }
                 }
                } 

            }
            
}

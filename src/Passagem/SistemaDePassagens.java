package Passagem;

import java.util.ArrayList;

public class SistemaDePassagens {
    
    public static void main(String[] args) {

        
        Economy ec1 = new Economy("9865549684", "Maria", "EC1", 1200);
        Economy ec2 = new Economy("56253620", "Joao", "EC2", 2200);
        
        Executive ex1 = new Executive("865251250", "Pedro", "EX1", 5000, 200);
        Executive ex2 = new Executive("48145156145", "Ethan", "EX2", 5000, 500);
        
        Premier p1 = new Premier("5251311021521", "Ian", "pr1", 7000, 5000);
        Premier p2 = new Premier("58465145661", "Bob", "pr2", 7000, 7000);
        
        ArrayList<Passagem> listaPassageiros = new ArrayList<>();
        listaPassageiros.add(ec1);
        listaPassageiros.add(ex2);
        listaPassageiros.add(ec2);
        listaPassageiros.add(p1);
        listaPassageiros.add(ex1);
        listaPassageiros.add(p2);
        
        for(Passagem lista : listaPassageiros){
            System.out.println(lista);
        }
        
        
        //Lista de assento desejado
        for(Passagem listaAssentoDesejado : listaPassageiros){
            if(listaAssentoDesejado instanceof Economy){
                String nome = listaAssentoDesejado.getNome();
                boolean assentoEncontrado = listaAssentoDesejado.buscarAssento("EC1");
                if(assentoEncontrado){
                    System.out.println("Assento Buscado:" + assentoEncontrado);
                    System.out.println(nome);
                    System.out.println("\n");
                }     
            }
        }
        
        //lista de passageiros por nome
        for(Passagem listaPassagemPorNome : listaPassageiros){
            String idEncontrado = listaPassagemPorNome.getNome();
        if(listaPassagemPorNome instanceof Economy){
            String nomeEncontrado = listaPassagemPorNome.buscarPorNome("Maria");
            if(nomeEncontrado != null){
                System.out.println(nomeEncontrado);
            }
        }else{
            System.out.println(idEncontrado + ": Esse nome nao pertence a essa Categoria\n");
        }
    }
    int [] pesos = {10,15,20};
    emitirPassagem(ec1, pesos);
    emitirPassagem(ec2, pesos);
    emitirPassagem(p2, pesos);
    
    }
    



    //metodo para imprimir os dados da passagem
    public static void emitirPassagem(Passagem passagem, int[] pesos){
        System.out.println("-----Passagem Emitida-----");
        System.out.println("Nome: " + passagem.getNome());
        System.out.println("CPF: " + passagem.getCpf());
        System.out.println("Assento: "+ passagem.getAssento());
        System.out.println("Custo Total bagagem: R$ " + passagem.custoBagagem(pesos.length, pesos));
        System.out.println("--------------------------\n");
    }

}



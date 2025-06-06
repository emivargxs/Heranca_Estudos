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
    
    for(Passagem lista : listaPassageiros){
        System.out.println(lista);
    }
   }
}

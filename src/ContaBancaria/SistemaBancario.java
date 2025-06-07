package ContaBancaria;

import java.util.ArrayList;

public class SistemaBancario {
    public static void main(String[] args) {
    ArrayList<ContaBancaria> listaTiposContas = new ArrayList<>();
    
    ContaComLimite c1 = new ContaComLimite("Maria", 1001, 500.0);
    ContaComLimite c2 = new ContaComLimite("João", 1002, 1500.0);
    ContaComLimite c3 = new ContaComLimite("Ana", 1003, 250.0);
    ContaComLimite c4 = new ContaComLimite("Carlos", 1004, 0.0);
    ContaComLimite c5 = new ContaComLimite("Beatriz", 1005, 2000.0);
    
    ContaRemunerada cr1 = new ContaRemunerada("Lucas", 2001, 1000.0);
    ContaRemunerada cr2 = new ContaRemunerada("Fernanda", 2002, 500.0);
    ContaRemunerada cr3 = new ContaRemunerada("Paulo", 2003, 2500.0);
    ContaRemunerada cr4 = new ContaRemunerada("Juliana", 2004, 300.0);
    ContaRemunerada cr5 = new ContaRemunerada("Rafael", 2005, 150.0);
    
    listaTiposContas.add(c1);
    listaTiposContas.add(c2);
    listaTiposContas.add(c3);
    listaTiposContas.add(c4);
    listaTiposContas.add(c5);
    
    listaTiposContas.add(cr1);
    listaTiposContas.add(cr2);
    listaTiposContas.add(cr3);
    listaTiposContas.add(cr4);
    listaTiposContas.add(cr5);

    //Listar todas as contas
    System.out.println("Lista Contas Bancarias");
    for(ContaBancaria listarContas : listaTiposContas){
        System.out.println(listarContas);
        
    }    
    System.out.println("\n");
    //filtrando clientes que possuem saldo > 2000
    System.out.println("Lista Clientes com saldo maior que 2000: \n");
    for(ContaBancaria conta : listaTiposContas){
        if(conta.clientesComSaldoMaior2000()){
            System.out.println("Cliente: " + conta.getNome() + " | Conta: " + conta.getNumeroConta() + " | Saldo: " + conta.getSaldo());
        }
    }
    System.out.println("\nExtrato de todas as contas:");
    for (ContaBancaria conta : listaTiposContas) {
    extratoBancario(conta);
}
    }

    private static void extratoBancario(ContaBancaria clientes){
        System.out.println("-------EXTRATO CONTA -------");
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Numero Conta Bancaria: " + clientes.getNumeroConta());
        System.out.println("Saldo Atual: R$ " + clientes.getSaldo());
        System.out.println("Movimentacoes 07/06-");
        boolean retirada = clientes.retirada(100);
        System.out.println("Valor retirado: ");
        System.out.println("Retirada: " + retirada);
        System.out.println("Saldo: R$ " + clientes.getSaldo());
        
    }
}

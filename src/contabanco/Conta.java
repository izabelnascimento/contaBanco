 package contabanco;
import java.util.Scanner;

public class Conta {
    String nome;
    int numeroConta, deposito=0, saque;
    float saldo=0;
    Scanner entrada = new Scanner(System.in);
    
    void depositar (){
        System.out.println("Deseja depositar? 1-Sim 2-Não");
        int opcao = entrada.nextInt();
        while (opcao == 1){
            System.out.println("Valor do depósito: ");
            int novodeposito = entrada.nextInt();
            deposito = deposito + novodeposito;
            System.out.println("Deseja depositar? 1-Sim 2-Não");
            int opcao2 = entrada.nextInt();
            opcao = opcao2;
        }
        saldo = saldo + deposito;
    }
    void sacar (){
        System.out.println("Deseja sacar? 1-Sim 2-Não");
        int opcao3 = entrada.nextInt();
        while (opcao3 == 1){
            System.out.println("Valor do saque: ");
            int novosaque = entrada.nextInt();
            saque = saque + novosaque;
            System.out.println("Deseja sacar? 1-Sim 2-Não");
            int opcao4 = entrada.nextInt();
            opcao3 = opcao4;
        }
        saldo = saldo - saque;
    }
    void nome (){
        System.out.println("Nome da conta: " + nome);
        System.out.println("Numero da conta: " + numeroConta);
    }
    void saldo (){
        System.out.println("Saldo: R$ " + saldo);
    }
}

package contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        
        c1.numeroConta = 06161651;
        c1.nome = "Maria";
        c1.nome();
        c1.depositar();
        c1.saldo();
        c1.sacar();
        c1.saldo();
    }
    
}

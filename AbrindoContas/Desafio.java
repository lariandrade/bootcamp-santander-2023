import java.util.Scanner;

/* Descrição do desafio:
* Implementar uma classe chamada "ContaBancaria" que represente uma conta com as seguintes informações: 
*  - número da conta;
*  - nome do titular;
*  - saldo.
*/
public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        ContaBancaria c1 = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        System.out.println("Conta: " + c1.getNumero());
        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Saldo: R$ " + c1.getSaldo());
    
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
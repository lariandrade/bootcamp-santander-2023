package Java.ExerciciosCollections.List.Ordenacao.Pessoas;

/*
 * Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. 
 * Implemente os seguintes métodos:
 * - adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
 * - ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
 * - ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println("Lista de pessoas: ");
        ordenacaoPessoa.listarPessoas();

        // Ordenando e exibindo por idade
        System.out.println("Ordenado por idade ");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println("Ordenado por altura ");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

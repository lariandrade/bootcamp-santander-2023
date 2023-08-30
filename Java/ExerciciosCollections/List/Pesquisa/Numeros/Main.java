package Java.ExerciciosCollections.List.Pesquisa.Numeros;

/*
 * Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. 
 * Implemente os seguintes métodos:
 * - adicionarNumero(int numero): Adiciona um número à lista de números.
 * - calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
 * - encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
 * - encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
 * - exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */
public class Main {

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
    

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}

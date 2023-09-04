package Java.ExerciciosCollections.Set.Ordenacao;

/*
 * Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. 
 * Cada produto possui atributos como nome, cod, preço e quantidade. 
 * Implemente os seguintes métodos:
 * - adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
 * - exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
 * - exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

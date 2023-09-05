package ExerciciosCollections.Map.OperacoesBasicas.Contatos;

/*
 * Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. 
 * Cada contato possui um nome como chave e um número de telefone como valor. 
 * Implemente os seguintes métodos:
 * - adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
 * - removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
 * - exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
 * - pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
 */
public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Larissa", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
    
        agendaContatos.exibirContatos();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();
    
        // Pesquisar número por nome
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Larissa");
        System.out.println("Número de telefone: " + numeroPesquisa);

    }
}

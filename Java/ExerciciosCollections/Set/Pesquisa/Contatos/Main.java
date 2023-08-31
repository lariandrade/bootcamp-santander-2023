package Java.ExerciciosCollections.Set.Pesquisa.Contatos;

/*
 * Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. 
 * Implemente os seguintes métodos:
 * - adicionarContato(String nome, int numero): Adiciona um contato à agenda.
 * - exibirContatos(): Exibe todos os contatos da agenda.
 * - pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
 * - atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico.
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Ana", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Fernando", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}

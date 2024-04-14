import java.util.List;

public class Usuario {
    private String nome;
    // outros detalhes do usuário

    public void pesquisarLivro(String consulta, SistemaGerenciamentoBiblioteca biblioteca) {
        List<Livro> resultados = biblioteca.pesquisarLivros(consulta);
        // exibir resultados
    }
}


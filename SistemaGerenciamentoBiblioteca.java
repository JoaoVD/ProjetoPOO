import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamentoBiblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void editarLivro(Livro livro) {
        // implementar funcionalidade de edição
    }

    public void excluirLivro(Livro livro) {
        livros.remove(livro);
    }

    public void atualizarStatusLivro(Livro livro, boolean status) {
        livro.setEstaDisponivel(status);
    }

    public void definirPeriodoEmprestimo(Livro livro, int dias) {
        // implementar funcionalidade de definição de período de empréstimo
    }

    public List<Livro> pesquisarLivros(String consulta) {
        List<Livro> resultados = new ArrayList<>();
        // implementar funcionalidade de pesquisa
        return resultados;
    }
}

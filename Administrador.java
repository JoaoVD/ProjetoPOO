public class Administrador extends Usuario {
    public void adicionarLivro(Livro livro, SistemaGerenciamentoBiblioteca biblioteca) {
        biblioteca.adicionarLivro(livro);
    }

    public void editarLivro(Livro livro, SistemaGerenciamentoBiblioteca biblioteca) {
        biblioteca.editarLivro(livro);
    }

    public void excluirLivro(Livro livro, SistemaGerenciamentoBiblioteca biblioteca) {
        biblioteca.excluirLivro(livro);
    }

    public void atualizarStatusLivro(Livro livro, boolean status, SistemaGerenciamentoBiblioteca biblioteca) {
        biblioteca.atualizarStatusLivro(livro, status);
    }

    public void definirPeriodoEmprestimo(Livro livro, int dias, SistemaGerenciamentoBiblioteca biblioteca) {
        biblioteca.definirPeriodoEmprestimo(livro, dias);
    }
}
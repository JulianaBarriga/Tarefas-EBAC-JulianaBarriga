package dao;
import domain.Usuario;
import java.util.Collection;

public interface IUsuarioDAO {
    public Boolean cadastrar(Usuario usuario);
    public void excluir(Long codigo);
    public void alterar(Usuario usuario);
    public Usuario consultar(Long codigo);
    public Collection<Usuario> buscarTodos();
}

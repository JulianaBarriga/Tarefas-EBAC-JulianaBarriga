package dao;

import domain.Usuario;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsuarioSetDAO implements IUsuarioDAO{

    private Set<Usuario> set;
    public UsuarioSetDAO(){
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Usuario usuario) {
        return this.set.add(usuario);
    }

    @Override
    public void excluir(Long codigo) {
        Usuario usuarioencontrado = null;
        for(Usuario usuario : this.set){
            if(usuario.getCodigo().equals(codigo)){
                usuarioencontrado = usuario;
                break;
            }
        }
        if (usuarioencontrado != null){
            this.set.remove(usuarioencontrado);
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        if(this.set.contains(usuario)){
            for(Usuario usuariocadastrado : this.set){
                if(usuariocadastrado.equals(usuario)){
                    usuariocadastrado.setCodigo(usuario.getCodigo());
                    usuariocadastrado.setNome(usuario.getNome());
                    usuariocadastrado.setPeso(usuario.getPeso());
                    usuariocadastrado.setCor(usuario.getCor());
                    usuariocadastrado.setGenero(usuario.getGenero());
                    usuariocadastrado.setIdade(usuario.getIdade());
                    usuariocadastrado.setTelefone(usuario.getTelefone());
                    usuariocadastrado.setDono(usuario.getDono());
                    break;
                }
            }
        }
    }

    @Override
    public Usuario consultar(Long codigo) {
        for(Usuario usuariocadastrado : this.set){
            if(usuariocadastrado.getCodigo().equals(codigo)){
                return usuariocadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Usuario> buscarTodos() {
        return this.set;
    }
}

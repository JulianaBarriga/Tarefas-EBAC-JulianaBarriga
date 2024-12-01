package dao;

import domain.Usuario;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioMapDAO implements IUsuarioDAO{
    private Map<Long, Usuario> map;
    public UsuarioMapDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Usuario usuario) {
        if(this.map.containsKey(usuario.getCodigo())){
            return false;
        } else{
            this.map.put(usuario.getCodigo(),usuario);
            return true;
        }
    }

    @Override
    public void excluir(Long codigo) {
        Usuario usuarioCadastrado = this.map.get(codigo);
        if(usuarioCadastrado != null){
            this.map.remove(usuarioCadastrado.getCodigo(), usuarioCadastrado);
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        Usuario usuarioCadastrado = this.map.get(usuario.getCodigo());
        if(usuarioCadastrado!=null){
            usuarioCadastrado.setCodigo(usuario.getCodigo());
            usuarioCadastrado.setNome(usuario.getNome());
            usuarioCadastrado.setPeso(usuario.getPeso());
            usuarioCadastrado.setCor(usuario.getCor());
            usuarioCadastrado.setGenero(usuario.getGenero());
            usuarioCadastrado.setIdade(usuario.getIdade());
            usuarioCadastrado.setTelefone(usuario.getTelefone());
            usuarioCadastrado.setDono(usuario.getDono());
        }
    }

    @Override
    public Usuario consultar(Long codigo) {
        return this.map.get(codigo);
    }

    @Override
    public Collection<Usuario> buscarTodos() {
        return this.map.values();
    }
}

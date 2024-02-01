package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import model.Usuario;

public class RepositorioLocalTreeMap implements Repositorio<Usuario> {

    private TreeMap<Long, Usuario> usuarios;

    public RepositorioLocalTreeMap() {
        usuarios = new TreeMap<>();
    }

    @Override
    public Usuario getById(Long id) {
        return usuarios.get(id);
    }

    @Override
    public List<Usuario> getAll() {
        List<Usuario> lista = new ArrayList<>(usuarios.values());
        return lista;
    }

    @Override
    public void add(Usuario elemento) {
        usuarios.put(elemento.getId(), elemento);
    }

    @Override
    public void delete(Usuario elemento) {
        usuarios.remove(elemento.getId());
    }
}
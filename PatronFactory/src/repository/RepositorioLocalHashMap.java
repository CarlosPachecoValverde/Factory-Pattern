package repository;

import model.Usuario;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RepositorioLocalHashMap implements Repositorio<Usuario> {

	HashMap<Long, Usuario> usuarios;
	

	public RepositorioLocalHashMap() {
		usuarios = new HashMap<>();
	}

	@Override
	public Usuario getById(Long id) {
		return usuarios.get(id);
	}

	@Override
	public List<Usuario> getAll() {
		
		List<Usuario> lista = new LinkedList<Usuario>();
		for(Entry<Long,Usuario> entry: usuarios.entrySet()){
			lista.add(entry.getValue());
			
		}
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

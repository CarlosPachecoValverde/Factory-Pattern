package repository.Factory;

import model.Usuario;
import repository.Repositorio;
import repository.RepositorioLocalHashMap;

public class FactoryRepositorioHashMap implements FactoryRepositorio<Usuario>{

	@Override
	public Repositorio<Usuario> obtenerRepositorio() {
		
		return new RepositorioLocalHashMap();
		
	}

}

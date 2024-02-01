package repository.Factory;

import model.Usuario;
import repository.Repositorio;
import repository.RepositorioLocalTreeMap;

public class FactoryRepositorioTreeMap implements FactoryRepositorio<Usuario> {

	@Override
	public Repositorio<Usuario> obtenerRepositorio() {
		return new RepositorioLocalTreeMap();
	}

}

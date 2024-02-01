package repository.Factory;

import java.util.HashMap;

import model.Usuario;
import repository.Repositorio;
import repository.RepositorioLocalHashMap;
import repository.RepositorioLocalTreeMap;

public class FactoryRepositorioGeneral implements FactoryRepositorio<Usuario>{

	
	private Class<?> clase;
	
	
	public FactoryRepositorioGeneral(Class<?> clase) {
		this.clase=clase;
	}
	
    @Override
    public Repositorio<Usuario> obtenerRepositorio() {
        if (clase.equals(RepositorioLocalHashMap.class)) {
            return new RepositorioLocalHashMap();
        }
        if (clase.equals(RepositorioLocalTreeMap.class)) {
            return new RepositorioLocalTreeMap();
        }
        return null;
    }

}

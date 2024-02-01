package repository.Factory;

import repository.Repositorio;

public interface FactoryRepositorio<T>{
	
	public Repositorio<T> obtenerRepositorio();

}

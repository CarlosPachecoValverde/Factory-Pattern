package repository;

import java.util.List;

public interface Repositorio<T> {
	
	public T getById(Long id);
	public List<T> getAll();
	public void add(T elemento);
	public void delete(T elemento);
	

}

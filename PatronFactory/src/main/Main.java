package main;

import model.Usuario;
import repository.RepositorioLocalHashMap;
import repository.Factory.FactoryRepositorioGeneral;

public class Main {

	public static void main(String[] args) {
		
		FactoryRepositorioGeneral factoriaGeneral= new FactoryRepositorioGeneral(RepositorioLocalHashMap.class);
		
		RepositorioLocalHashMap repositorio = (RepositorioLocalHashMap) factoriaGeneral.obtenerRepositorio();
		
		Usuario u1 = new Usuario();
		
		u1.setEdad(10);
		u1.setId(0);
		u1.setNombre("Carlos");
		
		repositorio.add(u1);
		
		System.out.println(repositorio.getAll());
		
		
		
	}

}

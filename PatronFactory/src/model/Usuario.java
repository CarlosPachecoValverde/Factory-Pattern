package model;

public class Usuario {

	private long id;
	private String nombre;
	private int edad;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}

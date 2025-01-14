package Libros;

public class Libros {
	String titulo;
	String autor;
	int id;
	int añoPublicacion;
	int copiasDisponibles;
	
	public Libros (String t, String a, int i, int ap, int cd) {
		this.titulo = t;
		this.autor = a;
		this.id = i;
		this.añoPublicacion = ap;
		this.copiasDisponibles = cd;
	}
}
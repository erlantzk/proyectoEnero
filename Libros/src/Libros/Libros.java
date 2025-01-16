package Libros;


public class Libros {
	String titulo;
	String autor;
	int id;
	int añoPublicacion;
	int copiasDisponibles;
	reserva [] listaDeReserva;
	
	public Libros (String t, String a, int i, int ap, int cd) {
		this.titulo = t;
		this.autor = a;
		this.id = i;
		this.añoPublicacion = ap;
		this.copiasDisponibles = cd;
	}
	
	public void consultarLibro(Libros libro, Libros id) {
		System.out.println("Titulo: " + titulo + " Autor: " + autor + " ID: " + " Año de publicación " + añoPublicacion + "Copias disponibles: " + copiasDisponibles);
	}
	
	public void listarLibros(Libros [] libros){
		for (Libros contador : libros) {
			System.out.println(contador.titulo);
		}
	}
	
	
	
}
package Libros;

import java.util.ArrayList;

public class Libros {
    String titulo;
    String autor;
    int id;
    int añoPublicacion;
    int copiasDisponibles;
    ArrayList<reserva> listaDeReservas;

    public Libros(String t, String a, int i, int ap, int cd) {
        this.titulo = t;
        this.autor = a;
        this.id = i;
        this.añoPublicacion = ap;
        this.copiasDisponibles = cd;
        this.listaDeReservas = new ArrayList<>();
    }

    public void consultarLibro() {
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | ID: " + id +
                " | Año de publicación: " + añoPublicacion + " | Copias disponibles: " + copiasDisponibles);
    }

    public void listarLibros(Libros[] libros) {
        for (Libros libro : libros) {
            System.out.println(libro.titulo);
        }
    }

    public boolean añadirReserva(reserva nuevaReserva) {
        if (copiasDisponibles > 0) {
            copiasDisponibles--; 
            listaDeReservas.add(nuevaReserva);
            System.out.println("Reserva añadida con éxito para el libro: " + titulo);
            return true;
        } else {
            System.out.println("No hay copias disponibles para reservar el libro: " + titulo);
            return false;
        }
    }
}

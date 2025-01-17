package programa;

package prueba;

public class Libros {
    String titulo;
    String autor;
    int id;
    int añoPublicacion;
    int copiasDisponibles;
    reserva[] reservas; 
    int contador;

    public Libros(String t, String a, int i, int ap, int cd) {
        this.titulo = t;
        this.autor = a;
        this.id = i;
        this.añoPublicacion = ap;
        this.copiasDisponibles = cd;
        this.reservas = new reserva[10];
        this.contador = 0; 
    }

    public void consultarLibro() {
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | ID: " + id +
                " | Año de publicación: " + añoPublicacion + " | Copias disponibles: " + copiasDisponibles);
    }

    public static void listarLibros(Libros[] libros) {
        for (Libros libro : libros) {
            System.out.println("Titulo: " + libro.titulo);
        }
    }

    public boolean añadirReserva(reserva nuevaReserva) {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
            if (contador < reservas.length) {
                reservas[contador] = nuevaReserva;
                contador++;
                System.out.println("Reserva añadida con éxito para el libro: " + titulo);
                return true;
            } else {
                System.out.println("No hay espacio suficiente en el array para más reservas.");
                return false;
            }
        } else {
            System.out.println("No hay copias disponibles para reservar el libro: " + titulo);
            return false;
        }
    }

    public boolean eliminarReserva(int idReserva) {
        for (int i = 0; i < contador; i++) {
            if (reservas[i] != null && reservas[i].getIdReserva() == idReserva) {
                reservas[i] = null;
                copiasDisponibles++;
                System.out.println("Reserva " + idReserva + " eliminada.");
                return true;
            }
        }
        System.out.println("No se hay reserva de " + idReserva);
        return false;
    }
    
    public boolean hayCopiasDisponibles() {
        return copiasDisponibles > 0;
    }

    public void reducirCopiasDisponibles() {
        if (hayCopiasDisponibles()) {
            copiasDisponibles--;
        } else {
            System.out.println("No hay más copias disponibles para reducir.");
        }
    }

    public void aumentarCopiasDisponibles() {
        copiasDisponibles++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}


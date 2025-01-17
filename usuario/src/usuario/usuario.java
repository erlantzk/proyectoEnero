package usuario;

public class usuario {
<<<<<<< HEAD
	
	String nombre;
	int ID;
	String[] rol = new String[3];

	rol[0]="estudiante";
	rol[1]="profesor";
	rol[2]="invitado";
	
}
=======

    private String nombre;

    private int id;

    private String rol;

    Libros[] librosPrestados;

    int contadorLibrosPrestados;



    public usuario(String nombre, int id, String rol) {

        this.nombre = nombre;

        this.id = id;

        this.rol = rol;

        this.librosPrestados = new Libros[5]; 

        this.contadorLibrosPrestados = 0; 

    }



    public String getNombre() {

        return nombre;

    }



    public void setNombre(String nombre) {

        this.nombre = nombre;

    }



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getRol() {

        return rol;

    }



    public void setRol(String rol) {

        this.rol = rol;

    }



    public Libros[] getLibrosPrestados() {

        return librosPrestados;

    }



    public boolean puedeRealizarPrestamo() {

        int limitePrestamos = obtenerLimitePrestamosPorRol();

        return contadorLibrosPrestados < limitePrestamos;

    }



    private int obtenerLimitePrestamosPorRol() {

        switch (rol.toLowerCase()) {

            case "estudiante":

                return 3;

            case "profesor":

                return 5;

            case "invitado":

                return 1;

            default:

                return 0; 

        }

    }



    public void añadirLibroPrestado(Libros libro) {

        if (puedeRealizarPrestamo()) {

            if (contadorLibrosPrestados < librosPrestados.length) {

                librosPrestados[contadorLibrosPrestados] = libro;

                contadorLibrosPrestados++;

                System.out.println("El libro '" + libro.getTitulo() + "' ha sido añadido al usuario: " + nombre);

            } else {

                System.out.println("No puedes realizar más préstamos, el límite ha sido alcanzado.");

            }

        } else {

            System.out.println("El usuario '" + nombre + "' no puede realizar más préstamos. Límite alcanzado.");

        }

    }



    public void removerLibroPrestado(Libros libro) {

        for (int i = 0; i < librosPrestados.length; i++) {

            if (librosPrestados[i] != null && librosPrestados[i].equals(libro)) {

                librosPrestados[i] = null;

                contadorLibrosPrestados--;

                System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por el usuario: " + nombre);

                return;

            }

        }

        System.out.println("El libro no estaba en la lista de préstamos del usuario.");

    }



    public static void registrarUsuario(usuario usuario) {

        System.out.println("Usuario registrado: Nombre - " + usuario.getNombre() + ", ID - " + usuario.getId() + ", Rol - " + usuario.getRol());

    }



    public static void listarUsuarios(usuario[] usuarios) {

        for (usuario usuario : usuarios) {

            System.out.println("Nombre: " + usuario.getNombre() + ", ID: " + usuario.getId() + ", Rol: " + usuario.getRol());

        }

    }

>>>>>>> 73611a7258b9d7ca7208bf0597e65c1432cc5ff7
}
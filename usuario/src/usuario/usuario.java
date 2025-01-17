package usuario;

public class usuario {
    
    String nombre;
    int ID;
    String[] rol = new String[3];
     List<Libro> librosPrestados;

    public usuario() {
        rol[0] = "estudiante";
        rol[1] = "profesor";
        rol[2] = "invitado";
    }

    public usuario(String nombre, int ID) {
        this();
        this.nombre = nombre;
        this.ID = ID;
    }
    public void registrarUsuario (usuario Usuario, usuario ID) {
    	System.out.println("Nombre "+ nombre + "ID" + ID );
    }
    public void listarUsuario (usuario [] Usuario) {
    	for(usuario contador:Usuario) {
    		System.out.println(contador.nombre);
    	}
    }
    public boolean puedeRealizarPrestamo() {
        int limitePrestamos = obtenerLimitePrestamosPorRol();
        return librosPrestados.size() < limitePrestamos;
    }
    public int obtenerLimitePrestamosPorRol() {
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
    public void añadirLibroPrestado(Libro libro) {
        if (puedeRealizarPrestamo()) {
            librosPrestados.add(libro);
            System.out.println("Libro añadido al usuario: " + nombre);
        } else {
            System.out.println("No se pueden añadir más libros. Límite alcanzado.");
        }
    }

    public void removerLibroPrestado(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            System.out.println("Libro devuelto por el usuario: " + nombre);
        } else {
            System.out.println("El libro no estaba en la lista de préstamos.");
        }
    }

    public void registrarUsuario(Usuario usuario) {
        System.out.println("Usuario registrado: Nombre - " + usuario.getNombre() + ", ID - " + usuario.getId());
    }
    
    
     
}


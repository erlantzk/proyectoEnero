package usuario;

public class usuario {
    
	 private String nombre;
	    private int id;
	    private String rol; 
	    private List<Libro> librosPrestados; 

	    public usuario() {
	        this.librosPrestados = new ArrayList<>();
	    }

	    public usuario(String nombre, int id, String rol) {
	        this();
	        this.nombre = nombre;
	        this.id = id;
	        this.rol = rol;
	    }

	    // Getter y Setter
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

	    public List<Libro> getLibrosPrestados() {
	        return librosPrestados;
	    }

	    public boolean puedeRealizarPrestamo() {
	        int limitePrestamos = obtenerLimitePrestamosPorRol();
	        return librosPrestados.size() < limitePrestamos;
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
	                return 0; // Rol no definido
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

	    public void registrarUsuario(usuario usuario) {
	        System.out.println("Usuario registrado: Nombre - " + usuario.getNombre() + ", ID - " + usuario.getId());
	    }

	    public static void listarUsuarios(usuario[] usuarios) {
	        for (usuario usuario : usuarios) {
	            System.out.println("Nombre: " + usuario.getNombre() + ", ID: " + usuario.getId() + ", Rol: " + usuario.getRol());
	        }
	    }
    
     
}


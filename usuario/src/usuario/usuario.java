package usuario;

public class usuario {
    
    String nombre;
    int ID;
    String[] rol = new String[3];

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
}


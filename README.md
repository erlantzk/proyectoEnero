# proyectoEnero
"Clase Usuario":
La clase usuario está contenida en el paquete usuario. 
Atributos:
nombre: Almacena el nombre del usuario como un texto.
ID: Un número entero para identificar al usuario.
rol: Un array de String que define posibles roles de un usuario, como "estudiante", "profesor" e "invitado". Tiene espacio para exactamente 3 elementos.
Constructores:
public usuario() {
    rol[0] = "estudiante";
    rol[1] = "profesor";
    rol[2] = "invitado";
}
Este constructor asigna valores predeterminados al array rol. Si creas un objeto usuario sin pasar parámetros, este constructor será invocado automáticamente
Constructor parametrizado:
public usuario(String nombre, int ID) {
    this();
    this.nombre = nombre;
    this.ID = ID;
}
Este constructor permite inicializar un objeto con un nombre y un ID.
La línea this(); llama al constructor por defecto antes de continuar, asegurando que el array rol también sea inicializado.
Métodos:
-registrarUsuario
-listarUsuario:Este método toma un array de objetos usuario como argumento.Itera sobre el array utilizando un bucle for-each y muestra los nombres de todos los usuarios en la consola.

/Clase Libros/
Lo primero es crear los atributos de la clase Libros que son, el nombre del libro, su autor, un id único que sirve de identificativo para el libro, el año de publicación del libro, las copias disponibles  en la blibioteca y un array de la clase reserva que sirve como lista de reserva.

Después he creado el constructor que sirve para guardar los datos de los libros.

Luego he creado los métodos que son:

consultarLibros que sirve para mostrar por pantalla todos los datos de cada libro.

listarLibros sirve para mostrar el titulo de los libros dentro de un array de libros.

añadirReserva sirve para añadir una reserva sobre un libro y muestra si esta disponible o no.

eliminarReserva sirve para eliminar una reserva previamente creada y si no hay reserva con ese id se muestra por pantalla.
/Clase Libros/

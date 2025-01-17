# proyectoEnero
/Clase usuario/
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
/Clase usuario/

/Clase Libros/
Lo primero es crear los atributos de la clase Libros que son, el nombre del libro, su autor, un id único que sirve de identificativo para el libro, el año de publicación del libro, las copias disponibles  en la blibioteca y un array de la clase reserva que sirve como lista de reserva.

Después he creado el constructor que sirve para guardar los datos de los libros.

Luego he creado los métodos que son:

consultarLibros que sirve para mostrar por pantalla todos los datos de cada libro.

listarLibros sirve para mostrar el titulo de los libros dentro de un array de libros.

añadirReserva sirve para añadir una reserva sobre un libro y muestra si esta disponible o no.

eliminarReserva sirve para eliminar una reserva previamente creada y si no hay reserva con ese id se muestra por pantalla.
/Clase Libros/

/Clase prestamo/
La clase Prestamo modela un préstamo de un libro a un usuario en un sistema de biblioteca. Incluye atributos, métodos para gestionar el préstamo y lógica para manejar acciones como creación y devolución de préstamos.
Atributos:
idPrestamo: Identificador único para cada préstamo, como un código o número único.
libro: Referencia a un objeto de la clase Libro, que representa el libro que se presta.
usuario: Referencia a un objeto de la clase Usuario, que representa al usuario que toma prestado el libro.
fechaPrestamo: Fecha en formato String que indica cuándo se realizó el préstamo.
fechaDevolucion: Fecha en formato String que indica cuándo el usuario debe devolver el libro. Puede inicializarse más tarde, una vez registrado el préstamo.
Constructor:
public Prestamo(String idPrestamo, Libro libro, Usuario usuario, String fechaPrestamo) {
    this.idPrestamo = idPrestamo;
    this.libro = libro;
    this.usuario = usuario;
    this.fechaPrestamo = fechaPrestamo;
}
El constructor se utiliza para inicializar un nuevo objeto Prestamo. Requiere cuatro parámetros:

idPrestamo: El identificador único del préstamo.
libro: El libro que se está prestando.
usuario: El usuario que solicita el préstamo.
fechaPrestamo: La fecha en que se realiza el préstamo.
Getters y Setters:
public String getIdPrestamo() {
    return idPrestamo;
}

public void setIdPrestamo(String idPrestamo) {
    this.idPrestamo = idPrestamo;
}
Getter (getIdPrestamo): Devuelve el valor del atributo idPrestamo.
Setter (setIdPrestamo): Permite establecer un nuevo valor para idPrestamo.
Otros getters y setters funcionan de manera similar para los atributos libro, usuario, fechaPrestamo, y fechaDevolucion.
Metodos:
crearPrestamo:Validaciones:
usuario.puedeRealizarPrestamo(): Comprueba si el usuario tiene permitido realizar un préstamo (por ejemplo, no tiene préstamos pendientes).
libro.hayCopiasDisponibles(): Verifica si el libro tiene copias disponibles para prestar.
Lógica del préstamo:
Si se cumplen las condiciones:
Llama a libro.reducirCopiasDisponibles() para disminuir el número de copias disponibles.
Llama a usuario.añadirLibroPrestado(libro) para registrar el libro como prestado al usuario.
Devuelve un nuevo objeto Prestamo con los datos proporcionados.
Si no se cumplen las condiciones:
Muestra un mensaje indicando que no se puede realizar el préstamo.
Retorna null.
marcarDevolucion:Este método gestiona la devolución del libro prestado:
Aumenta las copias disponibles del libro:
Llama a libro.aumentarCopiasDisponibles() para incrementar el número de copias disponibles.
Actualiza el registro del usuario:
Llama a usuario.removerLibroPrestado(libro) para eliminar el libro de la lista de libros prestados por el usuario.
Muestra un mensaje de confirmación:
Indica que la devolución se completó con éxito, incluyendo el título del libro.
validarDisponibilidad: Este método verifica si el libro asociado al préstamo tiene copias disponibles. Devuelve:true si hay copias disponibles.
false en caso contrario.
Clases asociadas
Este código depende de dos clases externas: Libro y Usuario. Aunque no están incluidas aquí, es posible deducir algunas de sus funcionalidades:
Clase Libro
Métodos esperados:
hayCopiasDisponibles(): Devuelve si hay copias del libro disponibles para préstamo.
reducirCopiasDisponibles(): Disminuye el número de copias disponibles.
aumentarCopiasDisponibles(): Incrementa el número de copias disponibles.
getTitulo(): Retorna el título del libro.
Clase Usuario
Métodos esperados:
puedeRealizarPrestamo(): Verifica si el usuario tiene permitido realizar más préstamos.
añadirLibroPrestado(Libro libro): Registra un libro como prestado al usuario.
removerLibroPrestado(Libro libro): Elimina un libro de la lista de libros prestados por el usuario.
/Clase prestamo/

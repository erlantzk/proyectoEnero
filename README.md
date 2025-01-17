# proyectoEnero DOCUMENTACIÓN SOBRE LAS CLASES UTILIZADOS (Eneritz, Iker, Erlantz, Illart).

/Clase usuario/
Este código es una clase llamada usuario que representa a un usuario de un sistema, probablemente relacionado con una biblioteca, donde los usuarios pueden realizar préstamos de libros. Vamos a desglosarlo por partes:

Atributos:
nombre: Almacena el nombre del usuario.
id: Almacena el ID único del usuario.
rol: Almacena el rol del usuario (por ejemplo, "estudiante", "profesor", "invitado").
librosPrestados: Una lista que contiene los libros que el usuario ha prestado.
Constructores:
Constructor por defecto:

Inicializa la lista librosPrestados como una lista vacía (new ArrayList<>()).
Constructor con parámetros:

Llama al constructor por defecto para inicializar la lista de libros prestados.
Recibe tres parámetros (nombre, id, rol) y los asigna a las variables correspondientes de la clase.
Métodos Getter y Setter:
Estos métodos permiten acceder y modificar los valores de los atributos de la clase.

getNombre() y setNombre(String nombre) permiten obtener y establecer el nombre del usuario.
getId() y setId(int id) permiten obtener y establecer el ID del usuario.
getRol() y setRol(String rol) permiten obtener y establecer el rol del usuario.
getLibrosPrestados() permite obtener la lista de libros prestados por el usuario.
Método puedeRealizarPrestamo():
Este método verifica si el usuario puede realizar un préstamo de un libro, basándose en el límite de préstamos que depende de su rol. Este límite se obtiene a través del método obtenerLimitePrestamosPorRol().

Método obtenerLimitePrestamosPorRol():
Este método devuelve el límite de libros que un usuario puede prestar según su rol:

"estudiante" puede tener hasta 3 libros.
"profesor" puede tener hasta 5 libros.
"invitado" puede tener solo 1 libro.
Si el rol no está definido, devuelve 0.
Métodos para añadir y remover libros prestados:
añadirLibroPrestado(Libro libro):

Si el usuario puede realizar un préstamo (es decir, no ha alcanzado el límite), agrega el libro a la lista librosPrestados y muestra un mensaje indicando que el libro fue añadido.
Si el usuario ya ha alcanzado el límite de libros prestados, muestra un mensaje indicando que no se pueden añadir más libros.
removerLibroPrestado(Libro libro):

Si el libro está en la lista de librosPrestados, lo elimina y muestra un mensaje indicando que el libro fue devuelto.
Si el libro no estaba en la lista de libros prestados, muestra un mensaje indicando que el libro no estaba en la lista.
Método registrarUsuario():
Este método simplemente imprime un mensaje que indica que el usuario ha sido registrado, mostrando su nombre y ID.

Método listarUsuarios():
Este método recibe un arreglo de usuarios y los lista imprimiendo su nombre, ID y rol.
/Clase usuario/

/Clase Libros/
Lo primero es crear los atributos de la clase Libros que son, el nombre del libro, su autor, un id único que sirve de identificativo para el libro, el año de publicación del libro, las copias disponibles  en la blibioteca y un array de la clase reserva que sirve como lista de reserva.

Después he creado el constructor que sirve para guardar los datos de los libros.

Luego he creado los métodos que son:

consultarLibros que sirve para mostrar por pantalla todos los datos de cada libro.

listarLibros sirve para mostrar el titulo de los libros dentro de un array de libros.

añadirReserva sirve para añadir una reserva sobre un libro y muestra si esta disponible o no.

eliminarReserva sirve para eliminar una reserva previamente creada y si no hay reserva con ese id se muestra por pantalla.

hayCopiasDisponibles verifica si quedan copias disponibles de un libro en concreto.

reducirCopiasDisponibles reduce las copias disponibles de un libro.

aumentarCopiasDisponibles aumenta las copias disponibles de un libro.

Por ultimo añadir getter y setter del atributo titulo.
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

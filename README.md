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


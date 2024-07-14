fun main() {
    // Saludo con tu nombre
    val tuNombre = "Haider"
    println("Hello, $tuNombre")

    // Variable que se puede cambiar (mutable)
    var variableCambiante = "Soy mutable"
    variableCambiante = "Puedo cambiar"
    println(variableCambiante)

    // Variable que no se puede cambiar (inmutable)
    val variableFija = "Soy inmutable"
    println(variableFija)

    // Una variable que puede contener null
    var nombre: String? = null

    // Imprime la longitud del nombre si no es null
    println(nombre?.length)

    // Usa un valor por defecto si el nombre es null
    val longitud = nombre?.length ?: 0
    println(longitud)

    // Función que devuelve la longitud del nombre o 0 si es null
    fun longitudNombre(nombre: String?): Int {
        return nombre?.length ?: 0
    }

    val nombreOpcional: String? = null
    println("La longitud del nombre es: ${longitudNombre(nombreOpcional)}")

    // Este es un comentario de una sola línea

    /*
     * Este es un comentario
     * de varias líneas
     */


}

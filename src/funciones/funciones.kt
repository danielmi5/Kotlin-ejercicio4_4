package funciones

fun String.title(): String{
    val lista = this.split(" ")
    var cadena = ""
    for (palabra in lista){
        cadena += palabra.lowercase().replaceFirstChar { it.uppercaseChar() } + " "
    }
    return cadena.trimEnd()
}
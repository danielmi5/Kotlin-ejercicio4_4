fun mostrarMenu(){
    println("\nMenú excepciones:\n0. Salir.\n1. Marca y modelo con valores nulos o vacíos.\n2. Coche con el número de caballos con un valor inferior a 70 o superior a 700.\n3. Coche con el número de puertas con un valor inferior a 3 o superior a 5.\n4. Coche con la matrícula con un valor que no tenga 7 caracteres.\n5. Instanciar y modificar el color a un valor nulo.")
}


fun main(){
    println(Coche("Ferrari", "Ferrari2", "verde", 134.45, 4, "1224ACA"))
    println(Coche("Seat", "Panda", "rojo", 534.45, 4, "24ACADE"))
    println(Coche("Renault", "Alpine", "azul", 84.0, 3, "62549CA"))

    print("\nPresiona ENTER para continuar...")
    readln()
    var salir = false
    var opcion = -1

    while(salir == false){
        mostrarMenu()
        try {
            print("Introduce una de las 6 opciones >> ")
            opcion = readln().toInt()


            when(opcion){
                0 -> salir = true
                1 -> Coche("", "", "verde", 134.45, 4, "1224ACA")
                2 -> Coche("Ferrari", "Ferrari2", "verde", 60.4, 4, "1224ACA")
                3 -> Coche("Ferrari", "Ferrari2", "verde", 134.45, 24, "1224ACA")
                4 -> Coche("Ferrari", "Ferrari2", "verde", 134.45, 4, "12CA")
                5 -> {
                    val coche = Coche("Ferrari", "Ferrari2", "verde", 134.45, 4, "1224ACA")
                    coche.color = null
                }
                else -> println("Debe estar dentro de una de las opciones")
            }

        } catch (e: IllegalArgumentException){
            println("*ERROR* -> $e")
        } catch (e: NumberFormatException){
            println("*ERROR* -> $e")
        } finally {
            print("\nPresiona ENTER para continuar...")
            readln()
        }

    }

    println("FIN DEL PROGRAMA")


}
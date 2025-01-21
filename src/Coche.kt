import funciones.title

class Coche (marca: String?, modelo: String?, var color: String?, val numCv: Double?, val numPuertas: Int?, val matricula: String?)
{
    val marca: String? = marca
        get() = field?.title()

    val modelo: String? = modelo
        get() = field?.title()

    init{
        require(!marca.isNullOrBlank()){"Marca no puede ser nulo o vacío"}
        require(!modelo.isNullOrBlank()){"El modelo no puede ser nulo o vacío"}
        require(color != null){"El color no puede ser nulo"}
        require(matricula != null && matricula.length == 7) { "Mátricula no válida" }
        require(numCv != null && numCv in 70.0..700.0) {"numCv debe estar entre 70 and 700"}
        require(numPuertas != null && numPuertas in 3..5) {"El número de puertas no podrá ser inferior a 3, ni superior a 5."}
    }






    override fun toString(): String {
        return "Coche (marca = $marca, modelo = $modelo, color = $color, numCv = $numCv, numPuertas = $numPuertas, matricula = $matricula)"
    }
}
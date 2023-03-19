import kotlin.random.Random
object FactoriaClases {

    fun factoriaPerros():perro {
        val nombres:Array<String> = arrayOf("pepe","juan")
        val razas = arrayOf("podenco","galgo")
        val color = arrayOf("negro","marron")
        val p = perro(false,
            nombres[Random.nextInt(0,nombres.size)],
            Random.nextInt(5,15),
            razas[Random.nextInt(0,nombres.size)],
            color[Random.nextInt(0,nombres.size)])
        return p
    }

    fun factoriaGatos():gato {
        val nombres = arrayOf("pepe","juan")
        val razas = arrayOf("podenco","galgo")
        val color = arrayOf("negro","marron")
        val g = gato(5,
            nombres[Random.nextInt(0,nombres.size)],
            Random.nextInt(5,15),
            razas[Random.nextInt(0,nombres.size)],
            color[Random.nextInt(0,nombres.size)])
        return g
    }
}
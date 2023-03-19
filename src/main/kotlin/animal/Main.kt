/**
 * Main
 *
 * @param args
 */
fun main(args: Array<String>) {
    val tobi = FactoriaClases.factoriaPerros()
    val blanquita = FactoriaClases.factoriaGatos()
    val pazos:Array<perro> = Array(15){FactoriaClases.factoriaPerros()}
    val animal:animal_domestico = FactoriaClases.factoriaPerros()
    val animal2:animal_domestico = perro(false,"tobi",2,"algo","rojo")
    /*val animal3:animal_domestico = animal_domestico("tobi",2,"algo","rojo") No funciona porque es una clase abstracta*/

    fun suma(a: Int, b: Int): Int {
        return a + b
    }
    fun resta(a: Int, b: Int): Int {
        return a - b
    }
    fun multiplicacion(a: Int, b: Int): Int {
        return a * b
    }
    fun segundoGrado(a:Double, b:Double, c:Double){
        var discriminante:Double
        var xa:Double
        var xb:Double
        discriminante = (b*b)-(4*a*c)
        println("> Discriminante = $discriminante")
        if (discriminante < 0) {
            println("> Solución\n     Sin soluciones reales")
        }else if (discriminante == 0.0) {
            println("> Solución\n ")
            xa = (-b)/(2*a)
            println("> Solucion \n    Xa=Xb : $xa")
        }else if (discriminante > 0) {
            println("> Solución")
            xa = (-b+Math.sqrt(discriminante))/(2*a)
            xb = (-b-Math.sqrt(discriminante))/(2*a)
            println("    Xa = $xa")
            println("    Xb = $xb")
        }
    }
}
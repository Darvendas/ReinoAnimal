fun main(args: Array<String>) {
    val tobi = FactoriaClases.factoriaPerros()
    val blanquita = FactoriaClases.factoriaGatos()
    val perros:Array<perro> = Array(15){FactoriaClases.factoriaPerros()}
    val animal:animal_domestico = FactoriaClases.factoriaPerros()
    val animal2:animal_domestico = perro(false,"tobi",2,"algo","rojo")
    /*val animal3:animal_domestico = animal_domestico("tobi",2,"algo","rojo") No funciona porque es una clase abstracta*/
}
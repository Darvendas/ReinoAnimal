import animal.Metodos

/**
 * Animal_domestico
 *
 * @constructor Create empty Animal_domestico
 */
abstract class animal_domestico : Metodos { /**poner , para separar herencias*/
    private var nombre:String
    private var peso:Int
    private var raza:String
    private var color:String

    companion object{
        var IVA:Float = 0.18f //
    }

    constructor(nom:String,pe:Int,raza:String,color:String){
        this.nombre = nom
        this.color = color
        this.peso = pe
        this.raza = raza
    }

    /**
     * Vacunar
     *
     * @return
     *///vacunar, comer, dormir,
    public fun vacunar():Boolean{
        println("Vamos al vete y nos vacunamos")
        return true
    }

    /**
     * Comer
     *
     * @return
     */
    abstract fun comer():Boolean

    /**
     * Dormir
     *
     * @return
     */
    abstract fun dormir():Boolean

    /**
     * Hacer ruido
     *
     * @return
     */
    abstract fun hacerRuido():String

    /**
     * Hacer caso
     *
     * @return
     */
    public open fun hacerCaso():Boolean{
        return true
    }

    override fun inteligencia(): Int {
        return this.peso - 5
    }

    override fun moralidad(): String {
        return "Es un animal"
    }

    override fun toString(): String {
        return "animal_domestico(nombre='$nombre', peso='$peso', raza='$raza', color='$color')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as animal_domestico

        if (nombre != other.nombre) return false
        if (peso != other.peso) return false
        if (raza != other.raza) return false
        return color == other.color
    }



}
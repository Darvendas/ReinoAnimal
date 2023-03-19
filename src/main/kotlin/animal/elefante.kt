import kotlin.random.Random

/**
 * Elefante
 *
 * @constructor Create empty Elefante
 */
class elefante : animal_domestico {
    private var peligroso:Boolean
    constructor(peli:Boolean,nom: String, pe: Int, raza: String, color: String) : super(nom, pe, raza, color){
        this.peligroso = peli
    }

    override fun comer(): Boolean {
        return true
    }

    override fun dormir(): Boolean {
        return true
    }

    override fun hacerRuido(): String {
        return "uuuuuaaaa"
    }

    /**
     * Peligroso
     *
     * @return
     */
    public fun peligroso():Boolean{
        return true
    }

    override fun moralidad(): String {
        return "Muy grande, pero poca moralidad"
    }

    override fun toString(): String {
        return "elefante(peligroso=$peligroso. es un ${super.toString()})"
    }

}
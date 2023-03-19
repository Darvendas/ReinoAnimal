import kotlin.random.Random

/**
 * Perro
 *
 * @constructor Create empty Perro
 */
class perro : animal_domestico {
    private var pulgas:Boolean

    constructor(pul:Boolean, nom: String, pe: Int, raza: String, color: String) : super(nom, pe, raza, color){
        this.pulgas = pul
    }

    /**
     * Sacar paseo
     *
     * @return
     */
    public fun sacarPaseo():Boolean{
        println("Nos vamos de paseo")
        return true
    }

    public override fun hacerCaso(): Boolean {
        var probablidad:Int = Random.nextInt(0,100)
        if(probablidad<90){
            return true
        }else
            return false
    }

    override fun comer(): Boolean {
        return false
    }

    override fun dormir(): Boolean {
        return true
    }

    public override fun hacerRuido():String{
        return "Wuauu"
    }

    override fun toString(): String {
        return "perro(pulgas=$pulgas. es un ${super.toString()})"
    }


}
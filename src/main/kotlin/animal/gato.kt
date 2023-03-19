import kotlin.random.Random

/**
 * Gato
 *
 * @constructor Create empty Gato
 */
class gato : animal_domestico {
    private var pelo:Int

    constructor(pel:Int,nom: String, pe: Int, raza: String, color: String) : super(nom, pe, raza, color){
        this.pelo = pel
    }

    /**
     * Tose bola pelo
     *
     * @return
     */
    public fun toseBolaPelo():Boolean{
        return true
    }
    public override fun hacerCaso(): Boolean {
        var probablidad:Int = Random.nextInt(0,100)
        if(probablidad<6){
            return true
        }else
            return false
    }

    override fun comer(): Boolean {
        return true
    }

    override fun dormir(): Boolean {
        return false
    }

    public override fun hacerRuido():String{
        return "miauu"
    }

    override fun toString(): String {
        return "gato(pelo=$pelo. es un ${super.toString()})"
    }
}
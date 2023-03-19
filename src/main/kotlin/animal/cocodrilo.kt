

class cocodrilo : animal_domestico {
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
        return "armmsasa"
    }
    public fun peligroso():Boolean{
        return true
    }

    override fun moralidad(): String {
        return "Sus dimentes te pueden matar"
    }

    override fun toString(): String {
        return "elefante(peligroso=$peligroso. es un ${super.toString()})"
    }

}
/**
 * Created by sulistiyanto on 31/12/17.
 */
fun main(args: Array<String>) {

    fun forceChoke() {
        println("Hi Riska Rossiana Ramdani")
    }

    forceChoke()

    fun makeAnEntance(line : String) {
        println(line)
    }

    makeAnEntance("Hi Ayangku")

    fun numberReturn(a : Int, b : Int) : Int {
        return a + b
    }

    println(numberReturn(2, 3))

    fun mood(ood : String = "AYu") {
        println(ood)
    }

    mood()
    mood("Jelek")
}

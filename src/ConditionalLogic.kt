/**
 * Created by sulistiyanto on 31/12/17.
 */
fun main(args: Array<String>) {

    val x = 0

    when (x) {
        1 -> println(" x = 1")
        2 -> println(" x = 2")
        else -> println("tidak semua")
    }

    fun jajal(mood : String = "angry") {
        if (mood == "angry") {
            println("kooo")
        } else {
            println("moooo")
        }
    }

    jajal("l")
}
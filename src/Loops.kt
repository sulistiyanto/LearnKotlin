/**
 * Created by sulistiyanto on 31/12/17.
 */
fun main(args: Array<String>) {
    val rebels = arrayListOf("Londo","Kondo", "Sopo", "Ora")

    val rebelVehicle = hashMapOf("Solo" to "Milineum falcon", "Luke" to "Lands")

    for (rebel in rebels) {
        println(rebel)
    }

    for ((key, value) in rebelVehicle) {
        println("$key mufg hbfdh $value")
    }

    var x = 10
    while (x > 0) {
        println(x)
        x--
    }
}
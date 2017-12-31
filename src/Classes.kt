/**
 * Created by sulistiyanto on 31/12/17.
 */

/*class Car(val make: String, val made: String) {

    fun accelerate() {
        println("vroom vroom")
    }
}

class Truck(val make: String, val made: String, val towing : Int) {

    fun accelerate() {
        println("vroom vroom")
    }
}*/

open class Vehicle(val make: String, val model: String) {

    open fun accelerate() {
        println("vroom vroom")
    }

    fun parking() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP!")
    }
}

class Car(make: String, model: String, var color : String) : Vehicle(make, model) {

    override fun accelerate() {
        println("hi")
        super.accelerate()
    }
}

fun main(args: Array<String>) {
    /*val car = Car("Toyota", "Avanza")
    println(car.made)
    println(car.make)
    car.accelerate()*/

    val tesla = Car("Tesla", "T-900", "Blue")
    tesla.brake()
    tesla.accelerate()
}
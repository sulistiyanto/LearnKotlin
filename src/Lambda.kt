/**
 * Created by sulistiyanto on 31/12/17.
 */
fun main(args: Array<String>) {

    val printMessage = { message : String -> println(message)}

    printMessage("Hello World")

    val sumA = { x : Int, y : Int -> x + y}
    println(sumA(5, 3))

    val sumB : (Int, Int) -> Int = {x, y -> x + y}

    fun downloadData(url : String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there were no network errors
        completion()
    }

    //call downloadData function
    downloadData("fakeUrl.com", {
        println("The code in this block, will only run" +
                "after the completion()")
    })

    fun downloadCarData(url : String, completion : (Car) -> Unit) {
        // sent a download request
        // we got back car data
        val car = Car("Tesla", "ModelX", "Red")
        completion(car)
    }

    downloadCarData("fakeURL.com") { car ->
        println(car.make)
        println(car.model)
    }

    downloadCarData("fakeURL.com") {
        println(it.make)
        println(it.model)
    }
}
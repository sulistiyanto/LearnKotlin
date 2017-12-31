/**
 * Created by sulistiyanto on 31/12/17.
 */
fun main(args: Array<String>) {
    val imperials = listOf("Londo","Kondo", "Sopo", "Ora")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Ora"))
    println(imperials)
    println(imperials.size)

    val rebels = arrayListOf("Kamu", "Aku", "Dia")
    rebels.set(0, "Loo")
    println(rebels)
    rebels.add(0, "Kamu")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Milineum falcon", "Luke" to "Lands")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Aku", "hoeee"))
    println(rebelVehiclesMap.values)

    val rebelVehicle = hashMapOf("Solo" to "Milineum falcon", "Luke" to "Lands")
    rebelVehicle["Solo"] = "Ndower"
    rebelVehicle.put("Aku", "Kamu")
    println(rebelVehicle)
    rebelVehicle.remove("Like")
    println(rebelVehicle)
    rebelVehicle.clear()
    println(rebelVehicle)

}
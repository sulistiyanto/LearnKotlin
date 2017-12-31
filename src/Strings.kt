/**
 * Created by sulistiyanto on 31/12/17.
 */
fun main(args: Array<String>) {
    val str = "ay ah asjfifa"
    println(str)

    val rawCrawl = """|A long time go,
    |in galaxy,
    |far, fa,
    |BUMM, BUMMM """.trimMargin()
    println(rawCrawl)

    /*for (char in str) {
        println(char)
    }*/

    val a = 2
    val b = 9

    val contentEquals = str.contentEquals("ay ah asjfifa")
    println(contentEquals)

    val contains = str.contains("ay", true)
    println(contains)

    val subSequence = str.subSequence(2, 8)
    println(subSequence)

    val name = "Sulistiyanto"
    println("My name is $name has ${name.length} and ${a + b}")
}

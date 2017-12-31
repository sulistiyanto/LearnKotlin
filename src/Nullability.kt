/**
 * Created by sulistiyanto on 31/12/17.
 */
fun main(args: Array<String>) {
    var name : String

    var nullableName : String? = "Hi Hi"
    println(nullableName)
    nullableName = null

    //null check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val  l = if (nullableName != null) nullableName.length else  -1

    // second method safe call operator ?
    println(nullableName?.length)

    // third method is Elvis Operator
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me"
    println(noName)

    //!!
}

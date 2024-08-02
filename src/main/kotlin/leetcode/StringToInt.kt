package leetcode

fun main() {
    val str = "   -042"
    var s = ""

    for (i in str) {
        if(i.toChar() == 45.toChar() || i.toChar() >= 48.toChar() && i.toChar() <= 57.toChar()) {
            s += i
        }
    }

    println(s.toInt())
}
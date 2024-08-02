package yt

fun main() {
    val num = readln().toInt()

    if (num > 0 ) {
        println("Positive number")
    } else if (num < 0) {
        println("Negative number.")
    } else {
        println("Zero")
    }
}
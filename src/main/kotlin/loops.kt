fun main(args: Array<String>) {
    val num = arrayOf(1, 5, 10, 15, 20)
    for (x in num) {
        if (x % 2 == 0) {
            println("pass")
        } else {
            println("fails")
        }
        println(x)
    }
}
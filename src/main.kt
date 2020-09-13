fun main(vararg args: String) {
    println("Hello, World! I am A+B and A*B program.")
    val (a, b) = readLine()!!.split(' ')
    println(a.toInt() + b.toInt())
    println(a.toInt() + b.toInt())
}
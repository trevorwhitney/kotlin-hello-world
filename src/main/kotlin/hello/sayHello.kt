package hello

fun greeting(name: String): String {
    return "Hello, $name!"
}

fun main(args: Array<String>) {
    println(greeting(args[0]))
}
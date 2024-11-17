fun operator() {
    println(1 + 1)
    println(2.5 * 4.4)
    println(6.8.div(2))
}

fun mutable() {
    var dd  = 4
    dd = 2
    val aa = 1
    //aa = 8
    println(dd)
    println(aa)
}

fun condition(){
    val a = 50
    val b = 23
    if (a >b) {
        println("a>b")
    } else {
        println("b>a")
    }
}

fun nullability() {
    var food: Int? = null
    food = food?.dec() ?: 0
    println(food)
}

fun loop() {
    // For Loop: Iterating through a range
    println("For loop:")
    for (i in 1..5) {
        println("Current value: $i")
    }

    // While Loop
    println("\nWhile loop:")
    var count = 5
    while (count > 0) {
        println("Countdown: $count")
        count--
    }

    // Do-While Loop
    println("\nDo-While loop:")
    var num = 0
    do {
        println("Current number: $num")
        num++
    } while (num < 3)
}

fun main() {
    loop()
}
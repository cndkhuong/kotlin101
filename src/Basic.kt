/**
 * Created by kevin on 6/15/17.
 */
fun main(args:Array<String>){
    println("Hello world")
    println("Sum of 1&2 = ${sum(1,2)}")
    loop()
}

fun sum(a:Int, b:Int) = a + b

fun max(a:Int, b:Int) = if (a > b) a else b

fun loop() {
    for(i in 1..19) println(i)
}
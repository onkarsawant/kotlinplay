
fun printBorder(border: String,timesToRepeat: Int) {
    repeat(timesToRepeat){
    print(border)
    }
    println("")
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age){
        print("`")
       }
    println("")
    print (" ")
    repeat(age){
        print("|")
    }
    println("")
 }

fun printCakeBottom(age: Int, layers: Int) {
    repeat(age + 2) {
        print("@")
    }
    println()
}


fun main() {
    
    val age = 5 
    val name = "Onkar"
    val border="%"
    val timesToRepeat = 23
    printBorder(border,timesToRepeat)    
    println("Happy Birthday ${name} !! ")
    printBorder(border,timesToRepeat)
    // this is a comment 
    printCakeCandles(age)
    printCakeTop(age)
    repeat(4){
    printCakeBottom(age,5)
    }
    println("")
    // this is another comment 
    println("Hello ${name} , you are ${age}!")
    println("${age} is the best age to celebrate ")
}

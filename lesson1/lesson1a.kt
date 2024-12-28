// Hello world program
// android developments
// dev by jetbrains
// replace java,javascript

// why kotlin
    //  1. more readable and clean code 
    //  2. less verbose than java
    //  3. type safety
    //  4. null safety
    //  5. interoperability with Java

//LESSON 1 Variables

 fun main() {
    //Variable- mem space/container/storage
    val greeting="Hello Kotlin"                      //immutable variable (once
    println(greeting)
    val regression=22.2
    val classification = "Muffins"
    println(regression)
    println(classification)

    // DATATYPES
    //1.Numbers
    val myInt = 100// Integers-Bytes,Shorts,Int,Long
    val myDouble=100.4 //floating types-double,Float
    //2.Strings
    val myString ="Kotlin is fun"
    //3.Boolean - true or false
    val myBoolean =true
    //4.Char - single character
    val myChar='A'
    //5.Arrays - Assignment1
    val myArray= arrayOf("one","two","three")    
    println(myInt)
    println(myDouble)
    println(myString)
    println(myBoolean)
    println(myChar)
    println(myArray)

    val name = "John Doe"
    println("My name is $name")

}
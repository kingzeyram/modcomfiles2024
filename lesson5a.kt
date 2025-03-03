// Functions - Group of related statements that perform a specific task 
// They are used to break a large program into smaller chunks
// they can be called from anywhere in the code,
// avoids repettition and makes code reusable
// more organised and manageable

//Jotlin Standard Functions
// A)Main
 //fun fun main(args: Array<String>) {}
//B)Print
 //println()
//C)Sqrt
//Sqrt()
fun main (){
val number: Double = 25.0
val sqrts: Double=Math.sqrt(number)
println("Answer $sqrts")  

welcome()
multiply()
sqrt()
}
//User Defined Functions
fun greetUser(name: String) {
    println("Hello, $name!")

 greetUser("")    
}
fun welcome(){
    print("Welcome")
}
fun addition(){
    val num1 = 40
    val num2 = 50
    val answer = num1 + num2
    println("addition Function : $answer")

}
//TODO: EX2 : function that multiplies 2 Doubles
//Output : "Multiplication Function : $multip"
fun multiply(){
  val num1: Double = 20.0
  val num2: Double = 10.0
  val multip  = num1 * num2
  println("Multiplication Function :$multip")
}







//TODO :EX3 : Function that Finds $Squareroot of a double
// OUTPUT : "With Inbuilt Function :$sqrt"
fun  sqrt(){
    val num1 :Double = 144.0
    val sqrts: Double=Math.sqrt(num1)
    println("With Inbuilt Function :$sqrts")
}

// Ex3 : // checking if allowed to withdraw 

fun chec(){
    val balance = 200
    if(balance <50){
        println("Not allowed")
    }
    else if(balance <= 1000){
        println("Withdraw at fee=>0 ")
    }
    else 
    println("Withdraw fee => 50")  
}
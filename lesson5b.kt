//TODO :EX3 : Function that Finds $Squareroot of a double
// OUTPUT : "With Inbuilt Function :$sqrt"
fun main(){

   sqrt1() 
   check1()
}
fun  sqrt1(){
    val num1 :Double = 144.0
    val sqrts: Double=Math.sqrt(num1)
    println("With Inbuilt Function :$sqrts")
}

// Ex3 : // checking if allowed to withdraw 

fun check1(){
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
//LOOPS
//Looping is the [process ] of repeating a task
// n-times

//A) While loops
// first we need to set a condition 
// if condition is true > loop works
// if cod=ndition is false > loop doesnt work
 fun main(){
    var balance = 0 // variable

    while (balance <=150){
        println("you Are Broke")
        //increase by 50
        balance = balance + 50
        println("$balance  ")
    } 
    // B. For loops
    var ag =10
    for (ag in 1..5){
        // if True
        println("$ag Trials" )}
    for (ag in 5..1){println("$ag ReverseTrials" )}

    for (ag in 5 downTo 1){println("$ag down" )}
    println("")
    for (ag in 1..5 step 2){println("$ag step" )}
    println("")
    for (ag in 5 downTo 1 step 2){println("$ag step" )}
    println("")

    val myArray= arrayOf("one","two","three")
    println(myArray[1])
 }


import kotlin.io.println// control flow
//if
//When
//when expression is used in kotlin to eavaluate
//Works similar to if...else
// the when keyword matches its arguments against all
// branches sequentially until some branch condition
// is stisfied

fun main(){
   // val a : Int=0 // variable set

  //
    // Example 2
    //var marks : Int=30
    //when (marks){
     //   in 1..30 -> println("You Scored &marks -Below average")
    

    // Example 3
    var marks1 : Int=30
    when (marks1){
        in 1..30 -> println("You Scored &marks - failed")
        in 31..50 -> println("You Scored &marks - below average")
        in 51..70 -> println("You Scored &marks - average")
        in 71..100 -> println("You Scored &marks - Above average")
    else -> print("Invalid")
    }
}
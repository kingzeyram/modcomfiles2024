fun main(){
    //val nums = arrayOf(100.0,56.6,67)
    //for (i in nums){
     //SquareRoot(num1= i )}
     SquareRoot(num1 =100.8)

    simpleinterest() 
    area()
    bmi(name= "Joe", height=172 , weight=56) 
}

fun SquareRoot(num1:Double){
val sqrt : Double = Math.sqrt(num1)
println("Squareroot of $num1 is $sqrt")}

//BMI Calculator
fun bmi( name: String ,height : Int , weight :Int)
    {
        val bmis = weight /(height*height)
       // println("Square Root => $num1 is $sqrt")
    } 


fun simpleinterest(){
    val p: Int = 200
    val r: Int = 10
    val t: Int =2
    val si :Int= ( p* r *t )
    println("simpleinterst :$si ")
}    

//AREA of Circle
fun area(){
    val pi:Double = 3.14
    val r: Int = 7
    val ar = (pi *r*r)
    print("Area is $ar")

}
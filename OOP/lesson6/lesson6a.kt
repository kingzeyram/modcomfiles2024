// Object Oriented Programming

//We take Problems as objects
//Object has
//1)Attributes (Properties)
//-variables (DataTypes)
//2)Behaviour -(Functions)
//-fun swala(),twiga(),kiboko()

//EXAMPLE 1:
class Person{
    // i member Properties - Name age height gender weight
    var name:String = "Ramsey"
    var age :Int = 18
    var height: Double=1.75
    var Weight : Double = 54.0 
    var gender : String = "F"
    //ii Member Functions - code speak sing
    fun code(){
        println("$name can Code")
    fun vote(){
        if (age>=18){
            println("$name can Vote")
        }
    fun bungiejump(){
        if (height>=1.50){
            println("$name can bunjie jump")
        }
    }    
    }    
    }
}
fun main(){
    // Initialising the object 
    var myObject = Person()
    // To access the members properties
    println(myObject.name)

    myObject.code()
}
    

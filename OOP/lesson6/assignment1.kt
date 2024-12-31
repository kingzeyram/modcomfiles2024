open class Person{ // Super Class / Parent Class
    // Attributes
    val name = "Ramsey"
    val age = 18
    fun code(){
        println("Can Code")
    }
}
// Student can Inherit person properties
class Student : Person(){ // subclass /
    val admnNo = "789"
    val group = "Swala"
    fun registerexam(){
        println("Student Function")
    }
}

class Trainer: Person(){
val  specialty = "Android"
}
fun main(){
    val stude = Student()
    // Access the properties
    println("=====Student==")
    println(stude.admnNo)
    println(stude.group)
    //access super class properties
    stude.code() // in person
    println("=====Trainer==")
    val trainer = Trainer()
    println(trainer.specialty)

    trainer.code()

}
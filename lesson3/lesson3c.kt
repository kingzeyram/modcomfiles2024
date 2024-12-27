fun main (args:Array<String>){
var languages = arrayOf("Kotlin","Java","Xml","Python")
var numbers = arrayOf(20,50,70,78)
    for (lang in languages){
        if (lang == "Java")
        println("Found $lang")
    }
    for (num in numbers){
        println(num)
    }
    var text = "Kotlin"
    for (letter in text){
        println(letter)
    }
}
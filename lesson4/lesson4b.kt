fun main(){
    val lang = arrayOf("Java","C++","python","C#","HTML")
    println(lang[0])
    lang[0]= "Kotlin"
    println(lang[0])
    
    val sz =lang.size
    println("i have $sz languages")
    for (lan in lang){
        if(lan == "python"){
            
          println ("found $lang")
            }
        else{
          println(" 0")
        }
    }

   

    }
    

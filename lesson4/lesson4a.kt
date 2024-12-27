fun main(){
    //ARRAYS
    // -store multiple elements in a single variable instead of creating each individual
    val veh1= "Toyota"
    val veh2= "Mazda"
    val veh3= "Subaru"
    // And soooo on

    val cars = arrayOf(veh1,veh2,veh3,"land Rover","Mercedes")
    val marks = arrayOf(90,67,88,45,99)

    for(car in cars) println(car)

    println("")



    //task
    val size= cars.size
    println("i have $size cars in my array")
    cars[3]="ferrari"
    cars.set(3,"lamborghini")
    println(cars[3])
    println(cars.get(2))
    
}
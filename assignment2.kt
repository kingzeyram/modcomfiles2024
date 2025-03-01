fun main(){
val grossIncome:Int =500000
val message:String = "Monthly Contribution = 2_000.00"

when { 
 grossIncome <5_999->
    println("Monthly Contribution = 150.00")
 grossIncome >=6000 && grossIncome <= 7999->
    print("Monthly Contribution = 300.00")
 grossIncome >=8000 && grossIncome <= 11999->
    print("Monthly Contribution = 400.00")    
 grossIncome >=12000 && grossIncome <= 14999->
    print("Monthly Contribution = 500.00")
 grossIncome >=15000 && grossIncome <= 19999->
    print("Monthly Contribution = 600.00")
 grossIncome >=20000 && grossIncome <= 24999->
    print("Monthly Contribution = 750.00")
 grossIncome >=25000 && grossIncome <= 29999->
    print("Monthly Contribution = 850.00")
 grossIncome >=30000 && grossIncome <= 49999->
    print("Monthly Contribution = 1_000.00")
 grossIncome >=50000 && grossIncome <= 99999->
    print("Monthly Contribution = 1_500.00")
else ->
    print(message)   
} 

}                 
#modules

import calc

print(calc.divide(12,4))

y=calc.divide(15,45)
print(y)

from calc import modulus,divide

print(modulus(23,4))

print(divide(23,4))

def leap(ly):

    if ly%4 ==0 :
        if ly%100==0:
            if ly%400==0:
                print(f'{ly}is a Leap year' )
            else:
                print(f'{ly} is not a Leap year')    
        else:
            print(f'{ly}is a Leap year' )
    else:
        print(f'{ly} is not a Leap year') 

import random

x= random.randint(0,100)
print(x) 



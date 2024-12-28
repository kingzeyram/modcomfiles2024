#Variable re-assignment

x =3
y =5

print(x)

x=4
print(x)

x=y+2
print(x)

x= x+1
print(x)

x += 1
print(x)

y+=3 #y=y+3
print(y)


# nested if
#LEAP YEAR
#divisible by 4
# century years,check if they are divisible by 400

while True:
    ly=int(input('Enter_year: '))

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



    
    
 




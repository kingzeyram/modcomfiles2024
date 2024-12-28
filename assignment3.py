#Calculator
#3 inputs
#1 -First number
#2 -Operator
#3 -Second number
# print result

#/*+-%


a= int(input('Enter a number: '))
b= input('action: ')
c= int(input('Enter second number: '))

if b == '*' :
    print(a*c)
elif b == '/':
    print(a/c)
elif b =='+':
    print(a+c)
elif b == '-' :
    print(a-c) 
elif b == '%' :
    print(a%c)    
else:
    print('Invalid Input') 
          


# 1 input
# check if even or odd
# print 'number is (even/odd)

a=int(input('Enter a number: '))

if a%2==0:
    print('even')
else:
    print('odd')    
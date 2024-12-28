# For loops
# Repeat tasks a number of times

#print('hello')
#print('hello')
#print('hello')

for x in range(3):
    print('Hello wrld')

for counter in range(1,6):
    print(f'counter: {counter}') 

for x in range(1,11,2 ):
    print(x)

for x in range(11,21):
    if x ==13:
       continue
    else:
        print(x)
    

for num in range(6):
    if num ==3:
        break
    else:
         print(num)

str1 = 'python'
for y in str1:
    print(y)  

str2 = '23 * 23'
for k in str2:
    if k ==' ':
     break
    else:
        print(k)

fruits={'passion','mango','apple','citrus','lemon'}

for fruit in fruits:
    if fruit == 'citrus':
        print('in stock')
        break
else:
        print('out of stock') 
        
           


   

           
    


#print(type(range(5)))

# print number 1 - 50
# replace multiples of 3 with buzz
# replace multiples of 5 with buzz
# replace multiples of both 3 and 5 with fizzbuzz

for num in range (1,51):
    if num %3==0:
        print('fizz' , end='...')
    else:
        pass
    if num %5==0:
        print('buzz',  end='...' )
    if num %3==0 and num%5==0:
        print('fizzBuzz', end='...')    
            
    print(num ,  end='...')

    
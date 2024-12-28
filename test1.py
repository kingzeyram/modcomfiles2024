# import random

# x= random.randit
#print(x)

#create a function that counts number of words in a sentence

#split method (strings)

#str1='good afternoon'

#str1.split()

# Quick Two Line Codes
#countOfWords = len(str1.split())
#print("Count of Words in the given Sentence:", countOfWords)


#def counter():
#    sentence=input('Type a sentence: ')
#    x = sentence.split()
#    print( f'{len(x)} words long')

#while True:
#   counter() 

def counter():
    sentence=input('Type a sentence: ')
    x = sentence.split()
    print(x)  


    count=0
    for word in x:
        count+=1
    print(count)     

    

# get string input
# loop though the string checking for vowels or consonants
# p is a consonant
# ...
# o is a vowel

  


word = input('Enter Word: \n')
for letter in word:
    if letter == 'a' or letter == 'e' or letter == 'i' or letter == 'o' or letter == 'u':
        print(f'{letter} :is a vowel') 
    else:
        print(f'{letter} :is a consonant')



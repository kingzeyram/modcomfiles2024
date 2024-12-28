student={
    'name':'john doe',
    'class':4,
    'parent name':'jane doe',
    'parent phone':122334543,
    'gender':'Male',
    'pocket money':6000
}

def withdraw():
    name = input('Enter students name: ')

    if name in student.values():
        amount= input('input amount to withdraw: ')
        student ['pocket money']-=int(amount)
        print(student['pocket money'])
    else:
        print('student not found')


print(withdraw())
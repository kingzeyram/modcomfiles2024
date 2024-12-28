#Dictionaries
a={}

user={
    'f_name':'Jane',
    's-name':'Doe',
    'age' :  20,
    'married':False
}
user['age']
print(user['f_name'])

user['age'] = 30

#Dict Methods
x= user.get('married')
print(user.get('s_name'))
print(x)

#update
user.update({'gender':'female'})
print(user)


#listkeys
print(user.keys())

#list value
print(user.values())

school={
    'name':'Modcom',

    'academia':{
        'class': 'Form1',
        'subjects':['maths','science','english'],
        'classteacher':'john Doe'
    },
    'location':'Westlands'
}

academia = school.get('academia')
print(academia)
print(academia['subjects'][1])

print(school['academia']['subjects'][-1])
    






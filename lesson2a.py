# lists

a =[]
cars=['hyundai','Honda','audi','mitsubishi']

print(cars)

#list slicing
#print(cars[0])
#print(cars[4])

print(cars[-1])

list2=['white',['red','green','blue'],76]
list2[1]
print(list2[1])
print(list2[1][-1])

str1='python'
print(str1[1])

list3=[23,45,21,3,23,4]
print(list3[2:])

print(list3[0:7:3])

# list methods
# count

list3.count(23)

print(list3.count(23))

#add element at the end
list3.append(True)
print(list3)

#insert
#list3.insert(index,element)
list3.insert(0,45.5)
print(list3)

#pop
#removes last element
list3.pop()
print(list3)
#removes first element
list3.pop(0)
print(list3)

#list remove it removes specified item if two it removes the first
list3.remove(23)

#lists are mutiable

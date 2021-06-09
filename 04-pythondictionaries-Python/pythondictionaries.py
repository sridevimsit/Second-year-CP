"""Time to play with Python dictionaries!
You're going to work on a dictionary that
stores cities by country and continent.
One is done for you - the city of Mountain 
View is in the USA, which is in North America.

You need to add the cities listed below by
modifying the structure.
Then, you should print out the values specified
by looking them up in the structure.

Cities to add:
Bangalore (India, Asia)
Atlanta (USA, North America)
Cairo (Egypt, Africa)
Shanghai (China, Asia)"""


"""Print the following (using "print").
1. A list of all cities in the USA in
alphabetic order. Make it function with name as sortUSA(), return list of cities
2. All cities in Asia, in alphabetic
order, next to the name of the country.
In your output, label each answer with a number
so it looks like this: (Make it function with name as alphaAsia(), return list of cities)
1
American City
American City
2
Asian City - Country
Asian City - Country"""

locations = {'Mountain View': {'USA': ['North America']},
'Bangalore': {'India':[ 'Asia']},
'Atlanta': {'USA':[ 'North America']},
'Cairo': {'Egypt':[ 'Africa']},
'Shanghai': {'China':['Asia']}}



def sortUSA():
    l=[]
    for k,v in locations.items():
        for k1,v1 in v.items() :
            
            if k1=='USA':
                l.append(k)
    
    return sorted(l)

def alphaAsia():
    l=[]
    for k,v in locations.items():
        for k1,v1 in v.items():
           
            if v1==['Asia']:
                s=k+' - '+k1
                l.append(s)
    
    return sorted(l)


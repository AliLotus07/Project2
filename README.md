Problem 1: 
The strcpy() method was not copying with the string correctly, when I did MyString "Lunch" into the other MyString "Dinner", it wouldn't work well due to the end of the original string was still there.
I fixed this bug by changing the size and the O at the end of the string. 
Problem 2:
The strcmp() method had an issue when the string started with the same characters as another string ("Burger", and "Burger King"). 
They could be seen as the same yet they both have a different story to tell (Length)
I fixed this bug by checking the lengths of the two strings before comparing it to the characters. 

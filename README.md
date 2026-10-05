Alejandro Silva Mora, Donald Glover Jr. BUGS fixed. 

Problem 1: 
 I used "Lunch" as my source and I used "Dinner" as my destination, but when I was checking up (running the code), the string didn't replace the old content because of the old character was still attached, this would also cause the   did MyString "Lunch" into the other MyString "Dinner", it wouldn't work well due to the end of the original string was still there.
I fixed this bug by changing the size and the O at the end of the string. 
Problem 2:
The strcmp() method had an issue when the string started with the same characters as another string ("Burger", and "Burger King"). 
They could be seen as the same yet they both have a different story to tell (Length)
I fixed this bug by checking the lengths of the two strings before comparing it to the characters. 

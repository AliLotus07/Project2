Alejandro Silva Mora, Donald Glover Jr. BUGS fixed. 

Problem 1: Strcpy()
I copied "Lunch" into a MyString that originally contained "Dinner". The copied string did not completely replace the old contents because the old character at the end could remain in the array. The method also did not properly account for the space needed for the terminating 0.
        
fixed: I fixed this by making sure the destination had enough room for the copied string and its terminating 0. I also added the terminating 0 after copying the characters so that the new string ends well and runs good.

Problem 2: Strcmp()
The original strcmp() method could incorrectly return true when one string was the beginning of another string. For example, "Burger" and "BurgerKing" could be considered equal because the method stopped when the first string ended.

Fixed: I fixed this by checking each of the two strings to see if they have the same logical length before I compared it to their characters. 

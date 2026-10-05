Alejandro Silva Mora, Donald Glover Jr. BUGS fixed. 

Problem 1: Strcpy()
I copied "Lunch" into a MyString that originally contained "Dinner". The copied string did not completely replace the old contents because the old character at the end could remain in the array. The method also did not properly account for the space needed for the terminating 0.
        int len = other.strlen();
        if (m_string.length < len +1) {
            m_string = allocateBuffer( len+1 );
        }
        copyToBuffer( other.m_string, m_string, 0 );
        m_string[len] = 0;.)
        
fixed: I was able to fix this by making sure the destination has enough space for the copied string and its terminating 0. I also added the terminating 0 after copying the characters.

Problem 2: Strcmp()
I was able to find this bug by testing strings that had different lengths, an example of this would be that when I was using "Burger" and "Burger King",it would incorrectly be treated as equal. The strcmp() method would stop when the first string ended without checking that the other string was longer.

I fixed this by checking each of the two strings before I started comparing their characters so that the test would run well.

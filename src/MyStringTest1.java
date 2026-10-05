import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MyStringTest1 {
      @Test
    void get_string() {

        char [] charArr = {'A','p','p','l','e'};
        MyString chars = new MyString(charArr);
        chars.get_string();
        char [] result = chars.get_string();
        assertArrayEquals(charArr,result);

    }

    @Test
    void strcat() {
        MyString f1 = MyString.convertToMyString("Burger");
        MyString f2 = MyString.convertToMyString("King");
        f1.strcat(f2);
        assertEquals("BurgerKing", MyString.convertToString(f1));

    }
    @Test
    void strcatEmpty() {
        MyString f1 = MyString.convertToMyString("");
        MyString s2 = MyString.convertToMyString("");
        f1.strcat(s2);
        assertEquals("", MyString.convertToString(f1));

    }


    @Test
    void strcpy() {
        MyString source = MyString.convertToMyString("Lunch");
        MyString destination = MyString.convertToMyString(("Dinner"));
        destination.strcpy(source);
        assertEquals("Lunch", MyString.convertToString(destination));
    }
    @Test
    void strcpyEmpty() {
        MyString source = MyString.convertToMyString("Lunch");
        MyString destination = new MyString (5);
        destination.strcpy(source);
        assertEquals("Lunch", MyString.convertToString(destination));


    }
    @Test
    void strcpyEquals() {
        MyString source = MyString.convertToMyString("");
        MyString destination = MyString.convertToMyString("Dinner");

        destination.strcpy(source);
        assertEquals("", MyString.convertToString(destination));

    }


    @Test
    void strcmp() {
        MyString f1 = MyString.convertToMyString("Burger");
        MyString s2 = MyString.convertToMyString("BurgerKing");
        assertFalse(f1.strcmp(s2));

    }

    @Test
    void strcmpEmpty() {

        MyString f1 = MyString.convertToMyString("");
        MyString s2 = MyString.convertToMyString("");
        assertTrue(f1.strcmp(s2));
    }

    @Test
    void strlen() {
        MyString string1 = MyString.convertToMyString("Pizza");
        assertEquals(5, string1.strlen());
    }

    @Test

    void testStrlenEmpty() {
        MyString string1 = MyString.convertToMyString("");

        assertEquals(0, string1.strlen());
    }


    @Test
    void setChar() {
        MyString string1 = MyString.convertToMyString("Carrot");
        string1.setChar('P',0);
        assertEquals('P', string1.getChar(0));
    }
    @Test
    void setChar2() {
        MyString string1 = MyString.convertToMyString("Carrot");
        string1.setChar('L', 2);
        assertEquals('L', string1.getChar(2));

    }


    @Test
    void getChar() {
        MyString string1 = MyString.convertToMyString("Carrot");
        MyString string2 = MyString.convertToMyString("Parrot");
        assertEquals('C', string1.getChar(0));
        assertEquals('P', string2.getChar(0));

    }

    @Test
    void convertToMyString() {
        MyString string1 = MyString.convertToMyString("Burger");

        assertEquals(6,string1.strlen());
        assertEquals('B', string1.getChar(0));
        assertEquals('u', string1.getChar(1));
        assertEquals('r', string1.getChar(2));
        assertEquals('g', string1.getChar(3));
        assertEquals('e', string1.getChar(4));
        assertEquals('r', string1.getChar(5));

    }

    @Test
    void convertToString() {
        MyString string1 = MyString.convertToMyString("Popsicle");
        String result = MyString.convertToString(string1);
        assertEquals("Popsicle", result);

        MyString empty = MyString.convertToMyString("");
        assertEquals("", MyString.convertToString(empty));

    }

}

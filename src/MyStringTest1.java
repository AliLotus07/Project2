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
        MyString first = MyString.convertToMyString("");
        MyString second = MyString.convertToMyString("");
        first.strcat(second);
        assertEquals("", MyString.convertToString(first));

    }
    @Test
    void StrcatEmpty () {
        MyString first = MyString.convertToMyString("Burger");
        MyString second = MyString.convertToMyString("Burger");

        assertTrue(first.strcmp(second));

    }

    @Test
    void Emptystrcat2() {
        MyString first = MyString.convertToMyString("Burger");
        MyString second = MyString.convertToMyString("");
        first.strcat(second);
        assertEquals("Burger", MyString.convertToString(first));

    }

    @Test
    void Emptystrcat1() {
        MyString first = MyString.convertToMyString("");
        MyString second = MyString.convertToMyString("King");

        first.strcat(second);
        assertEquals("King", MyString.convertToString(first));

    }

    @Test
    void strcpy() {
        MyString source = MyString.convertToMyString("Lunch");
        MyString destination = MyString.convertToMyString(("Dinner"));
        destination.strcpy(source);
        assertEquals("Lunch", MyString.convertToString(destination));

    }
    @Test
    void strcpy2() {
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
        MyString first = MyString.convertToMyString("Burger");
        MyString second = MyString.convertToMyString("BurgerKing");
        assertFalse(first.strcmp(second));
    }
    @Test
    void strcmp2() {
        MyString first = MyString.convertToMyString("Burger");
        MyString second = MyString.convertToMyString("Burger");
        assertTrue(first.strcmp(second));

    }

    @Test
    void Strcmp3() {
        MyString first = MyString.convertToMyString("Mac");
        MyString second = MyString.convertToMyString("book");
        assertFalse(first.strcmp(second));

    }

    @Test
    void strlen() {
        MyString str = MyString.convertToMyString("Pizza");
        assertEquals(5, str.strlen());
    }
    @Test
    void StrlenChar() {
        MyString str = MyString.convertToMyString("A");
        assertEquals(1, str.strlen());

    }

    @Test

    void testStrlenEmpty() {
        MyString str = MyString.convertToMyString("");

        assertEquals(0, str.strlen());
    }


    @Test
    void setChar() {
        MyString str = MyString.convertToMyString("Carrot");
        str.setChar('P',0);
        assertEquals('P', str.getChar(0));
    }
    @Test
    void setChar2() {
        MyString str = MyString.convertToMyString("Carrot");
        str.setChar('L', 2);
        assertEquals('L', str.getChar(2));

    }
    @Test
    void setChar3() {
        MyString str = MyString.convertToMyString("Carrot");
        str.setChar('L', 5);
        assertEquals('L', str.getChar(5));

    }

    @Test
    void getChar() {
        MyString str = MyString.convertToMyString("Carrot");
        assertEquals('C', str.getChar(0));
        assertEquals('a', str.getChar(1));
        assertEquals('r', str.getChar(2));
        assertEquals('r', str.getChar(3));
        assertEquals('o', str.getChar(4));
        assertEquals('t', str.getChar(5));

    }

    @Test
    void convertToMyString() {
        MyString str = MyString.convertToMyString("Burger");

        assertEquals(6,str.strlen());
        assertEquals('B', str.getChar(0));
        assertEquals('u', str.getChar(1));
        assertEquals('r', str.getChar(2));
        assertEquals('g', str.getChar(3));
        assertEquals('e', str.getChar(4));
        assertEquals('r', str.getChar(5));

    }

    @Test
    void convertToString() {
        MyString str = MyString.convertToMyString("Popsicle");
        String result = MyString.convertToString(str);
        assertEquals("Popsicle", result);
    }
    @Test
    void ConvertToString2 () {
        MyString str = MyString.convertToMyString("");
        assertEquals("", MyString.convertToString(str));

    }
}

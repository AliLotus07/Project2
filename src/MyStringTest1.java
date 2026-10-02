import static org.junit.jupiter.api.Assertions.*;
class MyStringTest1 {
   @Test
    void get_string() {
    }

    @Test
    void strcat() {
        MyString f1 = MyString.convertToMyString("Burger");
        MyString f2 = MyString.convertToMyString("King");
        f1.strcat(f2);
        assertEquals("BurgerKing", MyString.convertToString(f1));

    }

    @Test
    void strcpy() {
        MyString source = MyString.convertToMyString("Lunch");
        MyString destination = MyString.convertToMyString("Dinner");
        destination.strcpy(source);
        assertEquals("Lunch", MyString.convertToString(destination));

    }

    @Test
    void strcmp() {
        MyString O = MyString.convertToMyString("Burger");
        MyString OO = MyString.convertToMyString("King");
        assertTrue(O.strcmp(OO));
    }

    @Test
    void strlen() {
        MyString str = MyString.convertToMyString("Pizza");
        assertEquals(5, str.strlen());
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

        assertEquals(5,str.strlen());
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
}

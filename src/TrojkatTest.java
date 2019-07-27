import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrojkatTest
{
    @Test
    public void sprawdzCzyRownobocznyTest() {
        Trojkat trojkat=new Trojkat(5,5,5);
        assertEquals(trojkat.sprawdz(), "rownoboczny");

    }

    @Test
    public void sprawdzCzyRownoramiennyTest(){
        Trojkat trojkat=new Trojkat(5,5,6);
        assertEquals(trojkat.sprawdz(),"rownoramienny");
    }

    @Test
    public void test1(){
        Trojkat trojkat=new Trojkat(10, 3, 5);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }

}
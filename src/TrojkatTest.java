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
    @Test
    public void test2(){
        Trojkat trojkat=new Trojkat(-3,-2,-5);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }
    @Test
    public void test3(){
        Trojkat trojkat=new Trojkat(0,0,0);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }
    @Test
    public void test4(){
    Trojkat trojkat = new Trojkat(3.2,4,3.2);
    assertEquals(trojkat.sprawdz(), "rownoramienny");
    }
    @Test
    public void test5() {
        Trojkat trojkat = new Trojkat(0.000000003, 0.000000002, 0.000000002);
        assertEquals(trojkat.sprawdz(), "rownoramienny");
    }
    @Test
    public void test6() {
        Trojkat trojkat = new Trojkat(0.000000002, 0.000000002, 0.000000002);
        assertEquals(trojkat.sprawdz(), "rownoboczny");
    }
    @Test
    public void test7() {
        Trojkat trojkat = new Trojkat(-0.0000000000002, -0.0000000000000004, -0.000000000000000000000006);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }
    @Test
    public void test8() {
        Trojkat trojkat = new Trojkat(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE );
        assertEquals(trojkat.sprawdz(), "rownoboczny");
    }
    @Test
    public void test9() {
        Trojkat trojkat = new Trojkat(Double.MAX_VALUE-1, Double.MAX_VALUE-1,2);
        assertEquals(trojkat.sprawdz(), "rownoramienny");
    }
    @Test
    public void test10() {
        Trojkat trojkat = new Trojkat(0,3,2);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }
    @Test
    public void test11() {
        Trojkat trojkat = new Trojkat(0,Double.MAX_VALUE,Double.MAX_VALUE);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }
    @Test
    public void test12() {
        Trojkat trojkat = new Trojkat(0,-Double.MAX_VALUE,-Double.MAX_VALUE);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }
    @Test
    public void test13() {
        Trojkat trojkat = new Trojkat(1,-Double.MAX_VALUE,2);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }
    @Test
    public void test14() {
        Trojkat trojkat = new Trojkat(-Double.MAX_VALUE,-Double.MAX_VALUE,-Double.MAX_VALUE);
        assertEquals(trojkat.sprawdz(), "nie istnieje");
    }

}
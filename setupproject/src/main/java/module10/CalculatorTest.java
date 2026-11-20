package module10;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;
    @Before

    public void setUp(){
        calc = new Calculator();
    }
    @After
    public void tearDown(){
        calc = null;
    }

    // Now im going to start writing the tests using the junit libraries

    @Test

    public void adding() {
        assertEquals(7, calc.add(5, 2));
    }
    @Test

    public void adding2() {
        assertEquals(10, calc.add(-5, 15));
    }
    @Test
    public void adding3() {
        assertEquals(14.5, calc.add(7.0, 7.5),0.001);
    }
    @Test
    public void adding4() {
        assertEquals(7.5, calc.add(2.5, 5),0.001);
    }
    //substracting starts here
    @Test
    public void subtracting() {
        assertEquals(20, calc.sub(30, 10));
    }

    @Test
    public void subtracting1() {
        assertEquals(-5, calc.sub(5, 10));
    }
    //dividing
    @Test
    public void dividing() {
        assertEquals(4, calc.div(8, 2), 0.001);
    }
    //dividing with exception

    @Test
    public void dividingException() {
        assertEquals(0.0, calc.div(15, 0), 0.001);
    }
    //multiplying
    @Test
    public void multiplying() {
        assertEquals(27, calc.mult(9, 3));
    }

    @Test
    public void multiplyingException() {
        assertEquals(0, calc.mult(0, 16));
    }
}

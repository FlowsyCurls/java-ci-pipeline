import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    double a=4,b=5;
    double c=10, d=3;

    @Test
        //sum...
    void sumSuccessWhenCorrectInput() {
        Calculator test = new Calculator();

        //first attempt
        double result1 = test.sum(a, b);
        assertEquals(a+b, result1);

        //second attempt
        double result2 = test.sum(c, d);
        assertEquals(c+d, result2);
    }

    @Test
        //minus...
    void minusSuccessWhenCorrectInput() {
        Calculator test = new Calculator();

        //first attempt
        double result1 = test.minus(a, b);
        assertEquals(a-b, result1);

        //second attempt
        double result2 = test.minus(c, d);
        assertEquals(c-d, result2);
    }

    @Test
        //multiply...
    void multiplySuccessWhenCorrectInput() {
        Calculator test = new Calculator();

        //first attempt
        double result1 = test.multiply(a, b);
        assertEquals(a*b, result1);

        //second attempt
        double result2 = test.multiply(c, d);
        assertEquals(c*d, result2);
    }

    @Test
        //divide...
    void divideSuccessWhenCorrectInput() {
        Calculator test = new Calculator();

        //first attempt
        double result1 = test.divide(a, b);
        assertEquals(a/b, result1);

        //second attempt
        double result2 = test.divide(c, d);
        assertEquals(c/d, result2);
    }

}
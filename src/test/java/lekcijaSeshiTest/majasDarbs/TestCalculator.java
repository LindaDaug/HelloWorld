package lekcijaSeshiTest.majasDarbs;

import lekcijaSeshi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    private void testCalculatorAddition()
    {
      Calculator myCalculator = new Calculator();
      int result = myCalculator.add(3,4);
        int expectedAdd =7;
        Assert.assertEquals(myCalculator.add(3,4),expectedAdd  );
    }

    @Test
    private void testCalculatorSubstract()
    {
        Calculator myCalculator = new Calculator();
        int result = myCalculator.substract(10,5);
        int expectedSub =5;
        Assert.assertEquals(myCalculator.substract(10,5),expectedSub);
    }

    @Test
    private void testCalculatorMultiply()
    {
        Calculator myCalculator = new Calculator();
        int result = myCalculator.multiply(10,2);
        int expectedMultiply =20;
        Assert.assertEquals(myCalculator.multiply(10,2),expectedMultiply);
    }


    @Test
    private void testCalculatorDivision()
    {
        Calculator myCalculator = new Calculator();
        float result = myCalculator.divide(30,3);
        int expectedDivision =10;
        Assert.assertEquals(myCalculator.divide(30,3),expectedDivision);
    }
}

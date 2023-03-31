import org.example.Calculator;
import org.example.DollarCalculator;
import org.example.MarketApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarCalculatorTest {

    @Test
    public void testHello(){
        System.out.println("Hello");
        MarketApi marketApi = new MarketApi();
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
        dollarCalculator.init();

        Calculator calculator = new Calculator(dollarCalculator);

        System.out.println(calculator.sum(10,10));

        Assertions.assertEquals(22000, calculator.sum(10,10));
        Assertions.assertEquals(0,calculator.minus(10,10));
    }


}

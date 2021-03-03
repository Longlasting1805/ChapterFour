import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    SalaryCalculator newSalaryCalculator;
    @BeforeEach
    void setUp() {
        newSalaryCalculator=new SalaryCalculator(0,0);
    }

    @AfterEach
    void tearDown() {
    }

@Test
    void testThatWeSetHourlyPay(){
        newSalaryCalculator.setHourlyPay(40);
        assertEquals(40,newSalaryCalculator.getHourlyPay());
}
@Test
    void testThatWeSetWorkTime(){
        newSalaryCalculator.setWorkHour(5);
        assertEquals(5,newSalaryCalculator.getWorkHour());
}

@Test
    void testThatWeCanCalculateGrossPay(){
        newSalaryCalculator.setHourlyPay(40);
        newSalaryCalculator.setWorkHour(5);
        assertEquals(200,newSalaryCalculator.getGrossPay());

}
}
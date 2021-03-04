import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheTwoLargestNumbersTest {
    TheTwoLargestNumbers theTwoLargestNumbers;

    @BeforeEach
    void setUp() {
        theTwoLargestNumbers= new TheTwoLargestNumbers();
    }


    @AfterEach
    void tearDown() {
    }
    @Test
    void largestNumberTest(){
        theTwoLargestNumbers.setNumber(55);
        theTwoLargestNumbers.setNumber(22);
        assertEquals(55,theTwoLargestNumbers.getLargestNumber());
    }
    @Test
    void secondLargestNumberTest(){
        theTwoLargestNumbers.setNumber(55);
        theTwoLargestNumbers.setNumber(22);
        theTwoLargestNumbers.setNumber(100);
        theTwoLargestNumbers.setNumber(-2);
        theTwoLargestNumbers.setNumber(99);
        theTwoLargestNumbers.setNumber(101);
        assertEquals(100,theTwoLargestNumbers.getSecondLargestNumber());
        assertEquals(101,theTwoLargestNumbers.getLargestNumber());
    }
}
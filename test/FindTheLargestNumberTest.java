import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheLargestNumberTest {
    FindTheLargestNumber findThelargestNumber;
    @BeforeEach
    void setUp() {
        findThelargestNumber = new FindTheLargestNumber(180,11);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWeSetContestWinner(){
        findThelargestNumber.setContestWinner(12);
        assertEquals(12,findThelargestNumber.getContestWinner());
        }

//    @Test
//    void testThatWeCalculateLargestWinner(){
////        findThelargestNumber = new FindTheLargestNumber(180,5);
//        findThelargestNumber.setLargestNumber(180);
//        findThelargestNumber.setContestWinner(5);
//      assertEquals(180, findThelargestNumber.getLargestNumber());
//    }

}
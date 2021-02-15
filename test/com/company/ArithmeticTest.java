package com.company;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
public class ArithmeticTest {
        Arithmetic newArithmetic;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
@Test
  public void test_ThatOurConstructorWorks(){
        newArithmetic = new Arithmetic(51,34);
        double num1 = newArithmetic.getFirstNumber();
        assertEquals(51,num1);
}
@Test
    public void test_ThatConstructWorks(){
        newArithmetic = new Arithmetic(51,34);
        double num2 = newArithmetic.getSecondNumber();
        assertEquals(34,num2);
}
@Test
    public  void testThat_FirstNumberCanBeUpated(){
    newArithmetic = new Arithmetic(51,34);
    newArithmetic.setFirstNumber(6);
    assertEquals(6,newArithmetic.getFirstNumber());
}
@Test
    public void testThat_FirstNumberCanBeUpdated(){
        newArithmetic = new Arithmetic(51,34);
        newArithmetic.setSecondNumber(23);
        assertEquals(23,newArithmetic.getSecondNumber());
}
@Test
    public void testThat_UserCanDivideTwoNumbers(){
        newArithmetic = new Arithmetic(34,12);
        newArithmetic.setFirstNumber(20);
        newArithmetic.setSecondNumber(200);
        assertEquals(0.1,newArithmetic.divideTwoNumbers());

}
@Test
    public void testThat_UserCanMultiplyTwoNumbers(){
        newArithmetic = new Arithmetic(22,54);
        newArithmetic.setFirstNumber(33);
        newArithmetic.setSecondNumber(32);
        assertEquals(1056,newArithmetic.multiplyTwoNumbers());
}
@Test
    public void testThat_UserCanAddTwoNumbers(){
        newArithmetic = new Arithmetic(12,43);
        newArithmetic.setFirstNumber(144);
        newArithmetic.setSecondNumber(322);
        assertEquals(466,newArithmetic.addTwoNumbers());
}
@Test
    public void testThat_userCanSubtractTwoNumbers(){
        newArithmetic = new Arithmetic(32,11);
        newArithmetic.setFirstNumber(43);
        newArithmetic.setSecondNumber(15);
        assertEquals(28,newArithmetic.subtractTwoNumbers());

}

}
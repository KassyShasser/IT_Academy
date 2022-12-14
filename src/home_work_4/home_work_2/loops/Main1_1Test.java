package home_work_4.home_work_2.loops;

import home_work_2.loops.Main1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_1Test {
    @Test
    @DisplayName("Normal, by loop")
    public void printFactorialLoop1() {
        Assertions.assertEquals(120, Main1_1.printFactorialLoop(5));
    }

    @Test
    @DisplayName("from 1 to 1, , by loop")
    public void printFactorialLoop2() {
        Assertions.assertEquals(1, home_work_2.loops.Main1_1.printFactorialLoop(1));
    }

    @Test
    @DisplayName("Overflow, , by loop")
    public void printFactorialLoop3() {
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            home_work_2.loops.Main1_1.printFactorialLoop(22);
        });
    }

    @Test
    @DisplayName("Normal, recurse")
    public void factorial1() {
        Assertions.assertEquals(120, home_work_2.loops.Main1_1.factorial(5));
    }

    @Test
    @DisplayName("from 1 to 1, recurse")
    public void factorial2() {
        Assertions.assertEquals(1, home_work_2.loops.Main1_1.factorial(1));
    }

    @Test
    @DisplayName("Overflow, recurse")
    public void factorial3() {
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            home_work_2.loops.Main1_1.factorial(22);
        });
    }
}

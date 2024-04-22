package seminars.third.hw;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMainHW {



    @Test
    void checkEvenNumber() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(2));
    }

    @Test
    void checkOddNumber() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.evenOddNumber(3));
    }



    @Test
    void checkNumberInInterval() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.numberInInterval(25));
        assertTrue(mainHW.numberInInterval(100));
    }

    @Test
    void checkNumberNotInInterval() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(24));
        assertFalse(mainHW.numberInInterval(101));
    }
}

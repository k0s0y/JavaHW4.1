import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegistredAndBonusUnderLimit() {
        BonusService service = new BonusService();

        int amount = 1000;
        boolean registred = true;
        int expected = 30;

        int actual = service.calculate(amount, registred);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateRegistredAndBonusOverLimit() {
        BonusService service = new BonusService();

        int amount = 100000;
        boolean registred = true;
        int expected = 500;

        int actual = service.calculate(amount, registred);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNotRegistredAndBonusOverLimit() {
        BonusService service = new BonusService();

        int amount = 100000;
        boolean registred = false;
        int expected = 500;

        int actual = service.calculate(amount, registred);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNotRegistredAndBonusUnderLimit() {
        BonusService service = new BonusService();

        int amount = 1000;
        boolean registred = false;
        int expected = 10;

        int actual = service.calculate(amount, registred);

        assertEquals(expected, actual);

    }

}
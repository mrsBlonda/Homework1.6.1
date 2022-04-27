import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {
    SavingsAccount sut;


    @BeforeEach
    public void init() {
        sut = new SavingsAccount(0);
        System.out.println("Создание сберегательного счёта");

    }
    @BeforeAll
    public static void started() {
        System.out.println("Начало тестирования..");
    }

    @AfterEach
    public void finished() {
        System.out.println("Тестирование метода завершено");

    }
    @AfterAll
    public static void finishedAll() {
        System.out.println("Тестирование закончилось");
    }


    @Test
    public void pay() {
        // given:
        int amount = 5000;

        // when:
        sut.pay(amount);
        int expected = 0;

        // then:
        assertEquals(expected, sut.balance);
    }
    @Test
    public void transfer() {
        // given:
        Account account = new CreditAccount(0); int amount = 7000;

        // when:
        sut.transfer(account, amount);
        int expected = 0;

        // then:
        assertEquals(expected, sut.balance);
    }
    @Test
    public void addMoney() {
        // given:
        int amount = 5000;

        // when:
        sut.addMoney(amount);
        int expected = 5000;

        // then:
        assertEquals(expected, sut.balance);

    }




}

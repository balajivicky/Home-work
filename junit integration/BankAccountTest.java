import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest 
{

    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount(1000);
        acc.withdraw(400);
        assertEquals(600, acc.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        BankAccount acc = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(1500);
        });
    }

    @Test
    void testNegativeDeposit() {
        BankAccount acc = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> {
            acc.deposit(-100);
        });
    }

    @Test
    void testCheckBalance() {
        BankAccount acc = new BankAccount(2000);
        assertEquals(2000, acc.getBalance());
    }
}
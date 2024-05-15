import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {

    @Test
    public void notEnoughFunds(){
BankAccount b=new BankAccount(10);
assertThrows(NotEnoughFundsException.class,()->b.withdraw(11));
    }

    @Test
    public void EnoughFunds(){
        BankAccount b=new BankAccount(100);
        assertDoesNotThrow(()->b.withdraw(50));

    }
}

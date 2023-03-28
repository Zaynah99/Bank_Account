import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// where @test will go, imports and asserts

public class BankAccountTest {
BankAccount bankAccount;
@BeforeEach
public void setUp(){
    bankAccount = new BankAccount("Zaynah","Sadiq", "July", 123456);
}
    @Test
    public void canDepositMoney(){
        bankAccount.deposit(5000);
        assertThat(bankAccount.getBalance()).isEqualTo(5000);
    }

    @Test
    public void canWithdrawMoney(){
    bankAccount.withdraw(100);
    assertThat(bankAccount.getBalance()).isEqualTo(-100);
    }

    @Test
    public void hasFirstName(){
    assertThat(bankAccount.getFirstName()).isEqualTo("Zaynah");
    }

    @Test
    public void canSetFirstName(){
    bankAccount.setFirstName("Jane");
    assertThat(bankAccount.getFirstName()).isEqualTo("Jane");

}
    @Test
    public void hasSecondName() {
        assertThat(bankAccount.getLastName()).isEqualTo("Sadiq");
    }

    @Test
    public void canSetLastName(){
    bankAccount.setLastName("Doe");
    assertThat(bankAccount.getLastName()).isEqualTo("Doe");
    }

    @Test
    public void hasDateOfBirth(){ assertThat(bankAccount.getDateOfBirth()).isEqualTo("July");}

    @Test
    public void setDateofBirth(){
    bankAccount.setDateOfBirth("August");
    assertThat(bankAccount.getDateOfBirth()).isEqualTo("August");
    }

    @Test
    public void stateAccountNumber() {assertThat(bankAccount.getAccountNumber()).isEqualTo(123456);}

    @Test
    public void getAccountNumber(){
    bankAccount.setAccountNumber(0);
    assertThat(bankAccount.getAccountNumber()).isEqualTo("0");
    }


}
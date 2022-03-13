import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountPositiveTest extends TestCase {

    private final String name;


    public AccountPositiveTest(String name) {
        this.name = name;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"Джаред Лето"},
                {"Дж а"},
                {"Дж ар"},
                {"Джаред Летоооооооо"},
                {"Джаред Летоооооооощ"}

};
    }

    @Test
    public void validName() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss(account);
        assertTrue(actual);

    }
}
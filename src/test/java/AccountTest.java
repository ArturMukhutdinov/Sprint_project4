import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest extends TestCase {

    private final String name;


    public AccountTest(String name) {
        this.name = name;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"Джаред Лето"},
                {"Дж а"},
                {"Дж ар"},
                {"Джаред Летоооооооо"},
                {"Джаред Летоооооооощ"},
                {"Джаред Летоооооооощз"},
                {""},
                {" ДжаредЛето"},
                {"ДжаредЛето"},
                {"Джаред Лето "},
                {"Джаред  Лето"},
                {"Дж"}
};
    }

    @Test
    public void validName() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss(account);
        assertTrue(actual);
    }
}
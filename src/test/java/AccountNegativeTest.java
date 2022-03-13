import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountNegativeTest extends TestCase {

    private final String name;


    public AccountNegativeTest(String name) {
        this.name = name;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
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
        assertFalse(actual);

    }
}
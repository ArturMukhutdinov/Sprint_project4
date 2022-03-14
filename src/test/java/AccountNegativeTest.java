import io.qameta.allure.junit4.DisplayName;
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
    public static Object[][] getTestData() {
        return new Object[][]{
                {null},
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
    @DisplayName("Проверка эмбоссирования, негативные тесты")
    public void validName() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss(account);
        assertFalse(actual);

    }
}
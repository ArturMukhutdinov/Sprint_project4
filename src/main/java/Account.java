import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }
    @Step("Проверка строки на возможность эмбоссирования")
    public boolean checkNameToEmboss(Account account) {
        return account.name != null && account.name.length() >= 3 && account.name.length() <= 19
                && !account.name.startsWith(" ") && !account.name.endsWith(" ")
                && !account.name.contains("" + " " + " " + "") && account.name.contains(" ");
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */


    }
}
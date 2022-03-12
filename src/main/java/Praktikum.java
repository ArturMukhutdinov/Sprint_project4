public class Praktikum {

    public static void main(String[] args) {

        Account account = new Account("Джаред Лето");

        account.checkNameToEmboss(account);

        System.out.println(account.checkNameToEmboss(account));

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}
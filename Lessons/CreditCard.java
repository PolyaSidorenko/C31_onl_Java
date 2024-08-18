package Lessons;
//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//выводит текущую информацию о карточке. Напишите программу, которая создает три
//объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//третьей. Выведите на экран текущее состояние всех трех карточек.
public class CreditCard {
    String fullName;
    String accountNumber;
    int currentAmount;

    @Override
    public String toString() {
        return "Имя владельца карты: " + fullName + ", номер карты: " + accountNumber + ", сумма на счете: " + currentAmount;
    }

    public CreditCard(String fullName, String accountNumber, int currentAmount) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    void depositMoney(int deposit) {
        currentAmount = currentAmount + deposit;
    };

    void withdrawMoney(int withdraw) {
        currentAmount = currentAmount - withdraw;
    }
}

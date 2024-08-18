package Lessons;


public class Lesson6 {
    public static void main(String[] args) {
    CreditCard userOne = new CreditCard("Polina Sidorenko","1234 5678 9002",35600);
        System.out.println(userOne);
        userOne.depositMoney(25);
        System.out.println(userOne);
        System.out.println("  ");

        CreditCard userTwo = new CreditCard("Nikita Poleshchuk","1234 5678 9007",10250);
        System.out.println(userTwo);
        userTwo.depositMoney(25);
        System.out.println(userTwo);
        System.out.println("  ");

        CreditCard userThree = new CreditCard("Katya Galuzo","1234 5678 8794",1000870);
        System.out.println(userThree);
        userThree.withdrawMoney(1000);
        System.out.println(userThree);
    }
}
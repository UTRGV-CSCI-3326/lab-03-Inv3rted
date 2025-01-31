public class BankAccount{
    public static void main(String[] args){
        float balance = 2175.37f;
        balance -= 302.50f;
        balance += 50.03f;
        balance = (balance/2) + 20;
        balance -= 1;
        balance *= 2;
        balance += 1;
        System.out.println("Bob's current balance is $" + balance);
    }
}

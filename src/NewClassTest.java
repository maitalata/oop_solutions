public class NewClassTest {
    public static void main(String args[]){
        NewClass account1 = new NewClass();
        System.out.println(account1.printDetails());

        NewClass account2 = new NewClass("Test User", "BNK33442", 82132.87, 1.12);
        account2.depositMoney(50000);
        account2.withdrawMoney(15000);
        System.out.println("Account 2 Without Computing Interest");
        System.out.println(account2.printDetails());
        account2.computeInterest();
        System.out.println("Account 2 After Computing Interest");
        System.out.println(account2.printDetails());
    }
}

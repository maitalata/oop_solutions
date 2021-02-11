import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        NewClass[][] accountArr = new NewClass[10][];

        accountArr[0] = new NewClass[1];
        accountArr[1] = new NewClass[2];
        accountArr[2] = new NewClass[3];
        accountArr[3] = new NewClass[4];
        accountArr[4] = new NewClass[5];
        accountArr[5] = new NewClass[6];
        accountArr[6] = new NewClass[7];
        accountArr[7] = new NewClass[8];
        accountArr[8] = new NewClass[9];
        accountArr[9] = new NewClass[10];

        for(int i = 0; i < accountArr.length; i++){
            for (int j = 0; j < accountArr[i].length; j++){
                String accountName;
                String accountId;
                double accountBalance;
                double interestRate;

                System.out.print("Enter Account Name: ");
                accountName = input.nextLine();

                System.out.print("Enter Account ID: ");
                accountId = input.nextLine();

                System.out.print("Enter Account Balance: ");
                accountBalance = input.nextFloat();

                System.out.print("Enter Account Interest Rate: ");
                interestRate = input.nextFloat();

                accountArr[i][j] = new NewClass(accountName, accountId, accountBalance, interestRate);
            }
        }

        for(int i = 0; i < accountArr.length; i++){
            for (int j = 0; j < accountArr[i].length; j++){
                float amopunt;

                System.out.print("Enter Amount to Deposit to "+accountArr[i][j].accountName+"'s account: ");
                amopunt = input.nextFloat();
                accountArr[i][j].depositMoney(amopunt);

                System.out.print("Enter Amount to Withdraw from "+accountArr[i][j].accountName+"'s account: ");
                amopunt = input.nextFloat();
                accountArr[i][j].withdrawMoney(amopunt);

                accountArr[i][j].computeInterest();

                System.out.println(accountArr[i][j].printDetails());
            }
        }
    }
}


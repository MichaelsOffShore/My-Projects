import java.util.*;


public class bankingApplication {

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

        bankAccount acc1 = new bankAccount("Lucy McFaren", 1234);
        bankAccount acc2 = new bankAccount("Max Rustle", 2345);
        bankAccount acc3 = new bankAccount("Kyle Roberts", 3456);
        bankAccount acc4 = new bankAccount("Louise Jenkins", 4567);
        bankAccount acc5 = new bankAccount("Natt Belcher", 5678);

        bankAccount [] arr = {acc1, acc2, acc3, acc4, acc5};

        boolean appRunning = true;

int codeInput = 0;
int command = 0;

while(appRunning){


    System.out.println("Please enter your Passcode: ");
    codeInput = scan.nextInt();
    if(codeInput == -1){

        appRunning = false;
        break;

}
        bankAccount current = findAccount(codeInput, arr);
    System.out.println("Hello, " + current.fullName);
    System.out.println("1. Show balance");
    System.out.println("2. Deposit money");
    System.out.println("3. Withdraw money");
    System.out.println("4. Print account info");
    System.out.println("5. Send money");

    System.out.println();

while(command != -1){


    System.out.println("Input command: ");

    command = scan.nextInt();
    double deposit = 0;
    double withdrawal = 0;



    switch (command){

        case 1:
            System.out.println("Balance: " + current.balance);
            break;

        case 2:

            System.out.println("Deposit amount: ");
            deposit = scan.nextDouble();
            current.deposit(deposit);
            System.out.println("Done!");
            break;

        case 3:

            System.out.println("Withdrawal amount: ");
            withdrawal = scan.nextDouble();
            current.withdraw(withdrawal);
            System.out.println("Done!");
            break;

        case 4:

            current.printAccount();
            break;

        case 5:

            System.out.println("Amount: ");
            double n = scan.nextDouble();
            if(current.balance < n){
                System.out.println("Insufficient funds");
                break;
            } else{

                scan.nextLine();
                System.out.println("IBAN: ");
                String s = scan.next();
                current.balance -= n;
                String senderName = sendMoney(n, s, arr, current.fullName);
                current.transactionLog+="\nSent " + n + " to " + senderName;
                System.out.println("Success");
                break;
            }


        case -1:

            command = -1;
            break;

        default:
            System.out.println("Invalid Command");
            break;

    }


}

command = 0;

}

scan.close();

}

public static bankAccount findAccount(int codeInput, bankAccount [] arr){

for(int k = 0; k < arr.length; k++){

  if(codeInput == arr[k].passcode){

      return arr[k];

  }


}
bankAccount current = new bankAccount("",0);
return current;

}

public static String sendMoney(double amount, String IBAN, bankAccount [] arr, String sender){

        int c;
    for(c = 0; c < arr.length; c++){

        if(IBAN.equals(arr[c].IBAN)){

            arr[c].balance+=amount;
            arr[c].transactionLog+="\nRecieved " + amount + " from " + sender;
            return arr[c].fullName;


        }


    }

    return arr[c].fullName;

    }

    }

class bankAccount{

    String fullName = "";
    double balance = 0.00;
    int passcode = 0;
    String IBAN = "abcd";
    String transactionLog = "";

    public bankAccount(String fullName, int passcode){

     this.fullName = fullName;
     this.passcode = passcode;
    }

    public void deposit(double deposit){

        this.balance += deposit;
        this.transactionLog += "Credit " + deposit +"\n";
    }

    public void withdraw(double withdrawalAmount){

        if(withdrawalAmount > this.balance){

            System.out.println("Insufficient Funds");

        } else{

            this.balance -= withdrawalAmount;
            this.transactionLog += "Debit " + withdrawalAmount +"\n";

        }

    }





public void printAccount(){

    System.out.println("Name: " + this.fullName);
    System.out.println("Balance: $" + this.balance);
    System.out.println("IBAN: " + this.IBAN);
    System.out.println("-----Transactions Log-----");
    System.out.println(transactionLog);
    System.out.println("-----End of Transactions Log-----");
    System.out.println();
}

}

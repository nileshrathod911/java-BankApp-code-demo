package challenge44;

import java.util.Scanner;

 class bankUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Bank Application");

        System.out.print("Enter Account Holder Name : ");
        String name= sc.nextLine();

        System.out.print("Enter Account Number : ");
        long accountNumber= sc.nextLong();

        System.out.print("Enter initial Deposit : ");
        double initialDeposit= sc.nextDouble();

        BankAccount account=new BankAccount(name,accountNumber,initialDeposit);

        while (true){
            System.out.println("\n=== Banking Menu ===");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice= sc.nextInt();

            switch (choice){
                case 1:{
                    account.displayAccountDetails();
                    break;
                }
                case 2:{
                    System.out.print("Enter amount to deposit : ");
                    double depositAmount= sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                }
                case 3:{
                    System.out.print("Enter amount to withdraw : ");
                    double withdrawAmount= sc.nextDouble();
                    account.withdrawal(withdrawAmount);
                    break;
                }
                case 4:{
                    System.out.println("Current balance : "+account.getAccountBalance());
                    break;
                }
                case 5:{
                    System.out.println("Thank you for the using bank application.");
                    sc.close();
                    return;
                }
                default:{
                    System.out.println("Invalid choice!.please try again.");
                }
            }
        }

    }
}

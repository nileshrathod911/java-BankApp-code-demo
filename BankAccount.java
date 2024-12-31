package challenge44;

 class BankAccount {
     private String accountHolderName;
     private long accountNumber;
     private double accountBalance;

     public BankAccount(String accountHolderName,long accountNumber,double initiaDeposite){
         this.accountHolderName=accountHolderName;
         this.accountNumber=accountNumber;
         if(accountBalance>0){
             this.accountBalance=initiaDeposite;
         }else {
             System.out.println("initialDeposit must be positive!");
             accountBalance=0;
         }
     }

     public String getAccountHolderName(){
         return accountHolderName;
     }

     public Long getAccountNumber(){
         return accountNumber;
     }

     public double getAccountBalance() {
         return accountBalance;
     }

     public void deposit(double amount){
         if (amount>0){
             accountBalance+=amount;
             System.out.println("Deposit : "+amount);
         }else {
             System.out.println("Deposit amount must be positive!");
         }
     }

     public void withdrawal(double amount){
         if (amount>0 && amount<=accountBalance){
             accountBalance-=amount;
             System.out.println("Withdraw : "+amount);
         } else if (amount>accountBalance) {
             System.out.println("insufficient balance. Withdraw failed!");
         }else {
             System.out.println("Withdraw amount must be positive.");
         }
     }

     public void displayAccountDetails(){
         System.out.println("Holder Name : "+accountHolderName);
         System.out.println("Account Number : "+accountNumber);
         System.out.println("Current Balance : "+accountBalance);
     }

 }

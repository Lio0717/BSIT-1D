import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0; 
        int option;
        double amount;
        int correctPin = 1234;
        int pin;

        do{
            System.out.println("Enter your PIN: ");
            pin = sc.nextInt();
        if(pin != correctPin){
            System.out.println("Invalid Pin. Please Try again! ");
        }    
        }while (pin != correctPin);
        
        do {
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

       
            if (option == 1) {
                
                System.out.print("Enter amount to deposit: ");
                 amount = sc.nextDouble();
                if (amount >= 0) {
                    balance += amount;
                    System.out.println("Successfully deposited P" + amount);
                } else {
                    System.out.println("Invalid amount, please enter a positive value.");
                }
            } else if (option == 2) {
               
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextDouble();
                if (amount >= 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Successfully withdrew P" + amount);
                } else if (amount > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    System.out.println("Invalid amount, please enter a positive value.");
                }
            } else if (option == 3) {
                
                System.out.println("Your current balance is P" + balance);
            } else if (option == 4) {
                System.out.println("Thank you for using Simple Bank. Goodbye!");
            } else {
                System.out.println("Invalid option, please try again.");
            }

            System.out.println(); 
        } while (option != 4); 

    
    }
}


    
    


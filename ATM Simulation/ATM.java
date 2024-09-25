public class ATM{


    private int balance;
    private int pin;



    public ATM( int balance, int  pin){
         balance = this.balance ;
           pin = this.pin;

    }

    public void displayMenu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Change Pin");
        System.out.println("5. Exit");
    }

    public void deposit(int amount){
        balance += amount;

    }


    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;

    }

    public int getBalance(){
        return balance;
    }


    public boolean validatePin(int pin){
        return this.pin == pin;
    }


    public void changePin(int newPin){
        pin = newPin;
        System.out.println("Pin Successfully Changed");

    }
    public static void main(String[] args) {
        ATM atm = new ATM(1500, 1596);
        atm.displayMenu();
        System.out.print("Enter the pin: ");
        int pin = Integer.parseInt(System.console().readLine());
        if(atm.validatePin(pin)){
            int option  = 0;
            while(option != 5 ){
                atm.displayMenu();
                option =  Integer.parseInt(System.console().readLine());
                switch(option){
                    case 1:
                        System.out.println("Balance:" + atm.getBalance());
                        break;

                    case 2:
                        System.out.println("Enter Amount:");
                        int amount = Integer.parseInt(System.console().readLine());
                        atm.deposit(amount);
                        break;

                    case 3:
                        System.out.println("Enter Amount:");
                        amount = Integer.parseInt(System.console().readLine());
                        atm.withdraw(amount);
                        break;

                    case 4:
                        System.out.println("Enter NewPin:");
                       int newPin = Integer.parseInt(System.console().readLine());
                        atm.changePin(newPin);
                        break;

                    case 5:
                        System.out.println("Thank you for Visiting..!!");
                        break;

                    default:
                       break;
                }
            }
        }
        else{
            System.out.println("Please provide Correct Pin");
        }

    }
}


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
                        
                        break;

                    case 2:
                        
                        break;

                    case 3:
                        
                        break;

                    case 4:
                        
                        break;

                    case 5:
                        
                        break;

                    default:
                       break;
                }
            }
        }

    }
}
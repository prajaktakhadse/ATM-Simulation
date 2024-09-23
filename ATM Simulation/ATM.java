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
        atm.deposit(1000);
    }
}
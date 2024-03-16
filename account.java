public class account{
    int accNo;
    String name;
    float amount;

    void insert(int a,String n, float amt){
        accNo=a;
        name=n;
        amount=amt;
    }

    void deposit( float amt){
        amount= amount+amt;
        System.out.println(amt + "deposited");
    }

    void withdraw( float amt){
        if(amount < amt){
            System.out.println("Insuffiecient Funds");
        }
        else{
            amount= amount-amt;
        System.out.println(amt + "withdrawn");
        }
        
    }
    void  balance(){
        System.out.println("Balance is " + amount);
    }
    void  displayStatus(){
        System.out.println(accNo+ " " + name + "  " + amount);
}
public static void main(String[] args) {
    account acc1 = new account();
    acc1.insert(777, "mike", 10000);
    acc1.displayStatus();
    acc1.balance();
}
}
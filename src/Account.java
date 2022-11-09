import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated = LocalDate.now();

    public Account(){}

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId(){return id;}
    public void setId(int newId){this.id = newId;}

    public double getBalance(){return balance;}
    public void setBalance(double newBalance){balance = newBalance;}

    public double getAnnualInterestRate(){return annualInterestRate;}
    public void setAnnualInterestRate(double anInt){annualInterestRate = anInt;}

    public LocalDate getDateCreated(){return dateCreated;}

    public double getMonthlyInterest(){return (annualInterestRate/100) * balance;}

    public double getMonthlyInterestRate(){return annualInterestRate;}

    public void withdraw(double amount){
        if (balance > amount)
            balance -= amount;
        else
            System.out.println("not enough balance ...");
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void printInfo(){
        System.out.println("ID is "+ id);
        System.out.println("Balance is "+ balance);
        System.out.println("Annoual Interest Rate :" + annualInterestRate);
        System.out.println("Balance is: "+balance);
        System.out.println("Created on "+ dateCreated.toString());
    }
}

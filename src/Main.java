public class Main {
    public static void main(String[] args)
    {
    int numMonths = 2;
    double ccBalance = 5000.00;
    double interestRate = .17;
    System.out.println("Your original ballance was " + ccBalance + " dollars.");;
    for(int i = 1; i <= numMonths; i++)
    {
        double interest = ccBalance * interestRate;
        interest = Math.round(interest * 100) / 100.00;
        ccBalance = ccBalance + interest;
        System.out.println("After " + i + " months your ballance is " + ccBalance + " dollars.");
    }
    }
}
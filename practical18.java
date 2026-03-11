class practical18 {
String accountholdername;
double balance;

static double interestRate=5.0;

void assignvalues(String name, double bal)
{
accountholdername = name;
balance = bal;
}

double calculateinterest () {
return (balance*interestRate)/100;
}
static void updateinterestRate (double newrate)
{
interestRate = newrate;
System.out.println("Updaated interest rate"+ interestRate + "%");
}
void display() {
double interest = calculateinterest();
System.out.println("Account Holder:"+ accountholdername);
System.out.println("Balance"+ balance);
System.out.println("Interest Rate:"+ interestRate+"%");
System.out.println("Interest earned"+ calculateinterest ());
}

public static void main  (String args[])
{
practical18 p1 = new practical18();
practical18 p2 = new practical18();

p1.assignvalues("Jay",1000);
p2.assignvalues("ungotheble shivank the premium fastest bowler the mankind had ever seen since the human race started,",2000);

System.out.println("After rate change");
p1.display();
p2.display();
}
}
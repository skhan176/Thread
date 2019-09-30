
public class Tester{
	private double balance;
	private String accountnumber;
	
	public Tester(String accountnumber,double intitialBalance) {
		this.accountnumber=accountnumber;
		this.balance=intitialBalance;
		
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposit:"+balance);
		
	}
	public void witdraw(double amount) {
		balance-=amount;
		System.out.println("witdraw:"+balance);
		
	}
	}
  public class Main  {
	
	
	public static void main(String[] args) throws InterruptedException {
		final Tester account=new Tester("12345-678",1000.00);
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				
				account.deposit(300.0);
				account.witdraw(100.00);
				
			}
			
		
		});
		t1.start();
		t1.join();
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				
				account.deposit(203.75);
				account.witdraw(50);
				
			}
			
		});
		t2.start();
		t2.join();
		
	}
}
	
		
		

	
			
	
	
	
	
	
	
		
	

	
		
		
	
	
	
	
	
	
		
		
		
	
	

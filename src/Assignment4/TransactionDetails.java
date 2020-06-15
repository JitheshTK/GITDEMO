package Assignment4;

public class TransactionDetails { 
		
				public static void main(String[] args) { 
					CreditCardPayment a = new CreditCardPayment(10.50, "Arjun","09/26", "************1234"); 
					CashPayment y = new CashPayment(35.00); 

					CreditCardPayment b = new CreditCardPayment(9.75, "Rahul","07/24","************6789"); 
					CashPayment z = new CashPayment(40.25); 
					a.paymentDetails(); 
					y.paymentDetails(); 
					b.paymentDetails(); 
					z.paymentDetails(); 
				} 


} 
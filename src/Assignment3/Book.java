/*Write a program to create a class Book with the following data members: isbn, title and price. Inherit the class Book to two derived classes : Magazine and Novel with the following data members:  
Magazine: type  
Novel : author  
Populate the details using constructors.  
Create a magazine and Novel and display the details. */

package Assignment3;

class Book { 
				int isbn; 
				String title; 
				double price; 

public static void main(String[] args) { 
  
				Magazine magz=new Magazine("consumer"); 
				magz.display(5556663,"Mothercare",569); 
				Novel nov=new Novel("Leo Tolstoy"); 
				nov.display(6565123,"Anna Karenina",999); 
				} 

} 

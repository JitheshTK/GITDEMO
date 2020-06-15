/*Write a program to create a class Book with the following  
- attributes: -isbn, title, author, price  
- methods :  
i. Initialize the data members through parameterized constructor  
ii. displaydeta ils() to display the details of the book  
iii. discountedprice() : pass the discount percent, calculate the discount on price and find the amount to be paid after discount  
- task :  
Create an object book, initialize the book and display the details along with the discounted price 
 */
package Assignment1;

public class Book {
					String isbn,title,author; 
					double price ; 
					Book(String isbn,String title,String author,double price) 
					{ 
						this.isbn=isbn; 
						this.title=title; 
						this.author=author; 
						this.price=price; 
					} 

	    //Display the details of the book 
					void displaydetails()  
					{ 
						System.out.println("isbn="+isbn+"\nTitle="+title+"\nAuthor= "+author+"\nPrice="+price); 
					} 

	     //Calculate the discount on price and find the amount to be paid after discount  
					void discountedprice(int discountPercent)  
					{ 
						double discountAmount=price*discountPercent/100; 
						System.out.println("Amount paid after discount= "+(price-discountAmount)); 
					} 
					public static void main(String[] args)  

					{ 

					        Book obj=new Book("388053101-3","Core Java","Jithesh",350); 

					        obj.displaydetails(); 

					        obj.discountedprice(10); 

					 } 

					 } 
				
				

	     

	       

	    
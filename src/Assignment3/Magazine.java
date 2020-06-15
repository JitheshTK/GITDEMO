package Assignment3;

class Magazine extends Book{ 
				String type; 
				
				Magazine(String type){ 
						System.out.println("Type of Magazine = "+type); 
						} 

				void display(int isbn,String title,double price)  { 
					System.out.println("\nMagazine details"); 
					System.out.println("isbn of Magazine= "+isbn); 
					System.out.println("Title of Magazine = "+title);
					System.out.println("Price of Magazine = "+price); 
					} 

} 
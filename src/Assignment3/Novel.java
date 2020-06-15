package Assignment3;

class Novel extends Book{ 

    			String author; 

    			Novel(String author){ 
    				System.out.println("\n\nAuthor= "+author); 
    				} 
    			void display(int isbn,String title,double price)  { 
    				System.out.println("\nNovel details:"); 
    				System.out.println("isbn of Magazine= "+isbn); 
    				System.out.println("Title of Magazine = "+title); 
    				System.out.println("Price of Magazine = "+price); 
    			} 

} 
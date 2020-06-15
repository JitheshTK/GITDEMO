 /* Create a method named toString that returns the text field and also include a method to set this value. 
Next, define a class for Email that is derived from Document and includes member variables for the sender, recipient, and title of an email message.
Implement appropriate accessor and mutator methods. 
[An accessor is a member function that accesses the contents of an object but does not modify that object; eg: int getX(return x;)A mutator is a member function that can modify an object void setX(int x){this.x=x;} ]The body of the email message should be stored in the inherited variable text. Redefine the toString method to concatenate all text fields. 
*/
package Assignment2;

public class Email extends Document { 
		private String sender; 
		private String recipient; 
		private String title; 

    public Email(String textDoc, String sendertext, String recipienttext, String titletext) { 
    		super(textDoc); 
    		sender = sendertext; 
    		recipient = recipienttext; 
    		title = titletext;     		
    		} 

    public String getSender() { 
    	    return sender; 
    		} 

    public String getRecipient() { 
    		return recipient; 
    		} 

    public String getTitle() { 
    		return title; 
    		} 
    public String gettext(){ 
    		return super.toString(); 
    		} 

    public void setSender(String newSendertext){ 
    	    sender = newSendertext; 
      		} 
    
    public void setRecipient(String newRectext){ 
    		recipient = newRectext; 
    		} 

    public void setTitle(String newTitletext) { 
    		title = newTitletext; 
    		} 

    public String toString() { 
    		return "\nFrom: " + sender + "\nTo: " + recipient + "\n" + title + "\n\n" + super.toString(); 
    		} 

    public static void main(String[] args) { 

            String textcontent1 = "core java assignment" ; 
            String textcontent2 = "inherited variable text"; 

    Document document1 = new Email(textcontent1, "ABC", "DEF", "ALPHABETS"); 
    Document document2 = new Email(textcontent2, "APPLE", "ORANGE", "FRUITES"); 
    
    System.out.println(document1.toString()); 
    System.out.println(document2.toString()); 
    
    } 


} 

import java.util.Scanner; // import the Scanner class 

class hello2 {
  public static void main(String[] args) {
    
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
	Scanner myObj = new Scanner(System.in);
    String userName;
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}

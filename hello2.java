
import java.util.Scanner; 

class hello2 {
  public static void main(String[] args) {
    
    
  
    System.out.println("Enter username"); 
	Scanner myObj = new Scanner(System.in);
    String userName;
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }
}

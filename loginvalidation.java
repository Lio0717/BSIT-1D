import java.util.Scanner;
public class loginvalidation{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int attempt = 0;
        
        while(attempt <5){
        	System.out.println("Enter ur Username: ");
            String username = sc.nextLine();
            System.out.println("Enter ur Password: ");
            String password = sc.nextLine();
            
            String status = loginValidator(username, password);
            if(status.equals("success")){
            	System.out.println("Login Successfully");
                break;
            }else if(status.equals("failed")){
                System.out.println("Login Failed. Please try again");
				attempt++; 
                System.out.println("Attempts " + attempt);
            }
        }
        if (attempt == 5){
        	System.out.println("You've reached 5 attempts. Please try again later");
            sc.close();
        }
    }
    
    private static String loginValidator(String username, String password){
    String defaultUsername = "Hotdog";
    String defaultPassword = "1234";
    if(username.equals(defaultUsername) && password.equals(defaultPassword)){
    	return "success";
    }else{
    	return "failed";
    }
    
}
}
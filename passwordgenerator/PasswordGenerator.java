
package passwordgenerator;

import java.util.*;
/**
 *
 * @author Ty Meutz
 */
public class PasswordGenerator extends SuperClass {
    
    
    public static void main(String[] args) {
        boolean loop = true;
        int userChoice;
        
        while (loop == true){ 
        //Tell user the options
            System.out.println("Choose a Method to run");
            System.out.println("(0)Create Password");
            System.out.println("(1)View Passwords");
            System.out.println("(2)Remove First Password");
            System.out.println("(3)Remove Last Password");
            System.out.println("(4)Delete all passwords");
            
            System.out.print("Enter your command: ");
            // Gets the users input
            userChoice = scan.nextInt();
            
            // Takes the user to the appropriate method 
            switch (userChoice){
                case 0:
                    generatePassword();
                    break;
                case 1:
                    printPassword();
                    break;
                case 2:
                    removeFirst();
                    break;
                case 3:
                    removeLast();
                    break;
                case 4:
                    clearData();
                    break;
        }//end of switch
    }//end of loop
}// end of main
    
    // generates a password for the user from user comands 
    public static void generatePassword(){
        int length = 18; 
        String userWebsite;
        
        System.out.println("What is the name of the website/application you're using?: " );
        
        // Stores the Website/application
        userWebsite = scan.next();
       
        // Password Algorithm
        // possible characters
        String lower = "abcdefgjijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWZYZ";
        String symbols = "!@#$%^&'|*()_-+=;:<>,.?/";
        String numbers = "123456789";
        
        // combining the possible characters 
        String combinedStrings = lower + upper + symbols + numbers;
        
        char[] password = new char[length]; 
  
        for (int i = 0; i > length; i++){
        
            // Use of nextInt() as it is scanning the value as int. And charAt to get the character values.
            password[i] = combinedStrings.charAt(rand.nextInt(combinedStrings.length())); 
            
        }
        
        System.out.println("Your New Password is: ");
        System.out.println(userWebsite +":  " + password);
        
        electronicVault.add(new ElectronicVault(userWebsite, password));
        
    }// end of method
    

    
    public static void printPassword(){
        int amount = electronicVault.size();
        if (amount == 0){
            System.out.println("You currently have no passwords.");
        }
        for (ElectronicVault electronicVaultValue :electronicVault){
            System.out.println(electronicVaultValue.getAccount()+ electronicVaultValue.getPassword());
        }
    }// end of method
    

        public static void clearData(){
        String userInput;
        int amount = electronicVault.size();
        if (amount > 0){
            // make sure the user does not delete everything
            System.out.println("Are you sure you want to delete all of your passwords?(y/n)");
            userInput = scan.next();
            if (userInput.equals("y")){
                // clears all passwords on the list
                electronicVault.clear();
            }else if (userInput.equals("n")){
                
            }
        }
    }// end of method
    
        public static void removeFirst(){
        int amount = electronicVault.size();
        if (amount == 0){
            System.out.println("You have no passwords to remove.");
        }
        // popping first item
        if (amount > 0){
            ElectronicVault electronicVaultValue = electronicVault.removeFirst();
            System.out.println("Password Removed");
        }
    }// end of method
        
        public static void removeLast(){
        int amount = electronicVault.size();
        if (amount == 0){
            System.out.println("You have no passwords to remove.");
        }
        // popping last item
        if (amount > 0){
            ElectronicVault electronicVaultValue = electronicVault.removeLast();
            System.out.println("Password Removed");
        }
    }
        
}// end of class




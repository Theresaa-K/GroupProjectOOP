package ValidInformation;

public class Registration {private String email;
    private String userName;
    private String passWord; //All three are sensitive info

    //Create a protected constructor
    protected Registration (String email,String userName, String passWord){
        this.email=email; //Valid email Yahoo only
        this.userName=userName;//Cannot be empty and must be length larger than 6
        this.passWord=passWord; /* Password cannot be empty and should be length
larger than 6 characters. Password cannot contain userName. */

// Created if statement to check if email ends with "Yahoo"
        if (email.endsWith("@yahoo.com")){
            System.out.println("Email: "+ email+ " is valid");
        }else System.out.println("Invalid email, please use a valid email");

//create if statement to make sure username is longer than 6 characters
        if (userName.length()>=6){
            System.out.println("Username: "+userName +" is a valid input");
        } else System.out.println("Please enter a valid username of 6 characters or more");


        if (passWord.contains(userName)){
            System.out.println("Password must not contain username, try again");
        }else if(passWord.length()>=6){
            System.out.println("Password is valid");
        }
        else System.out.println("Invalid password");

    }

//use if statement to check if email contains yahoo
    //check if username and password is empty, if so "Invalid entry"

    public static void main(String[] args) {
        Registration registration = new Registration("tkenny@yahoo.com","tkenny1","1234567");
    }
}

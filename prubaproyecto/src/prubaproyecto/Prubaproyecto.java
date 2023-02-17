
package prubaproyecto;

import java.util.regex.Pattern;


public class Prubaproyecto {

    
    public static void main(String[] args) {
        
    String passwordhere ="lolol";
    Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
    Pattern lowerCasePatten = Pattern.compile("[a-z ]");
    Pattern digitCasePatten = Pattern.compile("[0-9 ]");
    
    if (passwordhere.length() <= 8) {
        System.out.println("Password lenght must have alleast 8 character !!");
    }
    if (!specailCharPatten.matcher(contraGUI.getText()).find()) {
        System.out.println("Password must have atleast one specail character !!");
    }
    if (!UpperCasePatten.matcher(contraGUI.getText()).find()) {
        System.out.println("Password must have atleast one uppercase character !!");
    }
    if (!lowerCasePatten.matcher(contraGUI.getText()).find()) {
        System.out.println("Password must have atleast one lowercase character !!");
    }
    if (!digitCasePatten.matcher(contraGUI.getText()).find()) {
        System.out.println("Password must have atleast one digit character !!");
    }

  }
    

}
        


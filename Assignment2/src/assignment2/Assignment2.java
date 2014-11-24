/*
 * Charles O'Neal
 * Assignment 2
 * This is the main method that calls the Admin Control Panel for Mini Twitter.
 */
package assignment2;

/**
 *
 * @author Charles
 */
public class Assignment2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      AdminControlPanel admin = AdminControlPanel.getInstance();
      admin.setVisible(true);
   }
   
}

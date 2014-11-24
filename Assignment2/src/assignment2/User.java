/*
 * Charles O'Neal
 * Assignment 2
 * This is the User class that contains all of the information for the user
 * It is also the Observer part of the OBSERVER PATTERN.
 */
package assignment2;

/**
 *
 * @author Charles
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
   
   private String userName;
   private List<Post> myFeed;
   private List<String> followed;
   
   public User(String userName) {
      this.userName = userName;
      followed = new ArrayList<>();
      myFeed = new ArrayList<>();
   }

   @Override
   public void update(Observable o, Object arg) {
      if(arg instanceof Post) {
	 myFeed = ((Info)o).getUserPost(followed);
      
   }
   }
   
}

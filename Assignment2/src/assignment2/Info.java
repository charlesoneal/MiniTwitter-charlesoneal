/*
 * Charles O'Neal
 * Assignment 2
 * This class uses the SINGLETON PATTERN and contains all of the information
 * for the feed, users, ang groups.  It is also the Observable Part of the 
 * OBSERVER PATTERN.
 */
package assignment2;

/**
 *
 * @author Charles
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Info extends Observable implements Analytics {
   
   private List<Post> feed;
   private List<String> users;
   private List<Group> groupList;
   private static Info instance;
   
   private Info() {
      feed = new ArrayList<>();
      users = new ArrayList<>();
      groupList = new ArrayList<>();
   }
   
   public static Info getInstance() {
      if (instance == null) {
	 instance = new Info();
      }
      return instance;
   }
   
   
   public void addPost(Post post) {
      feed.add(post);
      notifyObservers();
   }
   
   public void addGroup(Group group) {
      groupList.add(group);
      notifyObservers();
   }
   
   public List<Post> getUserPost(List<String> followed ) {
      List<Post> followedFeed = new ArrayList<>();
      
      for(int i = 0; i < feed.size(); i++) {
	 for(int j = 0; j < followed.size(); j++) {
	    if(followed.get(j).equals(feed.get(i).getUserName())) {
	       followedFeed.add(feed.get(i));
	    }
	 }
      }
      
      return followedFeed;
      
   }
   
   @Override
   public void accept(Visitor visitor) {
      
      visitor.atUsers(this.users);
      visitor.atFeed(this.feed);
      visitor.atGroups(this.groupList);
      
   }
   
   
   
}



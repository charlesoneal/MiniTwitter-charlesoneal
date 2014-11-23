/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Charles
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Info extends Observable {
   
   private List<Post> feed = new ArrayList<>();
   private List<String> users = new ArrayList<>();
   private List<Group> groupList = new ArrayList<>();
   
   
   public void addPost(Post post) {
      feed.add(post);
      notifyObservers();
   }
   
   public void addGroup(Group group) {
      groupList.add(group);
      notifyObservers();
   }
   
   
   
}



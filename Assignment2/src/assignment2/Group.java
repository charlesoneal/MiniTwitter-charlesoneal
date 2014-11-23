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

public class Group extends Observable {
   
   private String groupName;
   private List<String> groupMembers = new ArrayList<String>();
   
   public Group(String groupName) {
      this.groupName = groupName;
   }
   
   public void addGroupMember(String groupMember) {
      groupMembers.add(groupMember);
      notifyObservers();
   }
   
   public List<String> getGroup() {
      return groupMembers;
   }
   
   public String getGroupName() {
      return groupName;
   }
   
   
   
}

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

public class Group  {
   
   private String groupName;
   private List<String> groupMembers;
   private List<Group> innerGroups;
   
   public Group(String groupName) {
      this.groupName = groupName;
      groupMembers = new ArrayList<>();
      innerGroups = new ArrayList<>();
   }
   
   public void addGroupMember(String groupMember) {
      groupMembers.add(groupMember);
      
   }
   
   public List<String> getGroup() {
      return groupMembers;
   }
   
   public String getGroupName() {
      return groupName;
   }
   
   public int getInnerGroupSize() {
     return innerGroups.size();
   }
   
   
   
}

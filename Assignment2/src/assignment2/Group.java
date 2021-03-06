/*
 * Charles O'Neal
 * Assignment 2
 * This class is the group class for groups used by Mini Twitter
 * It is also an example of the COMPOSITE PATTERN. It is an extension of
 * the AbstractGroup class.
 */
package assignment2;

/**
 *
 * @author Charles
 */

import java.util.ArrayList;
import java.util.List;


public class Group extends AbstractGroup {
   
   private String groupName;
   private List<String> groupMembers;
   private List<InnerGroup> innerGroups;
   
   public Group(String groupName) {
      this.groupName = groupName;
      groupMembers = new ArrayList<>();
      innerGroups = new ArrayList<>();
   }
   
   @Override
   public void addGroupMember(String groupMember) {
      groupMembers.add(groupMember);
      
   }
   
   @Override
   public List<String> getGroup() {
      return groupMembers;
   }
   
   @Override
   public String getGroupName() {
      return groupName;
   }
   
   public int getInnerGroupSize() {
     return innerGroups.size();
   }
   
   
   
}

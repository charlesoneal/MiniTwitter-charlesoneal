/*
 * Charles O'Neal
 * Assignment 2
 * This class is the InnerGroup class for groups used by Mini Twitter
 * It is also an example of the COMPOSITE PATTERN. It is an extension of
 * the AbstractGroup class
 */
package assignment2;

import java.util.List;

/**
 *
 * @author Charles
 */
public class InnerGroup extends AbstractGroup {
   
   private String groupName;
   private List<String> groupMembers;

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
   
}

/*
 * Charles O'Neal
 * Assignment 2
 * This is the visitor interface for the VISITOR PATTERN.
 */
package assignment2;

import java.util.List;

/**
 *
 * @author Charles
 */
public interface Visitor {
   
   public void atFeed(List<Post> feed);
   public void atGroups(List<Group> groupList);
   public void atUsers(List<String> users);
   
   
}

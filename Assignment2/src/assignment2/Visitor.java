/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

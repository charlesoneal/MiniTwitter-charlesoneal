/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Charles
 */
public abstract class AbstractGroup {
   
   private String groupName;
   private List<String> groupMembers;
   
   public abstract void addGroupMember(String groupMember);
   public abstract List<String> getGroup();
   public abstract String getGroupName();
   
   
}

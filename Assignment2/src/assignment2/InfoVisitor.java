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
public class InfoVisitor implements Visitor{
   
   private final List<String> positiveWords = new ArrayList(){{
      add("wonderful");
      add("great");
      add("awesome");
      add("fantastic");
      add("amazing");
      add("good");
      add("excellent");
      add("beautiful");
      add("spectacular");
      add("special");
      add("lovely");
      add("incredible");
   
   }};
   private int totalUsers;
   private int totalGroups;
   private int totalTweets;
   private double percentPositive;
   private double wordCount;
   private double positiveWordsCount;

   @Override
   public void atFeed(List<Post> feed) {
      totalTweets = feed.size();
      wordCount = 0.0;
      positiveWordsCount = 0.0;
      percentPositive = 0.0;
      
      for(Post p: feed) {
	 wordCount += p.getTweet().split("\\s+").length;
	 for(int i = 0; i < positiveWords.size(); i++) {
	    String input = p.getTweet();
	    int index = input.indexOf(positiveWords.get(i));
	    double count = 0.0;
	    while(index != -1) {
	       count++;
	       input = input.substring(index + 1);
	       index = input.indexOf(positiveWords.get(i));
	       
	    }
	    positiveWordsCount += count;
	 }
      }
      
      percentPositive = wordCount/positiveWordsCount;
      
      
   }

   @Override
   public void atGroups(List<Group> groupList) {
      totalGroups = 0;
      
      for(Group g: groupList) {
	 totalGroups += g.getInnerGroupSize();
      }
      totalGroups += groupList.size();
      
      
      
   }

   @Override
   public void atUsers(List<String> users) {
      totalUsers = users.size();
   }
   
   public double getPercentPositive() {
      return percentPositive;
   }
   
   public int getTotalUsers() {
      return totalUsers;
   }
   
   public int getTotalGroups() {
      return totalGroups;
   }
   
   public int getTotalTweets() {
      return totalTweets;
   }
  
}

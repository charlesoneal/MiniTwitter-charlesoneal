/*
 * Charles O'Neal
 * Assignment 2
 * This is the Post clas that handles the information of each tweet
 * 
 */
package assignment2;

/**
 *
 * @author Charles
 */
public class Post {
   private String user;
   private String tweet;
   
   public Post(String user, String tweet) {
      this.user = user;
      this.tweet = tweet;
   }
   
   public Post getPost() {
      return this;
   }
   
   public String getUserName() {
      return this.user;
   }
   
   public String getTweet() {
      return this.tweet;
   }
   
   
   
}

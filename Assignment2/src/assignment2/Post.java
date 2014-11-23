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
   
   
   
}

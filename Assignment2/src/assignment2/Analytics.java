/*
 * Charles O'Neal
 * Assignment 2
 * This interface is a part of the VISITOR PATTERN.  It contains the accept
 * method for the element that accepts the visitor.
 * 
 */
package assignment2;

/**
 *
 * @author Charles
 */
public interface Analytics {
   public void accept(Visitor visitor);
}

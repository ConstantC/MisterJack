
import java.util.*;


/**
 * Class Detectives
 */
public class Detectives extends Player {

  //
  // Fields
  //

  private String name;
  private int position;
  
  //
  // Constructors
  //
  public Detectives () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of position
   * @param newVar the new value of position
   */
  public void setPosition (int newVar) {
    position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  public int getPosition () {
    return position;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getName()
  {
    return name;
  }


  /**
   */
  public void setPosition()
  {
  }


  /**
   * @return       int
   */
  public int getPosition()
  {
  }


}

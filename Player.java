
import java.util.*;


/**
 * Class Player
 */
public class Player {

  //
  // Fields
  //

  private String role;
  private String name;
  private int hourglasses;
  private Personnage[] alibis;
  
  //
  // Constructors
  //
  public Player () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of role
   * @param newVar the new value of role
   */
  public void setRole (String newVar) {
    role = newVar;
  }

  /**
   * Get the value of role
   * @return the value of role
   */
  public String getRole () {
    return role;
  }

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
   * Set the value of hourglasses
   * @param newVar the new value of hourglasses
   */
  public void setHourglasses (int newVar) {
    hourglasses = newVar;
  }

  /**
   * Get the value of hourglasses
   * @return the value of hourglasses
   */
  public int getHourglasses () {
    return hourglasses;
  }

  /**
   * Set the value of alibis
   * @param newVar the new value of alibis
   */
  public void setAlibis (Personnage[] newVar) {
    alibis = newVar;
  }

  /**
   * Get the value of alibis
   * @return the value of alibis
   */
  public Personnage[] getAlibis () {
    return alibis;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getRole()
  {
    return role;
  }


  /**
   * @return       String
   */
  public String getName()
  {
    return name;
  }


  /**
   */
  public void setHourglasses()
  {
  }


  /**
   */
  public void setAlibis()
  {
  }


  /**
   * @return       int
   */
  public int getHourglasses()
  {
  }


  /**
   * @return       Personnage[]
   */
  public Personnage[] getAlibis()
  {
  }


}


import java.util.*;


/**
 * Class Jeton
 */
abstract public class Jeton {

  //
  // Fields
  //

  protected String recto;
  protected String verso;
  
  //
  // Constructors
  //
  public Jeton () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of recto
   * @param newVar the new value of recto
   */
  public void setRecto (String newVar) {
    recto = newVar;
  }

  /**
   * Get the value of recto
   * @return the value of recto
   */
  public String getRecto () {
    return recto;
  }

  /**
   * Set the value of verso
   * @param newVar the new value of verso
   */
  public void setVerso (String newVar) {
    verso = newVar;
  }

  /**
   * Get the value of verso
   * @return the value of verso
   */
  public String getVerso () {
    return verso;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getRecto()
  {
  }


  /**
   * @return       String
   */
  public String getVerso()
  {
  }


  /**
   */
  public void setRecto()
  {
  }


  /**
   */
  public void setVerso()
  {
  }


}

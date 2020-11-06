
import java.util.*;


/**
 * Class Quartier
 */
public class Quartier {

  //
  // Fields
  //
  /**

   * Suspect
   * getColor (personnages)   */

  private String suspect;  /**

   * 0 pas de mur
   * 1 mur en haut
   * 2 mur à droite
   * 3 mur à gauche
   * 4 mur en bas   */

  private int mur;
  
  //
  // Constructors
  //
  public Quartier () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of suspect
   * Suspect
   * getColor (personnages)
   * @param newVar the new value of suspect
   */
  public void setSuspect (String newVar) {
    suspect = newVar;
  }

  /**
   * Get the value of suspect
   * Suspect
   * getColor (personnages)
   * @return the value of suspect
   */
  public String getSuspect () {
    return suspect;
  }

  /**
   * Set the value of mur
   * 0 pas de mur
   * 1 mur en haut
   * 2 mur à droite
   * 3 mur à gauche
   * 4 mur en bas
   * @param newVar the new value of mur
   */
  public void setMur (int newVar) {
    mur = newVar;
  }

  /**
   * Get the value of mur
   * 0 pas de mur
   * 1 mur en haut
   * 2 mur à droite
   * 3 mur à gauche
   * 4 mur en bas
   * @return the value of mur
   */
  public int getMur () {
    return mur;
  }

  //
  // Other methods
  //

  /**
   * @return       int
   */
  public int getMur()
  {
    return mur;
  }


  /**
   */
  public void setMur()
  {
  }


}

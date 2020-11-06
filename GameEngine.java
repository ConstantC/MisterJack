
import java.util.*;


/**
 * Class GameEngine
 */
public class GameEngine {

  //
  // Fields
  //

  private Quartier[][] District;
  private Player[] Players;
  private Player currentPlayer;
  private Personnage[] Personnages;
  private Action[] Actions;
  private Temp[] Temps;
  
  //
  // Constructors
  //
  public GameEngine () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of District
   * @param newVar the new value of District
   */
  public void setDistrict (Quartier[][] newVar) {
    District = newVar;
  }

  /**
   * Get the value of District
   * @return the value of District
   */
  public Quartier[][] getDistrict () {
    return District;
  }

  /**
   * Set the value of Players
   * @param newVar the new value of Players
   */
  public void setPlayers (Player[] newVar) {
    Players = newVar;
  }

  /**
   * Get the value of Players
   * @return the value of Players
   */
  public Player[] getPlayers () {
    return Players;
  }

  /**
   * Set the value of currentPlayer
   * @param newVar the new value of currentPlayer
   */
  public void setCurrentPlayer (Player newVar) {
    currentPlayer = newVar;
  }

  /**
   * Get the value of currentPlayer
   * @return the value of currentPlayer
   */
  public Player getCurrentPlayer () {
    return currentPlayer;
  }

  /**
   * Set the value of Personnages
   * @param newVar the new value of Personnages
   */
  public void setPersonnages (Personnage[] newVar) {
    Personnages = newVar;
  }

  /**
   * Get the value of Personnages
   * @return the value of Personnages
   */
  public Personnage[] getPersonnages () {
    return Personnages;
  }

  /**
   * Set the value of Actions
   * @param newVar the new value of Actions
   */
  public void setActions (Action[] newVar) {
    Actions = newVar;
  }

  /**
   * Get the value of Actions
   * @return the value of Actions
   */
  public Action[] getActions () {
    return Actions;
  }

  /**
   * Set the value of Temps
   * @param newVar the new value of Temps
   */
  public void setTemps (Temp[] newVar) {
    Temps = newVar;
  }

  /**
   * Get the value of Temps
   * @return the value of Temps
   */
  public Temp[] getTemps () {
    return Temps;
  }

  //
  // Other methods
  //

  /**
   */
  public void initDistrict()
  {
  }


  /**
   */
  public void initAction()
  {
  }


  /**
   */
  public void initTemp()
  {
  }


  /**
   */
  public void initPersonnage()
  {
  }


  /**
   */
  public void tossAction()
  {
  }


  /**
   */
  public void isMrJackVisible()
  {
  }


  /**
   */
  public void isMrJackWinner()
  {
  }


  /**
   */
  public void isDetectiveWinner()
  {
  }


  /**
   */
  public void play()
  {
  }


}

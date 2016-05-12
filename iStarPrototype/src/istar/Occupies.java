/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occupies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Occupies#getOccupiesPosition <em>Occupies Position</em>}</li>
 *   <li>{@link istar.Occupies#getOccupiesAgent <em>Occupies Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getOccupies()
 * @model annotation="gmf.link color='0,0,0' source='occupiesAgent' target='occupiesPosition' target.decoration='arrow' label='relationshipName' label.readOnly='true'"
 * @generated
 */
public interface Occupies extends Association
{
  /**
	 * Returns the value of the '<em><b>Occupies Position</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Position#getPositionOccupies <em>Position Occupies</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occupies Position</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupies Position</em>' reference.
	 * @see #setOccupiesPosition(Position)
	 * @see istar.IstarPackage#getOccupies_OccupiesPosition()
	 * @see istar.Position#getPositionOccupies
	 * @model opposite="positionOccupies" required="true"
	 * @generated
	 */
  Position getOccupiesPosition();

  /**
	 * Sets the value of the '{@link istar.Occupies#getOccupiesPosition <em>Occupies Position</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupies Position</em>' reference.
	 * @see #getOccupiesPosition()
	 * @generated
	 */
  void setOccupiesPosition(Position value);

  /**
	 * Returns the value of the '<em><b>Occupies Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Agent#getAgentOccupies <em>Agent Occupies</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occupies Agent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupies Agent</em>' reference.
	 * @see #setOccupiesAgent(Agent)
	 * @see istar.IstarPackage#getOccupies_OccupiesAgent()
	 * @see istar.Agent#getAgentOccupies
	 * @model opposite="agentOccupies" required="true"
	 * @generated
	 */
  Agent getOccupiesAgent();

  /**
	 * Sets the value of the '{@link istar.Occupies#getOccupiesAgent <em>Occupies Agent</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupies Agent</em>' reference.
	 * @see #getOccupiesAgent()
	 * @generated
	 */
  void setOccupiesAgent(Agent value);

} // Occupies

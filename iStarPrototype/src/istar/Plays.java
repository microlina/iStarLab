/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plays</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Plays#getPlaysRole <em>Plays Role</em>}</li>
 *   <li>{@link istar.Plays#getPlaysAgent <em>Plays Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getPlays()
 * @model annotation="gmf.link color='0,0,0' source='playsAgent' target='playsRole' target.decoration='arrow' label='relationshipName' label.readOnly='true'"
 * @generated
 */
public interface Plays extends Association
{
  /**
	 * Returns the value of the '<em><b>Plays Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Role#getRolePlays <em>Role Plays</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plays Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Plays Role</em>' reference.
	 * @see #setPlaysRole(Role)
	 * @see istar.IstarPackage#getPlays_PlaysRole()
	 * @see istar.Role#getRolePlays
	 * @model opposite="rolePlays" required="true"
	 * @generated
	 */
  Role getPlaysRole();

  /**
	 * Sets the value of the '{@link istar.Plays#getPlaysRole <em>Plays Role</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plays Role</em>' reference.
	 * @see #getPlaysRole()
	 * @generated
	 */
  void setPlaysRole(Role value);

  /**
	 * Returns the value of the '<em><b>Plays Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Agent#getAgentPlays <em>Agent Plays</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plays Agent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Plays Agent</em>' reference.
	 * @see #setPlaysAgent(Agent)
	 * @see istar.IstarPackage#getPlays_PlaysAgent()
	 * @see istar.Agent#getAgentPlays
	 * @model opposite="agentPlays" required="true"
	 * @generated
	 */
  Agent getPlaysAgent();

  /**
	 * Sets the value of the '{@link istar.Plays#getPlaysAgent <em>Plays Agent</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plays Agent</em>' reference.
	 * @see #getPlaysAgent()
	 * @generated
	 */
  void setPlaysAgent(Agent value);

} // Plays

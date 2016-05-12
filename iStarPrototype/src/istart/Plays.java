/**
 */
package istart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plays</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Plays#getPlaysRole <em>Plays Role</em>}</li>
 *   <li>{@link istart.Plays#getPlaysAgent <em>Plays Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getPlays()
 * @model annotation="gmf.link color='0,0,0' source='playsAgent' target='playsRole' target.decoration='arrow' label='relationshipName' label.readOnly='true'"
 * @generated
 */
public interface Plays extends Association
{
  /**
   * Returns the value of the '<em><b>Plays Role</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Role#getRolePlays <em>Role Plays</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plays Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plays Role</em>' reference.
   * @see #setPlaysRole(Role)
   * @see istart.IstartPackage#getPlays_PlaysRole()
   * @see istart.Role#getRolePlays
   * @model opposite="rolePlays" required="true"
   * @generated
   */
  Role getPlaysRole();

  /**
   * Sets the value of the '{@link istart.Plays#getPlaysRole <em>Plays Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plays Role</em>' reference.
   * @see #getPlaysRole()
   * @generated
   */
  void setPlaysRole(Role value);

  /**
   * Returns the value of the '<em><b>Plays Agent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Agent#getAgentPlays <em>Agent Plays</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plays Agent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plays Agent</em>' reference.
   * @see #setPlaysAgent(Agent)
   * @see istart.IstartPackage#getPlays_PlaysAgent()
   * @see istart.Agent#getAgentPlays
   * @model opposite="agentPlays" required="true"
   * @generated
   */
  Agent getPlaysAgent();

  /**
   * Sets the value of the '{@link istart.Plays#getPlaysAgent <em>Plays Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plays Agent</em>' reference.
   * @see #getPlaysAgent()
   * @generated
   */
  void setPlaysAgent(Agent value);

} // Plays

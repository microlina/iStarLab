/**
 */
package istart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.INS#getINSagent <em>IN Sagent</em>}</li>
 *   <li>{@link istart.INS#getINSsecondAgent <em>IN Ssecond Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getINS()
 * @model annotation="gmf.link color='0,0,0' source='INSagent' target='INSsecondAgent' target.decoration='arrow' label='relationshipName' label.readOnly='true' source.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface INS extends Association
{
  /**
   * Returns the value of the '<em><b>IN Sagent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Agent#getAgentINS <em>Agent INS</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IN Sagent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IN Sagent</em>' reference.
   * @see #setINSagent(Agent)
   * @see istart.IstartPackage#getINS_INSagent()
   * @see istart.Agent#getAgentINS
   * @model opposite="agentINS" required="true"
   * @generated
   */
  Agent getINSagent();

  /**
   * Sets the value of the '{@link istart.INS#getINSagent <em>IN Sagent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IN Sagent</em>' reference.
   * @see #getINSagent()
   * @generated
   */
  void setINSagent(Agent value);

  /**
   * Returns the value of the '<em><b>IN Ssecond Agent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Agent#getSecondAgentINS <em>Second Agent INS</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IN Ssecond Agent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IN Ssecond Agent</em>' reference.
   * @see #setINSsecondAgent(Agent)
   * @see istart.IstartPackage#getINS_INSsecondAgent()
   * @see istart.Agent#getSecondAgentINS
   * @model opposite="secondAgentINS" required="true"
   * @generated
   */
  Agent getINSsecondAgent();

  /**
   * Sets the value of the '{@link istart.INS#getINSsecondAgent <em>IN Ssecond Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IN Ssecond Agent</em>' reference.
   * @see #getINSsecondAgent()
   * @generated
   */
  void setINSsecondAgent(Agent value);

} // INS

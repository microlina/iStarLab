/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.INS#getINSagent <em>IN Sagent</em>}</li>
 *   <li>{@link istar.INS#getINSsecondAgent <em>IN Ssecond Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getINS()
 * @model annotation="gmf.link color='0,0,0' source='INSagent' target='INSsecondAgent' target.decoration='arrow' label='relationshipName' label.readOnly='true' source.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface INS extends Association
{
  /**
	 * Returns the value of the '<em><b>IN Sagent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Agent#getAgentINS <em>Agent INS</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IN Sagent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>IN Sagent</em>' reference.
	 * @see #setINSagent(Agent)
	 * @see istar.IstarPackage#getINS_INSagent()
	 * @see istar.Agent#getAgentINS
	 * @model opposite="agentINS" required="true"
	 * @generated
	 */
  Agent getINSagent();

  /**
	 * Sets the value of the '{@link istar.INS#getINSagent <em>IN Sagent</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IN Sagent</em>' reference.
	 * @see #getINSagent()
	 * @generated
	 */
  void setINSagent(Agent value);

  /**
	 * Returns the value of the '<em><b>IN Ssecond Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Agent#getSecondAgentINS <em>Second Agent INS</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IN Ssecond Agent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>IN Ssecond Agent</em>' reference.
	 * @see #setINSsecondAgent(Agent)
	 * @see istar.IstarPackage#getINS_INSsecondAgent()
	 * @see istar.Agent#getSecondAgentINS
	 * @model opposite="secondAgentINS" required="true"
	 * @generated
	 */
  Agent getINSsecondAgent();

  /**
	 * Sets the value of the '{@link istar.INS#getINSsecondAgent <em>IN Ssecond Agent</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IN Ssecond Agent</em>' reference.
	 * @see #getINSsecondAgent()
	 * @generated
	 */
  void setINSsecondAgent(Agent value);

} // INS

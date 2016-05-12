/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Agent#getAgentPlays <em>Agent Plays</em>}</li>
 *   <li>{@link istar.Agent#getAgentOccupies <em>Agent Occupies</em>}</li>
 *   <li>{@link istar.Agent#getAgentINS <em>Agent INS</em>}</li>
 *   <li>{@link istar.Agent#getSecondAgentINS <em>Second Agent INS</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getAgent()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Agent extends Actors
{
  /**
	 * Returns the value of the '<em><b>Agent Plays</b></em>' reference list.
	 * The list contents are of type {@link istar.Plays}.
	 * It is bidirectional and its opposite is '{@link istar.Plays#getPlaysAgent <em>Plays Agent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Plays</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Plays</em>' reference list.
	 * @see istar.IstarPackage#getAgent_AgentPlays()
	 * @see istar.Plays#getPlaysAgent
	 * @model opposite="playsAgent"
	 * @generated
	 */
  EList<Plays> getAgentPlays();

  /**
	 * Returns the value of the '<em><b>Agent Occupies</b></em>' reference list.
	 * The list contents are of type {@link istar.Occupies}.
	 * It is bidirectional and its opposite is '{@link istar.Occupies#getOccupiesAgent <em>Occupies Agent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Occupies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Occupies</em>' reference list.
	 * @see istar.IstarPackage#getAgent_AgentOccupies()
	 * @see istar.Occupies#getOccupiesAgent
	 * @model opposite="occupiesAgent"
	 * @generated
	 */
  EList<Occupies> getAgentOccupies();

  /**
	 * Returns the value of the '<em><b>Agent INS</b></em>' reference list.
	 * The list contents are of type {@link istar.INS}.
	 * It is bidirectional and its opposite is '{@link istar.INS#getINSagent <em>IN Sagent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent INS</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent INS</em>' reference list.
	 * @see istar.IstarPackage#getAgent_AgentINS()
	 * @see istar.INS#getINSagent
	 * @model opposite="INSagent"
	 * @generated
	 */
  EList<INS> getAgentINS();

  /**
	 * Returns the value of the '<em><b>Second Agent INS</b></em>' reference list.
	 * The list contents are of type {@link istar.INS}.
	 * It is bidirectional and its opposite is '{@link istar.INS#getINSsecondAgent <em>IN Ssecond Agent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Agent INS</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Agent INS</em>' reference list.
	 * @see istar.IstarPackage#getAgent_SecondAgentINS()
	 * @see istar.INS#getINSsecondAgent
	 * @model opposite="INSsecondAgent"
	 * @generated
	 */
  EList<INS> getSecondAgentINS();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()'"
	 * @generated
	 */
	Integer NEIA();

} // Agent

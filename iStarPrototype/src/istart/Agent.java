/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Agent#getAgentPlays <em>Agent Plays</em>}</li>
 *   <li>{@link istart.Agent#getAgentOccupies <em>Agent Occupies</em>}</li>
 *   <li>{@link istart.Agent#getAgentINS <em>Agent INS</em>}</li>
 *   <li>{@link istart.Agent#getSecondAgentINS <em>Second Agent INS</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getAgent()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Agent extends Actors
{
  /**
   * Returns the value of the '<em><b>Agent Plays</b></em>' reference list.
   * The list contents are of type {@link istart.Plays}.
   * It is bidirectional and its opposite is '{@link istart.Plays#getPlaysAgent <em>Plays Agent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Plays</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Plays</em>' reference list.
   * @see istart.IstartPackage#getAgent_AgentPlays()
   * @see istart.Plays#getPlaysAgent
   * @model opposite="playsAgent"
   * @generated
   */
  EList<Plays> getAgentPlays();

  /**
   * Returns the value of the '<em><b>Agent Occupies</b></em>' reference list.
   * The list contents are of type {@link istart.Occupies}.
   * It is bidirectional and its opposite is '{@link istart.Occupies#getOccupiesAgent <em>Occupies Agent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Occupies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Occupies</em>' reference list.
   * @see istart.IstartPackage#getAgent_AgentOccupies()
   * @see istart.Occupies#getOccupiesAgent
   * @model opposite="occupiesAgent"
   * @generated
   */
  EList<Occupies> getAgentOccupies();

  /**
   * Returns the value of the '<em><b>Agent INS</b></em>' reference list.
   * The list contents are of type {@link istart.INS}.
   * It is bidirectional and its opposite is '{@link istart.INS#getINSagent <em>IN Sagent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent INS</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent INS</em>' reference list.
   * @see istart.IstartPackage#getAgent_AgentINS()
   * @see istart.INS#getINSagent
   * @model opposite="INSagent"
   * @generated
   */
  EList<INS> getAgentINS();

  /**
   * Returns the value of the '<em><b>Second Agent INS</b></em>' reference list.
   * The list contents are of type {@link istart.INS}.
   * It is bidirectional and its opposite is '{@link istart.INS#getINSsecondAgent <em>IN Ssecond Agent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Agent INS</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Agent INS</em>' reference list.
   * @see istart.IstartPackage#getAgent_SecondAgentINS()
   * @see istart.INS#getINSsecondAgent
   * @model opposite="INSsecondAgent"
   * @generated
   */
  EList<INS> getSecondAgentINS();

} // Agent

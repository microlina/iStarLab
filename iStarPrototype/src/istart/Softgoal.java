/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Softgoal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Softgoal#getSoftgoalContribution <em>Softgoal Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getSoftgoal()
 * @model annotation="gmf.node label='nodeName' label.icon='false' color='206,255,153' border.color='0,0,0' size='80,40' figure='polygon' polygon.x='0 0 5 15 25 35 45 50 50 45 35 25 15 5' polygon.y='10 20 30 30 25 30 30 20 10 0 0 5 0 0'"
 * @generated
 */
public interface Softgoal extends Element
{
  /**
   * Returns the value of the '<em><b>Softgoal Contribution</b></em>' reference list.
   * The list contents are of type {@link istart.ContributionLink}.
   * It is bidirectional and its opposite is '{@link istart.ContributionLink#getContributionSoftgoal <em>Contribution Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Softgoal Contribution</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Softgoal Contribution</em>' reference list.
   * @see istart.IstartPackage#getSoftgoal_SoftgoalContribution()
   * @see istart.ContributionLink#getContributionSoftgoal
   * @model opposite="contributionSoftgoal"
   * @generated
   */
  EList<ContributionLink> getSoftgoalContribution();

} // Softgoal

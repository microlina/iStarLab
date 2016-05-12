/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Goal#getGoalMeansEnd <em>Goal Means End</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getGoal()
 * @model annotation="gmf.node label='nodeName' label.icon='false' color='184,219,255' border.color='0,0,0' size='80,40' figure='polygon' polygon.x='0 0 5 15 35 45 50 50 45 35 15 5' polygon.y='10 20 30 30 30 30 20 10 0 0 0 0'"
 * @generated
 */
public interface Goal extends Element
{
  /**
   * Returns the value of the '<em><b>Goal Means End</b></em>' reference list.
   * The list contents are of type {@link istart.MeansEnd}.
   * It is bidirectional and its opposite is '{@link istart.MeansEnd#getMeansEndGoal <em>Means End Goal</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Means End</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Means End</em>' reference list.
   * @see istart.IstartPackage#getGoal_GoalMeansEnd()
   * @see istart.MeansEnd#getMeansEndGoal
   * @model opposite="meansEndGoal"
   * @generated
   */
  EList<MeansEnd> getGoalMeansEnd();

} // Goal

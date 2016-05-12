/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Means End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.MeansEnd#getMeansEndTask <em>Means End Task</em>}</li>
 *   <li>{@link istar.MeansEnd#getMeansEndGoal <em>Means End Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getMeansEnd()
 * @model annotation="gmf.link color='0,0,0' source='meansEndTask' target='meansEndGoal' target.decoration='filledclosedarrow' label.placement='none'"
 * @generated
 */
public interface MeansEnd extends Decomposition
{
  /**
	 * Returns the value of the '<em><b>Means End Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Task#getTaskMeansEnd <em>Task Means End</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Means End Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Means End Task</em>' reference.
	 * @see #setMeansEndTask(Task)
	 * @see istar.IstarPackage#getMeansEnd_MeansEndTask()
	 * @see istar.Task#getTaskMeansEnd
	 * @model opposite="taskMeansEnd" required="true"
	 * @generated
	 */
  Task getMeansEndTask();

  /**
	 * Sets the value of the '{@link istar.MeansEnd#getMeansEndTask <em>Means End Task</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Means End Task</em>' reference.
	 * @see #getMeansEndTask()
	 * @generated
	 */
  void setMeansEndTask(Task value);

  /**
	 * Returns the value of the '<em><b>Means End Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Goal#getGoalMeansEnd <em>Goal Means End</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Means End Goal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Means End Goal</em>' reference.
	 * @see #setMeansEndGoal(Goal)
	 * @see istar.IstarPackage#getMeansEnd_MeansEndGoal()
	 * @see istar.Goal#getGoalMeansEnd
	 * @model opposite="goalMeansEnd" required="true"
	 * @generated
	 */
  Goal getMeansEndGoal();

  /**
	 * Sets the value of the '{@link istar.MeansEnd#getMeansEndGoal <em>Means End Goal</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Means End Goal</em>' reference.
	 * @see #getMeansEndGoal()
	 * @generated
	 */
  void setMeansEndGoal(Goal value);

} // MeansEnd

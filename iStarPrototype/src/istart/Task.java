/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Task#getTaskMeansEnd <em>Task Means End</em>}</li>
 *   <li>{@link istart.Task#getTaskDecomposition <em>Task Decomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getTask()
 * @model annotation="gmf.node label='nodeName' label.icon='false' color='255,227,143' border.color='0,0,0' size='80,40' figure='polygon' polygon.x='0 10 50 60 50 10' polygon.y='15 30 30 15 0 0'"
 * @generated
 */
public interface Task extends Element
{
  /**
   * Returns the value of the '<em><b>Task Means End</b></em>' reference list.
   * The list contents are of type {@link istart.MeansEnd}.
   * It is bidirectional and its opposite is '{@link istart.MeansEnd#getMeansEndTask <em>Means End Task</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Means End</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Means End</em>' reference list.
   * @see istart.IstartPackage#getTask_TaskMeansEnd()
   * @see istart.MeansEnd#getMeansEndTask
   * @model opposite="meansEndTask"
   * @generated
   */
  EList<MeansEnd> getTaskMeansEnd();

  /**
   * Returns the value of the '<em><b>Task Decomposition</b></em>' reference list.
   * The list contents are of type {@link istart.DecompositionLink}.
   * It is bidirectional and its opposite is '{@link istart.DecompositionLink#getDecompositionTask <em>Decomposition Task</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Decomposition</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Decomposition</em>' reference list.
   * @see istart.IstartPackage#getTask_TaskDecomposition()
   * @see istart.DecompositionLink#getDecompositionTask
   * @model opposite="decompositionTask"
   * @generated
   */
  EList<DecompositionLink> getTaskDecomposition();

} // Task

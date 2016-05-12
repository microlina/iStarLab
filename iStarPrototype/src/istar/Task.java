/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Task#getTaskMeansEnd <em>Task Means End</em>}</li>
 *   <li>{@link istar.Task#getTaskDecomposition <em>Task Decomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getTask()
 * @model annotation="gmf.node label='nodeName' label.icon='false' color='255,227,143' border.color='0,0,0' size='80,40' figure='polygon' polygon.x='0 10 50 60 50 10' polygon.y='15 30 30 15 0 0'"
 * @generated
 */
public interface Task extends Element
{
  /**
	 * Returns the value of the '<em><b>Task Means End</b></em>' reference list.
	 * The list contents are of type {@link istar.MeansEnd}.
	 * It is bidirectional and its opposite is '{@link istar.MeansEnd#getMeansEndTask <em>Means End Task</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Means End</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Means End</em>' reference list.
	 * @see istar.IstarPackage#getTask_TaskMeansEnd()
	 * @see istar.MeansEnd#getMeansEndTask
	 * @model opposite="meansEndTask"
	 * @generated
	 */
  EList<MeansEnd> getTaskMeansEnd();

  /**
	 * Returns the value of the '<em><b>Task Decomposition</b></em>' reference list.
	 * The list contents are of type {@link istar.DecompositionLink}.
	 * It is bidirectional and its opposite is '{@link istar.DecompositionLink#getDecompositionTask <em>Decomposition Task</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Decomposition</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Decomposition</em>' reference list.
	 * @see istar.IstarPackage#getTask_TaskDecomposition()
	 * @see istar.DecompositionLink#getDecompositionTask
	 * @model opposite="decompositionTask"
	 * @generated
	 */
  EList<DecompositionLink> getTaskDecomposition();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.taskDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()'"
	 * @generated
	 */
	Integer NDT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()'"
	 * @generated
	 */
	Integer NCLT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()'"
	 * @generated
	 */
	Integer NDLT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDT() + self.NCLT() + self.NDLT()'"
	 * @generated
	 */
	Integer NLT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NIDT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NODT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NIDT() + self.NODT()'"
	 * @generated
	 */
	Integer NDepT();

} // Task

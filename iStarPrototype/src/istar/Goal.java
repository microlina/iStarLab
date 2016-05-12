/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Goal#getGoalMeansEnd <em>Goal Means End</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getGoal()
 * @model annotation="gmf.node label='nodeName' label.icon='false' color='184,219,255' border.color='0,0,0' size='80,40' figure='polygon' polygon.x='0 0 5 15 35 45 50 50 45 35 15 5' polygon.y='10 20 30 30 30 30 20 10 0 0 0 0'"
 * @generated
 */
public interface Goal extends Element
{
  /**
	 * Returns the value of the '<em><b>Goal Means End</b></em>' reference list.
	 * The list contents are of type {@link istar.MeansEnd}.
	 * It is bidirectional and its opposite is '{@link istar.MeansEnd#getMeansEndGoal <em>Means End Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Means End</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Means End</em>' reference list.
	 * @see istar.IstarPackage#getGoal_GoalMeansEnd()
	 * @see istar.MeansEnd#getMeansEndGoal
	 * @model opposite="meansEndGoal"
	 * @generated
	 */
  EList<MeansEnd> getGoalMeansEnd();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.goalMeansEnds->select(me : MeansEnds | me.oclIsKindOf(MeansEnds))->size()'"
	 * @generated
	 */
	Integer NDG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()'"
	 * @generated
	 */
	Integer NCLG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()'"
	 * @generated
	 */
	Integer NDLG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDG() + self.NCLG() + self.NDLG()'"
	 * @generated
	 */
	Integer NLG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NIDG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NODG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NIDG() + self.NODG()'"
	 * @generated
	 */
	Integer NDepG();

} // Goal

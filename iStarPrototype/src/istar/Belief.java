/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belief</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see istar.IstarPackage#getBelief()
 * @model annotation="gmf.node label='nodeName' label.icon='false' color='255,194,173' border.color='0,0,0' size='80,40' figure='ellipse'"
 * @generated
 */
public interface Belief extends Element
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()'"
	 * @generated
	 */
	Integer NCLB();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()'"
	 * @generated
	 */
	Integer NDLB();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NCLB() + self.NDLB()'"
	 * @generated
	 */
	Integer NLB();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NIDB();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NODB();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NIDB() + self.NODB()'"
	 * @generated
	 */
	Integer NDepB();
} // Belief

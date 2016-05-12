/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see istar.IstarPackage#getResource()
 * @model annotation="gmf.node label='nodeName' label.icon='false' color='255,255,179' border.color='0,0,0' size='80,40' figure='rectangle'"
 * @generated
 */
public interface Resource extends Element
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()'"
	 * @generated
	 */
	Integer NCLR();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()'"
	 * @generated
	 */
	Integer NDLR();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NCLR() + self.NDLR()'"
	 * @generated
	 */
	Integer NLR();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NIDR();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()'"
	 * @generated
	 */
	Integer NODR();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NIDR() + self.NODR()'"
	 * @generated
	 */
	Integer NDepR();
} // Resource

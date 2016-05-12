/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Element#getElementContribution <em>Element Contribution</em>}</li>
 *   <li>{@link istar.Element#getElementDecomposition <em>Element Decomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends Node
{
  /**
	 * Returns the value of the '<em><b>Element Contribution</b></em>' reference list.
	 * The list contents are of type {@link istar.ContributionLink}.
	 * It is bidirectional and its opposite is '{@link istar.ContributionLink#getContributionElement <em>Contribution Element</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Contribution</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Contribution</em>' reference list.
	 * @see istar.IstarPackage#getElement_ElementContribution()
	 * @see istar.ContributionLink#getContributionElement
	 * @model opposite="contributionElement"
	 * @generated
	 */
  EList<ContributionLink> getElementContribution();

  /**
	 * Returns the value of the '<em><b>Element Decomposition</b></em>' reference list.
	 * The list contents are of type {@link istar.DecompositionLink}.
	 * It is bidirectional and its opposite is '{@link istar.DecompositionLink#getDecompositionElement <em>Decomposition Element</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Decomposition</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Decomposition</em>' reference list.
	 * @see istar.IstarPackage#getElement_ElementDecomposition()
	 * @see istar.DecompositionLink#getDecompositionElement
	 * @model opposite="decompositionElement"
	 * @generated
	 */
  EList<DecompositionLink> getElementDecomposition();

} // Element

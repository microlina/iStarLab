/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Element#getElementContribution <em>Element Contribution</em>}</li>
 *   <li>{@link istart.Element#getElementDecomposition <em>Element Decomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends Node
{
  /**
   * Returns the value of the '<em><b>Element Contribution</b></em>' reference list.
   * The list contents are of type {@link istart.ContributionLink}.
   * It is bidirectional and its opposite is '{@link istart.ContributionLink#getContributionElement <em>Contribution Element</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Contribution</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Contribution</em>' reference list.
   * @see istart.IstartPackage#getElement_ElementContribution()
   * @see istart.ContributionLink#getContributionElement
   * @model opposite="contributionElement"
   * @generated
   */
  EList<ContributionLink> getElementContribution();

  /**
   * Returns the value of the '<em><b>Element Decomposition</b></em>' reference list.
   * The list contents are of type {@link istart.DecompositionLink}.
   * It is bidirectional and its opposite is '{@link istart.DecompositionLink#getDecompositionElement <em>Decomposition Element</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Decomposition</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Decomposition</em>' reference list.
   * @see istart.IstartPackage#getElement_ElementDecomposition()
   * @see istart.DecompositionLink#getDecompositionElement
   * @model opposite="decompositionElement"
   * @generated
   */
  EList<DecompositionLink> getElementDecomposition();

} // Element

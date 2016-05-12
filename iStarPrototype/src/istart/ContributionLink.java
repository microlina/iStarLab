/**
 */
package istart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.ContributionLink#getContributionElement <em>Contribution Element</em>}</li>
 *   <li>{@link istart.ContributionLink#getContributionSoftgoal <em>Contribution Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getContributionLink()
 * @model abstract="true"
 * @generated
 */
public interface ContributionLink extends Relationship
{
  /**
   * Returns the value of the '<em><b>Contribution Element</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Element#getElementContribution <em>Element Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution Element</em>' reference.
   * @see #setContributionElement(Element)
   * @see istart.IstartPackage#getContributionLink_ContributionElement()
   * @see istart.Element#getElementContribution
   * @model opposite="elementContribution" required="true"
   * @generated
   */
  Element getContributionElement();

  /**
   * Sets the value of the '{@link istart.ContributionLink#getContributionElement <em>Contribution Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contribution Element</em>' reference.
   * @see #getContributionElement()
   * @generated
   */
  void setContributionElement(Element value);

  /**
   * Returns the value of the '<em><b>Contribution Softgoal</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Softgoal#getSoftgoalContribution <em>Softgoal Contribution</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution Softgoal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contribution Softgoal</em>' reference.
   * @see #setContributionSoftgoal(Softgoal)
   * @see istart.IstartPackage#getContributionLink_ContributionSoftgoal()
   * @see istart.Softgoal#getSoftgoalContribution
   * @model opposite="softgoalContribution" required="true"
   * @generated
   */
  Softgoal getContributionSoftgoal();

  /**
   * Sets the value of the '{@link istart.ContributionLink#getContributionSoftgoal <em>Contribution Softgoal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contribution Softgoal</em>' reference.
   * @see #getContributionSoftgoal()
   * @generated
   */
  void setContributionSoftgoal(Softgoal value);

} // ContributionLink

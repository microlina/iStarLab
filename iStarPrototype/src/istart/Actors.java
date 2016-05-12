/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Actors#getHasElement <em>Has Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getActors()
 * @model abstract="true"
 * @generated
 */
public interface Actors extends Node
{
  /**
   * Returns the value of the '<em><b>Has Element</b></em>' containment reference list.
   * The list contents are of type {@link istart.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Element</em>' containment reference list.
   * @see #isSetHasElement()
   * @see #unsetHasElement()
   * @see istart.IstartPackage#getActors_HasElement()
   * @model containment="true" unsettable="true"
   * @generated
   */
  EList<Element> getHasElement();

  /**
   * Unsets the value of the '{@link istart.Actors#getHasElement <em>Has Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetHasElement()
   * @see #getHasElement()
   * @generated
   */
  void unsetHasElement();

  /**
   * Returns whether the value of the '{@link istart.Actors#getHasElement <em>Has Element</em>}' containment reference list is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Has Element</em>' containment reference list is set.
   * @see #unsetHasElement()
   * @see #getHasElement()
   * @generated
   */
  boolean isSetHasElement();

} // Actors

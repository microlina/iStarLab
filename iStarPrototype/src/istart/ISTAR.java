/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISTAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.ISTAR#getHasNode <em>Has Node</em>}</li>
 *   <li>{@link istart.ISTAR#getModelName <em>Model Name</em>}</li>
 *   <li>{@link istart.ISTAR#getHasRelationship <em>Has Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getISTAR()
 * @model
 * @generated
 */
public interface ISTAR extends EObject
{
  /**
   * Returns the value of the '<em><b>Has Node</b></em>' containment reference list.
   * The list contents are of type {@link istart.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Node</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Node</em>' containment reference list.
   * @see istart.IstartPackage#getISTAR_HasNode()
   * @model containment="true"
   * @generated
   */
  EList<Node> getHasNode();

  /**
   * Returns the value of the '<em><b>Model Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Name</em>' attribute.
   * @see #setModelName(String)
   * @see istart.IstartPackage#getISTAR_ModelName()
   * @model
   * @generated
   */
  String getModelName();

  /**
   * Sets the value of the '{@link istart.ISTAR#getModelName <em>Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Name</em>' attribute.
   * @see #getModelName()
   * @generated
   */
  void setModelName(String value);

  /**
   * Returns the value of the '<em><b>Has Relationship</b></em>' containment reference list.
   * The list contents are of type {@link istart.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Relationship</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Relationship</em>' containment reference list.
   * @see istart.IstartPackage#getISTAR_HasRelationship()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getHasRelationship();

} // ISTAR

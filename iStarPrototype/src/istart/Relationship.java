/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Relationship#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link istart.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link istart.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link istart.Relationship#getRelationshipNFR <em>Relationship NFR</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Name</em>' attribute.
   * @see #setRelationshipName(String)
   * @see istart.IstartPackage#getRelationship_RelationshipName()
   * @model
   * @generated
   */
  String getRelationshipName();

  /**
   * Sets the value of the '{@link istart.Relationship#getRelationshipName <em>Relationship Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship Name</em>' attribute.
   * @see #getRelationshipName()
   * @generated
   */
  void setRelationshipName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see istart.IstartPackage#getRelationship_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link istart.Relationship#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see istart.IstartPackage#getRelationship_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link istart.Relationship#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Relationship NFR</b></em>' attribute list.
   * The list contents are of type {@link istart.NFR}.
   * The literals are from the enumeration {@link istart.NFR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship NFR</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship NFR</em>' attribute list.
   * @see istart.NFR
   * @see istart.IstartPackage#getRelationship_RelationshipNFR()
   * @model default="unknown"
   * @generated
   */
  EList<NFR> getRelationshipNFR();

} // Relationship

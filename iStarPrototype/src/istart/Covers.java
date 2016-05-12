/**
 */
package istart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Covers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Covers#getCoversRole <em>Covers Role</em>}</li>
 *   <li>{@link istart.Covers#getCoversPosition <em>Covers Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getCovers()
 * @model annotation="gmf.link color='0,0,0' source='coversPosition' target='coversRole' target.decoration='arrow' label='relationshipName' label.readOnly='true'"
 * @generated
 */
public interface Covers extends Association
{
  /**
   * Returns the value of the '<em><b>Covers Role</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Role#getRoleCovers <em>Role Covers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Covers Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Covers Role</em>' reference.
   * @see #setCoversRole(Role)
   * @see istart.IstartPackage#getCovers_CoversRole()
   * @see istart.Role#getRoleCovers
   * @model opposite="roleCovers" required="true"
   * @generated
   */
  Role getCoversRole();

  /**
   * Sets the value of the '{@link istart.Covers#getCoversRole <em>Covers Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Covers Role</em>' reference.
   * @see #getCoversRole()
   * @generated
   */
  void setCoversRole(Role value);

  /**
   * Returns the value of the '<em><b>Covers Position</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Position#getPositionCovers <em>Position Covers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Covers Position</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Covers Position</em>' reference.
   * @see #setCoversPosition(Position)
   * @see istart.IstartPackage#getCovers_CoversPosition()
   * @see istart.Position#getPositionCovers
   * @model opposite="positionCovers" required="true"
   * @generated
   */
  Position getCoversPosition();

  /**
   * Sets the value of the '{@link istart.Covers#getCoversPosition <em>Covers Position</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Covers Position</em>' reference.
   * @see #getCoversPosition()
   * @generated
   */
  void setCoversPosition(Position value);

} // Covers

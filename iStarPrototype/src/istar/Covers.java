/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Covers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Covers#getCoversRole <em>Covers Role</em>}</li>
 *   <li>{@link istar.Covers#getCoversPosition <em>Covers Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getCovers()
 * @model annotation="gmf.link color='0,0,0' source='coversPosition' target='coversRole' target.decoration='arrow' label='relationshipName' label.readOnly='true'"
 * @generated
 */
public interface Covers extends Association
{
  /**
	 * Returns the value of the '<em><b>Covers Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Role#getRoleCovers <em>Role Covers</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Covers Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers Role</em>' reference.
	 * @see #setCoversRole(Role)
	 * @see istar.IstarPackage#getCovers_CoversRole()
	 * @see istar.Role#getRoleCovers
	 * @model opposite="roleCovers" required="true"
	 * @generated
	 */
  Role getCoversRole();

  /**
	 * Sets the value of the '{@link istar.Covers#getCoversRole <em>Covers Role</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covers Role</em>' reference.
	 * @see #getCoversRole()
	 * @generated
	 */
  void setCoversRole(Role value);

  /**
	 * Returns the value of the '<em><b>Covers Position</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Position#getPositionCovers <em>Position Covers</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Covers Position</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers Position</em>' reference.
	 * @see #setCoversPosition(Position)
	 * @see istar.IstarPackage#getCovers_CoversPosition()
	 * @see istar.Position#getPositionCovers
	 * @model opposite="positionCovers" required="true"
	 * @generated
	 */
  Position getCoversPosition();

  /**
	 * Sets the value of the '{@link istar.Covers#getCoversPosition <em>Covers Position</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covers Position</em>' reference.
	 * @see #getCoversPosition()
	 * @generated
	 */
  void setCoversPosition(Position value);

} // Covers

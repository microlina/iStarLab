/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Role#getRolePlays <em>Role Plays</em>}</li>
 *   <li>{@link istar.Role#getRoleCovers <em>Role Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getRole()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Role extends Actors
{
  /**
	 * Returns the value of the '<em><b>Role Plays</b></em>' reference list.
	 * The list contents are of type {@link istar.Plays}.
	 * It is bidirectional and its opposite is '{@link istar.Plays#getPlaysRole <em>Plays Role</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Plays</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Plays</em>' reference list.
	 * @see istar.IstarPackage#getRole_RolePlays()
	 * @see istar.Plays#getPlaysRole
	 * @model opposite="playsRole"
	 * @generated
	 */
  EList<Plays> getRolePlays();

  /**
	 * Returns the value of the '<em><b>Role Covers</b></em>' reference list.
	 * The list contents are of type {@link istar.Covers}.
	 * It is bidirectional and its opposite is '{@link istar.Covers#getCoversRole <em>Covers Role</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Covers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Covers</em>' reference list.
	 * @see istar.IstarPackage#getRole_RoleCovers()
	 * @see istar.Covers#getCoversRole
	 * @model opposite="coversRole"
	 * @generated
	 */
  EList<Covers> getRoleCovers();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()'"
	 * @generated
	 */
	Integer NEIR();

} // Role

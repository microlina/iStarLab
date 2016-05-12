/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Role#getRolePlays <em>Role Plays</em>}</li>
 *   <li>{@link istart.Role#getRoleCovers <em>Role Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getRole()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Role extends Actors
{
  /**
   * Returns the value of the '<em><b>Role Plays</b></em>' reference list.
   * The list contents are of type {@link istart.Plays}.
   * It is bidirectional and its opposite is '{@link istart.Plays#getPlaysRole <em>Plays Role</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Plays</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Plays</em>' reference list.
   * @see istart.IstartPackage#getRole_RolePlays()
   * @see istart.Plays#getPlaysRole
   * @model opposite="playsRole"
   * @generated
   */
  EList<Plays> getRolePlays();

  /**
   * Returns the value of the '<em><b>Role Covers</b></em>' reference list.
   * The list contents are of type {@link istart.Covers}.
   * It is bidirectional and its opposite is '{@link istart.Covers#getCoversRole <em>Covers Role</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Covers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Covers</em>' reference list.
   * @see istart.IstartPackage#getRole_RoleCovers()
   * @see istart.Covers#getCoversRole
   * @model opposite="coversRole"
   * @generated
   */
  EList<Covers> getRoleCovers();

} // Role

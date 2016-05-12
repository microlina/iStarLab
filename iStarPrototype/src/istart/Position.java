/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Position#getPositionCovers <em>Position Covers</em>}</li>
 *   <li>{@link istart.Position#getPositionOccupies <em>Position Occupies</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getPosition()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Position extends Actors
{
  /**
   * Returns the value of the '<em><b>Position Covers</b></em>' reference list.
   * The list contents are of type {@link istart.Covers}.
   * It is bidirectional and its opposite is '{@link istart.Covers#getCoversPosition <em>Covers Position</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position Covers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position Covers</em>' reference list.
   * @see istart.IstartPackage#getPosition_PositionCovers()
   * @see istart.Covers#getCoversPosition
   * @model opposite="coversPosition"
   * @generated
   */
  EList<Covers> getPositionCovers();

  /**
   * Returns the value of the '<em><b>Position Occupies</b></em>' reference list.
   * The list contents are of type {@link istart.Occupies}.
   * It is bidirectional and its opposite is '{@link istart.Occupies#getOccupiesPosition <em>Occupies Position</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position Occupies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position Occupies</em>' reference list.
   * @see istart.IstartPackage#getPosition_PositionOccupies()
   * @see istart.Occupies#getOccupiesPosition
   * @model opposite="occupiesPosition"
   * @generated
   */
  EList<Occupies> getPositionOccupies();

} // Position

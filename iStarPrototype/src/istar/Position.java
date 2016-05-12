/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Position#getPositionCovers <em>Position Covers</em>}</li>
 *   <li>{@link istar.Position#getPositionOccupies <em>Position Occupies</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getPosition()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Position extends Actors
{
  /**
	 * Returns the value of the '<em><b>Position Covers</b></em>' reference list.
	 * The list contents are of type {@link istar.Covers}.
	 * It is bidirectional and its opposite is '{@link istar.Covers#getCoversPosition <em>Covers Position</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position Covers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Covers</em>' reference list.
	 * @see istar.IstarPackage#getPosition_PositionCovers()
	 * @see istar.Covers#getCoversPosition
	 * @model opposite="coversPosition"
	 * @generated
	 */
  EList<Covers> getPositionCovers();

  /**
	 * Returns the value of the '<em><b>Position Occupies</b></em>' reference list.
	 * The list contents are of type {@link istar.Occupies}.
	 * It is bidirectional and its opposite is '{@link istar.Occupies#getOccupiesPosition <em>Occupies Position</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position Occupies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Occupies</em>' reference list.
	 * @see istar.IstarPackage#getPosition_PositionOccupies()
	 * @see istar.Occupies#getOccupiesPosition
	 * @model opposite="occupiesPosition"
	 * @generated
	 */
  EList<Occupies> getPositionOccupies();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()'"
	 * @generated
	 */
	Integer NEIP();

} // Position

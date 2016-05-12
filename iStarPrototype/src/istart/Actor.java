/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Actor#getActorISA <em>Actor ISA</em>}</li>
 *   <li>{@link istart.Actor#getSecondActorISA <em>Second Actor ISA</em>}</li>
 *   <li>{@link istart.Actor#getActorIsPartOf <em>Actor Is Part Of</em>}</li>
 *   <li>{@link istart.Actor#getSecondActorIsPartOf <em>Second Actor Is Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getActor()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Actor extends Actors
{
  /**
   * Returns the value of the '<em><b>Actor ISA</b></em>' reference list.
   * The list contents are of type {@link istart.ISA}.
   * It is bidirectional and its opposite is '{@link istart.ISA#getISAactor <em>IS Aactor</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor ISA</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor ISA</em>' reference list.
   * @see istart.IstartPackage#getActor_ActorISA()
   * @see istart.ISA#getISAactor
   * @model opposite="ISAactor"
   * @generated
   */
  EList<ISA> getActorISA();

  /**
   * Returns the value of the '<em><b>Second Actor ISA</b></em>' reference list.
   * The list contents are of type {@link istart.ISA}.
   * It is bidirectional and its opposite is '{@link istart.ISA#getISAsecondActor <em>IS Asecond Actor</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Actor ISA</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Actor ISA</em>' reference list.
   * @see istart.IstartPackage#getActor_SecondActorISA()
   * @see istart.ISA#getISAsecondActor
   * @model opposite="ISAsecondActor"
   * @generated
   */
  EList<ISA> getSecondActorISA();

  /**
   * Returns the value of the '<em><b>Actor Is Part Of</b></em>' reference list.
   * The list contents are of type {@link istart.IsPartOf}.
   * It is bidirectional and its opposite is '{@link istart.IsPartOf#getIsPartOfActor <em>Is Part Of Actor</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor Is Part Of</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor Is Part Of</em>' reference list.
   * @see istart.IstartPackage#getActor_ActorIsPartOf()
   * @see istart.IsPartOf#getIsPartOfActor
   * @model opposite="isPartOfActor"
   * @generated
   */
  EList<IsPartOf> getActorIsPartOf();

  /**
   * Returns the value of the '<em><b>Second Actor Is Part Of</b></em>' reference list.
   * The list contents are of type {@link istart.IsPartOf}.
   * It is bidirectional and its opposite is '{@link istart.IsPartOf#getIsPartOfSecondActor <em>Is Part Of Second Actor</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Actor Is Part Of</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Actor Is Part Of</em>' reference list.
   * @see istart.IstartPackage#getActor_SecondActorIsPartOf()
   * @see istart.IsPartOf#getIsPartOfSecondActor
   * @model opposite="isPartOfSecondActor"
   * @generated
   */
  EList<IsPartOf> getSecondActorIsPartOf();

} // Actor

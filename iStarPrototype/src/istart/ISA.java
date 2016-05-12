/**
 */
package istart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.ISA#getISAactor <em>IS Aactor</em>}</li>
 *   <li>{@link istart.ISA#getISAsecondActor <em>IS Asecond Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getISA()
 * @model annotation="gmf.link color='0,0,0' source='ISAactor' target='ISAsecondActor' target.decoration='arrow' label='relationshipName' label.readOnly='true' source.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface ISA extends Association
{
  /**
   * Returns the value of the '<em><b>IS Aactor</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Actor#getActorISA <em>Actor ISA</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IS Aactor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IS Aactor</em>' reference.
   * @see #setISAactor(Actor)
   * @see istart.IstartPackage#getISA_ISAactor()
   * @see istart.Actor#getActorISA
   * @model opposite="actorISA" required="true"
   * @generated
   */
  Actor getISAactor();

  /**
   * Sets the value of the '{@link istart.ISA#getISAactor <em>IS Aactor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IS Aactor</em>' reference.
   * @see #getISAactor()
   * @generated
   */
  void setISAactor(Actor value);

  /**
   * Returns the value of the '<em><b>IS Asecond Actor</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Actor#getSecondActorISA <em>Second Actor ISA</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IS Asecond Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IS Asecond Actor</em>' reference.
   * @see #setISAsecondActor(Actor)
   * @see istart.IstartPackage#getISA_ISAsecondActor()
   * @see istart.Actor#getSecondActorISA
   * @model opposite="secondActorISA" required="true"
   * @generated
   */
  Actor getISAsecondActor();

  /**
   * Sets the value of the '{@link istart.ISA#getISAsecondActor <em>IS Asecond Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IS Asecond Actor</em>' reference.
   * @see #getISAsecondActor()
   * @generated
   */
  void setISAsecondActor(Actor value);

} // ISA

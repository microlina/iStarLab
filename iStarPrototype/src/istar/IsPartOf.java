/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Part Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.IsPartOf#getIsPartOfActor <em>Is Part Of Actor</em>}</li>
 *   <li>{@link istar.IsPartOf#getIsPartOfSecondActor <em>Is Part Of Second Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getIsPartOf()
 * @model annotation="gmf.link color='0,0,0' source='isPartOfActor' target='isPartOfSecondActor' target.decoration='arrow' label='relationshipName' label.readOnly='true' source.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface IsPartOf extends Association
{
  /**
	 * Returns the value of the '<em><b>Is Part Of Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Actor#getActorIsPartOf <em>Actor Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Part Of Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of Actor</em>' reference.
	 * @see #setIsPartOfActor(Actor)
	 * @see istar.IstarPackage#getIsPartOf_IsPartOfActor()
	 * @see istar.Actor#getActorIsPartOf
	 * @model opposite="actorIsPartOf" required="true"
	 * @generated
	 */
  Actor getIsPartOfActor();

  /**
	 * Sets the value of the '{@link istar.IsPartOf#getIsPartOfActor <em>Is Part Of Actor</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of Actor</em>' reference.
	 * @see #getIsPartOfActor()
	 * @generated
	 */
  void setIsPartOfActor(Actor value);

  /**
	 * Returns the value of the '<em><b>Is Part Of Second Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Actor#getSecondActorIsPartOf <em>Second Actor Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Part Of Second Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of Second Actor</em>' reference.
	 * @see #setIsPartOfSecondActor(Actor)
	 * @see istar.IstarPackage#getIsPartOf_IsPartOfSecondActor()
	 * @see istar.Actor#getSecondActorIsPartOf
	 * @model opposite="secondActorIsPartOf" required="true"
	 * @generated
	 */
  Actor getIsPartOfSecondActor();

  /**
	 * Sets the value of the '{@link istar.IsPartOf#getIsPartOfSecondActor <em>Is Part Of Second Actor</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of Second Actor</em>' reference.
	 * @see #getIsPartOfSecondActor()
	 * @generated
	 */
  void setIsPartOfSecondActor(Actor value);

} // IsPartOf

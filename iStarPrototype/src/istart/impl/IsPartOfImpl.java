/**
 */
package istart.impl;

import istart.Actor;
import istart.IsPartOf;
import istart.IstartPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Part Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.IsPartOfImpl#getIsPartOfActor <em>Is Part Of Actor</em>}</li>
 *   <li>{@link istart.impl.IsPartOfImpl#getIsPartOfSecondActor <em>Is Part Of Second Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsPartOfImpl extends AssociationImpl implements IsPartOf
{
  /**
   * The cached value of the '{@link #getIsPartOfActor() <em>Is Part Of Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsPartOfActor()
   * @generated
   * @ordered
   */
  protected Actor isPartOfActor;

  /**
   * The cached value of the '{@link #getIsPartOfSecondActor() <em>Is Part Of Second Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsPartOfSecondActor()
   * @generated
   * @ordered
   */
  protected Actor isPartOfSecondActor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IsPartOfImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IstartPackage.Literals.IS_PART_OF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getIsPartOfActor()
  {
    if (isPartOfActor != null && isPartOfActor.eIsProxy())
    {
      InternalEObject oldIsPartOfActor = (InternalEObject)isPartOfActor;
      isPartOfActor = (Actor)eResolveProxy(oldIsPartOfActor);
      if (isPartOfActor != oldIsPartOfActor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR, oldIsPartOfActor, isPartOfActor));
      }
    }
    return isPartOfActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetIsPartOfActor()
  {
    return isPartOfActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsPartOfActor(Actor newIsPartOfActor, NotificationChain msgs)
  {
    Actor oldIsPartOfActor = isPartOfActor;
    isPartOfActor = newIsPartOfActor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR, oldIsPartOfActor, newIsPartOfActor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsPartOfActor(Actor newIsPartOfActor)
  {
    if (newIsPartOfActor != isPartOfActor)
    {
      NotificationChain msgs = null;
      if (isPartOfActor != null)
        msgs = ((InternalEObject)isPartOfActor).eInverseRemove(this, IstartPackage.ACTOR__ACTOR_IS_PART_OF, Actor.class, msgs);
      if (newIsPartOfActor != null)
        msgs = ((InternalEObject)newIsPartOfActor).eInverseAdd(this, IstartPackage.ACTOR__ACTOR_IS_PART_OF, Actor.class, msgs);
      msgs = basicSetIsPartOfActor(newIsPartOfActor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR, newIsPartOfActor, newIsPartOfActor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getIsPartOfSecondActor()
  {
    if (isPartOfSecondActor != null && isPartOfSecondActor.eIsProxy())
    {
      InternalEObject oldIsPartOfSecondActor = (InternalEObject)isPartOfSecondActor;
      isPartOfSecondActor = (Actor)eResolveProxy(oldIsPartOfSecondActor);
      if (isPartOfSecondActor != oldIsPartOfSecondActor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR, oldIsPartOfSecondActor, isPartOfSecondActor));
      }
    }
    return isPartOfSecondActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetIsPartOfSecondActor()
  {
    return isPartOfSecondActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsPartOfSecondActor(Actor newIsPartOfSecondActor, NotificationChain msgs)
  {
    Actor oldIsPartOfSecondActor = isPartOfSecondActor;
    isPartOfSecondActor = newIsPartOfSecondActor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR, oldIsPartOfSecondActor, newIsPartOfSecondActor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsPartOfSecondActor(Actor newIsPartOfSecondActor)
  {
    if (newIsPartOfSecondActor != isPartOfSecondActor)
    {
      NotificationChain msgs = null;
      if (isPartOfSecondActor != null)
        msgs = ((InternalEObject)isPartOfSecondActor).eInverseRemove(this, IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF, Actor.class, msgs);
      if (newIsPartOfSecondActor != null)
        msgs = ((InternalEObject)newIsPartOfSecondActor).eInverseAdd(this, IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF, Actor.class, msgs);
      msgs = basicSetIsPartOfSecondActor(newIsPartOfSecondActor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR, newIsPartOfSecondActor, newIsPartOfSecondActor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR:
        if (isPartOfActor != null)
          msgs = ((InternalEObject)isPartOfActor).eInverseRemove(this, IstartPackage.ACTOR__ACTOR_IS_PART_OF, Actor.class, msgs);
        return basicSetIsPartOfActor((Actor)otherEnd, msgs);
      case IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR:
        if (isPartOfSecondActor != null)
          msgs = ((InternalEObject)isPartOfSecondActor).eInverseRemove(this, IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF, Actor.class, msgs);
        return basicSetIsPartOfSecondActor((Actor)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR:
        return basicSetIsPartOfActor(null, msgs);
      case IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR:
        return basicSetIsPartOfSecondActor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR:
        if (resolve) return getIsPartOfActor();
        return basicGetIsPartOfActor();
      case IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR:
        if (resolve) return getIsPartOfSecondActor();
        return basicGetIsPartOfSecondActor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR:
        setIsPartOfActor((Actor)newValue);
        return;
      case IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR:
        setIsPartOfSecondActor((Actor)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR:
        setIsPartOfActor((Actor)null);
        return;
      case IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR:
        setIsPartOfSecondActor((Actor)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR:
        return isPartOfActor != null;
      case IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR:
        return isPartOfSecondActor != null;
    }
    return super.eIsSet(featureID);
  }

} //IsPartOfImpl

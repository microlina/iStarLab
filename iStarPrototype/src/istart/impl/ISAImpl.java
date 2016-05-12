/**
 */
package istart.impl;

import istart.Actor;
import istart.ISA;
import istart.IstartPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.ISAImpl#getISAactor <em>IS Aactor</em>}</li>
 *   <li>{@link istart.impl.ISAImpl#getISAsecondActor <em>IS Asecond Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ISAImpl extends AssociationImpl implements ISA
{
  /**
   * The cached value of the '{@link #getISAactor() <em>IS Aactor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getISAactor()
   * @generated
   * @ordered
   */
  protected Actor isAactor;

  /**
   * The cached value of the '{@link #getISAsecondActor() <em>IS Asecond Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getISAsecondActor()
   * @generated
   * @ordered
   */
  protected Actor isAsecondActor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ISAImpl()
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
    return IstartPackage.Literals.ISA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getISAactor()
  {
    if (isAactor != null && isAactor.eIsProxy())
    {
      InternalEObject oldISAactor = (InternalEObject)isAactor;
      isAactor = (Actor)eResolveProxy(oldISAactor);
      if (isAactor != oldISAactor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.ISA__IS_AACTOR, oldISAactor, isAactor));
      }
    }
    return isAactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetISAactor()
  {
    return isAactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetISAactor(Actor newISAactor, NotificationChain msgs)
  {
    Actor oldISAactor = isAactor;
    isAactor = newISAactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.ISA__IS_AACTOR, oldISAactor, newISAactor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setISAactor(Actor newISAactor)
  {
    if (newISAactor != isAactor)
    {
      NotificationChain msgs = null;
      if (isAactor != null)
        msgs = ((InternalEObject)isAactor).eInverseRemove(this, IstartPackage.ACTOR__ACTOR_ISA, Actor.class, msgs);
      if (newISAactor != null)
        msgs = ((InternalEObject)newISAactor).eInverseAdd(this, IstartPackage.ACTOR__ACTOR_ISA, Actor.class, msgs);
      msgs = basicSetISAactor(newISAactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.ISA__IS_AACTOR, newISAactor, newISAactor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getISAsecondActor()
  {
    if (isAsecondActor != null && isAsecondActor.eIsProxy())
    {
      InternalEObject oldISAsecondActor = (InternalEObject)isAsecondActor;
      isAsecondActor = (Actor)eResolveProxy(oldISAsecondActor);
      if (isAsecondActor != oldISAsecondActor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.ISA__IS_ASECOND_ACTOR, oldISAsecondActor, isAsecondActor));
      }
    }
    return isAsecondActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetISAsecondActor()
  {
    return isAsecondActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetISAsecondActor(Actor newISAsecondActor, NotificationChain msgs)
  {
    Actor oldISAsecondActor = isAsecondActor;
    isAsecondActor = newISAsecondActor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.ISA__IS_ASECOND_ACTOR, oldISAsecondActor, newISAsecondActor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setISAsecondActor(Actor newISAsecondActor)
  {
    if (newISAsecondActor != isAsecondActor)
    {
      NotificationChain msgs = null;
      if (isAsecondActor != null)
        msgs = ((InternalEObject)isAsecondActor).eInverseRemove(this, IstartPackage.ACTOR__SECOND_ACTOR_ISA, Actor.class, msgs);
      if (newISAsecondActor != null)
        msgs = ((InternalEObject)newISAsecondActor).eInverseAdd(this, IstartPackage.ACTOR__SECOND_ACTOR_ISA, Actor.class, msgs);
      msgs = basicSetISAsecondActor(newISAsecondActor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.ISA__IS_ASECOND_ACTOR, newISAsecondActor, newISAsecondActor));
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
      case IstartPackage.ISA__IS_AACTOR:
        if (isAactor != null)
          msgs = ((InternalEObject)isAactor).eInverseRemove(this, IstartPackage.ACTOR__ACTOR_ISA, Actor.class, msgs);
        return basicSetISAactor((Actor)otherEnd, msgs);
      case IstartPackage.ISA__IS_ASECOND_ACTOR:
        if (isAsecondActor != null)
          msgs = ((InternalEObject)isAsecondActor).eInverseRemove(this, IstartPackage.ACTOR__SECOND_ACTOR_ISA, Actor.class, msgs);
        return basicSetISAsecondActor((Actor)otherEnd, msgs);
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
      case IstartPackage.ISA__IS_AACTOR:
        return basicSetISAactor(null, msgs);
      case IstartPackage.ISA__IS_ASECOND_ACTOR:
        return basicSetISAsecondActor(null, msgs);
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
      case IstartPackage.ISA__IS_AACTOR:
        if (resolve) return getISAactor();
        return basicGetISAactor();
      case IstartPackage.ISA__IS_ASECOND_ACTOR:
        if (resolve) return getISAsecondActor();
        return basicGetISAsecondActor();
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
      case IstartPackage.ISA__IS_AACTOR:
        setISAactor((Actor)newValue);
        return;
      case IstartPackage.ISA__IS_ASECOND_ACTOR:
        setISAsecondActor((Actor)newValue);
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
      case IstartPackage.ISA__IS_AACTOR:
        setISAactor((Actor)null);
        return;
      case IstartPackage.ISA__IS_ASECOND_ACTOR:
        setISAsecondActor((Actor)null);
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
      case IstartPackage.ISA__IS_AACTOR:
        return isAactor != null;
      case IstartPackage.ISA__IS_ASECOND_ACTOR:
        return isAsecondActor != null;
    }
    return super.eIsSet(featureID);
  }

} //ISAImpl

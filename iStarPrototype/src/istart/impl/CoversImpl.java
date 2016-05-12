/**
 */
package istart.impl;

import istart.Covers;
import istart.IstartPackage;
import istart.Position;
import istart.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Covers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.CoversImpl#getCoversRole <em>Covers Role</em>}</li>
 *   <li>{@link istart.impl.CoversImpl#getCoversPosition <em>Covers Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoversImpl extends AssociationImpl implements Covers
{
  /**
   * The cached value of the '{@link #getCoversRole() <em>Covers Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoversRole()
   * @generated
   * @ordered
   */
  protected Role coversRole;

  /**
   * The cached value of the '{@link #getCoversPosition() <em>Covers Position</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoversPosition()
   * @generated
   * @ordered
   */
  protected Position coversPosition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoversImpl()
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
    return IstartPackage.Literals.COVERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getCoversRole()
  {
    if (coversRole != null && coversRole.eIsProxy())
    {
      InternalEObject oldCoversRole = (InternalEObject)coversRole;
      coversRole = (Role)eResolveProxy(oldCoversRole);
      if (coversRole != oldCoversRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.COVERS__COVERS_ROLE, oldCoversRole, coversRole));
      }
    }
    return coversRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetCoversRole()
  {
    return coversRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoversRole(Role newCoversRole, NotificationChain msgs)
  {
    Role oldCoversRole = coversRole;
    coversRole = newCoversRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.COVERS__COVERS_ROLE, oldCoversRole, newCoversRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoversRole(Role newCoversRole)
  {
    if (newCoversRole != coversRole)
    {
      NotificationChain msgs = null;
      if (coversRole != null)
        msgs = ((InternalEObject)coversRole).eInverseRemove(this, IstartPackage.ROLE__ROLE_COVERS, Role.class, msgs);
      if (newCoversRole != null)
        msgs = ((InternalEObject)newCoversRole).eInverseAdd(this, IstartPackage.ROLE__ROLE_COVERS, Role.class, msgs);
      msgs = basicSetCoversRole(newCoversRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.COVERS__COVERS_ROLE, newCoversRole, newCoversRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position getCoversPosition()
  {
    if (coversPosition != null && coversPosition.eIsProxy())
    {
      InternalEObject oldCoversPosition = (InternalEObject)coversPosition;
      coversPosition = (Position)eResolveProxy(oldCoversPosition);
      if (coversPosition != oldCoversPosition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.COVERS__COVERS_POSITION, oldCoversPosition, coversPosition));
      }
    }
    return coversPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position basicGetCoversPosition()
  {
    return coversPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoversPosition(Position newCoversPosition, NotificationChain msgs)
  {
    Position oldCoversPosition = coversPosition;
    coversPosition = newCoversPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.COVERS__COVERS_POSITION, oldCoversPosition, newCoversPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoversPosition(Position newCoversPosition)
  {
    if (newCoversPosition != coversPosition)
    {
      NotificationChain msgs = null;
      if (coversPosition != null)
        msgs = ((InternalEObject)coversPosition).eInverseRemove(this, IstartPackage.POSITION__POSITION_COVERS, Position.class, msgs);
      if (newCoversPosition != null)
        msgs = ((InternalEObject)newCoversPosition).eInverseAdd(this, IstartPackage.POSITION__POSITION_COVERS, Position.class, msgs);
      msgs = basicSetCoversPosition(newCoversPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.COVERS__COVERS_POSITION, newCoversPosition, newCoversPosition));
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
      case IstartPackage.COVERS__COVERS_ROLE:
        if (coversRole != null)
          msgs = ((InternalEObject)coversRole).eInverseRemove(this, IstartPackage.ROLE__ROLE_COVERS, Role.class, msgs);
        return basicSetCoversRole((Role)otherEnd, msgs);
      case IstartPackage.COVERS__COVERS_POSITION:
        if (coversPosition != null)
          msgs = ((InternalEObject)coversPosition).eInverseRemove(this, IstartPackage.POSITION__POSITION_COVERS, Position.class, msgs);
        return basicSetCoversPosition((Position)otherEnd, msgs);
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
      case IstartPackage.COVERS__COVERS_ROLE:
        return basicSetCoversRole(null, msgs);
      case IstartPackage.COVERS__COVERS_POSITION:
        return basicSetCoversPosition(null, msgs);
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
      case IstartPackage.COVERS__COVERS_ROLE:
        if (resolve) return getCoversRole();
        return basicGetCoversRole();
      case IstartPackage.COVERS__COVERS_POSITION:
        if (resolve) return getCoversPosition();
        return basicGetCoversPosition();
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
      case IstartPackage.COVERS__COVERS_ROLE:
        setCoversRole((Role)newValue);
        return;
      case IstartPackage.COVERS__COVERS_POSITION:
        setCoversPosition((Position)newValue);
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
      case IstartPackage.COVERS__COVERS_ROLE:
        setCoversRole((Role)null);
        return;
      case IstartPackage.COVERS__COVERS_POSITION:
        setCoversPosition((Position)null);
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
      case IstartPackage.COVERS__COVERS_ROLE:
        return coversRole != null;
      case IstartPackage.COVERS__COVERS_POSITION:
        return coversPosition != null;
    }
    return super.eIsSet(featureID);
  }

} //CoversImpl

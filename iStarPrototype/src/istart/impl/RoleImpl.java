/**
 */
package istart.impl;

import istart.Covers;
import istart.IstartPackage;
import istart.Plays;
import istart.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.RoleImpl#getRolePlays <em>Role Plays</em>}</li>
 *   <li>{@link istart.impl.RoleImpl#getRoleCovers <em>Role Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends ActorsImpl implements Role
{
  /**
   * The cached value of the '{@link #getRolePlays() <em>Role Plays</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRolePlays()
   * @generated
   * @ordered
   */
  protected EList<Plays> rolePlays;

  /**
   * The cached value of the '{@link #getRoleCovers() <em>Role Covers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleCovers()
   * @generated
   * @ordered
   */
  protected EList<Covers> roleCovers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleImpl()
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
    return IstartPackage.Literals.ROLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Plays> getRolePlays()
  {
    if (rolePlays == null)
    {
      rolePlays = new EObjectWithInverseResolvingEList<Plays>(Plays.class, this, IstartPackage.ROLE__ROLE_PLAYS, IstartPackage.PLAYS__PLAYS_ROLE);
    }
    return rolePlays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Covers> getRoleCovers()
  {
    if (roleCovers == null)
    {
      roleCovers = new EObjectWithInverseResolvingEList<Covers>(Covers.class, this, IstartPackage.ROLE__ROLE_COVERS, IstartPackage.COVERS__COVERS_ROLE);
    }
    return roleCovers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IstartPackage.ROLE__ROLE_PLAYS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getRolePlays()).basicAdd(otherEnd, msgs);
      case IstartPackage.ROLE__ROLE_COVERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleCovers()).basicAdd(otherEnd, msgs);
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
      case IstartPackage.ROLE__ROLE_PLAYS:
        return ((InternalEList<?>)getRolePlays()).basicRemove(otherEnd, msgs);
      case IstartPackage.ROLE__ROLE_COVERS:
        return ((InternalEList<?>)getRoleCovers()).basicRemove(otherEnd, msgs);
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
      case IstartPackage.ROLE__ROLE_PLAYS:
        return getRolePlays();
      case IstartPackage.ROLE__ROLE_COVERS:
        return getRoleCovers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IstartPackage.ROLE__ROLE_PLAYS:
        getRolePlays().clear();
        getRolePlays().addAll((Collection<? extends Plays>)newValue);
        return;
      case IstartPackage.ROLE__ROLE_COVERS:
        getRoleCovers().clear();
        getRoleCovers().addAll((Collection<? extends Covers>)newValue);
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
      case IstartPackage.ROLE__ROLE_PLAYS:
        getRolePlays().clear();
        return;
      case IstartPackage.ROLE__ROLE_COVERS:
        getRoleCovers().clear();
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
      case IstartPackage.ROLE__ROLE_PLAYS:
        return rolePlays != null && !rolePlays.isEmpty();
      case IstartPackage.ROLE__ROLE_COVERS:
        return roleCovers != null && !roleCovers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RoleImpl

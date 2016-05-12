/**
 */
package istart.impl;

import istart.Actor;
import istart.ISA;
import istart.IsPartOf;
import istart.IstartPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.ActorImpl#getActorISA <em>Actor ISA</em>}</li>
 *   <li>{@link istart.impl.ActorImpl#getSecondActorISA <em>Second Actor ISA</em>}</li>
 *   <li>{@link istart.impl.ActorImpl#getActorIsPartOf <em>Actor Is Part Of</em>}</li>
 *   <li>{@link istart.impl.ActorImpl#getSecondActorIsPartOf <em>Second Actor Is Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends ActorsImpl implements Actor
{
  /**
   * The cached value of the '{@link #getActorISA() <em>Actor ISA</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorISA()
   * @generated
   * @ordered
   */
  protected EList<ISA> actorISA;

  /**
   * The cached value of the '{@link #getSecondActorISA() <em>Second Actor ISA</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondActorISA()
   * @generated
   * @ordered
   */
  protected EList<ISA> secondActorISA;

  /**
   * The cached value of the '{@link #getActorIsPartOf() <em>Actor Is Part Of</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorIsPartOf()
   * @generated
   * @ordered
   */
  protected EList<IsPartOf> actorIsPartOf;

  /**
   * The cached value of the '{@link #getSecondActorIsPartOf() <em>Second Actor Is Part Of</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondActorIsPartOf()
   * @generated
   * @ordered
   */
  protected EList<IsPartOf> secondActorIsPartOf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorImpl()
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
    return IstartPackage.Literals.ACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ISA> getActorISA()
  {
    if (actorISA == null)
    {
      actorISA = new EObjectWithInverseResolvingEList<ISA>(ISA.class, this, IstartPackage.ACTOR__ACTOR_ISA, IstartPackage.ISA__IS_AACTOR);
    }
    return actorISA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ISA> getSecondActorISA()
  {
    if (secondActorISA == null)
    {
      secondActorISA = new EObjectWithInverseResolvingEList<ISA>(ISA.class, this, IstartPackage.ACTOR__SECOND_ACTOR_ISA, IstartPackage.ISA__IS_ASECOND_ACTOR);
    }
    return secondActorISA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IsPartOf> getActorIsPartOf()
  {
    if (actorIsPartOf == null)
    {
      actorIsPartOf = new EObjectWithInverseResolvingEList<IsPartOf>(IsPartOf.class, this, IstartPackage.ACTOR__ACTOR_IS_PART_OF, IstartPackage.IS_PART_OF__IS_PART_OF_ACTOR);
    }
    return actorIsPartOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IsPartOf> getSecondActorIsPartOf()
  {
    if (secondActorIsPartOf == null)
    {
      secondActorIsPartOf = new EObjectWithInverseResolvingEList<IsPartOf>(IsPartOf.class, this, IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF, IstartPackage.IS_PART_OF__IS_PART_OF_SECOND_ACTOR);
    }
    return secondActorIsPartOf;
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
      case IstartPackage.ACTOR__ACTOR_ISA:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getActorISA()).basicAdd(otherEnd, msgs);
      case IstartPackage.ACTOR__SECOND_ACTOR_ISA:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecondActorISA()).basicAdd(otherEnd, msgs);
      case IstartPackage.ACTOR__ACTOR_IS_PART_OF:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getActorIsPartOf()).basicAdd(otherEnd, msgs);
      case IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecondActorIsPartOf()).basicAdd(otherEnd, msgs);
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
      case IstartPackage.ACTOR__ACTOR_ISA:
        return ((InternalEList<?>)getActorISA()).basicRemove(otherEnd, msgs);
      case IstartPackage.ACTOR__SECOND_ACTOR_ISA:
        return ((InternalEList<?>)getSecondActorISA()).basicRemove(otherEnd, msgs);
      case IstartPackage.ACTOR__ACTOR_IS_PART_OF:
        return ((InternalEList<?>)getActorIsPartOf()).basicRemove(otherEnd, msgs);
      case IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF:
        return ((InternalEList<?>)getSecondActorIsPartOf()).basicRemove(otherEnd, msgs);
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
      case IstartPackage.ACTOR__ACTOR_ISA:
        return getActorISA();
      case IstartPackage.ACTOR__SECOND_ACTOR_ISA:
        return getSecondActorISA();
      case IstartPackage.ACTOR__ACTOR_IS_PART_OF:
        return getActorIsPartOf();
      case IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF:
        return getSecondActorIsPartOf();
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
      case IstartPackage.ACTOR__ACTOR_ISA:
        getActorISA().clear();
        getActorISA().addAll((Collection<? extends ISA>)newValue);
        return;
      case IstartPackage.ACTOR__SECOND_ACTOR_ISA:
        getSecondActorISA().clear();
        getSecondActorISA().addAll((Collection<? extends ISA>)newValue);
        return;
      case IstartPackage.ACTOR__ACTOR_IS_PART_OF:
        getActorIsPartOf().clear();
        getActorIsPartOf().addAll((Collection<? extends IsPartOf>)newValue);
        return;
      case IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF:
        getSecondActorIsPartOf().clear();
        getSecondActorIsPartOf().addAll((Collection<? extends IsPartOf>)newValue);
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
      case IstartPackage.ACTOR__ACTOR_ISA:
        getActorISA().clear();
        return;
      case IstartPackage.ACTOR__SECOND_ACTOR_ISA:
        getSecondActorISA().clear();
        return;
      case IstartPackage.ACTOR__ACTOR_IS_PART_OF:
        getActorIsPartOf().clear();
        return;
      case IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF:
        getSecondActorIsPartOf().clear();
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
      case IstartPackage.ACTOR__ACTOR_ISA:
        return actorISA != null && !actorISA.isEmpty();
      case IstartPackage.ACTOR__SECOND_ACTOR_ISA:
        return secondActorISA != null && !secondActorISA.isEmpty();
      case IstartPackage.ACTOR__ACTOR_IS_PART_OF:
        return actorIsPartOf != null && !actorIsPartOf.isEmpty();
      case IstartPackage.ACTOR__SECOND_ACTOR_IS_PART_OF:
        return secondActorIsPartOf != null && !secondActorIsPartOf.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActorImpl

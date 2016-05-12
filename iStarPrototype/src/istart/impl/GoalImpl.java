/**
 */
package istart.impl;

import istart.Goal;
import istart.IstartPackage;
import istart.MeansEnd;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.GoalImpl#getGoalMeansEnd <em>Goal Means End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends ElementImpl implements Goal
{
  /**
   * The cached value of the '{@link #getGoalMeansEnd() <em>Goal Means End</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalMeansEnd()
   * @generated
   * @ordered
   */
  protected EList<MeansEnd> goalMeansEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalImpl()
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
    return IstartPackage.Literals.GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MeansEnd> getGoalMeansEnd()
  {
    if (goalMeansEnd == null)
    {
      goalMeansEnd = new EObjectWithInverseResolvingEList<MeansEnd>(MeansEnd.class, this, IstartPackage.GOAL__GOAL_MEANS_END, IstartPackage.MEANS_END__MEANS_END_GOAL);
    }
    return goalMeansEnd;
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
      case IstartPackage.GOAL__GOAL_MEANS_END:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getGoalMeansEnd()).basicAdd(otherEnd, msgs);
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
      case IstartPackage.GOAL__GOAL_MEANS_END:
        return ((InternalEList<?>)getGoalMeansEnd()).basicRemove(otherEnd, msgs);
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
      case IstartPackage.GOAL__GOAL_MEANS_END:
        return getGoalMeansEnd();
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
      case IstartPackage.GOAL__GOAL_MEANS_END:
        getGoalMeansEnd().clear();
        getGoalMeansEnd().addAll((Collection<? extends MeansEnd>)newValue);
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
      case IstartPackage.GOAL__GOAL_MEANS_END:
        getGoalMeansEnd().clear();
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
      case IstartPackage.GOAL__GOAL_MEANS_END:
        return goalMeansEnd != null && !goalMeansEnd.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GoalImpl

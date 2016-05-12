/**
 */
package istart.impl;

import istart.DecompositionLink;
import istart.IstartPackage;
import istart.MeansEnd;
import istart.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.TaskImpl#getTaskMeansEnd <em>Task Means End</em>}</li>
 *   <li>{@link istart.impl.TaskImpl#getTaskDecomposition <em>Task Decomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends ElementImpl implements Task
{
  /**
   * The cached value of the '{@link #getTaskMeansEnd() <em>Task Means End</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskMeansEnd()
   * @generated
   * @ordered
   */
  protected EList<MeansEnd> taskMeansEnd;

  /**
   * The cached value of the '{@link #getTaskDecomposition() <em>Task Decomposition</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskDecomposition()
   * @generated
   * @ordered
   */
  protected EList<DecompositionLink> taskDecomposition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
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
    return IstartPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MeansEnd> getTaskMeansEnd()
  {
    if (taskMeansEnd == null)
    {
      taskMeansEnd = new EObjectWithInverseResolvingEList<MeansEnd>(MeansEnd.class, this, IstartPackage.TASK__TASK_MEANS_END, IstartPackage.MEANS_END__MEANS_END_TASK);
    }
    return taskMeansEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DecompositionLink> getTaskDecomposition()
  {
    if (taskDecomposition == null)
    {
      taskDecomposition = new EObjectWithInverseResolvingEList<DecompositionLink>(DecompositionLink.class, this, IstartPackage.TASK__TASK_DECOMPOSITION, IstartPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK);
    }
    return taskDecomposition;
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
      case IstartPackage.TASK__TASK_MEANS_END:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskMeansEnd()).basicAdd(otherEnd, msgs);
      case IstartPackage.TASK__TASK_DECOMPOSITION:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskDecomposition()).basicAdd(otherEnd, msgs);
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
      case IstartPackage.TASK__TASK_MEANS_END:
        return ((InternalEList<?>)getTaskMeansEnd()).basicRemove(otherEnd, msgs);
      case IstartPackage.TASK__TASK_DECOMPOSITION:
        return ((InternalEList<?>)getTaskDecomposition()).basicRemove(otherEnd, msgs);
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
      case IstartPackage.TASK__TASK_MEANS_END:
        return getTaskMeansEnd();
      case IstartPackage.TASK__TASK_DECOMPOSITION:
        return getTaskDecomposition();
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
      case IstartPackage.TASK__TASK_MEANS_END:
        getTaskMeansEnd().clear();
        getTaskMeansEnd().addAll((Collection<? extends MeansEnd>)newValue);
        return;
      case IstartPackage.TASK__TASK_DECOMPOSITION:
        getTaskDecomposition().clear();
        getTaskDecomposition().addAll((Collection<? extends DecompositionLink>)newValue);
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
      case IstartPackage.TASK__TASK_MEANS_END:
        getTaskMeansEnd().clear();
        return;
      case IstartPackage.TASK__TASK_DECOMPOSITION:
        getTaskDecomposition().clear();
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
      case IstartPackage.TASK__TASK_MEANS_END:
        return taskMeansEnd != null && !taskMeansEnd.isEmpty();
      case IstartPackage.TASK__TASK_DECOMPOSITION:
        return taskDecomposition != null && !taskDecomposition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TaskImpl

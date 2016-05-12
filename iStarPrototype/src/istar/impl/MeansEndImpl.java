/**
 */
package istar.impl;

import istar.Goal;
import istar.IstarPackage;
import istar.MeansEnd;
import istar.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Means End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.MeansEndImpl#getMeansEndTask <em>Means End Task</em>}</li>
 *   <li>{@link istar.impl.MeansEndImpl#getMeansEndGoal <em>Means End Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeansEndImpl extends DecompositionImpl implements MeansEnd
{
  /**
	 * The cached value of the '{@link #getMeansEndTask() <em>Means End Task</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMeansEndTask()
	 * @generated
	 * @ordered
	 */
  protected Task meansEndTask;

  /**
	 * The cached value of the '{@link #getMeansEndGoal() <em>Means End Goal</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMeansEndGoal()
	 * @generated
	 * @ordered
	 */
  protected Goal meansEndGoal;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MeansEndImpl()
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
		return IstarPackage.Literals.MEANS_END;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task getMeansEndTask()
  {
		if (meansEndTask != null && meansEndTask.eIsProxy()) {
			InternalEObject oldMeansEndTask = (InternalEObject)meansEndTask;
			meansEndTask = (Task)eResolveProxy(oldMeansEndTask);
			if (meansEndTask != oldMeansEndTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.MEANS_END__MEANS_END_TASK, oldMeansEndTask, meansEndTask));
			}
		}
		return meansEndTask;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task basicGetMeansEndTask()
  {
		return meansEndTask;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMeansEndTask(Task newMeansEndTask, NotificationChain msgs)
  {
		Task oldMeansEndTask = meansEndTask;
		meansEndTask = newMeansEndTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.MEANS_END__MEANS_END_TASK, oldMeansEndTask, newMeansEndTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMeansEndTask(Task newMeansEndTask)
  {
		if (newMeansEndTask != meansEndTask) {
			NotificationChain msgs = null;
			if (meansEndTask != null)
				msgs = ((InternalEObject)meansEndTask).eInverseRemove(this, IstarPackage.TASK__TASK_MEANS_END, Task.class, msgs);
			if (newMeansEndTask != null)
				msgs = ((InternalEObject)newMeansEndTask).eInverseAdd(this, IstarPackage.TASK__TASK_MEANS_END, Task.class, msgs);
			msgs = basicSetMeansEndTask(newMeansEndTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.MEANS_END__MEANS_END_TASK, newMeansEndTask, newMeansEndTask));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Goal getMeansEndGoal()
  {
		if (meansEndGoal != null && meansEndGoal.eIsProxy()) {
			InternalEObject oldMeansEndGoal = (InternalEObject)meansEndGoal;
			meansEndGoal = (Goal)eResolveProxy(oldMeansEndGoal);
			if (meansEndGoal != oldMeansEndGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.MEANS_END__MEANS_END_GOAL, oldMeansEndGoal, meansEndGoal));
			}
		}
		return meansEndGoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Goal basicGetMeansEndGoal()
  {
		return meansEndGoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMeansEndGoal(Goal newMeansEndGoal, NotificationChain msgs)
  {
		Goal oldMeansEndGoal = meansEndGoal;
		meansEndGoal = newMeansEndGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.MEANS_END__MEANS_END_GOAL, oldMeansEndGoal, newMeansEndGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMeansEndGoal(Goal newMeansEndGoal)
  {
		if (newMeansEndGoal != meansEndGoal) {
			NotificationChain msgs = null;
			if (meansEndGoal != null)
				msgs = ((InternalEObject)meansEndGoal).eInverseRemove(this, IstarPackage.GOAL__GOAL_MEANS_END, Goal.class, msgs);
			if (newMeansEndGoal != null)
				msgs = ((InternalEObject)newMeansEndGoal).eInverseAdd(this, IstarPackage.GOAL__GOAL_MEANS_END, Goal.class, msgs);
			msgs = basicSetMeansEndGoal(newMeansEndGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.MEANS_END__MEANS_END_GOAL, newMeansEndGoal, newMeansEndGoal));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case IstarPackage.MEANS_END__MEANS_END_TASK:
				if (meansEndTask != null)
					msgs = ((InternalEObject)meansEndTask).eInverseRemove(this, IstarPackage.TASK__TASK_MEANS_END, Task.class, msgs);
				return basicSetMeansEndTask((Task)otherEnd, msgs);
			case IstarPackage.MEANS_END__MEANS_END_GOAL:
				if (meansEndGoal != null)
					msgs = ((InternalEObject)meansEndGoal).eInverseRemove(this, IstarPackage.GOAL__GOAL_MEANS_END, Goal.class, msgs);
				return basicSetMeansEndGoal((Goal)otherEnd, msgs);
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
		switch (featureID) {
			case IstarPackage.MEANS_END__MEANS_END_TASK:
				return basicSetMeansEndTask(null, msgs);
			case IstarPackage.MEANS_END__MEANS_END_GOAL:
				return basicSetMeansEndGoal(null, msgs);
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
		switch (featureID) {
			case IstarPackage.MEANS_END__MEANS_END_TASK:
				if (resolve) return getMeansEndTask();
				return basicGetMeansEndTask();
			case IstarPackage.MEANS_END__MEANS_END_GOAL:
				if (resolve) return getMeansEndGoal();
				return basicGetMeansEndGoal();
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
		switch (featureID) {
			case IstarPackage.MEANS_END__MEANS_END_TASK:
				setMeansEndTask((Task)newValue);
				return;
			case IstarPackage.MEANS_END__MEANS_END_GOAL:
				setMeansEndGoal((Goal)newValue);
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
		switch (featureID) {
			case IstarPackage.MEANS_END__MEANS_END_TASK:
				setMeansEndTask((Task)null);
				return;
			case IstarPackage.MEANS_END__MEANS_END_GOAL:
				setMeansEndGoal((Goal)null);
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
		switch (featureID) {
			case IstarPackage.MEANS_END__MEANS_END_TASK:
				return meansEndTask != null;
			case IstarPackage.MEANS_END__MEANS_END_GOAL:
				return meansEndGoal != null;
		}
		return super.eIsSet(featureID);
	}

} //MeansEndImpl

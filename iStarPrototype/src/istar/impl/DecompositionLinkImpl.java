/**
 */
package istar.impl;

import istar.DecompositionLink;
import istar.Element;
import istar.IstarPackage;
import istar.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.DecompositionLinkImpl#getDecompositionTask <em>Decomposition Task</em>}</li>
 *   <li>{@link istar.impl.DecompositionLinkImpl#getDecompositionElement <em>Decomposition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecompositionLinkImpl extends DecompositionImpl implements DecompositionLink
{
  /**
	 * The cached value of the '{@link #getDecompositionTask() <em>Decomposition Task</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDecompositionTask()
	 * @generated
	 * @ordered
	 */
  protected Task decompositionTask;

  /**
	 * The cached value of the '{@link #getDecompositionElement() <em>Decomposition Element</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDecompositionElement()
	 * @generated
	 * @ordered
	 */
  protected Element decompositionElement;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DecompositionLinkImpl()
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
		return IstarPackage.Literals.DECOMPOSITION_LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task getDecompositionTask()
  {
		if (decompositionTask != null && decompositionTask.eIsProxy()) {
			InternalEObject oldDecompositionTask = (InternalEObject)decompositionTask;
			decompositionTask = (Task)eResolveProxy(oldDecompositionTask);
			if (decompositionTask != oldDecompositionTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK, oldDecompositionTask, decompositionTask));
			}
		}
		return decompositionTask;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Task basicGetDecompositionTask()
  {
		return decompositionTask;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDecompositionTask(Task newDecompositionTask, NotificationChain msgs)
  {
		Task oldDecompositionTask = decompositionTask;
		decompositionTask = newDecompositionTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK, oldDecompositionTask, newDecompositionTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDecompositionTask(Task newDecompositionTask)
  {
		if (newDecompositionTask != decompositionTask) {
			NotificationChain msgs = null;
			if (decompositionTask != null)
				msgs = ((InternalEObject)decompositionTask).eInverseRemove(this, IstarPackage.TASK__TASK_DECOMPOSITION, Task.class, msgs);
			if (newDecompositionTask != null)
				msgs = ((InternalEObject)newDecompositionTask).eInverseAdd(this, IstarPackage.TASK__TASK_DECOMPOSITION, Task.class, msgs);
			msgs = basicSetDecompositionTask(newDecompositionTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK, newDecompositionTask, newDecompositionTask));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Element getDecompositionElement()
  {
		if (decompositionElement != null && decompositionElement.eIsProxy()) {
			InternalEObject oldDecompositionElement = (InternalEObject)decompositionElement;
			decompositionElement = (Element)eResolveProxy(oldDecompositionElement);
			if (decompositionElement != oldDecompositionElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT, oldDecompositionElement, decompositionElement));
			}
		}
		return decompositionElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Element basicGetDecompositionElement()
  {
		return decompositionElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDecompositionElement(Element newDecompositionElement, NotificationChain msgs)
  {
		Element oldDecompositionElement = decompositionElement;
		decompositionElement = newDecompositionElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT, oldDecompositionElement, newDecompositionElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDecompositionElement(Element newDecompositionElement)
  {
		if (newDecompositionElement != decompositionElement) {
			NotificationChain msgs = null;
			if (decompositionElement != null)
				msgs = ((InternalEObject)decompositionElement).eInverseRemove(this, IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION, Element.class, msgs);
			if (newDecompositionElement != null)
				msgs = ((InternalEObject)newDecompositionElement).eInverseAdd(this, IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION, Element.class, msgs);
			msgs = basicSetDecompositionElement(newDecompositionElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT, newDecompositionElement, newDecompositionElement));
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
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK:
				if (decompositionTask != null)
					msgs = ((InternalEObject)decompositionTask).eInverseRemove(this, IstarPackage.TASK__TASK_DECOMPOSITION, Task.class, msgs);
				return basicSetDecompositionTask((Task)otherEnd, msgs);
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT:
				if (decompositionElement != null)
					msgs = ((InternalEObject)decompositionElement).eInverseRemove(this, IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION, Element.class, msgs);
				return basicSetDecompositionElement((Element)otherEnd, msgs);
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
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK:
				return basicSetDecompositionTask(null, msgs);
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT:
				return basicSetDecompositionElement(null, msgs);
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
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK:
				if (resolve) return getDecompositionTask();
				return basicGetDecompositionTask();
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT:
				if (resolve) return getDecompositionElement();
				return basicGetDecompositionElement();
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
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK:
				setDecompositionTask((Task)newValue);
				return;
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT:
				setDecompositionElement((Element)newValue);
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
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK:
				setDecompositionTask((Task)null);
				return;
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT:
				setDecompositionElement((Element)null);
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
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_TASK:
				return decompositionTask != null;
			case IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT:
				return decompositionElement != null;
		}
		return super.eIsSet(featureID);
	}

} //DecompositionLinkImpl

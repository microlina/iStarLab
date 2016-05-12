/**
 */
package istar.impl;

import istar.ContributionLink;
import istar.Element;
import istar.IstarPackage;
import istar.Softgoal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.ContributionLinkImpl#getContributionElement <em>Contribution Element</em>}</li>
 *   <li>{@link istar.impl.ContributionLinkImpl#getContributionSoftgoal <em>Contribution Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContributionLinkImpl extends RelationshipImpl implements ContributionLink
{
  /**
	 * The cached value of the '{@link #getContributionElement() <em>Contribution Element</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContributionElement()
	 * @generated
	 * @ordered
	 */
  protected Element contributionElement;

  /**
	 * The cached value of the '{@link #getContributionSoftgoal() <em>Contribution Softgoal</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContributionSoftgoal()
	 * @generated
	 * @ordered
	 */
  protected Softgoal contributionSoftgoal;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContributionLinkImpl()
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
		return IstarPackage.Literals.CONTRIBUTION_LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Element getContributionElement()
  {
		if (contributionElement != null && contributionElement.eIsProxy()) {
			InternalEObject oldContributionElement = (InternalEObject)contributionElement;
			contributionElement = (Element)eResolveProxy(oldContributionElement);
			if (contributionElement != oldContributionElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT, oldContributionElement, contributionElement));
			}
		}
		return contributionElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Element basicGetContributionElement()
  {
		return contributionElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetContributionElement(Element newContributionElement, NotificationChain msgs)
  {
		Element oldContributionElement = contributionElement;
		contributionElement = newContributionElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT, oldContributionElement, newContributionElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContributionElement(Element newContributionElement)
  {
		if (newContributionElement != contributionElement) {
			NotificationChain msgs = null;
			if (contributionElement != null)
				msgs = ((InternalEObject)contributionElement).eInverseRemove(this, IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION, Element.class, msgs);
			if (newContributionElement != null)
				msgs = ((InternalEObject)newContributionElement).eInverseAdd(this, IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION, Element.class, msgs);
			msgs = basicSetContributionElement(newContributionElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT, newContributionElement, newContributionElement));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Softgoal getContributionSoftgoal()
  {
		if (contributionSoftgoal != null && contributionSoftgoal.eIsProxy()) {
			InternalEObject oldContributionSoftgoal = (InternalEObject)contributionSoftgoal;
			contributionSoftgoal = (Softgoal)eResolveProxy(oldContributionSoftgoal);
			if (contributionSoftgoal != oldContributionSoftgoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL, oldContributionSoftgoal, contributionSoftgoal));
			}
		}
		return contributionSoftgoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Softgoal basicGetContributionSoftgoal()
  {
		return contributionSoftgoal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetContributionSoftgoal(Softgoal newContributionSoftgoal, NotificationChain msgs)
  {
		Softgoal oldContributionSoftgoal = contributionSoftgoal;
		contributionSoftgoal = newContributionSoftgoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL, oldContributionSoftgoal, newContributionSoftgoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContributionSoftgoal(Softgoal newContributionSoftgoal)
  {
		if (newContributionSoftgoal != contributionSoftgoal) {
			NotificationChain msgs = null;
			if (contributionSoftgoal != null)
				msgs = ((InternalEObject)contributionSoftgoal).eInverseRemove(this, IstarPackage.SOFTGOAL__SOFTGOAL_CONTRIBUTION, Softgoal.class, msgs);
			if (newContributionSoftgoal != null)
				msgs = ((InternalEObject)newContributionSoftgoal).eInverseAdd(this, IstarPackage.SOFTGOAL__SOFTGOAL_CONTRIBUTION, Softgoal.class, msgs);
			msgs = basicSetContributionSoftgoal(newContributionSoftgoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL, newContributionSoftgoal, newContributionSoftgoal));
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
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT:
				if (contributionElement != null)
					msgs = ((InternalEObject)contributionElement).eInverseRemove(this, IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION, Element.class, msgs);
				return basicSetContributionElement((Element)otherEnd, msgs);
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL:
				if (contributionSoftgoal != null)
					msgs = ((InternalEObject)contributionSoftgoal).eInverseRemove(this, IstarPackage.SOFTGOAL__SOFTGOAL_CONTRIBUTION, Softgoal.class, msgs);
				return basicSetContributionSoftgoal((Softgoal)otherEnd, msgs);
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
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT:
				return basicSetContributionElement(null, msgs);
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL:
				return basicSetContributionSoftgoal(null, msgs);
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
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT:
				if (resolve) return getContributionElement();
				return basicGetContributionElement();
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL:
				if (resolve) return getContributionSoftgoal();
				return basicGetContributionSoftgoal();
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
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT:
				setContributionElement((Element)newValue);
				return;
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL:
				setContributionSoftgoal((Softgoal)newValue);
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
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT:
				setContributionElement((Element)null);
				return;
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL:
				setContributionSoftgoal((Softgoal)null);
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
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT:
				return contributionElement != null;
			case IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL:
				return contributionSoftgoal != null;
		}
		return super.eIsSet(featureID);
	}

} //ContributionLinkImpl

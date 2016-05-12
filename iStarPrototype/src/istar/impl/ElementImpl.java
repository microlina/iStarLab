/**
 */
package istar.impl;

import istar.ContributionLink;
import istar.DecompositionLink;
import istar.Element;
import istar.IstarPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.ElementImpl#getElementContribution <em>Element Contribution</em>}</li>
 *   <li>{@link istar.impl.ElementImpl#getElementDecomposition <em>Element Decomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends NodeImpl implements Element
{
  /**
	 * The cached value of the '{@link #getElementContribution() <em>Element Contribution</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElementContribution()
	 * @generated
	 * @ordered
	 */
  protected EList<ContributionLink> elementContribution;

  /**
	 * The cached value of the '{@link #getElementDecomposition() <em>Element Decomposition</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElementDecomposition()
	 * @generated
	 * @ordered
	 */
  protected EList<DecompositionLink> elementDecomposition;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ElementImpl()
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
		return IstarPackage.Literals.ELEMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ContributionLink> getElementContribution()
  {
		if (elementContribution == null) {
			elementContribution = new EObjectWithInverseResolvingEList<ContributionLink>(ContributionLink.class, this, IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION, IstarPackage.CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT);
		}
		return elementContribution;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DecompositionLink> getElementDecomposition()
  {
		if (elementDecomposition == null) {
			elementDecomposition = new EObjectWithInverseResolvingEList<DecompositionLink>(DecompositionLink.class, this, IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION, IstarPackage.DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT);
		}
		return elementDecomposition;
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
		switch (featureID) {
			case IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementContribution()).basicAdd(otherEnd, msgs);
			case IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementDecomposition()).basicAdd(otherEnd, msgs);
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
			case IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION:
				return ((InternalEList<?>)getElementContribution()).basicRemove(otherEnd, msgs);
			case IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION:
				return ((InternalEList<?>)getElementDecomposition()).basicRemove(otherEnd, msgs);
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
			case IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION:
				return getElementContribution();
			case IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION:
				return getElementDecomposition();
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
		switch (featureID) {
			case IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION:
				getElementContribution().clear();
				getElementContribution().addAll((Collection<? extends ContributionLink>)newValue);
				return;
			case IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION:
				getElementDecomposition().clear();
				getElementDecomposition().addAll((Collection<? extends DecompositionLink>)newValue);
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
			case IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION:
				getElementContribution().clear();
				return;
			case IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION:
				getElementDecomposition().clear();
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
			case IstarPackage.ELEMENT__ELEMENT_CONTRIBUTION:
				return elementContribution != null && !elementContribution.isEmpty();
			case IstarPackage.ELEMENT__ELEMENT_DECOMPOSITION:
				return elementDecomposition != null && !elementDecomposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl

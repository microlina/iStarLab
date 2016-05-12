/**
 */
package istar.impl;

import istar.Covers;
import istar.IstarPackage;
import istar.Occupies;
import istar.Position;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.PositionImpl#getPositionCovers <em>Position Covers</em>}</li>
 *   <li>{@link istar.impl.PositionImpl#getPositionOccupies <em>Position Occupies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionImpl extends ActorsImpl implements Position
{
  /**
	 * The cached value of the '{@link #getPositionCovers() <em>Position Covers</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPositionCovers()
	 * @generated
	 * @ordered
	 */
  protected EList<Covers> positionCovers;

  /**
	 * The cached value of the '{@link #getPositionOccupies() <em>Position Occupies</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPositionOccupies()
	 * @generated
	 * @ordered
	 */
  protected EList<Occupies> positionOccupies;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PositionImpl()
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
		return IstarPackage.Literals.POSITION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Covers> getPositionCovers()
  {
		if (positionCovers == null) {
			positionCovers = new EObjectWithInverseResolvingEList<Covers>(Covers.class, this, IstarPackage.POSITION__POSITION_COVERS, IstarPackage.COVERS__COVERS_POSITION);
		}
		return positionCovers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Occupies> getPositionOccupies()
  {
		if (positionOccupies == null) {
			positionOccupies = new EObjectWithInverseResolvingEList<Occupies>(Occupies.class, this, IstarPackage.POSITION__POSITION_OCCUPIES, IstarPackage.OCCUPIES__OCCUPIES_POSITION);
		}
		return positionOccupies;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer NEIP() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case IstarPackage.POSITION__POSITION_COVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPositionCovers()).basicAdd(otherEnd, msgs);
			case IstarPackage.POSITION__POSITION_OCCUPIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPositionOccupies()).basicAdd(otherEnd, msgs);
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
			case IstarPackage.POSITION__POSITION_COVERS:
				return ((InternalEList<?>)getPositionCovers()).basicRemove(otherEnd, msgs);
			case IstarPackage.POSITION__POSITION_OCCUPIES:
				return ((InternalEList<?>)getPositionOccupies()).basicRemove(otherEnd, msgs);
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
			case IstarPackage.POSITION__POSITION_COVERS:
				return getPositionCovers();
			case IstarPackage.POSITION__POSITION_OCCUPIES:
				return getPositionOccupies();
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
			case IstarPackage.POSITION__POSITION_COVERS:
				getPositionCovers().clear();
				getPositionCovers().addAll((Collection<? extends Covers>)newValue);
				return;
			case IstarPackage.POSITION__POSITION_OCCUPIES:
				getPositionOccupies().clear();
				getPositionOccupies().addAll((Collection<? extends Occupies>)newValue);
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
			case IstarPackage.POSITION__POSITION_COVERS:
				getPositionCovers().clear();
				return;
			case IstarPackage.POSITION__POSITION_OCCUPIES:
				getPositionOccupies().clear();
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
			case IstarPackage.POSITION__POSITION_COVERS:
				return positionCovers != null && !positionCovers.isEmpty();
			case IstarPackage.POSITION__POSITION_OCCUPIES:
				return positionOccupies != null && !positionOccupies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PositionImpl

/**
 */
package istar.impl;

import istar.IstarPackage;
import istar.NFR;
import istar.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.RelationshipImpl#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link istar.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link istar.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link istar.impl.RelationshipImpl#getRelationshipNFR <em>Relationship NFR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends EObjectImpl implements Relationship
{
  /**
	 * The default value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
  protected static final String RELATIONSHIP_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
  protected String relationshipName = RELATIONSHIP_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
  protected static final String SOURCE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
  protected String source = SOURCE_EDEFAULT;

  /**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
  protected static final String TARGET_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
  protected String target = TARGET_EDEFAULT;

  /**
	 * The cached value of the '{@link #getRelationshipNFR() <em>Relationship NFR</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRelationshipNFR()
	 * @generated
	 * @ordered
	 */
  protected EList<NFR> relationshipNFR;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RelationshipImpl()
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
		return IstarPackage.Literals.RELATIONSHIP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getRelationshipName()
  {
		return relationshipName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRelationshipName(String newRelationshipName)
  {
		String oldRelationshipName = relationshipName;
		relationshipName = newRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.RELATIONSHIP__RELATIONSHIP_NAME, oldRelationshipName, relationshipName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSource()
  {
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSource(String newSource)
  {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.RELATIONSHIP__SOURCE, oldSource, source));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTarget()
  {
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTarget(String newTarget)
  {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.RELATIONSHIP__TARGET, oldTarget, target));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<NFR> getRelationshipNFR()
  {
		if (relationshipNFR == null) {
			relationshipNFR = new EDataTypeUniqueEList<NFR>(NFR.class, this, IstarPackage.RELATIONSHIP__RELATIONSHIP_NFR);
		}
		return relationshipNFR;
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
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NAME:
				return getRelationshipName();
			case IstarPackage.RELATIONSHIP__SOURCE:
				return getSource();
			case IstarPackage.RELATIONSHIP__TARGET:
				return getTarget();
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NFR:
				return getRelationshipNFR();
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
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName((String)newValue);
				return;
			case IstarPackage.RELATIONSHIP__SOURCE:
				setSource((String)newValue);
				return;
			case IstarPackage.RELATIONSHIP__TARGET:
				setTarget((String)newValue);
				return;
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NFR:
				getRelationshipNFR().clear();
				getRelationshipNFR().addAll((Collection<? extends NFR>)newValue);
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
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName(RELATIONSHIP_NAME_EDEFAULT);
				return;
			case IstarPackage.RELATIONSHIP__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case IstarPackage.RELATIONSHIP__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NFR:
				getRelationshipNFR().clear();
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
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NAME:
				return RELATIONSHIP_NAME_EDEFAULT == null ? relationshipName != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationshipName);
			case IstarPackage.RELATIONSHIP__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case IstarPackage.RELATIONSHIP__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case IstarPackage.RELATIONSHIP__RELATIONSHIP_NFR:
				return relationshipNFR != null && !relationshipNFR.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relationshipName: ");
		result.append(relationshipName);
		result.append(", source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(", relationshipNFR: ");
		result.append(relationshipNFR);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl

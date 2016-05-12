/**
 */
package istart.impl;

import istart.ISTAR;
import istart.IstartPackage;
import istart.Node;
import istart.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISTAR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.ISTARImpl#getHasNode <em>Has Node</em>}</li>
 *   <li>{@link istart.impl.ISTARImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link istart.impl.ISTARImpl#getHasRelationship <em>Has Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ISTARImpl extends EObjectImpl implements ISTAR
{
  /**
   * The cached value of the '{@link #getHasNode() <em>Has Node</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasNode()
   * @generated
   * @ordered
   */
  protected EList<Node> hasNode;

  /**
   * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelName()
   * @generated
   * @ordered
   */
  protected static final String MODEL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelName()
   * @generated
   * @ordered
   */
  protected String modelName = MODEL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHasRelationship() <em>Has Relationship</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasRelationship()
   * @generated
   * @ordered
   */
  protected EList<Relationship> hasRelationship;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ISTARImpl()
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
    return IstartPackage.Literals.ISTAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getHasNode()
  {
    if (hasNode == null)
    {
      hasNode = new EObjectContainmentEList<Node>(Node.class, this, IstartPackage.ISTAR__HAS_NODE);
    }
    return hasNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelName()
  {
    return modelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelName(String newModelName)
  {
    String oldModelName = modelName;
    modelName = newModelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.ISTAR__MODEL_NAME, oldModelName, modelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relationship> getHasRelationship()
  {
    if (hasRelationship == null)
    {
      hasRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, IstartPackage.ISTAR__HAS_RELATIONSHIP);
    }
    return hasRelationship;
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
      case IstartPackage.ISTAR__HAS_NODE:
        return ((InternalEList<?>)getHasNode()).basicRemove(otherEnd, msgs);
      case IstartPackage.ISTAR__HAS_RELATIONSHIP:
        return ((InternalEList<?>)getHasRelationship()).basicRemove(otherEnd, msgs);
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
      case IstartPackage.ISTAR__HAS_NODE:
        return getHasNode();
      case IstartPackage.ISTAR__MODEL_NAME:
        return getModelName();
      case IstartPackage.ISTAR__HAS_RELATIONSHIP:
        return getHasRelationship();
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
      case IstartPackage.ISTAR__HAS_NODE:
        getHasNode().clear();
        getHasNode().addAll((Collection<? extends Node>)newValue);
        return;
      case IstartPackage.ISTAR__MODEL_NAME:
        setModelName((String)newValue);
        return;
      case IstartPackage.ISTAR__HAS_RELATIONSHIP:
        getHasRelationship().clear();
        getHasRelationship().addAll((Collection<? extends Relationship>)newValue);
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
      case IstartPackage.ISTAR__HAS_NODE:
        getHasNode().clear();
        return;
      case IstartPackage.ISTAR__MODEL_NAME:
        setModelName(MODEL_NAME_EDEFAULT);
        return;
      case IstartPackage.ISTAR__HAS_RELATIONSHIP:
        getHasRelationship().clear();
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
      case IstartPackage.ISTAR__HAS_NODE:
        return hasNode != null && !hasNode.isEmpty();
      case IstartPackage.ISTAR__MODEL_NAME:
        return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
      case IstartPackage.ISTAR__HAS_RELATIONSHIP:
        return hasRelationship != null && !hasRelationship.isEmpty();
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
    result.append(" (modelName: ");
    result.append(modelName);
    result.append(')');
    return result.toString();
  }

} //ISTARImpl

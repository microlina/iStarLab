/**
 */
package istar.impl;

import istar.DependencyLink;
import istar.IstarPackage;
import istar.NFR;
import istar.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.NodeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link istar.impl.NodeImpl#getNodeDependency <em>Node Dependency</em>}</li>
 *   <li>{@link istar.impl.NodeImpl#getSecondNodeDependency <em>Second Node Dependency</em>}</li>
 *   <li>{@link istar.impl.NodeImpl#getNodeNFR <em>Node NFR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node
{
  /**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
  protected static final String NODE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
  protected String nodeName = NODE_NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getNodeDependency() <em>Node Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNodeDependency()
	 * @generated
	 * @ordered
	 */
  protected EList<DependencyLink> nodeDependency;

  /**
	 * The cached value of the '{@link #getSecondNodeDependency() <em>Second Node Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecondNodeDependency()
	 * @generated
	 * @ordered
	 */
  protected EList<DependencyLink> secondNodeDependency;

  /**
	 * The cached value of the '{@link #getNodeNFR() <em>Node NFR</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNodeNFR()
	 * @generated
	 * @ordered
	 */
  protected EList<NFR> nodeNFR;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NodeImpl()
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
		return IstarPackage.Literals.NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getNodeName()
  {
		return nodeName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNodeName(String newNodeName)
  {
		String oldNodeName = nodeName;
		nodeName = newNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.NODE__NODE_NAME, oldNodeName, nodeName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DependencyLink> getNodeDependency()
  {
		if (nodeDependency == null) {
			nodeDependency = new EObjectWithInverseResolvingEList<DependencyLink>(DependencyLink.class, this, IstarPackage.NODE__NODE_DEPENDENCY, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE);
		}
		return nodeDependency;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DependencyLink> getSecondNodeDependency()
  {
		if (secondNodeDependency == null) {
			secondNodeDependency = new EObjectWithInverseResolvingEList<DependencyLink>(DependencyLink.class, this, IstarPackage.NODE__SECOND_NODE_DEPENDENCY, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE);
		}
		return secondNodeDependency;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<NFR> getNodeNFR()
  {
		if (nodeNFR == null) {
			nodeNFR = new EDataTypeUniqueEList<NFR>(NFR.class, this, IstarPackage.NODE__NODE_NFR);
		}
		return nodeNFR;
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
			case IstarPackage.NODE__NODE_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodeDependency()).basicAdd(otherEnd, msgs);
			case IstarPackage.NODE__SECOND_NODE_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecondNodeDependency()).basicAdd(otherEnd, msgs);
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
			case IstarPackage.NODE__NODE_DEPENDENCY:
				return ((InternalEList<?>)getNodeDependency()).basicRemove(otherEnd, msgs);
			case IstarPackage.NODE__SECOND_NODE_DEPENDENCY:
				return ((InternalEList<?>)getSecondNodeDependency()).basicRemove(otherEnd, msgs);
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
			case IstarPackage.NODE__NODE_NAME:
				return getNodeName();
			case IstarPackage.NODE__NODE_DEPENDENCY:
				return getNodeDependency();
			case IstarPackage.NODE__SECOND_NODE_DEPENDENCY:
				return getSecondNodeDependency();
			case IstarPackage.NODE__NODE_NFR:
				return getNodeNFR();
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
			case IstarPackage.NODE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case IstarPackage.NODE__NODE_DEPENDENCY:
				getNodeDependency().clear();
				getNodeDependency().addAll((Collection<? extends DependencyLink>)newValue);
				return;
			case IstarPackage.NODE__SECOND_NODE_DEPENDENCY:
				getSecondNodeDependency().clear();
				getSecondNodeDependency().addAll((Collection<? extends DependencyLink>)newValue);
				return;
			case IstarPackage.NODE__NODE_NFR:
				getNodeNFR().clear();
				getNodeNFR().addAll((Collection<? extends NFR>)newValue);
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
			case IstarPackage.NODE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case IstarPackage.NODE__NODE_DEPENDENCY:
				getNodeDependency().clear();
				return;
			case IstarPackage.NODE__SECOND_NODE_DEPENDENCY:
				getSecondNodeDependency().clear();
				return;
			case IstarPackage.NODE__NODE_NFR:
				getNodeNFR().clear();
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
			case IstarPackage.NODE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case IstarPackage.NODE__NODE_DEPENDENCY:
				return nodeDependency != null && !nodeDependency.isEmpty();
			case IstarPackage.NODE__SECOND_NODE_DEPENDENCY:
				return secondNodeDependency != null && !secondNodeDependency.isEmpty();
			case IstarPackage.NODE__NODE_NFR:
				return nodeNFR != null && !nodeNFR.isEmpty();
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
		result.append(" (nodeName: ");
		result.append(nodeName);
		result.append(", nodeNFR: ");
		result.append(nodeNFR);
		result.append(')');
		return result.toString();
	}

} //NodeImpl

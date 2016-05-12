/**
 */
package istar.impl;

import istar.DependencyLink;
import istar.DependencyStrength;
import istar.IstarPackage;
import istar.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.DependencyLinkImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link istar.impl.DependencyLinkImpl#getDependencyName <em>Dependency Name</em>}</li>
 *   <li>{@link istar.impl.DependencyLinkImpl#getDependencyNode <em>Dependency Node</em>}</li>
 *   <li>{@link istar.impl.DependencyLinkImpl#getDependencySecondNode <em>Dependency Second Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyLinkImpl extends RelationshipImpl implements DependencyLink
{
  /**
	 * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
  protected static final DependencyStrength STRENGTH_EDEFAULT = DependencyStrength.COMMITED;

  /**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
  protected DependencyStrength strength = STRENGTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getDependencyName() <em>Dependency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDependencyName()
	 * @generated
	 * @ordered
	 */
  protected static final String DEPENDENCY_NAME_EDEFAULT = "D";

  /**
	 * The cached value of the '{@link #getDependencyName() <em>Dependency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDependencyName()
	 * @generated
	 * @ordered
	 */
  protected String dependencyName = DEPENDENCY_NAME_EDEFAULT;

  /**
	 * This is true if the Dependency Name attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean dependencyNameESet;

  /**
	 * The cached value of the '{@link #getDependencyNode() <em>Dependency Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDependencyNode()
	 * @generated
	 * @ordered
	 */
  protected Node dependencyNode;

  /**
	 * The cached value of the '{@link #getDependencySecondNode() <em>Dependency Second Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDependencySecondNode()
	 * @generated
	 * @ordered
	 */
  protected Node dependencySecondNode;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DependencyLinkImpl()
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
		return IstarPackage.Literals.DEPENDENCY_LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DependencyStrength getStrength()
  {
		return strength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStrength(DependencyStrength newStrength)
  {
		DependencyStrength oldStrength = strength;
		strength = newStrength == null ? STRENGTH_EDEFAULT : newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.DEPENDENCY_LINK__STRENGTH, oldStrength, strength));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDependencyName()
  {
		return dependencyName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDependencyName(String newDependencyName)
  {
		String oldDependencyName = dependencyName;
		dependencyName = newDependencyName;
		boolean oldDependencyNameESet = dependencyNameESet;
		dependencyNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NAME, oldDependencyName, dependencyName, !oldDependencyNameESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetDependencyName()
  {
		String oldDependencyName = dependencyName;
		boolean oldDependencyNameESet = dependencyNameESet;
		dependencyName = DEPENDENCY_NAME_EDEFAULT;
		dependencyNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NAME, oldDependencyName, DEPENDENCY_NAME_EDEFAULT, oldDependencyNameESet));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetDependencyName()
  {
		return dependencyNameESet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Node getDependencyNode()
  {
		if (dependencyNode != null && dependencyNode.eIsProxy()) {
			InternalEObject oldDependencyNode = (InternalEObject)dependencyNode;
			dependencyNode = (Node)eResolveProxy(oldDependencyNode);
			if (dependencyNode != oldDependencyNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE, oldDependencyNode, dependencyNode));
			}
		}
		return dependencyNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Node basicGetDependencyNode()
  {
		return dependencyNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDependencyNode(Node newDependencyNode, NotificationChain msgs)
  {
		Node oldDependencyNode = dependencyNode;
		dependencyNode = newDependencyNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE, oldDependencyNode, newDependencyNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDependencyNode(Node newDependencyNode)
  {
		if (newDependencyNode != dependencyNode) {
			NotificationChain msgs = null;
			if (dependencyNode != null)
				msgs = ((InternalEObject)dependencyNode).eInverseRemove(this, IstarPackage.NODE__NODE_DEPENDENCY, Node.class, msgs);
			if (newDependencyNode != null)
				msgs = ((InternalEObject)newDependencyNode).eInverseAdd(this, IstarPackage.NODE__NODE_DEPENDENCY, Node.class, msgs);
			msgs = basicSetDependencyNode(newDependencyNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE, newDependencyNode, newDependencyNode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Node getDependencySecondNode()
  {
		if (dependencySecondNode != null && dependencySecondNode.eIsProxy()) {
			InternalEObject oldDependencySecondNode = (InternalEObject)dependencySecondNode;
			dependencySecondNode = (Node)eResolveProxy(oldDependencySecondNode);
			if (dependencySecondNode != oldDependencySecondNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE, oldDependencySecondNode, dependencySecondNode));
			}
		}
		return dependencySecondNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Node basicGetDependencySecondNode()
  {
		return dependencySecondNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDependencySecondNode(Node newDependencySecondNode, NotificationChain msgs)
  {
		Node oldDependencySecondNode = dependencySecondNode;
		dependencySecondNode = newDependencySecondNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE, oldDependencySecondNode, newDependencySecondNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDependencySecondNode(Node newDependencySecondNode)
  {
		if (newDependencySecondNode != dependencySecondNode) {
			NotificationChain msgs = null;
			if (dependencySecondNode != null)
				msgs = ((InternalEObject)dependencySecondNode).eInverseRemove(this, IstarPackage.NODE__SECOND_NODE_DEPENDENCY, Node.class, msgs);
			if (newDependencySecondNode != null)
				msgs = ((InternalEObject)newDependencySecondNode).eInverseAdd(this, IstarPackage.NODE__SECOND_NODE_DEPENDENCY, Node.class, msgs);
			msgs = basicSetDependencySecondNode(newDependencySecondNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE, newDependencySecondNode, newDependencySecondNode));
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
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE:
				if (dependencyNode != null)
					msgs = ((InternalEObject)dependencyNode).eInverseRemove(this, IstarPackage.NODE__NODE_DEPENDENCY, Node.class, msgs);
				return basicSetDependencyNode((Node)otherEnd, msgs);
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE:
				if (dependencySecondNode != null)
					msgs = ((InternalEObject)dependencySecondNode).eInverseRemove(this, IstarPackage.NODE__SECOND_NODE_DEPENDENCY, Node.class, msgs);
				return basicSetDependencySecondNode((Node)otherEnd, msgs);
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
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE:
				return basicSetDependencyNode(null, msgs);
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE:
				return basicSetDependencySecondNode(null, msgs);
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
			case IstarPackage.DEPENDENCY_LINK__STRENGTH:
				return getStrength();
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NAME:
				return getDependencyName();
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE:
				if (resolve) return getDependencyNode();
				return basicGetDependencyNode();
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE:
				if (resolve) return getDependencySecondNode();
				return basicGetDependencySecondNode();
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
			case IstarPackage.DEPENDENCY_LINK__STRENGTH:
				setStrength((DependencyStrength)newValue);
				return;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NAME:
				setDependencyName((String)newValue);
				return;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE:
				setDependencyNode((Node)newValue);
				return;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE:
				setDependencySecondNode((Node)newValue);
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
			case IstarPackage.DEPENDENCY_LINK__STRENGTH:
				setStrength(STRENGTH_EDEFAULT);
				return;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NAME:
				unsetDependencyName();
				return;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE:
				setDependencyNode((Node)null);
				return;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE:
				setDependencySecondNode((Node)null);
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
			case IstarPackage.DEPENDENCY_LINK__STRENGTH:
				return strength != STRENGTH_EDEFAULT;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NAME:
				return isSetDependencyName();
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_NODE:
				return dependencyNode != null;
			case IstarPackage.DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE:
				return dependencySecondNode != null;
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
		result.append(" (strength: ");
		result.append(strength);
		result.append(", dependencyName: ");
		if (dependencyNameESet) result.append(dependencyName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DependencyLinkImpl

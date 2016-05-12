/**
 */
package istart.impl;

import istart.Agent;
import istart.IstartPackage;
import istart.Plays;
import istart.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plays</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.PlaysImpl#getPlaysRole <em>Plays Role</em>}</li>
 *   <li>{@link istart.impl.PlaysImpl#getPlaysAgent <em>Plays Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaysImpl extends AssociationImpl implements Plays
{
  /**
   * The cached value of the '{@link #getPlaysRole() <em>Plays Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlaysRole()
   * @generated
   * @ordered
   */
  protected Role playsRole;

  /**
   * The cached value of the '{@link #getPlaysAgent() <em>Plays Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlaysAgent()
   * @generated
   * @ordered
   */
  protected Agent playsAgent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlaysImpl()
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
    return IstartPackage.Literals.PLAYS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getPlaysRole()
  {
    if (playsRole != null && playsRole.eIsProxy())
    {
      InternalEObject oldPlaysRole = (InternalEObject)playsRole;
      playsRole = (Role)eResolveProxy(oldPlaysRole);
      if (playsRole != oldPlaysRole)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.PLAYS__PLAYS_ROLE, oldPlaysRole, playsRole));
      }
    }
    return playsRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetPlaysRole()
  {
    return playsRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlaysRole(Role newPlaysRole, NotificationChain msgs)
  {
    Role oldPlaysRole = playsRole;
    playsRole = newPlaysRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.PLAYS__PLAYS_ROLE, oldPlaysRole, newPlaysRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlaysRole(Role newPlaysRole)
  {
    if (newPlaysRole != playsRole)
    {
      NotificationChain msgs = null;
      if (playsRole != null)
        msgs = ((InternalEObject)playsRole).eInverseRemove(this, IstartPackage.ROLE__ROLE_PLAYS, Role.class, msgs);
      if (newPlaysRole != null)
        msgs = ((InternalEObject)newPlaysRole).eInverseAdd(this, IstartPackage.ROLE__ROLE_PLAYS, Role.class, msgs);
      msgs = basicSetPlaysRole(newPlaysRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.PLAYS__PLAYS_ROLE, newPlaysRole, newPlaysRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent getPlaysAgent()
  {
    if (playsAgent != null && playsAgent.eIsProxy())
    {
      InternalEObject oldPlaysAgent = (InternalEObject)playsAgent;
      playsAgent = (Agent)eResolveProxy(oldPlaysAgent);
      if (playsAgent != oldPlaysAgent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.PLAYS__PLAYS_AGENT, oldPlaysAgent, playsAgent));
      }
    }
    return playsAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetPlaysAgent()
  {
    return playsAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlaysAgent(Agent newPlaysAgent, NotificationChain msgs)
  {
    Agent oldPlaysAgent = playsAgent;
    playsAgent = newPlaysAgent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.PLAYS__PLAYS_AGENT, oldPlaysAgent, newPlaysAgent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlaysAgent(Agent newPlaysAgent)
  {
    if (newPlaysAgent != playsAgent)
    {
      NotificationChain msgs = null;
      if (playsAgent != null)
        msgs = ((InternalEObject)playsAgent).eInverseRemove(this, IstartPackage.AGENT__AGENT_PLAYS, Agent.class, msgs);
      if (newPlaysAgent != null)
        msgs = ((InternalEObject)newPlaysAgent).eInverseAdd(this, IstartPackage.AGENT__AGENT_PLAYS, Agent.class, msgs);
      msgs = basicSetPlaysAgent(newPlaysAgent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.PLAYS__PLAYS_AGENT, newPlaysAgent, newPlaysAgent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IstartPackage.PLAYS__PLAYS_ROLE:
        if (playsRole != null)
          msgs = ((InternalEObject)playsRole).eInverseRemove(this, IstartPackage.ROLE__ROLE_PLAYS, Role.class, msgs);
        return basicSetPlaysRole((Role)otherEnd, msgs);
      case IstartPackage.PLAYS__PLAYS_AGENT:
        if (playsAgent != null)
          msgs = ((InternalEObject)playsAgent).eInverseRemove(this, IstartPackage.AGENT__AGENT_PLAYS, Agent.class, msgs);
        return basicSetPlaysAgent((Agent)otherEnd, msgs);
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
      case IstartPackage.PLAYS__PLAYS_ROLE:
        return basicSetPlaysRole(null, msgs);
      case IstartPackage.PLAYS__PLAYS_AGENT:
        return basicSetPlaysAgent(null, msgs);
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
      case IstartPackage.PLAYS__PLAYS_ROLE:
        if (resolve) return getPlaysRole();
        return basicGetPlaysRole();
      case IstartPackage.PLAYS__PLAYS_AGENT:
        if (resolve) return getPlaysAgent();
        return basicGetPlaysAgent();
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
    switch (featureID)
    {
      case IstartPackage.PLAYS__PLAYS_ROLE:
        setPlaysRole((Role)newValue);
        return;
      case IstartPackage.PLAYS__PLAYS_AGENT:
        setPlaysAgent((Agent)newValue);
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
      case IstartPackage.PLAYS__PLAYS_ROLE:
        setPlaysRole((Role)null);
        return;
      case IstartPackage.PLAYS__PLAYS_AGENT:
        setPlaysAgent((Agent)null);
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
      case IstartPackage.PLAYS__PLAYS_ROLE:
        return playsRole != null;
      case IstartPackage.PLAYS__PLAYS_AGENT:
        return playsAgent != null;
    }
    return super.eIsSet(featureID);
  }

} //PlaysImpl

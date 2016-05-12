/**
 */
package istart.impl;

import istart.Agent;
import istart.INS;
import istart.IstartPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.INSImpl#getINSagent <em>IN Sagent</em>}</li>
 *   <li>{@link istart.impl.INSImpl#getINSsecondAgent <em>IN Ssecond Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class INSImpl extends AssociationImpl implements INS
{
  /**
   * The cached value of the '{@link #getINSagent() <em>IN Sagent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getINSagent()
   * @generated
   * @ordered
   */
  protected Agent inSagent;

  /**
   * The cached value of the '{@link #getINSsecondAgent() <em>IN Ssecond Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getINSsecondAgent()
   * @generated
   * @ordered
   */
  protected Agent inSsecondAgent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected INSImpl()
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
    return IstartPackage.Literals.INS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent getINSagent()
  {
    if (inSagent != null && inSagent.eIsProxy())
    {
      InternalEObject oldINSagent = (InternalEObject)inSagent;
      inSagent = (Agent)eResolveProxy(oldINSagent);
      if (inSagent != oldINSagent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.INS__IN_SAGENT, oldINSagent, inSagent));
      }
    }
    return inSagent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetINSagent()
  {
    return inSagent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetINSagent(Agent newINSagent, NotificationChain msgs)
  {
    Agent oldINSagent = inSagent;
    inSagent = newINSagent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.INS__IN_SAGENT, oldINSagent, newINSagent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setINSagent(Agent newINSagent)
  {
    if (newINSagent != inSagent)
    {
      NotificationChain msgs = null;
      if (inSagent != null)
        msgs = ((InternalEObject)inSagent).eInverseRemove(this, IstartPackage.AGENT__AGENT_INS, Agent.class, msgs);
      if (newINSagent != null)
        msgs = ((InternalEObject)newINSagent).eInverseAdd(this, IstartPackage.AGENT__AGENT_INS, Agent.class, msgs);
      msgs = basicSetINSagent(newINSagent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.INS__IN_SAGENT, newINSagent, newINSagent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent getINSsecondAgent()
  {
    if (inSsecondAgent != null && inSsecondAgent.eIsProxy())
    {
      InternalEObject oldINSsecondAgent = (InternalEObject)inSsecondAgent;
      inSsecondAgent = (Agent)eResolveProxy(oldINSsecondAgent);
      if (inSsecondAgent != oldINSsecondAgent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.INS__IN_SSECOND_AGENT, oldINSsecondAgent, inSsecondAgent));
      }
    }
    return inSsecondAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetINSsecondAgent()
  {
    return inSsecondAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetINSsecondAgent(Agent newINSsecondAgent, NotificationChain msgs)
  {
    Agent oldINSsecondAgent = inSsecondAgent;
    inSsecondAgent = newINSsecondAgent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.INS__IN_SSECOND_AGENT, oldINSsecondAgent, newINSsecondAgent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setINSsecondAgent(Agent newINSsecondAgent)
  {
    if (newINSsecondAgent != inSsecondAgent)
    {
      NotificationChain msgs = null;
      if (inSsecondAgent != null)
        msgs = ((InternalEObject)inSsecondAgent).eInverseRemove(this, IstartPackage.AGENT__SECOND_AGENT_INS, Agent.class, msgs);
      if (newINSsecondAgent != null)
        msgs = ((InternalEObject)newINSsecondAgent).eInverseAdd(this, IstartPackage.AGENT__SECOND_AGENT_INS, Agent.class, msgs);
      msgs = basicSetINSsecondAgent(newINSsecondAgent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.INS__IN_SSECOND_AGENT, newINSsecondAgent, newINSsecondAgent));
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
      case IstartPackage.INS__IN_SAGENT:
        if (inSagent != null)
          msgs = ((InternalEObject)inSagent).eInverseRemove(this, IstartPackage.AGENT__AGENT_INS, Agent.class, msgs);
        return basicSetINSagent((Agent)otherEnd, msgs);
      case IstartPackage.INS__IN_SSECOND_AGENT:
        if (inSsecondAgent != null)
          msgs = ((InternalEObject)inSsecondAgent).eInverseRemove(this, IstartPackage.AGENT__SECOND_AGENT_INS, Agent.class, msgs);
        return basicSetINSsecondAgent((Agent)otherEnd, msgs);
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
      case IstartPackage.INS__IN_SAGENT:
        return basicSetINSagent(null, msgs);
      case IstartPackage.INS__IN_SSECOND_AGENT:
        return basicSetINSsecondAgent(null, msgs);
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
      case IstartPackage.INS__IN_SAGENT:
        if (resolve) return getINSagent();
        return basicGetINSagent();
      case IstartPackage.INS__IN_SSECOND_AGENT:
        if (resolve) return getINSsecondAgent();
        return basicGetINSsecondAgent();
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
      case IstartPackage.INS__IN_SAGENT:
        setINSagent((Agent)newValue);
        return;
      case IstartPackage.INS__IN_SSECOND_AGENT:
        setINSsecondAgent((Agent)newValue);
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
      case IstartPackage.INS__IN_SAGENT:
        setINSagent((Agent)null);
        return;
      case IstartPackage.INS__IN_SSECOND_AGENT:
        setINSsecondAgent((Agent)null);
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
      case IstartPackage.INS__IN_SAGENT:
        return inSagent != null;
      case IstartPackage.INS__IN_SSECOND_AGENT:
        return inSsecondAgent != null;
    }
    return super.eIsSet(featureID);
  }

} //INSImpl

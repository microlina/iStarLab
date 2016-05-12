/**
 */
package istart.impl;

import istart.Agent;
import istart.IstartPackage;
import istart.Occupies;
import istart.Position;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istart.impl.OccupiesImpl#getOccupiesPosition <em>Occupies Position</em>}</li>
 *   <li>{@link istart.impl.OccupiesImpl#getOccupiesAgent <em>Occupies Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccupiesImpl extends AssociationImpl implements Occupies
{
  /**
   * The cached value of the '{@link #getOccupiesPosition() <em>Occupies Position</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccupiesPosition()
   * @generated
   * @ordered
   */
  protected Position occupiesPosition;

  /**
   * The cached value of the '{@link #getOccupiesAgent() <em>Occupies Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccupiesAgent()
   * @generated
   * @ordered
   */
  protected Agent occupiesAgent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OccupiesImpl()
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
    return IstartPackage.Literals.OCCUPIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position getOccupiesPosition()
  {
    if (occupiesPosition != null && occupiesPosition.eIsProxy())
    {
      InternalEObject oldOccupiesPosition = (InternalEObject)occupiesPosition;
      occupiesPosition = (Position)eResolveProxy(oldOccupiesPosition);
      if (occupiesPosition != oldOccupiesPosition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.OCCUPIES__OCCUPIES_POSITION, oldOccupiesPosition, occupiesPosition));
      }
    }
    return occupiesPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position basicGetOccupiesPosition()
  {
    return occupiesPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOccupiesPosition(Position newOccupiesPosition, NotificationChain msgs)
  {
    Position oldOccupiesPosition = occupiesPosition;
    occupiesPosition = newOccupiesPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.OCCUPIES__OCCUPIES_POSITION, oldOccupiesPosition, newOccupiesPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOccupiesPosition(Position newOccupiesPosition)
  {
    if (newOccupiesPosition != occupiesPosition)
    {
      NotificationChain msgs = null;
      if (occupiesPosition != null)
        msgs = ((InternalEObject)occupiesPosition).eInverseRemove(this, IstartPackage.POSITION__POSITION_OCCUPIES, Position.class, msgs);
      if (newOccupiesPosition != null)
        msgs = ((InternalEObject)newOccupiesPosition).eInverseAdd(this, IstartPackage.POSITION__POSITION_OCCUPIES, Position.class, msgs);
      msgs = basicSetOccupiesPosition(newOccupiesPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.OCCUPIES__OCCUPIES_POSITION, newOccupiesPosition, newOccupiesPosition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent getOccupiesAgent()
  {
    if (occupiesAgent != null && occupiesAgent.eIsProxy())
    {
      InternalEObject oldOccupiesAgent = (InternalEObject)occupiesAgent;
      occupiesAgent = (Agent)eResolveProxy(oldOccupiesAgent);
      if (occupiesAgent != oldOccupiesAgent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstartPackage.OCCUPIES__OCCUPIES_AGENT, oldOccupiesAgent, occupiesAgent));
      }
    }
    return occupiesAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetOccupiesAgent()
  {
    return occupiesAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOccupiesAgent(Agent newOccupiesAgent, NotificationChain msgs)
  {
    Agent oldOccupiesAgent = occupiesAgent;
    occupiesAgent = newOccupiesAgent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IstartPackage.OCCUPIES__OCCUPIES_AGENT, oldOccupiesAgent, newOccupiesAgent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOccupiesAgent(Agent newOccupiesAgent)
  {
    if (newOccupiesAgent != occupiesAgent)
    {
      NotificationChain msgs = null;
      if (occupiesAgent != null)
        msgs = ((InternalEObject)occupiesAgent).eInverseRemove(this, IstartPackage.AGENT__AGENT_OCCUPIES, Agent.class, msgs);
      if (newOccupiesAgent != null)
        msgs = ((InternalEObject)newOccupiesAgent).eInverseAdd(this, IstartPackage.AGENT__AGENT_OCCUPIES, Agent.class, msgs);
      msgs = basicSetOccupiesAgent(newOccupiesAgent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IstartPackage.OCCUPIES__OCCUPIES_AGENT, newOccupiesAgent, newOccupiesAgent));
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
      case IstartPackage.OCCUPIES__OCCUPIES_POSITION:
        if (occupiesPosition != null)
          msgs = ((InternalEObject)occupiesPosition).eInverseRemove(this, IstartPackage.POSITION__POSITION_OCCUPIES, Position.class, msgs);
        return basicSetOccupiesPosition((Position)otherEnd, msgs);
      case IstartPackage.OCCUPIES__OCCUPIES_AGENT:
        if (occupiesAgent != null)
          msgs = ((InternalEObject)occupiesAgent).eInverseRemove(this, IstartPackage.AGENT__AGENT_OCCUPIES, Agent.class, msgs);
        return basicSetOccupiesAgent((Agent)otherEnd, msgs);
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
      case IstartPackage.OCCUPIES__OCCUPIES_POSITION:
        return basicSetOccupiesPosition(null, msgs);
      case IstartPackage.OCCUPIES__OCCUPIES_AGENT:
        return basicSetOccupiesAgent(null, msgs);
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
      case IstartPackage.OCCUPIES__OCCUPIES_POSITION:
        if (resolve) return getOccupiesPosition();
        return basicGetOccupiesPosition();
      case IstartPackage.OCCUPIES__OCCUPIES_AGENT:
        if (resolve) return getOccupiesAgent();
        return basicGetOccupiesAgent();
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
      case IstartPackage.OCCUPIES__OCCUPIES_POSITION:
        setOccupiesPosition((Position)newValue);
        return;
      case IstartPackage.OCCUPIES__OCCUPIES_AGENT:
        setOccupiesAgent((Agent)newValue);
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
      case IstartPackage.OCCUPIES__OCCUPIES_POSITION:
        setOccupiesPosition((Position)null);
        return;
      case IstartPackage.OCCUPIES__OCCUPIES_AGENT:
        setOccupiesAgent((Agent)null);
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
      case IstartPackage.OCCUPIES__OCCUPIES_POSITION:
        return occupiesPosition != null;
      case IstartPackage.OCCUPIES__OCCUPIES_AGENT:
        return occupiesAgent != null;
    }
    return super.eIsSet(featureID);
  }

} //OccupiesImpl

/**
 */
package istar.impl;

import istar.Agent;
import istar.INS;
import istar.IstarPackage;
import istar.Occupies;
import istar.Plays;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.AgentImpl#getAgentPlays <em>Agent Plays</em>}</li>
 *   <li>{@link istar.impl.AgentImpl#getAgentOccupies <em>Agent Occupies</em>}</li>
 *   <li>{@link istar.impl.AgentImpl#getAgentINS <em>Agent INS</em>}</li>
 *   <li>{@link istar.impl.AgentImpl#getSecondAgentINS <em>Second Agent INS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends ActorsImpl implements Agent
{
  /**
	 * The cached value of the '{@link #getAgentPlays() <em>Agent Plays</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAgentPlays()
	 * @generated
	 * @ordered
	 */
  protected EList<Plays> agentPlays;

  /**
	 * The cached value of the '{@link #getAgentOccupies() <em>Agent Occupies</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAgentOccupies()
	 * @generated
	 * @ordered
	 */
  protected EList<Occupies> agentOccupies;

  /**
	 * The cached value of the '{@link #getAgentINS() <em>Agent INS</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAgentINS()
	 * @generated
	 * @ordered
	 */
  protected EList<INS> agentINS;

  /**
	 * The cached value of the '{@link #getSecondAgentINS() <em>Second Agent INS</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecondAgentINS()
	 * @generated
	 * @ordered
	 */
  protected EList<INS> secondAgentINS;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AgentImpl()
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
		return IstarPackage.Literals.AGENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Plays> getAgentPlays()
  {
		if (agentPlays == null) {
			agentPlays = new EObjectWithInverseResolvingEList<Plays>(Plays.class, this, IstarPackage.AGENT__AGENT_PLAYS, IstarPackage.PLAYS__PLAYS_AGENT);
		}
		return agentPlays;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Occupies> getAgentOccupies()
  {
		if (agentOccupies == null) {
			agentOccupies = new EObjectWithInverseResolvingEList<Occupies>(Occupies.class, this, IstarPackage.AGENT__AGENT_OCCUPIES, IstarPackage.OCCUPIES__OCCUPIES_AGENT);
		}
		return agentOccupies;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<INS> getAgentINS()
  {
		if (agentINS == null) {
			agentINS = new EObjectWithInverseResolvingEList<INS>(INS.class, this, IstarPackage.AGENT__AGENT_INS, IstarPackage.INS__IN_SAGENT);
		}
		return agentINS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<INS> getSecondAgentINS()
  {
		if (secondAgentINS == null) {
			secondAgentINS = new EObjectWithInverseResolvingEList<INS>(INS.class, this, IstarPackage.AGENT__SECOND_AGENT_INS, IstarPackage.INS__IN_SSECOND_AGENT);
		}
		return secondAgentINS;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer NEIA() {
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
			case IstarPackage.AGENT__AGENT_PLAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAgentPlays()).basicAdd(otherEnd, msgs);
			case IstarPackage.AGENT__AGENT_OCCUPIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAgentOccupies()).basicAdd(otherEnd, msgs);
			case IstarPackage.AGENT__AGENT_INS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAgentINS()).basicAdd(otherEnd, msgs);
			case IstarPackage.AGENT__SECOND_AGENT_INS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecondAgentINS()).basicAdd(otherEnd, msgs);
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
			case IstarPackage.AGENT__AGENT_PLAYS:
				return ((InternalEList<?>)getAgentPlays()).basicRemove(otherEnd, msgs);
			case IstarPackage.AGENT__AGENT_OCCUPIES:
				return ((InternalEList<?>)getAgentOccupies()).basicRemove(otherEnd, msgs);
			case IstarPackage.AGENT__AGENT_INS:
				return ((InternalEList<?>)getAgentINS()).basicRemove(otherEnd, msgs);
			case IstarPackage.AGENT__SECOND_AGENT_INS:
				return ((InternalEList<?>)getSecondAgentINS()).basicRemove(otherEnd, msgs);
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
			case IstarPackage.AGENT__AGENT_PLAYS:
				return getAgentPlays();
			case IstarPackage.AGENT__AGENT_OCCUPIES:
				return getAgentOccupies();
			case IstarPackage.AGENT__AGENT_INS:
				return getAgentINS();
			case IstarPackage.AGENT__SECOND_AGENT_INS:
				return getSecondAgentINS();
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
			case IstarPackage.AGENT__AGENT_PLAYS:
				getAgentPlays().clear();
				getAgentPlays().addAll((Collection<? extends Plays>)newValue);
				return;
			case IstarPackage.AGENT__AGENT_OCCUPIES:
				getAgentOccupies().clear();
				getAgentOccupies().addAll((Collection<? extends Occupies>)newValue);
				return;
			case IstarPackage.AGENT__AGENT_INS:
				getAgentINS().clear();
				getAgentINS().addAll((Collection<? extends INS>)newValue);
				return;
			case IstarPackage.AGENT__SECOND_AGENT_INS:
				getSecondAgentINS().clear();
				getSecondAgentINS().addAll((Collection<? extends INS>)newValue);
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
			case IstarPackage.AGENT__AGENT_PLAYS:
				getAgentPlays().clear();
				return;
			case IstarPackage.AGENT__AGENT_OCCUPIES:
				getAgentOccupies().clear();
				return;
			case IstarPackage.AGENT__AGENT_INS:
				getAgentINS().clear();
				return;
			case IstarPackage.AGENT__SECOND_AGENT_INS:
				getSecondAgentINS().clear();
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
			case IstarPackage.AGENT__AGENT_PLAYS:
				return agentPlays != null && !agentPlays.isEmpty();
			case IstarPackage.AGENT__AGENT_OCCUPIES:
				return agentOccupies != null && !agentOccupies.isEmpty();
			case IstarPackage.AGENT__AGENT_INS:
				return agentINS != null && !agentINS.isEmpty();
			case IstarPackage.AGENT__SECOND_AGENT_INS:
				return secondAgentINS != null && !secondAgentINS.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl

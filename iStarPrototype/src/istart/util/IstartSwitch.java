/**
 */
package istart.util;

import istart.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see istart.IstartPackage
 * @generated
 */
public class IstartSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IstartPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IstartSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IstartPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case IstartPackage.ISTAR:
      {
        ISTAR istar = (ISTAR)theEObject;
        T result = caseISTAR(istar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.RELATIONSHIP:
      {
        Relationship relationship = (Relationship)theEObject;
        T result = caseRelationship(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.ACTORS:
      {
        Actors actors = (Actors)theEObject;
        T result = caseActors(actors);
        if (result == null) result = caseNode(actors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = caseActors(actor);
        if (result == null) result = caseNode(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.AGENT:
      {
        Agent agent = (Agent)theEObject;
        T result = caseAgent(agent);
        if (result == null) result = caseActors(agent);
        if (result == null) result = caseNode(agent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.POSITION:
      {
        Position position = (Position)theEObject;
        T result = casePosition(position);
        if (result == null) result = caseActors(position);
        if (result == null) result = caseNode(position);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = caseActors(role);
        if (result == null) result = caseNode(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseNode(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = caseElement(goal);
        if (result == null) result = caseNode(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.SOFTGOAL:
      {
        Softgoal softgoal = (Softgoal)theEObject;
        T result = caseSoftgoal(softgoal);
        if (result == null) result = caseElement(softgoal);
        if (result == null) result = caseNode(softgoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = caseElement(task);
        if (result == null) result = caseNode(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = caseElement(resource);
        if (result == null) result = caseNode(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.BELIEF:
      {
        Belief belief = (Belief)theEObject;
        T result = caseBelief(belief);
        if (result == null) result = caseElement(belief);
        if (result == null) result = caseNode(belief);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.ASSOCIATION:
      {
        Association association = (Association)theEObject;
        T result = caseAssociation(association);
        if (result == null) result = caseRelationship(association);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.ISA:
      {
        ISA isa = (ISA)theEObject;
        T result = caseISA(isa);
        if (result == null) result = caseAssociation(isa);
        if (result == null) result = caseRelationship(isa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.IS_PART_OF:
      {
        IsPartOf isPartOf = (IsPartOf)theEObject;
        T result = caseIsPartOf(isPartOf);
        if (result == null) result = caseAssociation(isPartOf);
        if (result == null) result = caseRelationship(isPartOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.PLAYS:
      {
        Plays plays = (Plays)theEObject;
        T result = casePlays(plays);
        if (result == null) result = caseAssociation(plays);
        if (result == null) result = caseRelationship(plays);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.COVERS:
      {
        Covers covers = (Covers)theEObject;
        T result = caseCovers(covers);
        if (result == null) result = caseAssociation(covers);
        if (result == null) result = caseRelationship(covers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.OCCUPIES:
      {
        Occupies occupies = (Occupies)theEObject;
        T result = caseOccupies(occupies);
        if (result == null) result = caseAssociation(occupies);
        if (result == null) result = caseRelationship(occupies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.INS:
      {
        INS ins = (INS)theEObject;
        T result = caseINS(ins);
        if (result == null) result = caseAssociation(ins);
        if (result == null) result = caseRelationship(ins);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.CONTRIBUTION_LINK:
      {
        ContributionLink contributionLink = (ContributionLink)theEObject;
        T result = caseContributionLink(contributionLink);
        if (result == null) result = caseRelationship(contributionLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.MAKE:
      {
        Make make = (Make)theEObject;
        T result = caseMake(make);
        if (result == null) result = caseContributionLink(make);
        if (result == null) result = caseRelationship(make);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.BREAK:
      {
        Break break_ = (Break)theEObject;
        T result = caseBreak(break_);
        if (result == null) result = caseContributionLink(break_);
        if (result == null) result = caseRelationship(break_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.HELP:
      {
        Help help = (Help)theEObject;
        T result = caseHelp(help);
        if (result == null) result = caseContributionLink(help);
        if (result == null) result = caseRelationship(help);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.HURT:
      {
        Hurt hurt = (Hurt)theEObject;
        T result = caseHurt(hurt);
        if (result == null) result = caseContributionLink(hurt);
        if (result == null) result = caseRelationship(hurt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.SOME_PLUS:
      {
        SomePlus somePlus = (SomePlus)theEObject;
        T result = caseSomePlus(somePlus);
        if (result == null) result = caseContributionLink(somePlus);
        if (result == null) result = caseRelationship(somePlus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.SOME_MINUS:
      {
        SomeMinus someMinus = (SomeMinus)theEObject;
        T result = caseSomeMinus(someMinus);
        if (result == null) result = caseContributionLink(someMinus);
        if (result == null) result = caseRelationship(someMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseContributionLink(and);
        if (result == null) result = caseRelationship(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseContributionLink(or);
        if (result == null) result = caseRelationship(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.UNKNOWN:
      {
        Unknown unknown = (Unknown)theEObject;
        T result = caseUnknown(unknown);
        if (result == null) result = caseContributionLink(unknown);
        if (result == null) result = caseRelationship(unknown);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.DECOMPOSITION:
      {
        Decomposition decomposition = (Decomposition)theEObject;
        T result = caseDecomposition(decomposition);
        if (result == null) result = caseRelationship(decomposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.MEANS_END:
      {
        MeansEnd meansEnd = (MeansEnd)theEObject;
        T result = caseMeansEnd(meansEnd);
        if (result == null) result = caseDecomposition(meansEnd);
        if (result == null) result = caseRelationship(meansEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.DECOMPOSITION_LINK:
      {
        DecompositionLink decompositionLink = (DecompositionLink)theEObject;
        T result = caseDecompositionLink(decompositionLink);
        if (result == null) result = caseDecomposition(decompositionLink);
        if (result == null) result = caseRelationship(decompositionLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IstartPackage.DEPENDENCY_LINK:
      {
        DependencyLink dependencyLink = (DependencyLink)theEObject;
        T result = caseDependencyLink(dependencyLink);
        if (result == null) result = caseRelationship(dependencyLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISTAR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISTAR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISTAR(ISTAR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationship(Relationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActors(Actors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgent(Agent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePosition(Position object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Softgoal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Softgoal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftgoal(Softgoal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Belief</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Belief</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBelief(Belief object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociation(Association object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISA(ISA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Part Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Part Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsPartOf(IsPartOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plays</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plays</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlays(Plays object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Covers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Covers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCovers(Covers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Occupies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Occupies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOccupies(Occupies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>INS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>INS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseINS(INS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contribution Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contribution Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributionLink(ContributionLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Make</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Make</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMake(Make object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreak(Break object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Help</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Help</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelp(Help object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hurt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hurt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHurt(Hurt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomePlus(SomePlus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeMinus(SomeMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unknown</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unknown</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnknown(Unknown object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecomposition(Decomposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Means End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Means End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeansEnd(MeansEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecompositionLink(DecompositionLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependencyLink(DependencyLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //IstartSwitch

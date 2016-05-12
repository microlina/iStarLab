/**
 */
package istart.util;

import istart.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see istart.IstartPackage
 * @generated
 */
public class IstartAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IstartPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IstartAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IstartPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IstartSwitch<Adapter> modelSwitch =
    new IstartSwitch<Adapter>()
    {
      @Override
      public Adapter caseISTAR(ISTAR object)
      {
        return createISTARAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseActors(Actors object)
      {
        return createActorsAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseAgent(Agent object)
      {
        return createAgentAdapter();
      }
      @Override
      public Adapter casePosition(Position object)
      {
        return createPositionAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseSoftgoal(Softgoal object)
      {
        return createSoftgoalAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseBelief(Belief object)
      {
        return createBeliefAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseISA(ISA object)
      {
        return createISAAdapter();
      }
      @Override
      public Adapter caseIsPartOf(IsPartOf object)
      {
        return createIsPartOfAdapter();
      }
      @Override
      public Adapter casePlays(Plays object)
      {
        return createPlaysAdapter();
      }
      @Override
      public Adapter caseCovers(Covers object)
      {
        return createCoversAdapter();
      }
      @Override
      public Adapter caseOccupies(Occupies object)
      {
        return createOccupiesAdapter();
      }
      @Override
      public Adapter caseINS(INS object)
      {
        return createINSAdapter();
      }
      @Override
      public Adapter caseContributionLink(ContributionLink object)
      {
        return createContributionLinkAdapter();
      }
      @Override
      public Adapter caseMake(Make object)
      {
        return createMakeAdapter();
      }
      @Override
      public Adapter caseBreak(Break object)
      {
        return createBreakAdapter();
      }
      @Override
      public Adapter caseHelp(Help object)
      {
        return createHelpAdapter();
      }
      @Override
      public Adapter caseHurt(Hurt object)
      {
        return createHurtAdapter();
      }
      @Override
      public Adapter caseSomePlus(SomePlus object)
      {
        return createSomePlusAdapter();
      }
      @Override
      public Adapter caseSomeMinus(SomeMinus object)
      {
        return createSomeMinusAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseUnknown(Unknown object)
      {
        return createUnknownAdapter();
      }
      @Override
      public Adapter caseDecomposition(Decomposition object)
      {
        return createDecompositionAdapter();
      }
      @Override
      public Adapter caseMeansEnd(MeansEnd object)
      {
        return createMeansEndAdapter();
      }
      @Override
      public Adapter caseDecompositionLink(DecompositionLink object)
      {
        return createDecompositionLinkAdapter();
      }
      @Override
      public Adapter caseDependencyLink(DependencyLink object)
      {
        return createDependencyLinkAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link istart.ISTAR <em>ISTAR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.ISTAR
   * @generated
   */
  public Adapter createISTARAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Actors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Actors
   * @generated
   */
  public Adapter createActorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Agent
   * @generated
   */
  public Adapter createAgentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Position
   * @generated
   */
  public Adapter createPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Softgoal <em>Softgoal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Softgoal
   * @generated
   */
  public Adapter createSoftgoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Belief <em>Belief</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Belief
   * @generated
   */
  public Adapter createBeliefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.ISA <em>ISA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.ISA
   * @generated
   */
  public Adapter createISAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.IsPartOf <em>Is Part Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.IsPartOf
   * @generated
   */
  public Adapter createIsPartOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Plays <em>Plays</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Plays
   * @generated
   */
  public Adapter createPlaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Covers <em>Covers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Covers
   * @generated
   */
  public Adapter createCoversAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Occupies <em>Occupies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Occupies
   * @generated
   */
  public Adapter createOccupiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.INS <em>INS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.INS
   * @generated
   */
  public Adapter createINSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.ContributionLink <em>Contribution Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.ContributionLink
   * @generated
   */
  public Adapter createContributionLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Make <em>Make</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Make
   * @generated
   */
  public Adapter createMakeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Break <em>Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Break
   * @generated
   */
  public Adapter createBreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Help <em>Help</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Help
   * @generated
   */
  public Adapter createHelpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Hurt <em>Hurt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Hurt
   * @generated
   */
  public Adapter createHurtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.SomePlus <em>Some Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.SomePlus
   * @generated
   */
  public Adapter createSomePlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.SomeMinus <em>Some Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.SomeMinus
   * @generated
   */
  public Adapter createSomeMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Unknown <em>Unknown</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Unknown
   * @generated
   */
  public Adapter createUnknownAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.Decomposition <em>Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.Decomposition
   * @generated
   */
  public Adapter createDecompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.MeansEnd <em>Means End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.MeansEnd
   * @generated
   */
  public Adapter createMeansEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.DecompositionLink <em>Decomposition Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.DecompositionLink
   * @generated
   */
  public Adapter createDecompositionLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istart.DependencyLink <em>Dependency Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istart.DependencyLink
   * @generated
   */
  public Adapter createDependencyLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //IstartAdapterFactory

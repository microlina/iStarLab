/**
 */
package istart.impl;

import istart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstartFactoryImpl extends EFactoryImpl implements IstartFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IstartFactory init()
  {
    try
    {
      IstartFactory theIstartFactory = (IstartFactory)EPackage.Registry.INSTANCE.getEFactory("is"); 
      if (theIstartFactory != null)
      {
        return theIstartFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IstartFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IstartFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IstartPackage.ISTAR: return createISTAR();
      case IstartPackage.NODE: return createNode();
      case IstartPackage.RELATIONSHIP: return createRelationship();
      case IstartPackage.ACTOR: return createActor();
      case IstartPackage.AGENT: return createAgent();
      case IstartPackage.POSITION: return createPosition();
      case IstartPackage.ROLE: return createRole();
      case IstartPackage.GOAL: return createGoal();
      case IstartPackage.SOFTGOAL: return createSoftgoal();
      case IstartPackage.TASK: return createTask();
      case IstartPackage.RESOURCE: return createResource();
      case IstartPackage.BELIEF: return createBelief();
      case IstartPackage.ISA: return createISA();
      case IstartPackage.IS_PART_OF: return createIsPartOf();
      case IstartPackage.PLAYS: return createPlays();
      case IstartPackage.COVERS: return createCovers();
      case IstartPackage.OCCUPIES: return createOccupies();
      case IstartPackage.INS: return createINS();
      case IstartPackage.MAKE: return createMake();
      case IstartPackage.BREAK: return createBreak();
      case IstartPackage.HELP: return createHelp();
      case IstartPackage.HURT: return createHurt();
      case IstartPackage.SOME_PLUS: return createSomePlus();
      case IstartPackage.SOME_MINUS: return createSomeMinus();
      case IstartPackage.AND: return createAnd();
      case IstartPackage.OR: return createOr();
      case IstartPackage.UNKNOWN: return createUnknown();
      case IstartPackage.MEANS_END: return createMeansEnd();
      case IstartPackage.DECOMPOSITION_LINK: return createDecompositionLink();
      case IstartPackage.DEPENDENCY_LINK: return createDependencyLink();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IstartPackage.DEPENDENCY_STRENGTH:
        return createDependencyStrengthFromString(eDataType, initialValue);
      case IstartPackage.NFR:
        return createNFRFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IstartPackage.DEPENDENCY_STRENGTH:
        return convertDependencyStrengthToString(eDataType, instanceValue);
      case IstartPackage.NFR:
        return convertNFRToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISTAR createISTAR()
  {
    ISTARImpl istar = new ISTARImpl();
    return istar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position createPosition()
  {
    PositionImpl position = new PositionImpl();
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Softgoal createSoftgoal()
  {
    SoftgoalImpl softgoal = new SoftgoalImpl();
    return softgoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Belief createBelief()
  {
    BeliefImpl belief = new BeliefImpl();
    return belief;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISA createISA()
  {
    ISAImpl isa = new ISAImpl();
    return isa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsPartOf createIsPartOf()
  {
    IsPartOfImpl isPartOf = new IsPartOfImpl();
    return isPartOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plays createPlays()
  {
    PlaysImpl plays = new PlaysImpl();
    return plays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Covers createCovers()
  {
    CoversImpl covers = new CoversImpl();
    return covers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Occupies createOccupies()
  {
    OccupiesImpl occupies = new OccupiesImpl();
    return occupies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INS createINS()
  {
    INSImpl ins = new INSImpl();
    return ins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Make createMake()
  {
    MakeImpl make = new MakeImpl();
    return make;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Break createBreak()
  {
    BreakImpl break_ = new BreakImpl();
    return break_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Help createHelp()
  {
    HelpImpl help = new HelpImpl();
    return help;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hurt createHurt()
  {
    HurtImpl hurt = new HurtImpl();
    return hurt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomePlus createSomePlus()
  {
    SomePlusImpl somePlus = new SomePlusImpl();
    return somePlus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeMinus createSomeMinus()
  {
    SomeMinusImpl someMinus = new SomeMinusImpl();
    return someMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unknown createUnknown()
  {
    UnknownImpl unknown = new UnknownImpl();
    return unknown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeansEnd createMeansEnd()
  {
    MeansEndImpl meansEnd = new MeansEndImpl();
    return meansEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecompositionLink createDecompositionLink()
  {
    DecompositionLinkImpl decompositionLink = new DecompositionLinkImpl();
    return decompositionLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyLink createDependencyLink()
  {
    DependencyLinkImpl dependencyLink = new DependencyLinkImpl();
    return dependencyLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyStrength createDependencyStrengthFromString(EDataType eDataType, String initialValue)
  {
    DependencyStrength result = DependencyStrength.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDependencyStrengthToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFR createNFRFromString(EDataType eDataType, String initialValue)
  {
    NFR result = NFR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNFRToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IstartPackage getIstartPackage()
  {
    return (IstartPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IstartPackage getPackage()
  {
    return IstartPackage.eINSTANCE;
  }

} //IstartFactoryImpl

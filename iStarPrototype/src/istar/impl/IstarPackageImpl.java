/**
 */
package istar.impl;

import istar.Actor;
import istar.Actors;
import istar.Agent;
import istar.And;
import istar.Association;
import istar.Belief;
import istar.Break;
import istar.ContributionLink;
import istar.Covers;
import istar.Decomposition;
import istar.DecompositionLink;
import istar.DependencyLink;
import istar.DependencyStrength;
import istar.Element;
import istar.Goal;
import istar.Help;
import istar.Hurt;
import istar.IsPartOf;
import istar.IstarFactory;
import istar.IstarPackage;
import istar.Make;
import istar.MeansEnd;
import istar.Node;
import istar.Occupies;
import istar.Or;
import istar.Plays;
import istar.Position;
import istar.Relationship;
import istar.Resource;
import istar.Role;
import istar.Softgoal;
import istar.SomeMinus;
import istar.SomePlus;
import istar.Task;
import istar.Unknown;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarPackageImpl extends EPackageImpl implements IstarPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass istarEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass nodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass relationshipEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass actorsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass actorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass agentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass positionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roleEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass elementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass goalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass softgoalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass taskEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass resourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass beliefEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass associationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass isaEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass isPartOfEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass playsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass coversEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass occupiesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass insEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass contributionLinkEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass makeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass breakEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass helpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass hurtEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass somePlusEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass someMinusEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass andEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass orEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass unknownEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass decompositionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass meansEndEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass decompositionLinkEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dependencyLinkEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum dependencyStrengthEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum nfrEEnum = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see istar.IstarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private IstarPackageImpl()
  {
		super(eNS_URI, IstarFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IstarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static IstarPackage init()
  {
		if (isInited) return (IstarPackage)EPackage.Registry.INSTANCE.getEPackage(IstarPackage.eNS_URI);

		// Obtain or create and register package
		IstarPackageImpl theIstarPackage = (IstarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IstarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IstarPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIstarPackage.createPackageContents();

		// Initialize created meta-data
		theIstarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIstarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IstarPackage.eNS_URI, theIstarPackage);
		return theIstarPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getISTAR()
  {
		return istarEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getISTAR_HasNode()
  {
		return (EReference)istarEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getISTAR_ModelName()
  {
		return (EAttribute)istarEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getISTAR_HasRelationship()
  {
		return (EReference)istarEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNode()
  {
		return nodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNode_NodeName()
  {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getNode_NodeDependency()
  {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getNode_SecondNodeDependency()
  {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNode_NodeNFR()
  {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRelationship()
  {
		return relationshipEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationship_RelationshipName()
  {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationship_Source()
  {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationship_Target()
  {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationship_RelationshipNFR()
  {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getActors()
  {
		return actorsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActors_HasElement()
  {
		return (EReference)actorsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getActor()
  {
		return actorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActor_ActorISA()
  {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActor_SecondActorISA()
  {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActor_ActorIsPartOf()
  {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getActor_SecondActorIsPartOf()
  {
		return (EReference)actorEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAgent()
  {
		return agentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAgent_AgentPlays()
  {
		return (EReference)agentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAgent_AgentOccupies()
  {
		return (EReference)agentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAgent_AgentINS()
  {
		return (EReference)agentEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAgent_SecondAgentINS()
  {
		return (EReference)agentEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPosition()
  {
		return positionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPosition_PositionCovers()
  {
		return (EReference)positionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPosition_PositionOccupies()
  {
		return (EReference)positionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRole()
  {
		return roleEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRole_RolePlays()
  {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRole_RoleCovers()
  {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getElement()
  {
		return elementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getElement_ElementContribution()
  {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getElement_ElementDecomposition()
  {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGoal()
  {
		return goalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getGoal_GoalMeansEnd()
  {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSoftgoal()
  {
		return softgoalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSoftgoal_SoftgoalContribution()
  {
		return (EReference)softgoalEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTask()
  {
		return taskEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_TaskMeansEnd()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTask_TaskDecomposition()
  {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResource()
  {
		return resourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBelief()
  {
		return beliefEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssociation()
  {
		return associationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getISA()
  {
		return isaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getISA_ISAactor()
  {
		return (EReference)isaEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getISA_ISAsecondActor()
  {
		return (EReference)isaEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIsPartOf()
  {
		return isPartOfEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIsPartOf_IsPartOfActor()
  {
		return (EReference)isPartOfEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIsPartOf_IsPartOfSecondActor()
  {
		return (EReference)isPartOfEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPlays()
  {
		return playsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPlays_PlaysRole()
  {
		return (EReference)playsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPlays_PlaysAgent()
  {
		return (EReference)playsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCovers()
  {
		return coversEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCovers_CoversRole()
  {
		return (EReference)coversEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCovers_CoversPosition()
  {
		return (EReference)coversEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOccupies()
  {
		return occupiesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOccupies_OccupiesPosition()
  {
		return (EReference)occupiesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOccupies_OccupiesAgent()
  {
		return (EReference)occupiesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getINS()
  {
		return insEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getINS_INSagent()
  {
		return (EReference)insEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getINS_INSsecondAgent()
  {
		return (EReference)insEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getContributionLink()
  {
		return contributionLinkEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContributionLink_ContributionElement()
  {
		return (EReference)contributionLinkEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContributionLink_ContributionSoftgoal()
  {
		return (EReference)contributionLinkEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMake()
  {
		return makeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBreak()
  {
		return breakEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getHelp()
  {
		return helpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getHurt()
  {
		return hurtEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSomePlus()
  {
		return somePlusEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSomeMinus()
  {
		return someMinusEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAnd()
  {
		return andEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOr()
  {
		return orEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getUnknown()
  {
		return unknownEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDecomposition()
  {
		return decompositionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMeansEnd()
  {
		return meansEndEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMeansEnd_MeansEndTask()
  {
		return (EReference)meansEndEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMeansEnd_MeansEndGoal()
  {
		return (EReference)meansEndEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDecompositionLink()
  {
		return decompositionLinkEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDecompositionLink_DecompositionTask()
  {
		return (EReference)decompositionLinkEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDecompositionLink_DecompositionElement()
  {
		return (EReference)decompositionLinkEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDependencyLink()
  {
		return dependencyLinkEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDependencyLink_Strength()
  {
		return (EAttribute)dependencyLinkEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDependencyLink_DependencyName()
  {
		return (EAttribute)dependencyLinkEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDependencyLink_DependencyNode()
  {
		return (EReference)dependencyLinkEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDependencyLink_DependencySecondNode()
  {
		return (EReference)dependencyLinkEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getDependencyStrength()
  {
		return dependencyStrengthEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getNFR()
  {
		return nfrEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IstarFactory getIstarFactory()
  {
		return (IstarFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		istarEClass = createEClass(ISTAR);
		createEReference(istarEClass, ISTAR__HAS_NODE);
		createEAttribute(istarEClass, ISTAR__MODEL_NAME);
		createEReference(istarEClass, ISTAR__HAS_RELATIONSHIP);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NODE_NAME);
		createEReference(nodeEClass, NODE__NODE_DEPENDENCY);
		createEReference(nodeEClass, NODE__SECOND_NODE_DEPENDENCY);
		createEAttribute(nodeEClass, NODE__NODE_NFR);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__RELATIONSHIP_NAME);
		createEAttribute(relationshipEClass, RELATIONSHIP__SOURCE);
		createEAttribute(relationshipEClass, RELATIONSHIP__TARGET);
		createEAttribute(relationshipEClass, RELATIONSHIP__RELATIONSHIP_NFR);

		actorsEClass = createEClass(ACTORS);
		createEReference(actorsEClass, ACTORS__HAS_ELEMENT);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ACTOR_ISA);
		createEReference(actorEClass, ACTOR__SECOND_ACTOR_ISA);
		createEReference(actorEClass, ACTOR__ACTOR_IS_PART_OF);
		createEReference(actorEClass, ACTOR__SECOND_ACTOR_IS_PART_OF);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__AGENT_PLAYS);
		createEReference(agentEClass, AGENT__AGENT_OCCUPIES);
		createEReference(agentEClass, AGENT__AGENT_INS);
		createEReference(agentEClass, AGENT__SECOND_AGENT_INS);

		positionEClass = createEClass(POSITION);
		createEReference(positionEClass, POSITION__POSITION_COVERS);
		createEReference(positionEClass, POSITION__POSITION_OCCUPIES);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__ROLE_PLAYS);
		createEReference(roleEClass, ROLE__ROLE_COVERS);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__ELEMENT_CONTRIBUTION);
		createEReference(elementEClass, ELEMENT__ELEMENT_DECOMPOSITION);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__GOAL_MEANS_END);

		softgoalEClass = createEClass(SOFTGOAL);
		createEReference(softgoalEClass, SOFTGOAL__SOFTGOAL_CONTRIBUTION);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__TASK_MEANS_END);
		createEReference(taskEClass, TASK__TASK_DECOMPOSITION);

		resourceEClass = createEClass(RESOURCE);

		beliefEClass = createEClass(BELIEF);

		associationEClass = createEClass(ASSOCIATION);

		isaEClass = createEClass(ISA);
		createEReference(isaEClass, ISA__IS_AACTOR);
		createEReference(isaEClass, ISA__IS_ASECOND_ACTOR);

		isPartOfEClass = createEClass(IS_PART_OF);
		createEReference(isPartOfEClass, IS_PART_OF__IS_PART_OF_ACTOR);
		createEReference(isPartOfEClass, IS_PART_OF__IS_PART_OF_SECOND_ACTOR);

		playsEClass = createEClass(PLAYS);
		createEReference(playsEClass, PLAYS__PLAYS_ROLE);
		createEReference(playsEClass, PLAYS__PLAYS_AGENT);

		coversEClass = createEClass(COVERS);
		createEReference(coversEClass, COVERS__COVERS_ROLE);
		createEReference(coversEClass, COVERS__COVERS_POSITION);

		occupiesEClass = createEClass(OCCUPIES);
		createEReference(occupiesEClass, OCCUPIES__OCCUPIES_POSITION);
		createEReference(occupiesEClass, OCCUPIES__OCCUPIES_AGENT);

		insEClass = createEClass(INS);
		createEReference(insEClass, INS__IN_SAGENT);
		createEReference(insEClass, INS__IN_SSECOND_AGENT);

		contributionLinkEClass = createEClass(CONTRIBUTION_LINK);
		createEReference(contributionLinkEClass, CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT);
		createEReference(contributionLinkEClass, CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL);

		makeEClass = createEClass(MAKE);

		breakEClass = createEClass(BREAK);

		helpEClass = createEClass(HELP);

		hurtEClass = createEClass(HURT);

		somePlusEClass = createEClass(SOME_PLUS);

		someMinusEClass = createEClass(SOME_MINUS);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		unknownEClass = createEClass(UNKNOWN);

		decompositionEClass = createEClass(DECOMPOSITION);

		meansEndEClass = createEClass(MEANS_END);
		createEReference(meansEndEClass, MEANS_END__MEANS_END_TASK);
		createEReference(meansEndEClass, MEANS_END__MEANS_END_GOAL);

		decompositionLinkEClass = createEClass(DECOMPOSITION_LINK);
		createEReference(decompositionLinkEClass, DECOMPOSITION_LINK__DECOMPOSITION_TASK);
		createEReference(decompositionLinkEClass, DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT);

		dependencyLinkEClass = createEClass(DEPENDENCY_LINK);
		createEAttribute(dependencyLinkEClass, DEPENDENCY_LINK__STRENGTH);
		createEAttribute(dependencyLinkEClass, DEPENDENCY_LINK__DEPENDENCY_NAME);
		createEReference(dependencyLinkEClass, DEPENDENCY_LINK__DEPENDENCY_NODE);
		createEReference(dependencyLinkEClass, DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE);

		// Create enums
		dependencyStrengthEEnum = createEEnum(DEPENDENCY_STRENGTH);
		nfrEEnum = createEEnum(NFR);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actorsEClass.getESuperTypes().add(this.getNode());
		actorEClass.getESuperTypes().add(this.getActors());
		agentEClass.getESuperTypes().add(this.getActors());
		positionEClass.getESuperTypes().add(this.getActors());
		roleEClass.getESuperTypes().add(this.getActors());
		elementEClass.getESuperTypes().add(this.getNode());
		goalEClass.getESuperTypes().add(this.getElement());
		softgoalEClass.getESuperTypes().add(this.getElement());
		taskEClass.getESuperTypes().add(this.getElement());
		resourceEClass.getESuperTypes().add(this.getElement());
		beliefEClass.getESuperTypes().add(this.getElement());
		associationEClass.getESuperTypes().add(this.getRelationship());
		isaEClass.getESuperTypes().add(this.getAssociation());
		isPartOfEClass.getESuperTypes().add(this.getAssociation());
		playsEClass.getESuperTypes().add(this.getAssociation());
		coversEClass.getESuperTypes().add(this.getAssociation());
		occupiesEClass.getESuperTypes().add(this.getAssociation());
		insEClass.getESuperTypes().add(this.getAssociation());
		contributionLinkEClass.getESuperTypes().add(this.getRelationship());
		makeEClass.getESuperTypes().add(this.getContributionLink());
		breakEClass.getESuperTypes().add(this.getContributionLink());
		helpEClass.getESuperTypes().add(this.getContributionLink());
		hurtEClass.getESuperTypes().add(this.getContributionLink());
		somePlusEClass.getESuperTypes().add(this.getContributionLink());
		someMinusEClass.getESuperTypes().add(this.getContributionLink());
		andEClass.getESuperTypes().add(this.getContributionLink());
		orEClass.getESuperTypes().add(this.getContributionLink());
		unknownEClass.getESuperTypes().add(this.getContributionLink());
		decompositionEClass.getESuperTypes().add(this.getRelationship());
		meansEndEClass.getESuperTypes().add(this.getDecomposition());
		decompositionLinkEClass.getESuperTypes().add(this.getDecomposition());
		dependencyLinkEClass.getESuperTypes().add(this.getRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(istarEClass, istar.ISTAR.class, "ISTAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISTAR_HasNode(), this.getNode(), null, "hasNode", null, 0, -1, istar.ISTAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISTAR_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, istar.ISTAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISTAR_HasRelationship(), this.getRelationship(), null, "hasRelationship", null, 0, -1, istar.ISTAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NAct", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NElem", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NEOAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NEIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MinNEIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MaxNEIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "AvgNEIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NGIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NDAG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MinNDAG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MaxNDAG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "AvgNDAG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NGWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NSIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NDAS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MinNDAS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MaxNDAS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "AvgNDAS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NSWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NTIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NDAT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MinNDAT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "MaxNDAT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "AvgNDAT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NTWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NIDA", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NODA", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NEIActB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NEIAgentB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NEIRoleB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NEIPosB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NActors", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NAgents", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NRoles", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NPos", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PSAct", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PGWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PSWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PTWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NAWEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PAWEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NUEIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PUEIAB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NAWUEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PAWUEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PAWOUEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NDA", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PIDA", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PODA", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEIntegerObject(), "NAWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PAWD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(istarEClass, ecorePackage.getEDoubleObject(), "PAWOD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_NodeName(), ecorePackage.getEString(), "nodeName", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_NodeDependency(), this.getDependencyLink(), this.getDependencyLink_DependencyNode(), "nodeDependency", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_SecondNodeDependency(), this.getDependencyLink(), this.getDependencyLink_DependencySecondNode(), "secondNodeDependency", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_NodeNFR(), this.getNFR(), "nodeNFR", "unknown", 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_RelationshipName(), ecorePackage.getEString(), "relationshipName", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Source(), ecorePackage.getEString(), "source", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Target(), ecorePackage.getEString(), "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_RelationshipNFR(), this.getNFR(), "relationshipNFR", "unknown", 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorsEClass, Actors.class, "Actors", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActors_HasElement(), this.getElement(), null, "hasElement", null, 0, -1, Actors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_ActorISA(), this.getISA(), this.getISA_ISAactor(), "actorISA", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_SecondActorISA(), this.getISA(), this.getISA_ISAsecondActor(), "secondActorISA", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ActorIsPartOf(), this.getIsPartOf(), this.getIsPartOf_IsPartOfActor(), "actorIsPartOf", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_SecondActorIsPartOf(), this.getIsPartOf(), this.getIsPartOf_IsPartOfSecondActor(), "secondActorIsPartOf", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NGI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NDGI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NGWDI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "MinNDGI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "MaxNDGI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEDoubleObject(), "AvgNDGI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NSI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NDSI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NSWDI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "MinNDSI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "MaxNDSI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEDoubleObject(), "AvgNDSI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NTI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NDTI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "MinNDTI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "MaxNDTI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEDoubleObject(), "AvgNDTI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NTWDI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NUGI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NUSI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NUTI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NURI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NUBI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NUEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEDoubleObject(), "PUEI", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NID", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NOD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "ND", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEDoubleObject(), "PID", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEDoubleObject(), "POD", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actorEClass, ecorePackage.getEIntegerObject(), "NIISA", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_AgentPlays(), this.getPlays(), this.getPlays_PlaysAgent(), "agentPlays", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_AgentOccupies(), this.getOccupies(), this.getOccupies_OccupiesAgent(), "agentOccupies", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_AgentINS(), this.getINS(), this.getINS_INSagent(), "agentINS", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_SecondAgentINS(), this.getINS(), this.getINS_INSsecondAgent(), "secondAgentINS", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(agentEClass, ecorePackage.getEIntegerObject(), "NEIA", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPosition_PositionCovers(), this.getCovers(), this.getCovers_CoversPosition(), "positionCovers", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_PositionOccupies(), this.getOccupies(), this.getOccupies_OccupiesPosition(), "positionOccupies", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(positionEClass, ecorePackage.getEIntegerObject(), "NEIP", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_RolePlays(), this.getPlays(), this.getPlays_PlaysRole(), "rolePlays", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RoleCovers(), this.getCovers(), this.getCovers_CoversRole(), "roleCovers", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(roleEClass, ecorePackage.getEIntegerObject(), "NEIR", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_ElementContribution(), this.getContributionLink(), this.getContributionLink_ContributionElement(), "elementContribution", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ElementDecomposition(), this.getDecompositionLink(), this.getDecompositionLink_DecompositionElement(), "elementDecomposition", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_GoalMeansEnd(), this.getMeansEnd(), this.getMeansEnd_MeansEndGoal(), "goalMeansEnd", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(goalEClass, ecorePackage.getEIntegerObject(), "NDG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(goalEClass, ecorePackage.getEIntegerObject(), "NCLG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(goalEClass, ecorePackage.getEIntegerObject(), "NDLG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(goalEClass, ecorePackage.getEIntegerObject(), "NLG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(goalEClass, ecorePackage.getEIntegerObject(), "NIDG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(goalEClass, ecorePackage.getEIntegerObject(), "NODG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(goalEClass, ecorePackage.getEIntegerObject(), "NDepG", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftgoal_SoftgoalContribution(), this.getContributionLink(), this.getContributionLink_ContributionSoftgoal(), "softgoalContribution", null, 0, -1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(softgoalEClass, ecorePackage.getEIntegerObject(), "NDS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(softgoalEClass, ecorePackage.getEIntegerObject(), "NCLS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(softgoalEClass, ecorePackage.getEIntegerObject(), "NDLS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(softgoalEClass, ecorePackage.getEIntegerObject(), "NLS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(softgoalEClass, ecorePackage.getEIntegerObject(), "NIDS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(softgoalEClass, ecorePackage.getEIntegerObject(), "NODS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(softgoalEClass, ecorePackage.getEIntegerObject(), "NDepS", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_TaskMeansEnd(), this.getMeansEnd(), this.getMeansEnd_MeansEndTask(), "taskMeansEnd", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TaskDecomposition(), this.getDecompositionLink(), this.getDecompositionLink_DecompositionTask(), "taskDecomposition", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEIntegerObject(), "NDT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEIntegerObject(), "NCLT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEIntegerObject(), "NDLT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEIntegerObject(), "NLT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEIntegerObject(), "NIDT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEIntegerObject(), "NODT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(taskEClass, ecorePackage.getEIntegerObject(), "NDepT", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(resourceEClass, ecorePackage.getEIntegerObject(), "NCLR", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(resourceEClass, ecorePackage.getEIntegerObject(), "NDLR", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(resourceEClass, ecorePackage.getEIntegerObject(), "NLR", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(resourceEClass, ecorePackage.getEIntegerObject(), "NIDR", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(resourceEClass, ecorePackage.getEIntegerObject(), "NODR", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(resourceEClass, ecorePackage.getEIntegerObject(), "NDepR", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(beliefEClass, Belief.class, "Belief", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(beliefEClass, ecorePackage.getEIntegerObject(), "NCLB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(beliefEClass, ecorePackage.getEIntegerObject(), "NDLB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(beliefEClass, ecorePackage.getEIntegerObject(), "NLB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(beliefEClass, ecorePackage.getEIntegerObject(), "NIDB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(beliefEClass, ecorePackage.getEIntegerObject(), "NODB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(beliefEClass, ecorePackage.getEIntegerObject(), "NDepB", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isaEClass, istar.ISA.class, "ISA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISA_ISAactor(), this.getActor(), this.getActor_ActorISA(), "ISAactor", null, 1, 1, istar.ISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISA_ISAsecondActor(), this.getActor(), this.getActor_SecondActorISA(), "ISAsecondActor", null, 1, 1, istar.ISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isPartOfEClass, IsPartOf.class, "IsPartOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsPartOf_IsPartOfActor(), this.getActor(), this.getActor_ActorIsPartOf(), "isPartOfActor", null, 1, 1, IsPartOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsPartOf_IsPartOfSecondActor(), this.getActor(), this.getActor_SecondActorIsPartOf(), "isPartOfSecondActor", null, 1, 1, IsPartOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playsEClass, Plays.class, "Plays", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlays_PlaysRole(), this.getRole(), this.getRole_RolePlays(), "playsRole", null, 1, 1, Plays.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlays_PlaysAgent(), this.getAgent(), this.getAgent_AgentPlays(), "playsAgent", null, 1, 1, Plays.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coversEClass, Covers.class, "Covers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCovers_CoversRole(), this.getRole(), this.getRole_RoleCovers(), "coversRole", null, 1, 1, Covers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCovers_CoversPosition(), this.getPosition(), this.getPosition_PositionCovers(), "coversPosition", null, 1, 1, Covers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occupiesEClass, Occupies.class, "Occupies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOccupies_OccupiesPosition(), this.getPosition(), this.getPosition_PositionOccupies(), "occupiesPosition", null, 1, 1, Occupies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOccupies_OccupiesAgent(), this.getAgent(), this.getAgent_AgentOccupies(), "occupiesAgent", null, 1, 1, Occupies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insEClass, istar.INS.class, "INS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getINS_INSagent(), this.getAgent(), this.getAgent_AgentINS(), "INSagent", null, 1, 1, istar.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getINS_INSsecondAgent(), this.getAgent(), this.getAgent_SecondAgentINS(), "INSsecondAgent", null, 1, 1, istar.INS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionLinkEClass, ContributionLink.class, "ContributionLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContributionLink_ContributionElement(), this.getElement(), this.getElement_ElementContribution(), "contributionElement", null, 1, 1, ContributionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContributionLink_ContributionSoftgoal(), this.getSoftgoal(), this.getSoftgoal_SoftgoalContribution(), "contributionSoftgoal", null, 1, 1, ContributionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(makeEClass, Make.class, "Make", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breakEClass, Break.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helpEClass, Help.class, "Help", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hurtEClass, Hurt.class, "Hurt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(somePlusEClass, SomePlus.class, "SomePlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(someMinusEClass, SomeMinus.class, "SomeMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownEClass, Unknown.class, "Unknown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decompositionEClass, Decomposition.class, "Decomposition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meansEndEClass, MeansEnd.class, "MeansEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeansEnd_MeansEndTask(), this.getTask(), this.getTask_TaskMeansEnd(), "meansEndTask", null, 1, 1, MeansEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeansEnd_MeansEndGoal(), this.getGoal(), this.getGoal_GoalMeansEnd(), "meansEndGoal", null, 1, 1, MeansEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decompositionLinkEClass, DecompositionLink.class, "DecompositionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecompositionLink_DecompositionTask(), this.getTask(), this.getTask_TaskDecomposition(), "decompositionTask", null, 1, 1, DecompositionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecompositionLink_DecompositionElement(), this.getElement(), this.getElement_ElementDecomposition(), "decompositionElement", null, 1, 1, DecompositionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyLinkEClass, DependencyLink.class, "DependencyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyLink_Strength(), this.getDependencyStrength(), "strength", null, 0, 1, DependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyLink_DependencyName(), ecorePackage.getEString(), "dependencyName", "D", 0, 1, DependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyLink_DependencyNode(), this.getNode(), this.getNode_NodeDependency(), "dependencyNode", null, 1, 1, DependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyLink_DependencySecondNode(), this.getNode(), this.getNode_SecondNodeDependency(), "dependencySecondNode", null, 1, 1, DependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dependencyStrengthEEnum, DependencyStrength.class, "DependencyStrength");
		addEEnumLiteral(dependencyStrengthEEnum, DependencyStrength.COMMITED);
		addEEnumLiteral(dependencyStrengthEEnum, DependencyStrength.OPEN);
		addEEnumLiteral(dependencyStrengthEEnum, DependencyStrength.CRITICAL);

		initEEnum(nfrEEnum, istar.NFR.class, "NFR");
		addEEnumLiteral(nfrEEnum, istar.NFR.UNKNOWN);
		addEEnumLiteral(nfrEEnum, istar.NFR.FUNCTIONAL_SUITABILITY);
		addEEnumLiteral(nfrEEnum, istar.NFR.PERFORMANCE_EFFICIENCY);
		addEEnumLiteral(nfrEEnum, istar.NFR.COMPATIBILITY);
		addEEnumLiteral(nfrEEnum, istar.NFR.USABILITY);
		addEEnumLiteral(nfrEEnum, istar.NFR.RELIABILITY);
		addEEnumLiteral(nfrEEnum, istar.NFR.SECURITY);
		addEEnumLiteral(nfrEEnum, istar.NFR.MAINTAINABILITY);
		addEEnumLiteral(nfrEEnum, istar.NFR.PORTABILITY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.compartment
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

  /**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmfAnnotations()
  {
		String source = "gmf.diagram";	
		addAnnotation
		  (istarEClass, 
		   source, 
		   new String[] {
		   });
	}

  /**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (istarEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.NEOAB() + self.NEIAB()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Element))->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nei : Integer = n.oclAsType(Actor).NEI() in total + nei)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; min : Integer = -1 | let nei : Integer = n.oclAsType(Actor).NEI() in if min = -1 then nei else min.min(nei) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; max : Integer = -1 | let nei : Integer = n.oclAsType(Actor).NEI() in if max = -1 then nei else max.max(nei) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "self.NEIAB() / self.NAct()",
			 "pre_nact", "self.NAct() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ngi : Integer = n.oclAsType(Actor).NGI() in total + ngi)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ndgi : Integer = n.oclAsType(Actor).NDGI() in total + ndgi)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MinNDGI() > 0)->iterate(n : Node; min : Integer = -1 | let minndgi : Integer = n.oclAsType(Actor).MinNDGI() in if min = -1 then minndgi else min.min(minndgi) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MaxNDGI() > 0)->iterate(n : Node; max : Integer = -1 | let maxndgi : Integer = n.oclAsType(Actor).MaxNDGI() in if max = -1 then maxndgi else max.max(maxndgi) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "body", "self.NDAG() / self.NGWD()",
			 "pre_NGWD", "self.NGWD() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ngwdi : Integer = n.oclAsType(Actor).NGWDI() in total + ngwdi)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nsi : Integer = n.oclAsType(Actor).NSI() in total + nsi)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ndsi : Integer = n.oclAsType(Actor).NDSI() in total + ndsi)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MinNDSI() > 0)->iterate(n : Node; min : Integer = -1 | let minndsi : Integer = n.oclAsType(Actor).MinNDSI() in if min = -1 then minndsi else min.min(minndsi) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MaxNDSI() > 0)->iterate(n : Node; max : Integer = -1 | let maxndsi : Integer = n.oclAsType(Actor).MaxNDSI() in if max = -1 then maxndsi else max.max(maxndsi) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(17), 
		   source, 
		   new String[] {
			 "body", "self.NDAS() / self.NSWD()",
			 "pre_NSWD", "self.NSWD() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(18), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nswdi : Integer = n.oclAsType(Actor).NSWDI() in total + nswdi)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(19), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nti : Integer = n.oclAsType(Actor).NTI() in total + nti)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(20), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ndti : Integer = n.oclAsType(Actor).NDTI() in total + ndti)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(21), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MinNDTI() > 0)->iterate(n : Node; min : Integer = -1 | let minndti : Integer = n.oclAsType(Actor).MinNDTI() in if min = -1 then minndti else min.min(minndti) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(22), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MaxNDTI() > 0)->iterate(n : Node; max : Integer = -1 | let maxndti : Integer = n.oclAsType(Actor).MaxNDTI() in if max = -1 then maxndti else max.max(maxndti) endif)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(23), 
		   source, 
		   new String[] {
			 "body", "self.NDAT() / self.NTWD()",
			 "pre_NTWD", "self.NTWD() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(24), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ntwdi : Integer = n.oclAsType(Actor).NTWDI() in total + ntwdi)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(25), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nid : Integer = n.oclAsType(Actor).NID() in total + nid)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(26), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nod : Integer = n.oclAsType(Actor).NOD() in total + nod)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(27), 
		   source, 
		   new String[] {
			 "body", "self.NEIAB() - (self.NEIAgentB() + self.NEIRoleB() + self.NEIPosB())"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(28), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Agent))->iterate(n : Node; total : Integer = 0 | let neia : Integer = n.oclAsType(Agent).NEIA() in total + neia)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(29), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Role))->iterate(n : Node; total : Integer = 0 | let neir : Integer = n.oclAsType(Role).NEIR() in total + neir)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(30), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Position))->iterate(n : Node; total : Integer = 0 | let neip : Integer = n.oclAsType(Position).NEIP() in total + neip)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(31), 
		   source, 
		   new String[] {
			 "body", "self.NAct() - (self.NAgents() + self.NRoles() + self.NPos())"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(32), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Agent))->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(33), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Role))->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(34), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Position))->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(35), 
		   source, 
		   new String[] {
			 "body", "(self.NAgents() + self.NRoles() + self.NPos()) / self.NAct()",
			 "pre_NAct", "self.NAct() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(36), 
		   source, 
		   new String[] {
			 "body", "self.NGWD() / self.NGIAB()",
			 "pre_NGIAB", "self.NGIAB() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(37), 
		   source, 
		   new String[] {
			 "body", "self.NSWD() / self.NSIAB()",
			 "pre_NSIAB", "self.NSIAB() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(38), 
		   source, 
		   new String[] {
			 "body", "self.NTWD() / self.NTIAB()",
			 "pre_NTIAB", "self.NTIAB() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(39), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).NEI() > 0)->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(40), 
		   source, 
		   new String[] {
			 "body", "self.NAWEI() / self.NAct()",
			 "pre_NAct", "self.NAct() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(41), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nuei : Integer = n.oclAsType(Actor).NUEI() in total + nuei)"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(42), 
		   source, 
		   new String[] {
			 "body", "self.NUEIAB() / self.NEIAB()",
			 "pre_NEIAB", "self.NEIAB() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(43), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).NUEI() > 0)->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(44), 
		   source, 
		   new String[] {
			 "body", "self.NAWUEI() / self.NAct()",
			 "pre_NAct", "self.NAct() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(45), 
		   source, 
		   new String[] {
			 "body", "1 - self.PAWUEI()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(46), 
		   source, 
		   new String[] {
			 "body", "self.NIDA() + self.NODA()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(47), 
		   source, 
		   new String[] {
			 "body", "self.NIDA() / self.NDA()",
			 "pre_NDA", "self.NDA() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(48), 
		   source, 
		   new String[] {
			 "body", "self.NODA() / self.NDA()",
			 "pre_NDA", "self.NDA() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(49), 
		   source, 
		   new String[] {
			 "body", "self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).ND() > 0)->size()"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(50), 
		   source, 
		   new String[] {
			 "body", "self.NAWD() / self.NAct()",
			 "pre_NAct", "self.NAct() > 0"
		   });	
		addAnnotation
		  (istarEClass.getEOperations().get(51), 
		   source, 
		   new String[] {
			 "body", "1 - self.PAWD()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Goal))->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Goal))->iterate(e : Element; total : Integer = 0 | let ndg : Integer = e.oclAsType(Goal).NDG() in total + ndg)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NDG() > 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NDG() > 0)->iterate(e : Element; min : Integer = -1 | let ndg : Integer = e.oclAsType(Goal).NDG() in if min = -1 then ndg else min.min(ndg) endif)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NDG() > 0)->iterate(e : Element; max : Integer = -1 | let ndg : Integer = e.oclAsType(Goal).NDG() in if max = -1 then ndg else max.max(ndg) endif)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "self.NDGI() / self.NGWDI()",
			 "pre_NGWDI", "self.NGWDI() > 0"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(7), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal))->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(8), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal))->iterate(e: Element; total : Integer = 0 | let nds : Integer = e.oclAsType(Softgoal).NDS() in total + nds)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(9), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NDS() > 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(10), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NDS() > 0)->iterate(e : Element; min : Integer = -1 | let nds : Integer = e.oclAsType(Softgoal).NDS() in if min = -1 then nds else min.min(nds) endif)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(11), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NDS() > 0)->iterate(e : Element; max : Integer = -1 | let nds : Integer = e.oclAsType(Softgoal).NDS() in if max = -1 then nds else max.max(nds) endif)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(12), 
		   source, 
		   new String[] {
			 "body", "self.NDSI() / self.NSWDI()",
			 "pre_NTWDI", "self.NSWDI() > 0"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(13), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Task))->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(14), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Task))->iterate(e : Element; total : Integer = 0 | let ndt : Integer = e.oclAsType(Task).NDT() in total + ndt)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(15), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NDT() > 0)->iterate(e : Element; min : Integer = -1 | let ndt : Integer = e.oclAsType(Task).NDT() in if min = -1 then ndt else min.min(ndt) endif)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(16), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NDT() > 0)->iterate(e : Element; max : Integer = -1 | let ndt : Integer = e.oclAsType(Task).NDT() in if max = -1 then ndt else max.max(ndt) endif)"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(17), 
		   source, 
		   new String[] {
			 "body", "self.NDTI() / self.NTWDI()",
			 "pre_NTWDI", "self.NTWDI() > 0"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(18), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NDT() > 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(19), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NLG() = 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(20), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NLS() = 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(21), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NLT() = 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(22), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Resource) and e.oclAsType(Resource).NLR() = 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(23), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Belief) and e.oclAsType(Belief).NLB() = 0)->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(24), 
		   source, 
		   new String[] {
			 "body", "self.NUGI() + self.NUSI() + self.NUTI() + self.NURI() + self.NUBI()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(25), 
		   source, 
		   new String[] {
			 "body", "self.NUEI() / self.NEI()",
			 "pre_NEI", "self.NEI() > 0"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(26), 
		   source, 
		   new String[] {
			 "body", "self.actorDependency->select(dl : DependencyLink | dl.oclIsKindOf(DependeeLink))->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(27), 
		   source, 
		   new String[] {
			 "body", "self.actorDependency->select(dl : DependencyLink | dl.oclIsKindOf(DependerLink))->size()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(28), 
		   source, 
		   new String[] {
			 "body", "self.NID() + self.NOD()"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(29), 
		   source, 
		   new String[] {
			 "body", "self.NID() / self.ND()",
			 "pre_ND", "self.ND() > 0"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(30), 
		   source, 
		   new String[] {
			 "body", "self.NOD() / self.ND()",
			 "pre_ND", "self.ND() > 0"
		   });	
		addAnnotation
		  (actorEClass.getEOperations().get(31), 
		   source, 
		   new String[] {
			 "body", "self.actorISA->size()"
		   });	
		addAnnotation
		  (agentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()"
		   });	
		addAnnotation
		  (positionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()"
		   });	
		addAnnotation
		  (roleEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()"
		   });	
		addAnnotation
		  (goalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.goalMeansEnds->select(me : MeansEnds | me.oclIsKindOf(MeansEnds))->size()"
		   });	
		addAnnotation
		  (goalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()"
		   });	
		addAnnotation
		  (goalEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()"
		   });	
		addAnnotation
		  (goalEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.NDG() + self.NCLG() + self.NDLG()"
		   });	
		addAnnotation
		  (goalEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (goalEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (goalEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "self.NIDG() + self.NODG()"
		   });	
		addAnnotation
		  (softgoalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.softgoalContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()"
		   });	
		addAnnotation
		  (softgoalEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()"
		   });	
		addAnnotation
		  (softgoalEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()"
		   });	
		addAnnotation
		  (softgoalEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.NDS() + self.NCLS() + self.NDLS()"
		   });	
		addAnnotation
		  (softgoalEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (softgoalEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (softgoalEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "self.NIDS() + self.NODS()"
		   });	
		addAnnotation
		  (taskEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.taskDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()"
		   });	
		addAnnotation
		  (taskEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()"
		   });	
		addAnnotation
		  (taskEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()"
		   });	
		addAnnotation
		  (taskEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.NDT() + self.NCLT() + self.NDLT()"
		   });	
		addAnnotation
		  (taskEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (taskEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (taskEClass.getEOperations().get(6), 
		   source, 
		   new String[] {
			 "body", "self.NIDT() + self.NODT()"
		   });	
		addAnnotation
		  (resourceEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()"
		   });	
		addAnnotation
		  (resourceEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()"
		   });	
		addAnnotation
		  (resourceEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.NCLR() + self.NDLR()"
		   });	
		addAnnotation
		  (resourceEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (resourceEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (resourceEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.NIDR() + self.NODR()"
		   });	
		addAnnotation
		  (beliefEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.elementContribution->select(cl : ContributionLink | cl.oclIsKindOf(ContributionLink))->size()"
		   });	
		addAnnotation
		  (beliefEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "body", "self.elementDecompositionLink->select(dl : DecompositionLink | dl.oclIsKindOf(DecompositionLink))->size()"
		   });	
		addAnnotation
		  (beliefEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "body", "self.NCLB() + self.NDLB()"
		   });	
		addAnnotation
		  (beliefEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
			 "body", "self.secondElementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (beliefEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
			 "body", "self.elementDependency->select(dl : DependencyLink | dl.oclIsKindOf(DepElemLink))->size()"
		   });	
		addAnnotation
		  (beliefEClass.getEOperations().get(5), 
		   source, 
		   new String[] {
			 "body", "self.NIDB() + self.NODB()"
		   });
	}

		/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_1Annotations()
  {
		String source = "gmf.compartment";	
		addAnnotation
		  (getActors_HasElement(), 
		   source, 
		   new String[] {
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_2Annotations()
  {
		String source = "gmf.node";	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "color", "249,249,249",
			 "border.color", "0,0,0",
			 "label", "nodeName"
		   });	
		addAnnotation
		  (agentEClass, 
		   source, 
		   new String[] {
			 "color", "249,249,249",
			 "border.color", "0,0,0",
			 "label", "nodeName"
		   });	
		addAnnotation
		  (positionEClass, 
		   source, 
		   new String[] {
			 "color", "249,249,249",
			 "border.color", "0,0,0",
			 "label", "nodeName"
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "color", "249,249,249",
			 "border.color", "0,0,0",
			 "label", "nodeName"
		   });	
		addAnnotation
		  (goalEClass, 
		   source, 
		   new String[] {
			 "label", "nodeName",
			 "label.icon", "false",
			 "color", "184,219,255",
			 "border.color", "0,0,0",
			 "size", "80,40",
			 "figure", "polygon",
			 "polygon.x", "0 0 5 15 35 45 50 50 45 35 15 5",
			 "polygon.y", "10 20 30 30 30 30 20 10 0 0 0 0"
		   });	
		addAnnotation
		  (softgoalEClass, 
		   source, 
		   new String[] {
			 "label", "nodeName",
			 "label.icon", "false",
			 "color", "206,255,153",
			 "border.color", "0,0,0",
			 "size", "80,40",
			 "figure", "polygon",
			 "polygon.x", "0 0 5 15 25 35 45 50 50 45 35 25 15 5",
			 "polygon.y", "10 20 30 30 25 30 30 20 10 0 0 5 0 0"
		   });	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "label", "nodeName",
			 "label.icon", "false",
			 "color", "255,227,143",
			 "border.color", "0,0,0",
			 "size", "80,40",
			 "figure", "polygon",
			 "polygon.x", "0 10 50 60 50 10",
			 "polygon.y", "15 30 30 15 0 0"
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "label", "nodeName",
			 "label.icon", "false",
			 "color", "255,255,179",
			 "border.color", "0,0,0",
			 "size", "80,40",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (beliefEClass, 
		   source, 
		   new String[] {
			 "label", "nodeName",
			 "label.icon", "false",
			 "color", "255,194,173",
			 "border.color", "0,0,0",
			 "size", "80,40",
			 "figure", "ellipse"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_3Annotations()
  {
		String source = "gmf.link";	
		addAnnotation
		  (isaEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "ISAactor",
			 "target", "ISAsecondActor",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (isPartOfEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "isPartOfActor",
			 "target", "isPartOfSecondActor",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (playsEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "playsAgent",
			 "target", "playsRole",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (coversEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "coversPosition",
			 "target", "coversRole",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (occupiesEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "occupiesAgent",
			 "target", "occupiesPosition",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (insEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "INSagent",
			 "target", "INSsecondAgent",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (makeEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (breakEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (helpEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (hurtEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (somePlusEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "label.text", "Some+",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (someMinusEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "label.text", "Some-",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (andEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (orEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (unknownEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "contributionElement",
			 "target", "contributionSoftgoal",
			 "target.decoration", "arrow",
			 "label", "relationshipName",
			 "label.readOnly", "true",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (meansEndEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "meansEndTask",
			 "target", "meansEndGoal",
			 "target.decoration", "filledclosedarrow",
			 "label.placement", "none"
		   });	
		addAnnotation
		  (decompositionLinkEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "decompositionTask",
			 "target", "decompositionElement",
			 "label.placement", "none",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (dependencyLinkEClass, 
		   source, 
		   new String[] {
			 "color", "0,0,0",
			 "source", "dependencyNode",
			 "target", "dependencySecondNode",
			 "target.decoration", "closedarrow",
			 "label", "dependencyName"
		   });
	}

} //IstarPackageImpl

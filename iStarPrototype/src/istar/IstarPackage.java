/**
 */
package istar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see istar.IstarFactory
 * @model kind="package"
 * @generated
 */
public interface IstarPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "istar";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "is";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "is";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  IstarPackage eINSTANCE = istar.impl.IstarPackageImpl.init();

  /**
	 * The meta object id for the '{@link istar.impl.ISTARImpl <em>ISTAR</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.ISTARImpl
	 * @see istar.impl.IstarPackageImpl#getISTAR()
	 * @generated
	 */
  int ISTAR = 0;

  /**
	 * The feature id for the '<em><b>Has Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISTAR__HAS_NODE = 0;

  /**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISTAR__MODEL_NAME = 1;

  /**
	 * The feature id for the '<em><b>Has Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISTAR__HAS_RELATIONSHIP = 2;

  /**
	 * The number of structural features of the '<em>ISTAR</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISTAR_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link istar.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.NodeImpl
	 * @see istar.impl.IstarPackageImpl#getNode()
	 * @generated
	 */
  int NODE = 1;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__NODE_NAME = 0;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__NODE_DEPENDENCY = 1;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__SECOND_NODE_DEPENDENCY = 2;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__NODE_NFR = 3;

  /**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link istar.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.RelationshipImpl
	 * @see istar.impl.IstarPackageImpl#getRelationship()
	 * @generated
	 */
  int RELATIONSHIP = 2;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP__RELATIONSHIP_NAME = 0;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP__SOURCE = 1;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP__TARGET = 2;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP__RELATIONSHIP_NFR = 3;

  /**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONSHIP_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link istar.impl.ActorsImpl <em>Actors</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.ActorsImpl
	 * @see istar.impl.IstarPackageImpl#getActors()
	 * @generated
	 */
  int ACTORS = 3;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTORS__NODE_NAME = NODE__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTORS__NODE_DEPENDENCY = NODE__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTORS__SECOND_NODE_DEPENDENCY = NODE__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTORS__NODE_NFR = NODE__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Has Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTORS__HAS_ELEMENT = NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Actors</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTORS_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link istar.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.ActorImpl
	 * @see istar.impl.IstarPackageImpl#getActor()
	 * @generated
	 */
  int ACTOR = 4;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__NODE_NAME = ACTORS__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__NODE_DEPENDENCY = ACTORS__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__SECOND_NODE_DEPENDENCY = ACTORS__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__NODE_NFR = ACTORS__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Has Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__HAS_ELEMENT = ACTORS__HAS_ELEMENT;

  /**
	 * The feature id for the '<em><b>Actor ISA</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__ACTOR_ISA = ACTORS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Second Actor ISA</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__SECOND_ACTOR_ISA = ACTORS_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Actor Is Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__ACTOR_IS_PART_OF = ACTORS_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Second Actor Is Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR__SECOND_ACTOR_IS_PART_OF = ACTORS_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACTOR_FEATURE_COUNT = ACTORS_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link istar.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.AgentImpl
	 * @see istar.impl.IstarPackageImpl#getAgent()
	 * @generated
	 */
  int AGENT = 5;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__NODE_NAME = ACTORS__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__NODE_DEPENDENCY = ACTORS__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__SECOND_NODE_DEPENDENCY = ACTORS__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__NODE_NFR = ACTORS__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Has Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__HAS_ELEMENT = ACTORS__HAS_ELEMENT;

  /**
	 * The feature id for the '<em><b>Agent Plays</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__AGENT_PLAYS = ACTORS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Agent Occupies</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__AGENT_OCCUPIES = ACTORS_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Agent INS</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__AGENT_INS = ACTORS_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Second Agent INS</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT__SECOND_AGENT_INS = ACTORS_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AGENT_FEATURE_COUNT = ACTORS_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link istar.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.PositionImpl
	 * @see istar.impl.IstarPackageImpl#getPosition()
	 * @generated
	 */
  int POSITION = 6;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__NODE_NAME = ACTORS__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__NODE_DEPENDENCY = ACTORS__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__SECOND_NODE_DEPENDENCY = ACTORS__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__NODE_NFR = ACTORS__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Has Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__HAS_ELEMENT = ACTORS__HAS_ELEMENT;

  /**
	 * The feature id for the '<em><b>Position Covers</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__POSITION_COVERS = ACTORS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Position Occupies</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__POSITION_OCCUPIES = ACTORS_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION_FEATURE_COUNT = ACTORS_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.RoleImpl
	 * @see istar.impl.IstarPackageImpl#getRole()
	 * @generated
	 */
  int ROLE = 7;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__NODE_NAME = ACTORS__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__NODE_DEPENDENCY = ACTORS__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__SECOND_NODE_DEPENDENCY = ACTORS__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__NODE_NFR = ACTORS__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Has Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__HAS_ELEMENT = ACTORS__HAS_ELEMENT;

  /**
	 * The feature id for the '<em><b>Role Plays</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__ROLE_PLAYS = ACTORS_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Role Covers</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE__ROLE_COVERS = ACTORS_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROLE_FEATURE_COUNT = ACTORS_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.ElementImpl
	 * @see istar.impl.IstarPackageImpl#getElement()
	 * @generated
	 */
  int ELEMENT = 8;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT__NODE_NAME = NODE__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT__NODE_DEPENDENCY = NODE__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT__SECOND_NODE_DEPENDENCY = NODE__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT__NODE_NFR = NODE__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Element Contribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT__ELEMENT_CONTRIBUTION = NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Element Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT__ELEMENT_DECOMPOSITION = NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ELEMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.GoalImpl
	 * @see istar.impl.IstarPackageImpl#getGoal()
	 * @generated
	 */
  int GOAL = 9;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__NODE_NAME = ELEMENT__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__NODE_DEPENDENCY = ELEMENT__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__SECOND_NODE_DEPENDENCY = ELEMENT__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__NODE_NFR = ELEMENT__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Element Contribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__ELEMENT_CONTRIBUTION = ELEMENT__ELEMENT_CONTRIBUTION;

  /**
	 * The feature id for the '<em><b>Element Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__ELEMENT_DECOMPOSITION = ELEMENT__ELEMENT_DECOMPOSITION;

  /**
	 * The feature id for the '<em><b>Goal Means End</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL__GOAL_MEANS_END = ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GOAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link istar.impl.SoftgoalImpl <em>Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.SoftgoalImpl
	 * @see istar.impl.IstarPackageImpl#getSoftgoal()
	 * @generated
	 */
  int SOFTGOAL = 10;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL__NODE_NAME = ELEMENT__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL__NODE_DEPENDENCY = ELEMENT__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL__SECOND_NODE_DEPENDENCY = ELEMENT__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL__NODE_NFR = ELEMENT__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Element Contribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL__ELEMENT_CONTRIBUTION = ELEMENT__ELEMENT_CONTRIBUTION;

  /**
	 * The feature id for the '<em><b>Element Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL__ELEMENT_DECOMPOSITION = ELEMENT__ELEMENT_DECOMPOSITION;

  /**
	 * The feature id for the '<em><b>Softgoal Contribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL__SOFTGOAL_CONTRIBUTION = ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Softgoal</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOFTGOAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link istar.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.TaskImpl
	 * @see istar.impl.IstarPackageImpl#getTask()
	 * @generated
	 */
  int TASK = 11;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__NODE_NAME = ELEMENT__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__NODE_DEPENDENCY = ELEMENT__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__SECOND_NODE_DEPENDENCY = ELEMENT__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__NODE_NFR = ELEMENT__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Element Contribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__ELEMENT_CONTRIBUTION = ELEMENT__ELEMENT_CONTRIBUTION;

  /**
	 * The feature id for the '<em><b>Element Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__ELEMENT_DECOMPOSITION = ELEMENT__ELEMENT_DECOMPOSITION;

  /**
	 * The feature id for the '<em><b>Task Means End</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__TASK_MEANS_END = ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Task Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK__TASK_DECOMPOSITION = ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TASK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.ResourceImpl
	 * @see istar.impl.IstarPackageImpl#getResource()
	 * @generated
	 */
  int RESOURCE = 12;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE__NODE_NAME = ELEMENT__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE__NODE_DEPENDENCY = ELEMENT__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE__SECOND_NODE_DEPENDENCY = ELEMENT__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE__NODE_NFR = ELEMENT__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Element Contribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE__ELEMENT_CONTRIBUTION = ELEMENT__ELEMENT_CONTRIBUTION;

  /**
	 * The feature id for the '<em><b>Element Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE__ELEMENT_DECOMPOSITION = ELEMENT__ELEMENT_DECOMPOSITION;

  /**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESOURCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.BeliefImpl <em>Belief</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.BeliefImpl
	 * @see istar.impl.IstarPackageImpl#getBelief()
	 * @generated
	 */
  int BELIEF = 13;

  /**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF__NODE_NAME = ELEMENT__NODE_NAME;

  /**
	 * The feature id for the '<em><b>Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF__NODE_DEPENDENCY = ELEMENT__NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Second Node Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF__SECOND_NODE_DEPENDENCY = ELEMENT__SECOND_NODE_DEPENDENCY;

  /**
	 * The feature id for the '<em><b>Node NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF__NODE_NFR = ELEMENT__NODE_NFR;

  /**
	 * The feature id for the '<em><b>Element Contribution</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF__ELEMENT_CONTRIBUTION = ELEMENT__ELEMENT_CONTRIBUTION;

  /**
	 * The feature id for the '<em><b>Element Decomposition</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF__ELEMENT_DECOMPOSITION = ELEMENT__ELEMENT_DECOMPOSITION;

  /**
	 * The number of structural features of the '<em>Belief</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BELIEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.AssociationImpl
	 * @see istar.impl.IstarPackageImpl#getAssociation()
	 * @generated
	 */
  int ASSOCIATION = 14;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__RELATIONSHIP_NAME = RELATIONSHIP__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__SOURCE = RELATIONSHIP__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__TARGET = RELATIONSHIP__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__RELATIONSHIP_NFR = RELATIONSHIP__RELATIONSHIP_NFR;

  /**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.ISAImpl <em>ISA</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.ISAImpl
	 * @see istar.impl.IstarPackageImpl#getISA()
	 * @generated
	 */
  int ISA = 15;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISA__RELATIONSHIP_NAME = ASSOCIATION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISA__SOURCE = ASSOCIATION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISA__TARGET = ASSOCIATION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISA__RELATIONSHIP_NFR = ASSOCIATION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>IS Aactor</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISA__IS_AACTOR = ASSOCIATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>IS Asecond Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISA__IS_ASECOND_ACTOR = ASSOCIATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>ISA</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ISA_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.IsPartOfImpl <em>Is Part Of</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.IsPartOfImpl
	 * @see istar.impl.IstarPackageImpl#getIsPartOf()
	 * @generated
	 */
  int IS_PART_OF = 16;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IS_PART_OF__RELATIONSHIP_NAME = ASSOCIATION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IS_PART_OF__SOURCE = ASSOCIATION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IS_PART_OF__TARGET = ASSOCIATION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IS_PART_OF__RELATIONSHIP_NFR = ASSOCIATION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Is Part Of Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IS_PART_OF__IS_PART_OF_ACTOR = ASSOCIATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Is Part Of Second Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IS_PART_OF__IS_PART_OF_SECOND_ACTOR = ASSOCIATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Is Part Of</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IS_PART_OF_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.PlaysImpl <em>Plays</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.PlaysImpl
	 * @see istar.impl.IstarPackageImpl#getPlays()
	 * @generated
	 */
  int PLAYS = 17;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYS__RELATIONSHIP_NAME = ASSOCIATION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYS__SOURCE = ASSOCIATION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYS__TARGET = ASSOCIATION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYS__RELATIONSHIP_NFR = ASSOCIATION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Plays Role</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYS__PLAYS_ROLE = ASSOCIATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Plays Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYS__PLAYS_AGENT = ASSOCIATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Plays</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYS_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.CoversImpl <em>Covers</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.CoversImpl
	 * @see istar.impl.IstarPackageImpl#getCovers()
	 * @generated
	 */
  int COVERS = 18;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COVERS__RELATIONSHIP_NAME = ASSOCIATION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COVERS__SOURCE = ASSOCIATION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COVERS__TARGET = ASSOCIATION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COVERS__RELATIONSHIP_NFR = ASSOCIATION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Covers Role</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COVERS__COVERS_ROLE = ASSOCIATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Covers Position</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COVERS__COVERS_POSITION = ASSOCIATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Covers</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COVERS_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.OccupiesImpl <em>Occupies</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.OccupiesImpl
	 * @see istar.impl.IstarPackageImpl#getOccupies()
	 * @generated
	 */
  int OCCUPIES = 19;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCCUPIES__RELATIONSHIP_NAME = ASSOCIATION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCCUPIES__SOURCE = ASSOCIATION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCCUPIES__TARGET = ASSOCIATION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCCUPIES__RELATIONSHIP_NFR = ASSOCIATION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Occupies Position</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCCUPIES__OCCUPIES_POSITION = ASSOCIATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Occupies Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCCUPIES__OCCUPIES_AGENT = ASSOCIATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Occupies</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCCUPIES_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.INSImpl <em>INS</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.INSImpl
	 * @see istar.impl.IstarPackageImpl#getINS()
	 * @generated
	 */
  int INS = 20;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INS__RELATIONSHIP_NAME = ASSOCIATION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INS__SOURCE = ASSOCIATION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INS__TARGET = ASSOCIATION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INS__RELATIONSHIP_NFR = ASSOCIATION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>IN Sagent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INS__IN_SAGENT = ASSOCIATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>IN Ssecond Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INS__IN_SSECOND_AGENT = ASSOCIATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>INS</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INS_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.ContributionLinkImpl <em>Contribution Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.ContributionLinkImpl
	 * @see istar.impl.IstarPackageImpl#getContributionLink()
	 * @generated
	 */
  int CONTRIBUTION_LINK = 21;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTION_LINK__RELATIONSHIP_NAME = RELATIONSHIP__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTION_LINK__SOURCE = RELATIONSHIP__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTION_LINK__TARGET = RELATIONSHIP__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTION_LINK__RELATIONSHIP_NFR = RELATIONSHIP__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Contribution Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRIBUTION_LINK_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.MakeImpl <em>Make</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.MakeImpl
	 * @see istar.impl.IstarPackageImpl#getMake()
	 * @generated
	 */
  int MAKE = 22;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAKE__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAKE__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAKE__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAKE__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAKE__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAKE__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Make</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAKE_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.BreakImpl
	 * @see istar.impl.IstarPackageImpl#getBreak()
	 * @generated
	 */
  int BREAK = 23;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BREAK__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BREAK__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BREAK__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BREAK__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BREAK__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BREAK__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BREAK_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.HelpImpl <em>Help</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.HelpImpl
	 * @see istar.impl.IstarPackageImpl#getHelp()
	 * @generated
	 */
  int HELP = 24;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HELP__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HELP__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HELP__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HELP__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HELP__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HELP__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Help</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HELP_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.HurtImpl <em>Hurt</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.HurtImpl
	 * @see istar.impl.IstarPackageImpl#getHurt()
	 * @generated
	 */
  int HURT = 25;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HURT__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HURT__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HURT__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HURT__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HURT__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HURT__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Hurt</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HURT_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.SomePlusImpl <em>Some Plus</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.SomePlusImpl
	 * @see istar.impl.IstarPackageImpl#getSomePlus()
	 * @generated
	 */
  int SOME_PLUS = 26;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_PLUS__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_PLUS__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_PLUS__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_PLUS__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_PLUS__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_PLUS__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Some Plus</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_PLUS_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.SomeMinusImpl <em>Some Minus</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.SomeMinusImpl
	 * @see istar.impl.IstarPackageImpl#getSomeMinus()
	 * @generated
	 */
  int SOME_MINUS = 27;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_MINUS__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_MINUS__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_MINUS__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_MINUS__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_MINUS__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_MINUS__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Some Minus</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SOME_MINUS_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.AndImpl
	 * @see istar.impl.IstarPackageImpl#getAnd()
	 * @generated
	 */
  int AND = 28;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int AND_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.OrImpl
	 * @see istar.impl.IstarPackageImpl#getOr()
	 * @generated
	 */
  int OR = 29;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OR_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.UnknownImpl <em>Unknown</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.UnknownImpl
	 * @see istar.impl.IstarPackageImpl#getUnknown()
	 * @generated
	 */
  int UNKNOWN = 30;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN__RELATIONSHIP_NAME = CONTRIBUTION_LINK__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN__SOURCE = CONTRIBUTION_LINK__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN__TARGET = CONTRIBUTION_LINK__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN__RELATIONSHIP_NFR = CONTRIBUTION_LINK__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Contribution Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN__CONTRIBUTION_ELEMENT = CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT;

  /**
	 * The feature id for the '<em><b>Contribution Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN__CONTRIBUTION_SOFTGOAL = CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL;

  /**
	 * The number of structural features of the '<em>Unknown</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNKNOWN_FEATURE_COUNT = CONTRIBUTION_LINK_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.DecompositionImpl
	 * @see istar.impl.IstarPackageImpl#getDecomposition()
	 * @generated
	 */
  int DECOMPOSITION = 31;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION__RELATIONSHIP_NAME = RELATIONSHIP__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION__SOURCE = RELATIONSHIP__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION__TARGET = RELATIONSHIP__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION__RELATIONSHIP_NFR = RELATIONSHIP__RELATIONSHIP_NFR;

  /**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link istar.impl.MeansEndImpl <em>Means End</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.MeansEndImpl
	 * @see istar.impl.IstarPackageImpl#getMeansEnd()
	 * @generated
	 */
  int MEANS_END = 32;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MEANS_END__RELATIONSHIP_NAME = DECOMPOSITION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MEANS_END__SOURCE = DECOMPOSITION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MEANS_END__TARGET = DECOMPOSITION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MEANS_END__RELATIONSHIP_NFR = DECOMPOSITION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Means End Task</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MEANS_END__MEANS_END_TASK = DECOMPOSITION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Means End Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MEANS_END__MEANS_END_GOAL = DECOMPOSITION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Means End</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MEANS_END_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.DecompositionLinkImpl <em>Decomposition Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.DecompositionLinkImpl
	 * @see istar.impl.IstarPackageImpl#getDecompositionLink()
	 * @generated
	 */
  int DECOMPOSITION_LINK = 33;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_LINK__RELATIONSHIP_NAME = DECOMPOSITION__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_LINK__SOURCE = DECOMPOSITION__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_LINK__TARGET = DECOMPOSITION__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_LINK__RELATIONSHIP_NFR = DECOMPOSITION__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Decomposition Task</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_LINK__DECOMPOSITION_TASK = DECOMPOSITION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Decomposition Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT = DECOMPOSITION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Decomposition Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DECOMPOSITION_LINK_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link istar.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.impl.DependencyLinkImpl
	 * @see istar.impl.IstarPackageImpl#getDependencyLink()
	 * @generated
	 */
  int DEPENDENCY_LINK = 34;

  /**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__RELATIONSHIP_NAME = RELATIONSHIP__RELATIONSHIP_NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__SOURCE = RELATIONSHIP__SOURCE;

  /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__TARGET = RELATIONSHIP__TARGET;

  /**
	 * The feature id for the '<em><b>Relationship NFR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__RELATIONSHIP_NFR = RELATIONSHIP__RELATIONSHIP_NFR;

  /**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__STRENGTH = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Dependency Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__DEPENDENCY_NAME = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Dependency Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__DEPENDENCY_NODE = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Dependency Second Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE = RELATIONSHIP_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_LINK_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link istar.DependencyStrength <em>Dependency Strength</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.DependencyStrength
	 * @see istar.impl.IstarPackageImpl#getDependencyStrength()
	 * @generated
	 */
  int DEPENDENCY_STRENGTH = 35;

  /**
	 * The meta object id for the '{@link istar.NFR <em>NFR</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see istar.NFR
	 * @see istar.impl.IstarPackageImpl#getNFR()
	 * @generated
	 */
  int NFR = 36;


  /**
	 * Returns the meta object for class '{@link istar.ISTAR <em>ISTAR</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISTAR</em>'.
	 * @see istar.ISTAR
	 * @generated
	 */
  EClass getISTAR();

  /**
	 * Returns the meta object for the containment reference list '{@link istar.ISTAR#getHasNode <em>Has Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Node</em>'.
	 * @see istar.ISTAR#getHasNode()
	 * @see #getISTAR()
	 * @generated
	 */
  EReference getISTAR_HasNode();

  /**
	 * Returns the meta object for the attribute '{@link istar.ISTAR#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see istar.ISTAR#getModelName()
	 * @see #getISTAR()
	 * @generated
	 */
  EAttribute getISTAR_ModelName();

  /**
	 * Returns the meta object for the containment reference list '{@link istar.ISTAR#getHasRelationship <em>Has Relationship</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relationship</em>'.
	 * @see istar.ISTAR#getHasRelationship()
	 * @see #getISTAR()
	 * @generated
	 */
  EReference getISTAR_HasRelationship();

  /**
	 * Returns the meta object for class '{@link istar.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see istar.Node
	 * @generated
	 */
  EClass getNode();

  /**
	 * Returns the meta object for the attribute '{@link istar.Node#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see istar.Node#getNodeName()
	 * @see #getNode()
	 * @generated
	 */
  EAttribute getNode_NodeName();

  /**
	 * Returns the meta object for the reference list '{@link istar.Node#getNodeDependency <em>Node Dependency</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Dependency</em>'.
	 * @see istar.Node#getNodeDependency()
	 * @see #getNode()
	 * @generated
	 */
  EReference getNode_NodeDependency();

  /**
	 * Returns the meta object for the reference list '{@link istar.Node#getSecondNodeDependency <em>Second Node Dependency</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Second Node Dependency</em>'.
	 * @see istar.Node#getSecondNodeDependency()
	 * @see #getNode()
	 * @generated
	 */
  EReference getNode_SecondNodeDependency();

  /**
	 * Returns the meta object for the attribute list '{@link istar.Node#getNodeNFR <em>Node NFR</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node NFR</em>'.
	 * @see istar.Node#getNodeNFR()
	 * @see #getNode()
	 * @generated
	 */
  EAttribute getNode_NodeNFR();

  /**
	 * Returns the meta object for class '{@link istar.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see istar.Relationship
	 * @generated
	 */
  EClass getRelationship();

  /**
	 * Returns the meta object for the attribute '{@link istar.Relationship#getRelationshipName <em>Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Name</em>'.
	 * @see istar.Relationship#getRelationshipName()
	 * @see #getRelationship()
	 * @generated
	 */
  EAttribute getRelationship_RelationshipName();

  /**
	 * Returns the meta object for the attribute '{@link istar.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see istar.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
  EAttribute getRelationship_Source();

  /**
	 * Returns the meta object for the attribute '{@link istar.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see istar.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
  EAttribute getRelationship_Target();

  /**
	 * Returns the meta object for the attribute list '{@link istar.Relationship#getRelationshipNFR <em>Relationship NFR</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Relationship NFR</em>'.
	 * @see istar.Relationship#getRelationshipNFR()
	 * @see #getRelationship()
	 * @generated
	 */
  EAttribute getRelationship_RelationshipNFR();

  /**
	 * Returns the meta object for class '{@link istar.Actors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actors</em>'.
	 * @see istar.Actors
	 * @generated
	 */
  EClass getActors();

  /**
	 * Returns the meta object for the containment reference list '{@link istar.Actors#getHasElement <em>Has Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Element</em>'.
	 * @see istar.Actors#getHasElement()
	 * @see #getActors()
	 * @generated
	 */
  EReference getActors_HasElement();

  /**
	 * Returns the meta object for class '{@link istar.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see istar.Actor
	 * @generated
	 */
  EClass getActor();

  /**
	 * Returns the meta object for the reference list '{@link istar.Actor#getActorISA <em>Actor ISA</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor ISA</em>'.
	 * @see istar.Actor#getActorISA()
	 * @see #getActor()
	 * @generated
	 */
  EReference getActor_ActorISA();

  /**
	 * Returns the meta object for the reference list '{@link istar.Actor#getSecondActorISA <em>Second Actor ISA</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Second Actor ISA</em>'.
	 * @see istar.Actor#getSecondActorISA()
	 * @see #getActor()
	 * @generated
	 */
  EReference getActor_SecondActorISA();

  /**
	 * Returns the meta object for the reference list '{@link istar.Actor#getActorIsPartOf <em>Actor Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor Is Part Of</em>'.
	 * @see istar.Actor#getActorIsPartOf()
	 * @see #getActor()
	 * @generated
	 */
  EReference getActor_ActorIsPartOf();

  /**
	 * Returns the meta object for the reference list '{@link istar.Actor#getSecondActorIsPartOf <em>Second Actor Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Second Actor Is Part Of</em>'.
	 * @see istar.Actor#getSecondActorIsPartOf()
	 * @see #getActor()
	 * @generated
	 */
  EReference getActor_SecondActorIsPartOf();

  /**
	 * Returns the meta object for class '{@link istar.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see istar.Agent
	 * @generated
	 */
  EClass getAgent();

  /**
	 * Returns the meta object for the reference list '{@link istar.Agent#getAgentPlays <em>Agent Plays</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent Plays</em>'.
	 * @see istar.Agent#getAgentPlays()
	 * @see #getAgent()
	 * @generated
	 */
  EReference getAgent_AgentPlays();

  /**
	 * Returns the meta object for the reference list '{@link istar.Agent#getAgentOccupies <em>Agent Occupies</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent Occupies</em>'.
	 * @see istar.Agent#getAgentOccupies()
	 * @see #getAgent()
	 * @generated
	 */
  EReference getAgent_AgentOccupies();

  /**
	 * Returns the meta object for the reference list '{@link istar.Agent#getAgentINS <em>Agent INS</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent INS</em>'.
	 * @see istar.Agent#getAgentINS()
	 * @see #getAgent()
	 * @generated
	 */
  EReference getAgent_AgentINS();

  /**
	 * Returns the meta object for the reference list '{@link istar.Agent#getSecondAgentINS <em>Second Agent INS</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Second Agent INS</em>'.
	 * @see istar.Agent#getSecondAgentINS()
	 * @see #getAgent()
	 * @generated
	 */
  EReference getAgent_SecondAgentINS();

  /**
	 * Returns the meta object for class '{@link istar.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see istar.Position
	 * @generated
	 */
  EClass getPosition();

  /**
	 * Returns the meta object for the reference list '{@link istar.Position#getPositionCovers <em>Position Covers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Covers</em>'.
	 * @see istar.Position#getPositionCovers()
	 * @see #getPosition()
	 * @generated
	 */
  EReference getPosition_PositionCovers();

  /**
	 * Returns the meta object for the reference list '{@link istar.Position#getPositionOccupies <em>Position Occupies</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Occupies</em>'.
	 * @see istar.Position#getPositionOccupies()
	 * @see #getPosition()
	 * @generated
	 */
  EReference getPosition_PositionOccupies();

  /**
	 * Returns the meta object for class '{@link istar.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see istar.Role
	 * @generated
	 */
  EClass getRole();

  /**
	 * Returns the meta object for the reference list '{@link istar.Role#getRolePlays <em>Role Plays</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Plays</em>'.
	 * @see istar.Role#getRolePlays()
	 * @see #getRole()
	 * @generated
	 */
  EReference getRole_RolePlays();

  /**
	 * Returns the meta object for the reference list '{@link istar.Role#getRoleCovers <em>Role Covers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Covers</em>'.
	 * @see istar.Role#getRoleCovers()
	 * @see #getRole()
	 * @generated
	 */
  EReference getRole_RoleCovers();

  /**
	 * Returns the meta object for class '{@link istar.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see istar.Element
	 * @generated
	 */
  EClass getElement();

  /**
	 * Returns the meta object for the reference list '{@link istar.Element#getElementContribution <em>Element Contribution</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Contribution</em>'.
	 * @see istar.Element#getElementContribution()
	 * @see #getElement()
	 * @generated
	 */
  EReference getElement_ElementContribution();

  /**
	 * Returns the meta object for the reference list '{@link istar.Element#getElementDecomposition <em>Element Decomposition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Decomposition</em>'.
	 * @see istar.Element#getElementDecomposition()
	 * @see #getElement()
	 * @generated
	 */
  EReference getElement_ElementDecomposition();

  /**
	 * Returns the meta object for class '{@link istar.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see istar.Goal
	 * @generated
	 */
  EClass getGoal();

  /**
	 * Returns the meta object for the reference list '{@link istar.Goal#getGoalMeansEnd <em>Goal Means End</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal Means End</em>'.
	 * @see istar.Goal#getGoalMeansEnd()
	 * @see #getGoal()
	 * @generated
	 */
  EReference getGoal_GoalMeansEnd();

  /**
	 * Returns the meta object for class '{@link istar.Softgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softgoal</em>'.
	 * @see istar.Softgoal
	 * @generated
	 */
  EClass getSoftgoal();

  /**
	 * Returns the meta object for the reference list '{@link istar.Softgoal#getSoftgoalContribution <em>Softgoal Contribution</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Softgoal Contribution</em>'.
	 * @see istar.Softgoal#getSoftgoalContribution()
	 * @see #getSoftgoal()
	 * @generated
	 */
  EReference getSoftgoal_SoftgoalContribution();

  /**
	 * Returns the meta object for class '{@link istar.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see istar.Task
	 * @generated
	 */
  EClass getTask();

  /**
	 * Returns the meta object for the reference list '{@link istar.Task#getTaskMeansEnd <em>Task Means End</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Means End</em>'.
	 * @see istar.Task#getTaskMeansEnd()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_TaskMeansEnd();

  /**
	 * Returns the meta object for the reference list '{@link istar.Task#getTaskDecomposition <em>Task Decomposition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Decomposition</em>'.
	 * @see istar.Task#getTaskDecomposition()
	 * @see #getTask()
	 * @generated
	 */
  EReference getTask_TaskDecomposition();

  /**
	 * Returns the meta object for class '{@link istar.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see istar.Resource
	 * @generated
	 */
  EClass getResource();

  /**
	 * Returns the meta object for class '{@link istar.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belief</em>'.
	 * @see istar.Belief
	 * @generated
	 */
  EClass getBelief();

  /**
	 * Returns the meta object for class '{@link istar.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see istar.Association
	 * @generated
	 */
  EClass getAssociation();

  /**
	 * Returns the meta object for class '{@link istar.ISA <em>ISA</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISA</em>'.
	 * @see istar.ISA
	 * @generated
	 */
  EClass getISA();

  /**
	 * Returns the meta object for the reference '{@link istar.ISA#getISAactor <em>IS Aactor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IS Aactor</em>'.
	 * @see istar.ISA#getISAactor()
	 * @see #getISA()
	 * @generated
	 */
  EReference getISA_ISAactor();

  /**
	 * Returns the meta object for the reference '{@link istar.ISA#getISAsecondActor <em>IS Asecond Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IS Asecond Actor</em>'.
	 * @see istar.ISA#getISAsecondActor()
	 * @see #getISA()
	 * @generated
	 */
  EReference getISA_ISAsecondActor();

  /**
	 * Returns the meta object for class '{@link istar.IsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Part Of</em>'.
	 * @see istar.IsPartOf
	 * @generated
	 */
  EClass getIsPartOf();

  /**
	 * Returns the meta object for the reference '{@link istar.IsPartOf#getIsPartOfActor <em>Is Part Of Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Part Of Actor</em>'.
	 * @see istar.IsPartOf#getIsPartOfActor()
	 * @see #getIsPartOf()
	 * @generated
	 */
  EReference getIsPartOf_IsPartOfActor();

  /**
	 * Returns the meta object for the reference '{@link istar.IsPartOf#getIsPartOfSecondActor <em>Is Part Of Second Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Part Of Second Actor</em>'.
	 * @see istar.IsPartOf#getIsPartOfSecondActor()
	 * @see #getIsPartOf()
	 * @generated
	 */
  EReference getIsPartOf_IsPartOfSecondActor();

  /**
	 * Returns the meta object for class '{@link istar.Plays <em>Plays</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plays</em>'.
	 * @see istar.Plays
	 * @generated
	 */
  EClass getPlays();

  /**
	 * Returns the meta object for the reference '{@link istar.Plays#getPlaysRole <em>Plays Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plays Role</em>'.
	 * @see istar.Plays#getPlaysRole()
	 * @see #getPlays()
	 * @generated
	 */
  EReference getPlays_PlaysRole();

  /**
	 * Returns the meta object for the reference '{@link istar.Plays#getPlaysAgent <em>Plays Agent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plays Agent</em>'.
	 * @see istar.Plays#getPlaysAgent()
	 * @see #getPlays()
	 * @generated
	 */
  EReference getPlays_PlaysAgent();

  /**
	 * Returns the meta object for class '{@link istar.Covers <em>Covers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Covers</em>'.
	 * @see istar.Covers
	 * @generated
	 */
  EClass getCovers();

  /**
	 * Returns the meta object for the reference '{@link istar.Covers#getCoversRole <em>Covers Role</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Covers Role</em>'.
	 * @see istar.Covers#getCoversRole()
	 * @see #getCovers()
	 * @generated
	 */
  EReference getCovers_CoversRole();

  /**
	 * Returns the meta object for the reference '{@link istar.Covers#getCoversPosition <em>Covers Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Covers Position</em>'.
	 * @see istar.Covers#getCoversPosition()
	 * @see #getCovers()
	 * @generated
	 */
  EReference getCovers_CoversPosition();

  /**
	 * Returns the meta object for class '{@link istar.Occupies <em>Occupies</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupies</em>'.
	 * @see istar.Occupies
	 * @generated
	 */
  EClass getOccupies();

  /**
	 * Returns the meta object for the reference '{@link istar.Occupies#getOccupiesPosition <em>Occupies Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occupies Position</em>'.
	 * @see istar.Occupies#getOccupiesPosition()
	 * @see #getOccupies()
	 * @generated
	 */
  EReference getOccupies_OccupiesPosition();

  /**
	 * Returns the meta object for the reference '{@link istar.Occupies#getOccupiesAgent <em>Occupies Agent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occupies Agent</em>'.
	 * @see istar.Occupies#getOccupiesAgent()
	 * @see #getOccupies()
	 * @generated
	 */
  EReference getOccupies_OccupiesAgent();

  /**
	 * Returns the meta object for class '{@link istar.INS <em>INS</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INS</em>'.
	 * @see istar.INS
	 * @generated
	 */
  EClass getINS();

  /**
	 * Returns the meta object for the reference '{@link istar.INS#getINSagent <em>IN Sagent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IN Sagent</em>'.
	 * @see istar.INS#getINSagent()
	 * @see #getINS()
	 * @generated
	 */
  EReference getINS_INSagent();

  /**
	 * Returns the meta object for the reference '{@link istar.INS#getINSsecondAgent <em>IN Ssecond Agent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IN Ssecond Agent</em>'.
	 * @see istar.INS#getINSsecondAgent()
	 * @see #getINS()
	 * @generated
	 */
  EReference getINS_INSsecondAgent();

  /**
	 * Returns the meta object for class '{@link istar.ContributionLink <em>Contribution Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution Link</em>'.
	 * @see istar.ContributionLink
	 * @generated
	 */
  EClass getContributionLink();

  /**
	 * Returns the meta object for the reference '{@link istar.ContributionLink#getContributionElement <em>Contribution Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contribution Element</em>'.
	 * @see istar.ContributionLink#getContributionElement()
	 * @see #getContributionLink()
	 * @generated
	 */
  EReference getContributionLink_ContributionElement();

  /**
	 * Returns the meta object for the reference '{@link istar.ContributionLink#getContributionSoftgoal <em>Contribution Softgoal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contribution Softgoal</em>'.
	 * @see istar.ContributionLink#getContributionSoftgoal()
	 * @see #getContributionLink()
	 * @generated
	 */
  EReference getContributionLink_ContributionSoftgoal();

  /**
	 * Returns the meta object for class '{@link istar.Make <em>Make</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make</em>'.
	 * @see istar.Make
	 * @generated
	 */
  EClass getMake();

  /**
	 * Returns the meta object for class '{@link istar.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see istar.Break
	 * @generated
	 */
  EClass getBreak();

  /**
	 * Returns the meta object for class '{@link istar.Help <em>Help</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help</em>'.
	 * @see istar.Help
	 * @generated
	 */
  EClass getHelp();

  /**
	 * Returns the meta object for class '{@link istar.Hurt <em>Hurt</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hurt</em>'.
	 * @see istar.Hurt
	 * @generated
	 */
  EClass getHurt();

  /**
	 * Returns the meta object for class '{@link istar.SomePlus <em>Some Plus</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Plus</em>'.
	 * @see istar.SomePlus
	 * @generated
	 */
  EClass getSomePlus();

  /**
	 * Returns the meta object for class '{@link istar.SomeMinus <em>Some Minus</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Minus</em>'.
	 * @see istar.SomeMinus
	 * @generated
	 */
  EClass getSomeMinus();

  /**
	 * Returns the meta object for class '{@link istar.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see istar.And
	 * @generated
	 */
  EClass getAnd();

  /**
	 * Returns the meta object for class '{@link istar.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see istar.Or
	 * @generated
	 */
  EClass getOr();

  /**
	 * Returns the meta object for class '{@link istar.Unknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown</em>'.
	 * @see istar.Unknown
	 * @generated
	 */
  EClass getUnknown();

  /**
	 * Returns the meta object for class '{@link istar.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see istar.Decomposition
	 * @generated
	 */
  EClass getDecomposition();

  /**
	 * Returns the meta object for class '{@link istar.MeansEnd <em>Means End</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Means End</em>'.
	 * @see istar.MeansEnd
	 * @generated
	 */
  EClass getMeansEnd();

  /**
	 * Returns the meta object for the reference '{@link istar.MeansEnd#getMeansEndTask <em>Means End Task</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Means End Task</em>'.
	 * @see istar.MeansEnd#getMeansEndTask()
	 * @see #getMeansEnd()
	 * @generated
	 */
  EReference getMeansEnd_MeansEndTask();

  /**
	 * Returns the meta object for the reference '{@link istar.MeansEnd#getMeansEndGoal <em>Means End Goal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Means End Goal</em>'.
	 * @see istar.MeansEnd#getMeansEndGoal()
	 * @see #getMeansEnd()
	 * @generated
	 */
  EReference getMeansEnd_MeansEndGoal();

  /**
	 * Returns the meta object for class '{@link istar.DecompositionLink <em>Decomposition Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition Link</em>'.
	 * @see istar.DecompositionLink
	 * @generated
	 */
  EClass getDecompositionLink();

  /**
	 * Returns the meta object for the reference '{@link istar.DecompositionLink#getDecompositionTask <em>Decomposition Task</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposition Task</em>'.
	 * @see istar.DecompositionLink#getDecompositionTask()
	 * @see #getDecompositionLink()
	 * @generated
	 */
  EReference getDecompositionLink_DecompositionTask();

  /**
	 * Returns the meta object for the reference '{@link istar.DecompositionLink#getDecompositionElement <em>Decomposition Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposition Element</em>'.
	 * @see istar.DecompositionLink#getDecompositionElement()
	 * @see #getDecompositionLink()
	 * @generated
	 */
  EReference getDecompositionLink_DecompositionElement();

  /**
	 * Returns the meta object for class '{@link istar.DependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Link</em>'.
	 * @see istar.DependencyLink
	 * @generated
	 */
  EClass getDependencyLink();

  /**
	 * Returns the meta object for the attribute '{@link istar.DependencyLink#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see istar.DependencyLink#getStrength()
	 * @see #getDependencyLink()
	 * @generated
	 */
  EAttribute getDependencyLink_Strength();

  /**
	 * Returns the meta object for the attribute '{@link istar.DependencyLink#getDependencyName <em>Dependency Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Name</em>'.
	 * @see istar.DependencyLink#getDependencyName()
	 * @see #getDependencyLink()
	 * @generated
	 */
  EAttribute getDependencyLink_DependencyName();

  /**
	 * Returns the meta object for the reference '{@link istar.DependencyLink#getDependencyNode <em>Dependency Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency Node</em>'.
	 * @see istar.DependencyLink#getDependencyNode()
	 * @see #getDependencyLink()
	 * @generated
	 */
  EReference getDependencyLink_DependencyNode();

  /**
	 * Returns the meta object for the reference '{@link istar.DependencyLink#getDependencySecondNode <em>Dependency Second Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency Second Node</em>'.
	 * @see istar.DependencyLink#getDependencySecondNode()
	 * @see #getDependencyLink()
	 * @generated
	 */
  EReference getDependencyLink_DependencySecondNode();

  /**
	 * Returns the meta object for enum '{@link istar.DependencyStrength <em>Dependency Strength</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Strength</em>'.
	 * @see istar.DependencyStrength
	 * @generated
	 */
  EEnum getDependencyStrength();

  /**
	 * Returns the meta object for enum '{@link istar.NFR <em>NFR</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NFR</em>'.
	 * @see istar.NFR
	 * @generated
	 */
  EEnum getNFR();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  IstarFactory getIstarFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link istar.impl.ISTARImpl <em>ISTAR</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.ISTARImpl
		 * @see istar.impl.IstarPackageImpl#getISTAR()
		 * @generated
		 */
    EClass ISTAR = eINSTANCE.getISTAR();

    /**
		 * The meta object literal for the '<em><b>Has Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ISTAR__HAS_NODE = eINSTANCE.getISTAR_HasNode();

    /**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ISTAR__MODEL_NAME = eINSTANCE.getISTAR_ModelName();

    /**
		 * The meta object literal for the '<em><b>Has Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ISTAR__HAS_RELATIONSHIP = eINSTANCE.getISTAR_HasRelationship();

    /**
		 * The meta object literal for the '{@link istar.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.NodeImpl
		 * @see istar.impl.IstarPackageImpl#getNode()
		 * @generated
		 */
    EClass NODE = eINSTANCE.getNode();

    /**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NODE__NODE_NAME = eINSTANCE.getNode_NodeName();

    /**
		 * The meta object literal for the '<em><b>Node Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NODE__NODE_DEPENDENCY = eINSTANCE.getNode_NodeDependency();

    /**
		 * The meta object literal for the '<em><b>Second Node Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference NODE__SECOND_NODE_DEPENDENCY = eINSTANCE.getNode_SecondNodeDependency();

    /**
		 * The meta object literal for the '<em><b>Node NFR</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NODE__NODE_NFR = eINSTANCE.getNode_NodeNFR();

    /**
		 * The meta object literal for the '{@link istar.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.RelationshipImpl
		 * @see istar.impl.IstarPackageImpl#getRelationship()
		 * @generated
		 */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
		 * The meta object literal for the '<em><b>Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONSHIP__RELATIONSHIP_NAME = eINSTANCE.getRelationship_RelationshipName();

    /**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

    /**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

    /**
		 * The meta object literal for the '<em><b>Relationship NFR</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONSHIP__RELATIONSHIP_NFR = eINSTANCE.getRelationship_RelationshipNFR();

    /**
		 * The meta object literal for the '{@link istar.impl.ActorsImpl <em>Actors</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.ActorsImpl
		 * @see istar.impl.IstarPackageImpl#getActors()
		 * @generated
		 */
    EClass ACTORS = eINSTANCE.getActors();

    /**
		 * The meta object literal for the '<em><b>Has Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTORS__HAS_ELEMENT = eINSTANCE.getActors_HasElement();

    /**
		 * The meta object literal for the '{@link istar.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.ActorImpl
		 * @see istar.impl.IstarPackageImpl#getActor()
		 * @generated
		 */
    EClass ACTOR = eINSTANCE.getActor();

    /**
		 * The meta object literal for the '<em><b>Actor ISA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTOR__ACTOR_ISA = eINSTANCE.getActor_ActorISA();

    /**
		 * The meta object literal for the '<em><b>Second Actor ISA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTOR__SECOND_ACTOR_ISA = eINSTANCE.getActor_SecondActorISA();

    /**
		 * The meta object literal for the '<em><b>Actor Is Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTOR__ACTOR_IS_PART_OF = eINSTANCE.getActor_ActorIsPartOf();

    /**
		 * The meta object literal for the '<em><b>Second Actor Is Part Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ACTOR__SECOND_ACTOR_IS_PART_OF = eINSTANCE.getActor_SecondActorIsPartOf();

    /**
		 * The meta object literal for the '{@link istar.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.AgentImpl
		 * @see istar.impl.IstarPackageImpl#getAgent()
		 * @generated
		 */
    EClass AGENT = eINSTANCE.getAgent();

    /**
		 * The meta object literal for the '<em><b>Agent Plays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference AGENT__AGENT_PLAYS = eINSTANCE.getAgent_AgentPlays();

    /**
		 * The meta object literal for the '<em><b>Agent Occupies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference AGENT__AGENT_OCCUPIES = eINSTANCE.getAgent_AgentOccupies();

    /**
		 * The meta object literal for the '<em><b>Agent INS</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference AGENT__AGENT_INS = eINSTANCE.getAgent_AgentINS();

    /**
		 * The meta object literal for the '<em><b>Second Agent INS</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference AGENT__SECOND_AGENT_INS = eINSTANCE.getAgent_SecondAgentINS();

    /**
		 * The meta object literal for the '{@link istar.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.PositionImpl
		 * @see istar.impl.IstarPackageImpl#getPosition()
		 * @generated
		 */
    EClass POSITION = eINSTANCE.getPosition();

    /**
		 * The meta object literal for the '<em><b>Position Covers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference POSITION__POSITION_COVERS = eINSTANCE.getPosition_PositionCovers();

    /**
		 * The meta object literal for the '<em><b>Position Occupies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference POSITION__POSITION_OCCUPIES = eINSTANCE.getPosition_PositionOccupies();

    /**
		 * The meta object literal for the '{@link istar.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.RoleImpl
		 * @see istar.impl.IstarPackageImpl#getRole()
		 * @generated
		 */
    EClass ROLE = eINSTANCE.getRole();

    /**
		 * The meta object literal for the '<em><b>Role Plays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROLE__ROLE_PLAYS = eINSTANCE.getRole_RolePlays();

    /**
		 * The meta object literal for the '<em><b>Role Covers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROLE__ROLE_COVERS = eINSTANCE.getRole_RoleCovers();

    /**
		 * The meta object literal for the '{@link istar.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.ElementImpl
		 * @see istar.impl.IstarPackageImpl#getElement()
		 * @generated
		 */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
		 * The meta object literal for the '<em><b>Element Contribution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ELEMENT__ELEMENT_CONTRIBUTION = eINSTANCE.getElement_ElementContribution();

    /**
		 * The meta object literal for the '<em><b>Element Decomposition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ELEMENT__ELEMENT_DECOMPOSITION = eINSTANCE.getElement_ElementDecomposition();

    /**
		 * The meta object literal for the '{@link istar.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.GoalImpl
		 * @see istar.impl.IstarPackageImpl#getGoal()
		 * @generated
		 */
    EClass GOAL = eINSTANCE.getGoal();

    /**
		 * The meta object literal for the '<em><b>Goal Means End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference GOAL__GOAL_MEANS_END = eINSTANCE.getGoal_GoalMeansEnd();

    /**
		 * The meta object literal for the '{@link istar.impl.SoftgoalImpl <em>Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.SoftgoalImpl
		 * @see istar.impl.IstarPackageImpl#getSoftgoal()
		 * @generated
		 */
    EClass SOFTGOAL = eINSTANCE.getSoftgoal();

    /**
		 * The meta object literal for the '<em><b>Softgoal Contribution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SOFTGOAL__SOFTGOAL_CONTRIBUTION = eINSTANCE.getSoftgoal_SoftgoalContribution();

    /**
		 * The meta object literal for the '{@link istar.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.TaskImpl
		 * @see istar.impl.IstarPackageImpl#getTask()
		 * @generated
		 */
    EClass TASK = eINSTANCE.getTask();

    /**
		 * The meta object literal for the '<em><b>Task Means End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__TASK_MEANS_END = eINSTANCE.getTask_TaskMeansEnd();

    /**
		 * The meta object literal for the '<em><b>Task Decomposition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TASK__TASK_DECOMPOSITION = eINSTANCE.getTask_TaskDecomposition();

    /**
		 * The meta object literal for the '{@link istar.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.ResourceImpl
		 * @see istar.impl.IstarPackageImpl#getResource()
		 * @generated
		 */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
		 * The meta object literal for the '{@link istar.impl.BeliefImpl <em>Belief</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.BeliefImpl
		 * @see istar.impl.IstarPackageImpl#getBelief()
		 * @generated
		 */
    EClass BELIEF = eINSTANCE.getBelief();

    /**
		 * The meta object literal for the '{@link istar.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.AssociationImpl
		 * @see istar.impl.IstarPackageImpl#getAssociation()
		 * @generated
		 */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
		 * The meta object literal for the '{@link istar.impl.ISAImpl <em>ISA</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.ISAImpl
		 * @see istar.impl.IstarPackageImpl#getISA()
		 * @generated
		 */
    EClass ISA = eINSTANCE.getISA();

    /**
		 * The meta object literal for the '<em><b>IS Aactor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ISA__IS_AACTOR = eINSTANCE.getISA_ISAactor();

    /**
		 * The meta object literal for the '<em><b>IS Asecond Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ISA__IS_ASECOND_ACTOR = eINSTANCE.getISA_ISAsecondActor();

    /**
		 * The meta object literal for the '{@link istar.impl.IsPartOfImpl <em>Is Part Of</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.IsPartOfImpl
		 * @see istar.impl.IstarPackageImpl#getIsPartOf()
		 * @generated
		 */
    EClass IS_PART_OF = eINSTANCE.getIsPartOf();

    /**
		 * The meta object literal for the '<em><b>Is Part Of Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IS_PART_OF__IS_PART_OF_ACTOR = eINSTANCE.getIsPartOf_IsPartOfActor();

    /**
		 * The meta object literal for the '<em><b>Is Part Of Second Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IS_PART_OF__IS_PART_OF_SECOND_ACTOR = eINSTANCE.getIsPartOf_IsPartOfSecondActor();

    /**
		 * The meta object literal for the '{@link istar.impl.PlaysImpl <em>Plays</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.PlaysImpl
		 * @see istar.impl.IstarPackageImpl#getPlays()
		 * @generated
		 */
    EClass PLAYS = eINSTANCE.getPlays();

    /**
		 * The meta object literal for the '<em><b>Plays Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PLAYS__PLAYS_ROLE = eINSTANCE.getPlays_PlaysRole();

    /**
		 * The meta object literal for the '<em><b>Plays Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PLAYS__PLAYS_AGENT = eINSTANCE.getPlays_PlaysAgent();

    /**
		 * The meta object literal for the '{@link istar.impl.CoversImpl <em>Covers</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.CoversImpl
		 * @see istar.impl.IstarPackageImpl#getCovers()
		 * @generated
		 */
    EClass COVERS = eINSTANCE.getCovers();

    /**
		 * The meta object literal for the '<em><b>Covers Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COVERS__COVERS_ROLE = eINSTANCE.getCovers_CoversRole();

    /**
		 * The meta object literal for the '<em><b>Covers Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COVERS__COVERS_POSITION = eINSTANCE.getCovers_CoversPosition();

    /**
		 * The meta object literal for the '{@link istar.impl.OccupiesImpl <em>Occupies</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.OccupiesImpl
		 * @see istar.impl.IstarPackageImpl#getOccupies()
		 * @generated
		 */
    EClass OCCUPIES = eINSTANCE.getOccupies();

    /**
		 * The meta object literal for the '<em><b>Occupies Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OCCUPIES__OCCUPIES_POSITION = eINSTANCE.getOccupies_OccupiesPosition();

    /**
		 * The meta object literal for the '<em><b>Occupies Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OCCUPIES__OCCUPIES_AGENT = eINSTANCE.getOccupies_OccupiesAgent();

    /**
		 * The meta object literal for the '{@link istar.impl.INSImpl <em>INS</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.INSImpl
		 * @see istar.impl.IstarPackageImpl#getINS()
		 * @generated
		 */
    EClass INS = eINSTANCE.getINS();

    /**
		 * The meta object literal for the '<em><b>IN Sagent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INS__IN_SAGENT = eINSTANCE.getINS_INSagent();

    /**
		 * The meta object literal for the '<em><b>IN Ssecond Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference INS__IN_SSECOND_AGENT = eINSTANCE.getINS_INSsecondAgent();

    /**
		 * The meta object literal for the '{@link istar.impl.ContributionLinkImpl <em>Contribution Link</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.ContributionLinkImpl
		 * @see istar.impl.IstarPackageImpl#getContributionLink()
		 * @generated
		 */
    EClass CONTRIBUTION_LINK = eINSTANCE.getContributionLink();

    /**
		 * The meta object literal for the '<em><b>Contribution Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTRIBUTION_LINK__CONTRIBUTION_ELEMENT = eINSTANCE.getContributionLink_ContributionElement();

    /**
		 * The meta object literal for the '<em><b>Contribution Softgoal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTRIBUTION_LINK__CONTRIBUTION_SOFTGOAL = eINSTANCE.getContributionLink_ContributionSoftgoal();

    /**
		 * The meta object literal for the '{@link istar.impl.MakeImpl <em>Make</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.MakeImpl
		 * @see istar.impl.IstarPackageImpl#getMake()
		 * @generated
		 */
    EClass MAKE = eINSTANCE.getMake();

    /**
		 * The meta object literal for the '{@link istar.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.BreakImpl
		 * @see istar.impl.IstarPackageImpl#getBreak()
		 * @generated
		 */
    EClass BREAK = eINSTANCE.getBreak();

    /**
		 * The meta object literal for the '{@link istar.impl.HelpImpl <em>Help</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.HelpImpl
		 * @see istar.impl.IstarPackageImpl#getHelp()
		 * @generated
		 */
    EClass HELP = eINSTANCE.getHelp();

    /**
		 * The meta object literal for the '{@link istar.impl.HurtImpl <em>Hurt</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.HurtImpl
		 * @see istar.impl.IstarPackageImpl#getHurt()
		 * @generated
		 */
    EClass HURT = eINSTANCE.getHurt();

    /**
		 * The meta object literal for the '{@link istar.impl.SomePlusImpl <em>Some Plus</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.SomePlusImpl
		 * @see istar.impl.IstarPackageImpl#getSomePlus()
		 * @generated
		 */
    EClass SOME_PLUS = eINSTANCE.getSomePlus();

    /**
		 * The meta object literal for the '{@link istar.impl.SomeMinusImpl <em>Some Minus</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.SomeMinusImpl
		 * @see istar.impl.IstarPackageImpl#getSomeMinus()
		 * @generated
		 */
    EClass SOME_MINUS = eINSTANCE.getSomeMinus();

    /**
		 * The meta object literal for the '{@link istar.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.AndImpl
		 * @see istar.impl.IstarPackageImpl#getAnd()
		 * @generated
		 */
    EClass AND = eINSTANCE.getAnd();

    /**
		 * The meta object literal for the '{@link istar.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.OrImpl
		 * @see istar.impl.IstarPackageImpl#getOr()
		 * @generated
		 */
    EClass OR = eINSTANCE.getOr();

    /**
		 * The meta object literal for the '{@link istar.impl.UnknownImpl <em>Unknown</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.UnknownImpl
		 * @see istar.impl.IstarPackageImpl#getUnknown()
		 * @generated
		 */
    EClass UNKNOWN = eINSTANCE.getUnknown();

    /**
		 * The meta object literal for the '{@link istar.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.DecompositionImpl
		 * @see istar.impl.IstarPackageImpl#getDecomposition()
		 * @generated
		 */
    EClass DECOMPOSITION = eINSTANCE.getDecomposition();

    /**
		 * The meta object literal for the '{@link istar.impl.MeansEndImpl <em>Means End</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.MeansEndImpl
		 * @see istar.impl.IstarPackageImpl#getMeansEnd()
		 * @generated
		 */
    EClass MEANS_END = eINSTANCE.getMeansEnd();

    /**
		 * The meta object literal for the '<em><b>Means End Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MEANS_END__MEANS_END_TASK = eINSTANCE.getMeansEnd_MeansEndTask();

    /**
		 * The meta object literal for the '<em><b>Means End Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MEANS_END__MEANS_END_GOAL = eINSTANCE.getMeansEnd_MeansEndGoal();

    /**
		 * The meta object literal for the '{@link istar.impl.DecompositionLinkImpl <em>Decomposition Link</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.DecompositionLinkImpl
		 * @see istar.impl.IstarPackageImpl#getDecompositionLink()
		 * @generated
		 */
    EClass DECOMPOSITION_LINK = eINSTANCE.getDecompositionLink();

    /**
		 * The meta object literal for the '<em><b>Decomposition Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DECOMPOSITION_LINK__DECOMPOSITION_TASK = eINSTANCE.getDecompositionLink_DecompositionTask();

    /**
		 * The meta object literal for the '<em><b>Decomposition Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DECOMPOSITION_LINK__DECOMPOSITION_ELEMENT = eINSTANCE.getDecompositionLink_DecompositionElement();

    /**
		 * The meta object literal for the '{@link istar.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.impl.DependencyLinkImpl
		 * @see istar.impl.IstarPackageImpl#getDependencyLink()
		 * @generated
		 */
    EClass DEPENDENCY_LINK = eINSTANCE.getDependencyLink();

    /**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DEPENDENCY_LINK__STRENGTH = eINSTANCE.getDependencyLink_Strength();

    /**
		 * The meta object literal for the '<em><b>Dependency Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DEPENDENCY_LINK__DEPENDENCY_NAME = eINSTANCE.getDependencyLink_DependencyName();

    /**
		 * The meta object literal for the '<em><b>Dependency Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEPENDENCY_LINK__DEPENDENCY_NODE = eINSTANCE.getDependencyLink_DependencyNode();

    /**
		 * The meta object literal for the '<em><b>Dependency Second Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEPENDENCY_LINK__DEPENDENCY_SECOND_NODE = eINSTANCE.getDependencyLink_DependencySecondNode();

    /**
		 * The meta object literal for the '{@link istar.DependencyStrength <em>Dependency Strength</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.DependencyStrength
		 * @see istar.impl.IstarPackageImpl#getDependencyStrength()
		 * @generated
		 */
    EEnum DEPENDENCY_STRENGTH = eINSTANCE.getDependencyStrength();

    /**
		 * The meta object literal for the '{@link istar.NFR <em>NFR</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see istar.NFR
		 * @see istar.impl.IstarPackageImpl#getNFR()
		 * @generated
		 */
    EEnum NFR = eINSTANCE.getNFR();

  }

} //IstarPackage

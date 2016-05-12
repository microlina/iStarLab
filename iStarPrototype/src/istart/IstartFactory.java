/**
 */
package istart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see istart.IstartPackage
 * @generated
 */
public interface IstartFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IstartFactory eINSTANCE = istart.impl.IstartFactoryImpl.init();

  /**
   * Returns a new object of class '<em>ISTAR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ISTAR</em>'.
   * @generated
   */
  ISTAR createISTAR();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship</em>'.
   * @generated
   */
  Relationship createRelationship();

  /**
   * Returns a new object of class '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor</em>'.
   * @generated
   */
  Actor createActor();

  /**
   * Returns a new object of class '<em>Agent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Agent</em>'.
   * @generated
   */
  Agent createAgent();

  /**
   * Returns a new object of class '<em>Position</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Position</em>'.
   * @generated
   */
  Position createPosition();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns a new object of class '<em>Softgoal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Softgoal</em>'.
   * @generated
   */
  Softgoal createSoftgoal();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Belief</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Belief</em>'.
   * @generated
   */
  Belief createBelief();

  /**
   * Returns a new object of class '<em>ISA</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ISA</em>'.
   * @generated
   */
  ISA createISA();

  /**
   * Returns a new object of class '<em>Is Part Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Part Of</em>'.
   * @generated
   */
  IsPartOf createIsPartOf();

  /**
   * Returns a new object of class '<em>Plays</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plays</em>'.
   * @generated
   */
  Plays createPlays();

  /**
   * Returns a new object of class '<em>Covers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Covers</em>'.
   * @generated
   */
  Covers createCovers();

  /**
   * Returns a new object of class '<em>Occupies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Occupies</em>'.
   * @generated
   */
  Occupies createOccupies();

  /**
   * Returns a new object of class '<em>INS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>INS</em>'.
   * @generated
   */
  INS createINS();

  /**
   * Returns a new object of class '<em>Make</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Make</em>'.
   * @generated
   */
  Make createMake();

  /**
   * Returns a new object of class '<em>Break</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break</em>'.
   * @generated
   */
  Break createBreak();

  /**
   * Returns a new object of class '<em>Help</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Help</em>'.
   * @generated
   */
  Help createHelp();

  /**
   * Returns a new object of class '<em>Hurt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hurt</em>'.
   * @generated
   */
  Hurt createHurt();

  /**
   * Returns a new object of class '<em>Some Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Plus</em>'.
   * @generated
   */
  SomePlus createSomePlus();

  /**
   * Returns a new object of class '<em>Some Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Minus</em>'.
   * @generated
   */
  SomeMinus createSomeMinus();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>Unknown</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unknown</em>'.
   * @generated
   */
  Unknown createUnknown();

  /**
   * Returns a new object of class '<em>Means End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Means End</em>'.
   * @generated
   */
  MeansEnd createMeansEnd();

  /**
   * Returns a new object of class '<em>Decomposition Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decomposition Link</em>'.
   * @generated
   */
  DecompositionLink createDecompositionLink();

  /**
   * Returns a new object of class '<em>Dependency Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency Link</em>'.
   * @generated
   */
  DependencyLink createDependencyLink();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IstartPackage getIstartPackage();

} //IstartFactory

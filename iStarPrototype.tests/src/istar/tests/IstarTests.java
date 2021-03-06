/**
 */
package istar.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>istar</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new IstarTests("istar Tests");
		suite.addTestSuite(ISTARTest.class);
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(AgentTest.class);
		suite.addTestSuite(PositionTest.class);
		suite.addTestSuite(RoleTest.class);
		suite.addTestSuite(GoalTest.class);
		suite.addTestSuite(SoftgoalTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(ResourceTest.class);
		suite.addTestSuite(BeliefTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarTests(String name) {
		super(name);
	}

} //IstarTests

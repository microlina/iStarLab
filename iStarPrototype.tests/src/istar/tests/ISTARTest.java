/**
 */
package istar.tests;

import istar.ISTAR;
import istar.IstarFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ISTAR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link istar.ISTAR#NAct() <em>NAct</em>}</li>
 *   <li>{@link istar.ISTAR#NElem() <em>NElem</em>}</li>
 *   <li>{@link istar.ISTAR#NEOAB() <em>NEOAB</em>}</li>
 *   <li>{@link istar.ISTAR#NEIAB() <em>NEIAB</em>}</li>
 *   <li>{@link istar.ISTAR#MinNEIAB() <em>Min NEIAB</em>}</li>
 *   <li>{@link istar.ISTAR#MaxNEIAB() <em>Max NEIAB</em>}</li>
 *   <li>{@link istar.ISTAR#AvgNEIAB() <em>Avg NEIAB</em>}</li>
 *   <li>{@link istar.ISTAR#NGIAB() <em>NGIAB</em>}</li>
 *   <li>{@link istar.ISTAR#NDAG() <em>NDAG</em>}</li>
 *   <li>{@link istar.ISTAR#MinNDAG() <em>Min NDAG</em>}</li>
 *   <li>{@link istar.ISTAR#MaxNDAG() <em>Max NDAG</em>}</li>
 *   <li>{@link istar.ISTAR#AvgNDAG() <em>Avg NDAG</em>}</li>
 *   <li>{@link istar.ISTAR#NGWD() <em>NGWD</em>}</li>
 *   <li>{@link istar.ISTAR#NSIAB() <em>NSIAB</em>}</li>
 *   <li>{@link istar.ISTAR#NDAS() <em>NDAS</em>}</li>
 *   <li>{@link istar.ISTAR#MinNDAS() <em>Min NDAS</em>}</li>
 *   <li>{@link istar.ISTAR#MaxNDAS() <em>Max NDAS</em>}</li>
 *   <li>{@link istar.ISTAR#AvgNDAS() <em>Avg NDAS</em>}</li>
 *   <li>{@link istar.ISTAR#NSWD() <em>NSWD</em>}</li>
 *   <li>{@link istar.ISTAR#NTIAB() <em>NTIAB</em>}</li>
 *   <li>{@link istar.ISTAR#NDAT() <em>NDAT</em>}</li>
 *   <li>{@link istar.ISTAR#MinNDAT() <em>Min NDAT</em>}</li>
 *   <li>{@link istar.ISTAR#MaxNDAT() <em>Max NDAT</em>}</li>
 *   <li>{@link istar.ISTAR#AvgNDAT() <em>Avg NDAT</em>}</li>
 *   <li>{@link istar.ISTAR#NTWD() <em>NTWD</em>}</li>
 *   <li>{@link istar.ISTAR#NIDA() <em>NIDA</em>}</li>
 *   <li>{@link istar.ISTAR#NODA() <em>NODA</em>}</li>
 *   <li>{@link istar.ISTAR#NEIActB() <em>NEI Act B</em>}</li>
 *   <li>{@link istar.ISTAR#NEIAgentB() <em>NEI Agent B</em>}</li>
 *   <li>{@link istar.ISTAR#NEIRoleB() <em>NEI Role B</em>}</li>
 *   <li>{@link istar.ISTAR#NEIPosB() <em>NEI Pos B</em>}</li>
 *   <li>{@link istar.ISTAR#NActors() <em>NActors</em>}</li>
 *   <li>{@link istar.ISTAR#NAgents() <em>NAgents</em>}</li>
 *   <li>{@link istar.ISTAR#NRoles() <em>NRoles</em>}</li>
 *   <li>{@link istar.ISTAR#NPos() <em>NPos</em>}</li>
 *   <li>{@link istar.ISTAR#PSAct() <em>PS Act</em>}</li>
 *   <li>{@link istar.ISTAR#PGWD() <em>PGWD</em>}</li>
 *   <li>{@link istar.ISTAR#PSWD() <em>PSWD</em>}</li>
 *   <li>{@link istar.ISTAR#PTWD() <em>PTWD</em>}</li>
 *   <li>{@link istar.ISTAR#NAWEI() <em>NAWEI</em>}</li>
 *   <li>{@link istar.ISTAR#PAWEI() <em>PAWEI</em>}</li>
 *   <li>{@link istar.ISTAR#NUEIAB() <em>NUEIAB</em>}</li>
 *   <li>{@link istar.ISTAR#PUEIAB() <em>PUEIAB</em>}</li>
 *   <li>{@link istar.ISTAR#NAWUEI() <em>NAWUEI</em>}</li>
 *   <li>{@link istar.ISTAR#PAWUEI() <em>PAWUEI</em>}</li>
 *   <li>{@link istar.ISTAR#PAWOUEI() <em>PAWOUEI</em>}</li>
 *   <li>{@link istar.ISTAR#NDA() <em>NDA</em>}</li>
 *   <li>{@link istar.ISTAR#PIDA() <em>PIDA</em>}</li>
 *   <li>{@link istar.ISTAR#PODA() <em>PODA</em>}</li>
 *   <li>{@link istar.ISTAR#NAWD() <em>NAWD</em>}</li>
 *   <li>{@link istar.ISTAR#PAWD() <em>PAWD</em>}</li>
 *   <li>{@link istar.ISTAR#PAWOD() <em>PAWOD</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ISTARTest extends TestCase {

	/**
	 * The fixture for this ISTAR test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTAR fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISTARTest.class);
	}

	/**
	 * Constructs a new ISTAR test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTARTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ISTAR test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ISTAR fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ISTAR test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTAR getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IstarFactory.eINSTANCE.createISTAR());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link istar.ISTAR#NAct() <em>NAct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NAct()
	 * @generated
	 */
	public void testNAct() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NElem() <em>NElem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NElem()
	 * @generated
	 */
	public void testNElem() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NEOAB() <em>NEOAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NEOAB()
	 * @generated
	 */
	public void testNEOAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NEIAB() <em>NEIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NEIAB()
	 * @generated
	 */
	public void testNEIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MinNEIAB() <em>Min NEIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MinNEIAB()
	 * @generated
	 */
	public void testMinNEIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MaxNEIAB() <em>Max NEIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MaxNEIAB()
	 * @generated
	 */
	public void testMaxNEIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#AvgNEIAB() <em>Avg NEIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#AvgNEIAB()
	 * @generated
	 */
	public void testAvgNEIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NGIAB() <em>NGIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NGIAB()
	 * @generated
	 */
	public void testNGIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NDAG() <em>NDAG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NDAG()
	 * @generated
	 */
	public void testNDAG() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MinNDAG() <em>Min NDAG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MinNDAG()
	 * @generated
	 */
	public void testMinNDAG() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MaxNDAG() <em>Max NDAG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MaxNDAG()
	 * @generated
	 */
	public void testMaxNDAG() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#AvgNDAG() <em>Avg NDAG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#AvgNDAG()
	 * @generated
	 */
	public void testAvgNDAG() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NGWD() <em>NGWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NGWD()
	 * @generated
	 */
	public void testNGWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NSIAB() <em>NSIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NSIAB()
	 * @generated
	 */
	public void testNSIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NDAS() <em>NDAS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NDAS()
	 * @generated
	 */
	public void testNDAS() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MinNDAS() <em>Min NDAS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MinNDAS()
	 * @generated
	 */
	public void testMinNDAS() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MaxNDAS() <em>Max NDAS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MaxNDAS()
	 * @generated
	 */
	public void testMaxNDAS() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#AvgNDAS() <em>Avg NDAS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#AvgNDAS()
	 * @generated
	 */
	public void testAvgNDAS() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NSWD() <em>NSWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NSWD()
	 * @generated
	 */
	public void testNSWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NTIAB() <em>NTIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NTIAB()
	 * @generated
	 */
	public void testNTIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NDAT() <em>NDAT</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NDAT()
	 * @generated
	 */
	public void testNDAT() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MinNDAT() <em>Min NDAT</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MinNDAT()
	 * @generated
	 */
	public void testMinNDAT() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#MaxNDAT() <em>Max NDAT</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#MaxNDAT()
	 * @generated
	 */
	public void testMaxNDAT() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#AvgNDAT() <em>Avg NDAT</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#AvgNDAT()
	 * @generated
	 */
	public void testAvgNDAT() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NTWD() <em>NTWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NTWD()
	 * @generated
	 */
	public void testNTWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NIDA() <em>NIDA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NIDA()
	 * @generated
	 */
	public void testNIDA() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NODA() <em>NODA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NODA()
	 * @generated
	 */
	public void testNODA() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NEIActB() <em>NEI Act B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NEIActB()
	 * @generated
	 */
	public void testNEIActB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NEIAgentB() <em>NEI Agent B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NEIAgentB()
	 * @generated
	 */
	public void testNEIAgentB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NEIRoleB() <em>NEI Role B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NEIRoleB()
	 * @generated
	 */
	public void testNEIRoleB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NEIPosB() <em>NEI Pos B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NEIPosB()
	 * @generated
	 */
	public void testNEIPosB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NActors() <em>NActors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NActors()
	 * @generated
	 */
	public void testNActors() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NAgents() <em>NAgents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NAgents()
	 * @generated
	 */
	public void testNAgents() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NRoles() <em>NRoles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NRoles()
	 * @generated
	 */
	public void testNRoles() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NPos() <em>NPos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NPos()
	 * @generated
	 */
	public void testNPos() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PSAct() <em>PS Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PSAct()
	 * @generated
	 */
	public void testPSAct() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PGWD() <em>PGWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PGWD()
	 * @generated
	 */
	public void testPGWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PSWD() <em>PSWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PSWD()
	 * @generated
	 */
	public void testPSWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PTWD() <em>PTWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PTWD()
	 * @generated
	 */
	public void testPTWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NAWEI() <em>NAWEI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NAWEI()
	 * @generated
	 */
	public void testNAWEI() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PAWEI() <em>PAWEI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PAWEI()
	 * @generated
	 */
	public void testPAWEI() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NUEIAB() <em>NUEIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NUEIAB()
	 * @generated
	 */
	public void testNUEIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PUEIAB() <em>PUEIAB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PUEIAB()
	 * @generated
	 */
	public void testPUEIAB() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NAWUEI() <em>NAWUEI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NAWUEI()
	 * @generated
	 */
	public void testNAWUEI() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PAWUEI() <em>PAWUEI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PAWUEI()
	 * @generated
	 */
	public void testPAWUEI() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PAWOUEI() <em>PAWOUEI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PAWOUEI()
	 * @generated
	 */
	public void testPAWOUEI() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NDA() <em>NDA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NDA()
	 * @generated
	 */
	public void testNDA() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PIDA() <em>PIDA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PIDA()
	 * @generated
	 */
	public void testPIDA() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PODA() <em>PODA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PODA()
	 * @generated
	 */
	public void testPODA() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#NAWD() <em>NAWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#NAWD()
	 * @generated
	 */
	public void testNAWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PAWD() <em>PAWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PAWD()
	 * @generated
	 */
	public void testPAWD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link istar.ISTAR#PAWOD() <em>PAWOD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.ISTAR#PAWOD()
	 * @generated
	 */
	public void testPAWOD() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ISTARTest

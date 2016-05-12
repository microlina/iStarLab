/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISTAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.ISTAR#getHasNode <em>Has Node</em>}</li>
 *   <li>{@link istar.ISTAR#getModelName <em>Model Name</em>}</li>
 *   <li>{@link istar.ISTAR#getHasRelationship <em>Has Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getISTAR()
 * @model
 * @generated
 */
public interface ISTAR extends EObject
{
  /**
	 * Returns the value of the '<em><b>Has Node</b></em>' containment reference list.
	 * The list contents are of type {@link istar.Node}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Node</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Node</em>' containment reference list.
	 * @see istar.IstarPackage#getISTAR_HasNode()
	 * @model containment="true"
	 * @generated
	 */
  EList<Node> getHasNode();

  /**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see istar.IstarPackage#getISTAR_ModelName()
	 * @model
	 * @generated
	 */
  String getModelName();

  /**
	 * Sets the value of the '{@link istar.ISTAR#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
  void setModelName(String value);

  /**
	 * Returns the value of the '<em><b>Has Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link istar.Relationship}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Relationship</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relationship</em>' containment reference list.
	 * @see istar.IstarPackage#getISTAR_HasRelationship()
	 * @model containment="true"
	 * @generated
	 */
  EList<Relationship> getHasRelationship();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->size()'"
	 * @generated
	 */
	Integer NAct();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NEOAB() + self.NEIAB()'"
	 * @generated
	 */
	Integer NElem();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Element))->size()'"
	 * @generated
	 */
	Integer NEOAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nei : Integer = n.oclAsType(Actor).NEI() in total + nei)'"
	 * @generated
	 */
	Integer NEIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; min : Integer = -1 | let nei : Integer = n.oclAsType(Actor).NEI() in if min = -1 then nei else min.min(nei) endif)'"
	 * @generated
	 */
	Integer MinNEIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; max : Integer = -1 | let nei : Integer = n.oclAsType(Actor).NEI() in if max = -1 then nei else max.max(nei) endif)'"
	 * @generated
	 */
	Integer MaxNEIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NEIAB() / self.NAct()' pre_nact='self.NAct() > 0'"
	 * @generated
	 */
	Double AvgNEIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ngi : Integer = n.oclAsType(Actor).NGI() in total + ngi)'"
	 * @generated
	 */
	Integer NGIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ndgi : Integer = n.oclAsType(Actor).NDGI() in total + ndgi)'"
	 * @generated
	 */
	Integer NDAG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MinNDGI() > 0)->iterate(n : Node; min : Integer = -1 | let minndgi : Integer = n.oclAsType(Actor).MinNDGI() in if min = -1 then minndgi else min.min(minndgi) endif)'"
	 * @generated
	 */
	Integer MinNDAG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MaxNDGI() > 0)->iterate(n : Node; max : Integer = -1 | let maxndgi : Integer = n.oclAsType(Actor).MaxNDGI() in if max = -1 then maxndgi else max.max(maxndgi) endif)'"
	 * @generated
	 */
	Integer MaxNDAG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDAG() / self.NGWD()' pre_NGWD='self.NGWD() > 0'"
	 * @generated
	 */
	Double AvgNDAG();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ngwdi : Integer = n.oclAsType(Actor).NGWDI() in total + ngwdi)'"
	 * @generated
	 */
	Integer NGWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nsi : Integer = n.oclAsType(Actor).NSI() in total + nsi)'"
	 * @generated
	 */
	Integer NSIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ndsi : Integer = n.oclAsType(Actor).NDSI() in total + ndsi)'"
	 * @generated
	 */
	Integer NDAS();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MinNDSI() > 0)->iterate(n : Node; min : Integer = -1 | let minndsi : Integer = n.oclAsType(Actor).MinNDSI() in if min = -1 then minndsi else min.min(minndsi) endif)'"
	 * @generated
	 */
	Integer MinNDAS();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MaxNDSI() > 0)->iterate(n : Node; max : Integer = -1 | let maxndsi : Integer = n.oclAsType(Actor).MaxNDSI() in if max = -1 then maxndsi else max.max(maxndsi) endif)'"
	 * @generated
	 */
	Integer MaxNDAS();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDAS() / self.NSWD()' pre_NSWD='self.NSWD() > 0'"
	 * @generated
	 */
	Double AvgNDAS();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nswdi : Integer = n.oclAsType(Actor).NSWDI() in total + nswdi)'"
	 * @generated
	 */
	Integer NSWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nti : Integer = n.oclAsType(Actor).NTI() in total + nti)'"
	 * @generated
	 */
	Integer NTIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ndti : Integer = n.oclAsType(Actor).NDTI() in total + ndti)'"
	 * @generated
	 */
	Integer NDAT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MinNDTI() > 0)->iterate(n : Node; min : Integer = -1 | let minndti : Integer = n.oclAsType(Actor).MinNDTI() in if min = -1 then minndti else min.min(minndti) endif)'"
	 * @generated
	 */
	Integer MinNDAT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).MaxNDTI() > 0)->iterate(n : Node; max : Integer = -1 | let maxndti : Integer = n.oclAsType(Actor).MaxNDTI() in if max = -1 then maxndti else max.max(maxndti) endif)'"
	 * @generated
	 */
	Integer MaxNDAT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDAT() / self.NTWD()' pre_NTWD='self.NTWD() > 0'"
	 * @generated
	 */
	Double AvgNDAT();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let ntwdi : Integer = n.oclAsType(Actor).NTWDI() in total + ntwdi)'"
	 * @generated
	 */
	Integer NTWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nid : Integer = n.oclAsType(Actor).NID() in total + nid)'"
	 * @generated
	 */
	Integer NIDA();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nod : Integer = n.oclAsType(Actor).NOD() in total + nod)'"
	 * @generated
	 */
	Integer NODA();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NEIAB() - (self.NEIAgentB() + self.NEIRoleB() + self.NEIPosB())'"
	 * @generated
	 */
	Integer NEIActB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Agent))->iterate(n : Node; total : Integer = 0 | let neia : Integer = n.oclAsType(Agent).NEIA() in total + neia)'"
	 * @generated
	 */
	Integer NEIAgentB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Role))->iterate(n : Node; total : Integer = 0 | let neir : Integer = n.oclAsType(Role).NEIR() in total + neir)'"
	 * @generated
	 */
	Integer NEIRoleB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Position))->iterate(n : Node; total : Integer = 0 | let neip : Integer = n.oclAsType(Position).NEIP() in total + neip)'"
	 * @generated
	 */
	Integer NEIPosB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NAct() - (self.NAgents() + self.NRoles() + self.NPos())'"
	 * @generated
	 */
	Integer NActors();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Agent))->size()'"
	 * @generated
	 */
	Integer NAgents();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Role))->size()'"
	 * @generated
	 */
	Integer NRoles();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Position))->size()'"
	 * @generated
	 */
	Integer NPos();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(self.NAgents() + self.NRoles() + self.NPos()) / self.NAct()' pre_NAct='self.NAct() > 0'"
	 * @generated
	 */
	Double PSAct();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NGWD() / self.NGIAB()' pre_NGIAB='self.NGIAB() > 0'"
	 * @generated
	 */
	Double PGWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NSWD() / self.NSIAB()' pre_NSIAB='self.NSIAB() > 0'"
	 * @generated
	 */
	Double PSWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NTWD() / self.NTIAB()' pre_NTIAB='self.NTIAB() > 0'"
	 * @generated
	 */
	Double PTWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).NEI() > 0)->size()'"
	 * @generated
	 */
	Integer NAWEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NAWEI() / self.NAct()' pre_NAct='self.NAct() > 0'"
	 * @generated
	 */
	Double PAWEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor))->iterate(n : Node; total : Integer = 0 | let nuei : Integer = n.oclAsType(Actor).NUEI() in total + nuei)'"
	 * @generated
	 */
	Integer NUEIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NUEIAB() / self.NEIAB()' pre_NEIAB='self.NEIAB() > 0'"
	 * @generated
	 */
	Double PUEIAB();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).NUEI() > 0)->size()'"
	 * @generated
	 */
	Integer NAWUEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NAWUEI() / self.NAct()' pre_NAct='self.NAct() > 0'"
	 * @generated
	 */
	Double PAWUEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='1 - self.PAWUEI()'"
	 * @generated
	 */
	Double PAWOUEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NIDA() + self.NODA()'"
	 * @generated
	 */
	Integer NDA();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NIDA() / self.NDA()' pre_NDA='self.NDA() > 0'"
	 * @generated
	 */
	Double PIDA();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NODA() / self.NDA()' pre_NDA='self.NDA() > 0'"
	 * @generated
	 */
	Double PODA();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasNode->select(n : Node | n.oclIsKindOf(Actor) and n.oclAsType(Actor).ND() > 0)->size()'"
	 * @generated
	 */
	Integer NAWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NAWD() / self.NAct()' pre_NAct='self.NAct() > 0'"
	 * @generated
	 */
	Double PAWD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='1 - self.PAWD()'"
	 * @generated
	 */
	Double PAWOD();

} // ISTAR

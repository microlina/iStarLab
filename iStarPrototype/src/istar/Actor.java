/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.Actor#getActorISA <em>Actor ISA</em>}</li>
 *   <li>{@link istar.Actor#getSecondActorISA <em>Second Actor ISA</em>}</li>
 *   <li>{@link istar.Actor#getActorIsPartOf <em>Actor Is Part Of</em>}</li>
 *   <li>{@link istar.Actor#getSecondActorIsPartOf <em>Second Actor Is Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getActor()
 * @model annotation="gmf.node color='249,249,249' border.color='0,0,0' label='nodeName'"
 * @generated
 */
public interface Actor extends Actors
{
  /**
	 * Returns the value of the '<em><b>Actor ISA</b></em>' reference list.
	 * The list contents are of type {@link istar.ISA}.
	 * It is bidirectional and its opposite is '{@link istar.ISA#getISAactor <em>IS Aactor</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor ISA</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor ISA</em>' reference list.
	 * @see istar.IstarPackage#getActor_ActorISA()
	 * @see istar.ISA#getISAactor
	 * @model opposite="ISAactor"
	 * @generated
	 */
  EList<ISA> getActorISA();

  /**
	 * Returns the value of the '<em><b>Second Actor ISA</b></em>' reference list.
	 * The list contents are of type {@link istar.ISA}.
	 * It is bidirectional and its opposite is '{@link istar.ISA#getISAsecondActor <em>IS Asecond Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Actor ISA</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Actor ISA</em>' reference list.
	 * @see istar.IstarPackage#getActor_SecondActorISA()
	 * @see istar.ISA#getISAsecondActor
	 * @model opposite="ISAsecondActor"
	 * @generated
	 */
  EList<ISA> getSecondActorISA();

  /**
	 * Returns the value of the '<em><b>Actor Is Part Of</b></em>' reference list.
	 * The list contents are of type {@link istar.IsPartOf}.
	 * It is bidirectional and its opposite is '{@link istar.IsPartOf#getIsPartOfActor <em>Is Part Of Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor Is Part Of</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Is Part Of</em>' reference list.
	 * @see istar.IstarPackage#getActor_ActorIsPartOf()
	 * @see istar.IsPartOf#getIsPartOfActor
	 * @model opposite="isPartOfActor"
	 * @generated
	 */
  EList<IsPartOf> getActorIsPartOf();

  /**
	 * Returns the value of the '<em><b>Second Actor Is Part Of</b></em>' reference list.
	 * The list contents are of type {@link istar.IsPartOf}.
	 * It is bidirectional and its opposite is '{@link istar.IsPartOf#getIsPartOfSecondActor <em>Is Part Of Second Actor</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Actor Is Part Of</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Actor Is Part Of</em>' reference list.
	 * @see istar.IstarPackage#getActor_SecondActorIsPartOf()
	 * @see istar.IsPartOf#getIsPartOfSecondActor
	 * @model opposite="isPartOfSecondActor"
	 * @generated
	 */
  EList<IsPartOf> getSecondActorIsPartOf();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Element))->size()'"
	 * @generated
	 */
	Integer NEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Goal))->size()'"
	 * @generated
	 */
	Integer NGI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Goal))->iterate(e : Element; total : Integer = 0 | let ndg : Integer = e.oclAsType(Goal).NDG() in total + ndg)'"
	 * @generated
	 */
	Integer NDGI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NDG() > 0)->size()'"
	 * @generated
	 */
	Integer NGWDI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NDG() > 0)->iterate(e : Element; min : Integer = -1 | let ndg : Integer = e.oclAsType(Goal).NDG() in if min = -1 then ndg else min.min(ndg) endif)'"
	 * @generated
	 */
	Integer MinNDGI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NDG() > 0)->iterate(e : Element; max : Integer = -1 | let ndg : Integer = e.oclAsType(Goal).NDG() in if max = -1 then ndg else max.max(ndg) endif)'"
	 * @generated
	 */
	Integer MaxNDGI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDGI() / self.NGWDI()' pre_NGWDI='self.NGWDI() > 0'"
	 * @generated
	 */
	Double AvgNDGI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal))->size()'"
	 * @generated
	 */
	Integer NSI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal))->iterate(e: Element; total : Integer = 0 | let nds : Integer = e.oclAsType(Softgoal).NDS() in total + nds)'"
	 * @generated
	 */
	Integer NDSI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NDS() > 0)->size()'"
	 * @generated
	 */
	Integer NSWDI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NDS() > 0)->iterate(e : Element; min : Integer = -1 | let nds : Integer = e.oclAsType(Softgoal).NDS() in if min = -1 then nds else min.min(nds) endif)'"
	 * @generated
	 */
	Integer MinNDSI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NDS() > 0)->iterate(e : Element; max : Integer = -1 | let nds : Integer = e.oclAsType(Softgoal).NDS() in if max = -1 then nds else max.max(nds) endif)'"
	 * @generated
	 */
	Integer MaxNDSI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDSI() / self.NSWDI()' pre_NTWDI='self.NSWDI() > 0'"
	 * @generated
	 */
	Double AvgNDSI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Task))->size()'"
	 * @generated
	 */
	Integer NTI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Task))->iterate(e : Element; total : Integer = 0 | let ndt : Integer = e.oclAsType(Task).NDT() in total + ndt)'"
	 * @generated
	 */
	Integer NDTI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NDT() > 0)->iterate(e : Element; min : Integer = -1 | let ndt : Integer = e.oclAsType(Task).NDT() in if min = -1 then ndt else min.min(ndt) endif)'"
	 * @generated
	 */
	Integer MinNDTI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NDT() > 0)->iterate(e : Element; max : Integer = -1 | let ndt : Integer = e.oclAsType(Task).NDT() in if max = -1 then ndt else max.max(ndt) endif)'"
	 * @generated
	 */
	Integer MaxNDTI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NDTI() / self.NTWDI()' pre_NTWDI='self.NTWDI() > 0'"
	 * @generated
	 */
	Double AvgNDTI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NDT() > 0)->size()'"
	 * @generated
	 */
	Integer NTWDI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Goal) and e.oclAsType(Goal).NLG() = 0)->size()'"
	 * @generated
	 */
	Integer NUGI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Softgoal) and e.oclAsType(Softgoal).NLS() = 0)->size()'"
	 * @generated
	 */
	Integer NUSI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Task) and e.oclAsType(Task).NLT() = 0)->size()'"
	 * @generated
	 */
	Integer NUTI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Resource) and e.oclAsType(Resource).NLR() = 0)->size()'"
	 * @generated
	 */
	Integer NURI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.hasElement->select(e : Element | e.oclIsKindOf(Belief) and e.oclAsType(Belief).NLB() = 0)->size()'"
	 * @generated
	 */
	Integer NUBI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NUGI() + self.NUSI() + self.NUTI() + self.NURI() + self.NUBI()'"
	 * @generated
	 */
	Integer NUEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NUEI() / self.NEI()' pre_NEI='self.NEI() > 0'"
	 * @generated
	 */
	Double PUEI();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.actorDependency->select(dl : DependencyLink | dl.oclIsKindOf(DependeeLink))->size()'"
	 * @generated
	 */
	Integer NID();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.actorDependency->select(dl : DependencyLink | dl.oclIsKindOf(DependerLink))->size()'"
	 * @generated
	 */
	Integer NOD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NID() + self.NOD()'"
	 * @generated
	 */
	Integer ND();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NID() / self.ND()' pre_ND='self.ND() > 0'"
	 * @generated
	 */
	Double PID();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.NOD() / self.ND()' pre_ND='self.ND() > 0'"
	 * @generated
	 */
	Double POD();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.actorISA->size()'"
	 * @generated
	 */
	Integer NIISA();

} // Actor

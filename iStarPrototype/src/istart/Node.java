/**
 */
package istart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.Node#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link istart.Node#getNodeDependency <em>Node Dependency</em>}</li>
 *   <li>{@link istart.Node#getSecondNodeDependency <em>Second Node Dependency</em>}</li>
 *   <li>{@link istart.Node#getNodeNFR <em>Node NFR</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Node Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Name</em>' attribute.
   * @see #setNodeName(String)
   * @see istart.IstartPackage#getNode_NodeName()
   * @model
   * @generated
   */
  String getNodeName();

  /**
   * Sets the value of the '{@link istart.Node#getNodeName <em>Node Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Name</em>' attribute.
   * @see #getNodeName()
   * @generated
   */
  void setNodeName(String value);

  /**
   * Returns the value of the '<em><b>Node Dependency</b></em>' reference list.
   * The list contents are of type {@link istart.DependencyLink}.
   * It is bidirectional and its opposite is '{@link istart.DependencyLink#getDependencyNode <em>Dependency Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Dependency</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Dependency</em>' reference list.
   * @see istart.IstartPackage#getNode_NodeDependency()
   * @see istart.DependencyLink#getDependencyNode
   * @model opposite="dependencyNode"
   * @generated
   */
  EList<DependencyLink> getNodeDependency();

  /**
   * Returns the value of the '<em><b>Second Node Dependency</b></em>' reference list.
   * The list contents are of type {@link istart.DependencyLink}.
   * It is bidirectional and its opposite is '{@link istart.DependencyLink#getDependencySecondNode <em>Dependency Second Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Node Dependency</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Node Dependency</em>' reference list.
   * @see istart.IstartPackage#getNode_SecondNodeDependency()
   * @see istart.DependencyLink#getDependencySecondNode
   * @model opposite="dependencySecondNode"
   * @generated
   */
  EList<DependencyLink> getSecondNodeDependency();

  /**
   * Returns the value of the '<em><b>Node NFR</b></em>' attribute list.
   * The list contents are of type {@link istart.NFR}.
   * The literals are from the enumeration {@link istart.NFR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node NFR</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node NFR</em>' attribute list.
   * @see istart.NFR
   * @see istart.IstartPackage#getNode_NodeNFR()
   * @model default="unknown"
   * @generated
   */
  EList<NFR> getNodeNFR();

} // Node

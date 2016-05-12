/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.DependencyLink#getStrength <em>Strength</em>}</li>
 *   <li>{@link istar.DependencyLink#getDependencyName <em>Dependency Name</em>}</li>
 *   <li>{@link istar.DependencyLink#getDependencyNode <em>Dependency Node</em>}</li>
 *   <li>{@link istar.DependencyLink#getDependencySecondNode <em>Dependency Second Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getDependencyLink()
 * @model annotation="gmf.link color='0,0,0' source='dependencyNode' target='dependencySecondNode' target.decoration='closedarrow' label='dependencyName'"
 * @generated
 */
public interface DependencyLink extends Relationship
{
  /**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link istar.DependencyStrength}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strength</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see istar.DependencyStrength
	 * @see #setStrength(DependencyStrength)
	 * @see istar.IstarPackage#getDependencyLink_Strength()
	 * @model
	 * @generated
	 */
  DependencyStrength getStrength();

  /**
	 * Sets the value of the '{@link istar.DependencyLink#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see istar.DependencyStrength
	 * @see #getStrength()
	 * @generated
	 */
  void setStrength(DependencyStrength value);

  /**
	 * Returns the value of the '<em><b>Dependency Name</b></em>' attribute.
	 * The default value is <code>"D"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Name</em>' attribute.
	 * @see #isSetDependencyName()
	 * @see #unsetDependencyName()
	 * @see #setDependencyName(String)
	 * @see istar.IstarPackage#getDependencyLink_DependencyName()
	 * @model default="D" unsettable="true"
	 * @generated
	 */
  String getDependencyName();

  /**
	 * Sets the value of the '{@link istar.DependencyLink#getDependencyName <em>Dependency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Name</em>' attribute.
	 * @see #isSetDependencyName()
	 * @see #unsetDependencyName()
	 * @see #getDependencyName()
	 * @generated
	 */
  void setDependencyName(String value);

  /**
	 * Unsets the value of the '{@link istar.DependencyLink#getDependencyName <em>Dependency Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetDependencyName()
	 * @see #getDependencyName()
	 * @see #setDependencyName(String)
	 * @generated
	 */
  void unsetDependencyName();

  /**
	 * Returns whether the value of the '{@link istar.DependencyLink#getDependencyName <em>Dependency Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dependency Name</em>' attribute is set.
	 * @see #unsetDependencyName()
	 * @see #getDependencyName()
	 * @see #setDependencyName(String)
	 * @generated
	 */
  boolean isSetDependencyName();

  /**
	 * Returns the value of the '<em><b>Dependency Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Node#getNodeDependency <em>Node Dependency</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Node</em>' reference.
	 * @see #setDependencyNode(Node)
	 * @see istar.IstarPackage#getDependencyLink_DependencyNode()
	 * @see istar.Node#getNodeDependency
	 * @model opposite="nodeDependency" required="true"
	 * @generated
	 */
  Node getDependencyNode();

  /**
	 * Sets the value of the '{@link istar.DependencyLink#getDependencyNode <em>Dependency Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Node</em>' reference.
	 * @see #getDependencyNode()
	 * @generated
	 */
  void setDependencyNode(Node value);

  /**
	 * Returns the value of the '<em><b>Dependency Second Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link istar.Node#getSecondNodeDependency <em>Second Node Dependency</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Second Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Second Node</em>' reference.
	 * @see #setDependencySecondNode(Node)
	 * @see istar.IstarPackage#getDependencyLink_DependencySecondNode()
	 * @see istar.Node#getSecondNodeDependency
	 * @model opposite="secondNodeDependency" required="true"
	 * @generated
	 */
  Node getDependencySecondNode();

  /**
	 * Sets the value of the '{@link istar.DependencyLink#getDependencySecondNode <em>Dependency Second Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Second Node</em>' reference.
	 * @see #getDependencySecondNode()
	 * @generated
	 */
  void setDependencySecondNode(Node value);

} // DependencyLink

/**
 */
package istart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.DependencyLink#getStrength <em>Strength</em>}</li>
 *   <li>{@link istart.DependencyLink#getDependencyName <em>Dependency Name</em>}</li>
 *   <li>{@link istart.DependencyLink#getDependencyNode <em>Dependency Node</em>}</li>
 *   <li>{@link istart.DependencyLink#getDependencySecondNode <em>Dependency Second Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getDependencyLink()
 * @model annotation="gmf.link color='0,0,0' source='dependencyNode' target='dependencySecondNode' target.decoration='closedarrow' label='dependencyName'"
 * @generated
 */
public interface DependencyLink extends Relationship
{
  /**
   * Returns the value of the '<em><b>Strength</b></em>' attribute.
   * The literals are from the enumeration {@link istart.DependencyStrength}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strength</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strength</em>' attribute.
   * @see istart.DependencyStrength
   * @see #setStrength(DependencyStrength)
   * @see istart.IstartPackage#getDependencyLink_Strength()
   * @model
   * @generated
   */
  DependencyStrength getStrength();

  /**
   * Sets the value of the '{@link istart.DependencyLink#getStrength <em>Strength</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strength</em>' attribute.
   * @see istart.DependencyStrength
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
   * @see istart.IstartPackage#getDependencyLink_DependencyName()
   * @model default="D" unsettable="true"
   * @generated
   */
  String getDependencyName();

  /**
   * Sets the value of the '{@link istart.DependencyLink#getDependencyName <em>Dependency Name</em>}' attribute.
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
   * Unsets the value of the '{@link istart.DependencyLink#getDependencyName <em>Dependency Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetDependencyName()
   * @see #getDependencyName()
   * @see #setDependencyName(String)
   * @generated
   */
  void unsetDependencyName();

  /**
   * Returns whether the value of the '{@link istart.DependencyLink#getDependencyName <em>Dependency Name</em>}' attribute is set.
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
   * It is bidirectional and its opposite is '{@link istart.Node#getNodeDependency <em>Node Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency Node</em>' reference.
   * @see #setDependencyNode(Node)
   * @see istart.IstartPackage#getDependencyLink_DependencyNode()
   * @see istart.Node#getNodeDependency
   * @model opposite="nodeDependency" required="true"
   * @generated
   */
  Node getDependencyNode();

  /**
   * Sets the value of the '{@link istart.DependencyLink#getDependencyNode <em>Dependency Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency Node</em>' reference.
   * @see #getDependencyNode()
   * @generated
   */
  void setDependencyNode(Node value);

  /**
   * Returns the value of the '<em><b>Dependency Second Node</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Node#getSecondNodeDependency <em>Second Node Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Second Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency Second Node</em>' reference.
   * @see #setDependencySecondNode(Node)
   * @see istart.IstartPackage#getDependencyLink_DependencySecondNode()
   * @see istart.Node#getSecondNodeDependency
   * @model opposite="secondNodeDependency" required="true"
   * @generated
   */
  Node getDependencySecondNode();

  /**
   * Sets the value of the '{@link istart.DependencyLink#getDependencySecondNode <em>Dependency Second Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency Second Node</em>' reference.
   * @see #getDependencySecondNode()
   * @generated
   */
  void setDependencySecondNode(Node value);

} // DependencyLink

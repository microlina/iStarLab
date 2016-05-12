/**
 */
package istart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istart.DecompositionLink#getDecompositionTask <em>Decomposition Task</em>}</li>
 *   <li>{@link istart.DecompositionLink#getDecompositionElement <em>Decomposition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see istart.IstartPackage#getDecompositionLink()
 * @model annotation="gmf.link color='0,0,0' source='decompositionTask' target='decompositionElement' label.placement='none' source.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface DecompositionLink extends Decomposition
{
  /**
   * Returns the value of the '<em><b>Decomposition Task</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Task#getTaskDecomposition <em>Task Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposition Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposition Task</em>' reference.
   * @see #setDecompositionTask(Task)
   * @see istart.IstartPackage#getDecompositionLink_DecompositionTask()
   * @see istart.Task#getTaskDecomposition
   * @model opposite="taskDecomposition" required="true"
   * @generated
   */
  Task getDecompositionTask();

  /**
   * Sets the value of the '{@link istart.DecompositionLink#getDecompositionTask <em>Decomposition Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decomposition Task</em>' reference.
   * @see #getDecompositionTask()
   * @generated
   */
  void setDecompositionTask(Task value);

  /**
   * Returns the value of the '<em><b>Decomposition Element</b></em>' reference.
   * It is bidirectional and its opposite is '{@link istart.Element#getElementDecomposition <em>Element Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposition Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposition Element</em>' reference.
   * @see #setDecompositionElement(Element)
   * @see istart.IstartPackage#getDecompositionLink_DecompositionElement()
   * @see istart.Element#getElementDecomposition
   * @model opposite="elementDecomposition" required="true"
   * @generated
   */
  Element getDecompositionElement();

  /**
   * Sets the value of the '{@link istart.DecompositionLink#getDecompositionElement <em>Decomposition Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decomposition Element</em>' reference.
   * @see #getDecompositionElement()
   * @generated
   */
  void setDecompositionElement(Element value);

} // DecompositionLink

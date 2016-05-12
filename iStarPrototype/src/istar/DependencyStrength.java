/**
 */
package istar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Strength</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see istar.IstarPackage#getDependencyStrength()
 * @model
 * @generated
 */
public enum DependencyStrength implements Enumerator
{
  /**
	 * The '<em><b>Commited</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #COMMITED_VALUE
	 * @generated
	 * @ordered
	 */
  COMMITED(0, "commited", "commited"),

  /**
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
  OPEN(1, "open", "open"),

  /**
	 * The '<em><b>Critical</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
  CRITICAL(2, "critical", "critical");

  /**
	 * The '<em><b>Commited</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Commited</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #COMMITED
	 * @model name="commited"
	 * @generated
	 * @ordered
	 */
  public static final int COMMITED_VALUE = 0;

  /**
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Open</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model name="open"
	 * @generated
	 * @ordered
	 */
  public static final int OPEN_VALUE = 1;

  /**
	 * The '<em><b>Critical</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model name="critical"
	 * @generated
	 * @ordered
	 */
  public static final int CRITICAL_VALUE = 2;

  /**
	 * An array of all the '<em><b>Dependency Strength</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final DependencyStrength[] VALUES_ARRAY =
    new DependencyStrength[] {
			COMMITED,
			OPEN,
			CRITICAL,
		};

  /**
	 * A public read-only list of all the '<em><b>Dependency Strength</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<DependencyStrength> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Dependency Strength</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DependencyStrength get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyStrength result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Dependency Strength</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DependencyStrength getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DependencyStrength result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Dependency Strength</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DependencyStrength get(int value)
  {
		switch (value) {
			case COMMITED_VALUE: return COMMITED;
			case OPEN_VALUE: return OPEN;
			case CRITICAL_VALUE: return CRITICAL;
		}
		return null;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final int value;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String name;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private final String literal;

  /**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private DependencyStrength(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //DependencyStrength

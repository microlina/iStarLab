/**
 */
package istar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NFR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see istar.IstarPackage#getNFR()
 * @model
 * @generated
 */
public enum NFR implements Enumerator
{
  /**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
  UNKNOWN(0, "unknown", "unknown"),

  /**
	 * The '<em><b>Functional Suitability</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_SUITABILITY_VALUE
	 * @generated
	 * @ordered
	 */
  FUNCTIONAL_SUITABILITY(1, "functionalSuitability", "functionalSuitability"),

  /**
	 * The '<em><b>Performance Efficiency</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PERFORMANCE_EFFICIENCY_VALUE
	 * @generated
	 * @ordered
	 */
  PERFORMANCE_EFFICIENCY(2, "performanceEfficiency", "performanceEfficiency"),

  /**
	 * The '<em><b>Compatibility</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #COMPATIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
  COMPATIBILITY(3, "compatibility", "compatibility"),

  /**
	 * The '<em><b>Usability</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #USABILITY_VALUE
	 * @generated
	 * @ordered
	 */
  USABILITY(4, "usability", "usability"),

  /**
	 * The '<em><b>Reliability</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #RELIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
  RELIABILITY(5, "reliability", "reliability"),

  /**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
  SECURITY(6, "security", "security"),

  /**
	 * The '<em><b>Maintainability</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY_VALUE
	 * @generated
	 * @ordered
	 */
  MAINTAINABILITY(7, "maintainability", "maintainability"),

  /**
	 * The '<em><b>Portability</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PORTABILITY_VALUE
	 * @generated
	 * @ordered
	 */
  PORTABILITY(8, "portability", "portability");

  /**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
  public static final int UNKNOWN_VALUE = 0;

  /**
	 * The '<em><b>Functional Suitability</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Functional Suitability</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_SUITABILITY
	 * @model name="functionalSuitability"
	 * @generated
	 * @ordered
	 */
  public static final int FUNCTIONAL_SUITABILITY_VALUE = 1;

  /**
	 * The '<em><b>Performance Efficiency</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Performance Efficiency</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PERFORMANCE_EFFICIENCY
	 * @model name="performanceEfficiency"
	 * @generated
	 * @ordered
	 */
  public static final int PERFORMANCE_EFFICIENCY_VALUE = 2;

  /**
	 * The '<em><b>Compatibility</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compatibility</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #COMPATIBILITY
	 * @model name="compatibility"
	 * @generated
	 * @ordered
	 */
  public static final int COMPATIBILITY_VALUE = 3;

  /**
	 * The '<em><b>Usability</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Usability</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #USABILITY
	 * @model name="usability"
	 * @generated
	 * @ordered
	 */
  public static final int USABILITY_VALUE = 4;

  /**
	 * The '<em><b>Reliability</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reliability</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #RELIABILITY
	 * @model name="reliability"
	 * @generated
	 * @ordered
	 */
  public static final int RELIABILITY_VALUE = 5;

  /**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="security"
	 * @generated
	 * @ordered
	 */
  public static final int SECURITY_VALUE = 6;

  /**
	 * The '<em><b>Maintainability</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Maintainability</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY
	 * @model name="maintainability"
	 * @generated
	 * @ordered
	 */
  public static final int MAINTAINABILITY_VALUE = 7;

  /**
	 * The '<em><b>Portability</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Portability</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PORTABILITY
	 * @model name="portability"
	 * @generated
	 * @ordered
	 */
  public static final int PORTABILITY_VALUE = 8;

  /**
	 * An array of all the '<em><b>NFR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final NFR[] VALUES_ARRAY =
    new NFR[] {
			UNKNOWN,
			FUNCTIONAL_SUITABILITY,
			PERFORMANCE_EFFICIENCY,
			COMPATIBILITY,
			USABILITY,
			RELIABILITY,
			SECURITY,
			MAINTAINABILITY,
			PORTABILITY,
		};

  /**
	 * A public read-only list of all the '<em><b>NFR</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<NFR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>NFR</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static NFR get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NFR result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>NFR</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static NFR getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NFR result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>NFR</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static NFR get(int value)
  {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case FUNCTIONAL_SUITABILITY_VALUE: return FUNCTIONAL_SUITABILITY;
			case PERFORMANCE_EFFICIENCY_VALUE: return PERFORMANCE_EFFICIENCY;
			case COMPATIBILITY_VALUE: return COMPATIBILITY;
			case USABILITY_VALUE: return USABILITY;
			case RELIABILITY_VALUE: return RELIABILITY;
			case SECURITY_VALUE: return SECURITY;
			case MAINTAINABILITY_VALUE: return MAINTAINABILITY;
			case PORTABILITY_VALUE: return PORTABILITY;
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
  private NFR(int value, String name, String literal)
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
  
} //NFR

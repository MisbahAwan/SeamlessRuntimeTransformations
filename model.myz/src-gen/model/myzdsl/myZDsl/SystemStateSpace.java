/**
 * generated by Xtext 2.25.0
 */
package model.myzdsl.myZDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System State Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.myzdsl.myZDsl.SystemStateSpace#getName <em>Name</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.SystemStateSpace#getVariables <em>Variables</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.SystemStateSpace#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see model.myzdsl.myZDsl.MyZDslPackage#getSystemStateSpace()
 * @model
 * @generated
 */
public interface SystemStateSpace extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see model.myzdsl.myZDsl.MyZDslPackage#getSystemStateSpace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link model.myzdsl.myZDsl.SystemStateSpace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link model.myzdsl.myZDsl.Variables}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see model.myzdsl.myZDsl.MyZDslPackage#getSystemStateSpace_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variables> getVariables();

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
   * The list contents are of type {@link model.myzdsl.myZDsl.SystemStateSpacePredicate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference list.
   * @see model.myzdsl.myZDsl.MyZDslPackage#getSystemStateSpace_Predicate()
   * @model containment="true"
   * @generated
   */
  EList<SystemStateSpacePredicate> getPredicate();

} // SystemStateSpace

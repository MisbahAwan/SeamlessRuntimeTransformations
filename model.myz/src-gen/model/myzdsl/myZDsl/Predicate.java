/**
 * generated by Xtext 2.25.0
 */
package model.myzdsl.myZDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.myzdsl.myZDsl.Predicate#getVasInput <em>Vas Input</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.Predicate#getBelongs <em>Belongs</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.Predicate#getBelongsVariable <em>Belongs Variable</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.Predicate#getVasOutput <em>Vas Output</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.Predicate#getVasStateChange <em>Vas State Change</em>}</li>
 * </ul>
 *
 * @see model.myzdsl.myZDsl.MyZDslPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Vas Input</b></em>' containment reference list.
   * The list contents are of type {@link model.myzdsl.myZDsl.Variables}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vas Input</em>' containment reference list.
   * @see model.myzdsl.myZDsl.MyZDslPackage#getPredicate_VasInput()
   * @model containment="true"
   * @generated
   */
  EList<Variables> getVasInput();

  /**
   * Returns the value of the '<em><b>Belongs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belongs</em>' attribute.
   * @see #setBelongs(String)
   * @see model.myzdsl.myZDsl.MyZDslPackage#getPredicate_Belongs()
   * @model
   * @generated
   */
  String getBelongs();

  /**
   * Sets the value of the '{@link model.myzdsl.myZDsl.Predicate#getBelongs <em>Belongs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belongs</em>' attribute.
   * @see #getBelongs()
   * @generated
   */
  void setBelongs(String value);

  /**
   * Returns the value of the '<em><b>Belongs Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belongs Variable</em>' containment reference.
   * @see #setBelongsVariable(Variables)
   * @see model.myzdsl.myZDsl.MyZDslPackage#getPredicate_BelongsVariable()
   * @model containment="true"
   * @generated
   */
  Variables getBelongsVariable();

  /**
   * Sets the value of the '{@link model.myzdsl.myZDsl.Predicate#getBelongsVariable <em>Belongs Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belongs Variable</em>' containment reference.
   * @see #getBelongsVariable()
   * @generated
   */
  void setBelongsVariable(Variables value);

  /**
   * Returns the value of the '<em><b>Vas Output</b></em>' containment reference list.
   * The list contents are of type {@link model.myzdsl.myZDsl.PredicatePostCondition2}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vas Output</em>' containment reference list.
   * @see model.myzdsl.myZDsl.MyZDslPackage#getPredicate_VasOutput()
   * @model containment="true"
   * @generated
   */
  EList<PredicatePostCondition2> getVasOutput();

  /**
   * Returns the value of the '<em><b>Vas State Change</b></em>' containment reference list.
   * The list contents are of type {@link model.myzdsl.myZDsl.PredicatePostCondition1}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vas State Change</em>' containment reference list.
   * @see model.myzdsl.myZDsl.MyZDslPackage#getPredicate_VasStateChange()
   * @model containment="true"
   * @generated
   */
  EList<PredicatePostCondition1> getVasStateChange();

} // Predicate

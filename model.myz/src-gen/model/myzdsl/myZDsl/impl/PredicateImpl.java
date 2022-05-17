/**
 * generated by Xtext 2.25.0
 */
package model.myzdsl.myZDsl.impl;

import java.util.Collection;

import model.myzdsl.myZDsl.MyZDslPackage;
import model.myzdsl.myZDsl.Predicate;
import model.myzdsl.myZDsl.PredicatePostCondition1;
import model.myzdsl.myZDsl.PredicatePostCondition2;
import model.myzdsl.myZDsl.Variables;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicateImpl#getVasInput <em>Vas Input</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicateImpl#getBelongs <em>Belongs</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicateImpl#getBelongsVariable <em>Belongs Variable</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicateImpl#getVasOutput <em>Vas Output</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicateImpl#getVasStateChange <em>Vas State Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateImpl extends MinimalEObjectImpl.Container implements Predicate
{
  /**
   * The cached value of the '{@link #getVasInput() <em>Vas Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVasInput()
   * @generated
   * @ordered
   */
  protected EList<Variables> vasInput;

  /**
   * The default value of the '{@link #getBelongs() <em>Belongs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelongs()
   * @generated
   * @ordered
   */
  protected static final String BELONGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBelongs() <em>Belongs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelongs()
   * @generated
   * @ordered
   */
  protected String belongs = BELONGS_EDEFAULT;

  /**
   * The cached value of the '{@link #getBelongsVariable() <em>Belongs Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelongsVariable()
   * @generated
   * @ordered
   */
  protected Variables belongsVariable;

  /**
   * The cached value of the '{@link #getVasOutput() <em>Vas Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVasOutput()
   * @generated
   * @ordered
   */
  protected EList<PredicatePostCondition2> vasOutput;

  /**
   * The cached value of the '{@link #getVasStateChange() <em>Vas State Change</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVasStateChange()
   * @generated
   * @ordered
   */
  protected EList<PredicatePostCondition1> vasStateChange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyZDslPackage.Literals.PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variables> getVasInput()
  {
    if (vasInput == null)
    {
      vasInput = new EObjectContainmentEList<Variables>(Variables.class, this, MyZDslPackage.PREDICATE__VAS_INPUT);
    }
    return vasInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBelongs()
  {
    return belongs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBelongs(String newBelongs)
  {
    String oldBelongs = belongs;
    belongs = newBelongs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE__BELONGS, oldBelongs, belongs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variables getBelongsVariable()
  {
    return belongsVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBelongsVariable(Variables newBelongsVariable, NotificationChain msgs)
  {
    Variables oldBelongsVariable = belongsVariable;
    belongsVariable = newBelongsVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE__BELONGS_VARIABLE, oldBelongsVariable, newBelongsVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBelongsVariable(Variables newBelongsVariable)
  {
    if (newBelongsVariable != belongsVariable)
    {
      NotificationChain msgs = null;
      if (belongsVariable != null)
        msgs = ((InternalEObject)belongsVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE__BELONGS_VARIABLE, null, msgs);
      if (newBelongsVariable != null)
        msgs = ((InternalEObject)newBelongsVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE__BELONGS_VARIABLE, null, msgs);
      msgs = basicSetBelongsVariable(newBelongsVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE__BELONGS_VARIABLE, newBelongsVariable, newBelongsVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PredicatePostCondition2> getVasOutput()
  {
    if (vasOutput == null)
    {
      vasOutput = new EObjectContainmentEList<PredicatePostCondition2>(PredicatePostCondition2.class, this, MyZDslPackage.PREDICATE__VAS_OUTPUT);
    }
    return vasOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PredicatePostCondition1> getVasStateChange()
  {
    if (vasStateChange == null)
    {
      vasStateChange = new EObjectContainmentEList<PredicatePostCondition1>(PredicatePostCondition1.class, this, MyZDslPackage.PREDICATE__VAS_STATE_CHANGE);
    }
    return vasStateChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyZDslPackage.PREDICATE__VAS_INPUT:
        return ((InternalEList<?>)getVasInput()).basicRemove(otherEnd, msgs);
      case MyZDslPackage.PREDICATE__BELONGS_VARIABLE:
        return basicSetBelongsVariable(null, msgs);
      case MyZDslPackage.PREDICATE__VAS_OUTPUT:
        return ((InternalEList<?>)getVasOutput()).basicRemove(otherEnd, msgs);
      case MyZDslPackage.PREDICATE__VAS_STATE_CHANGE:
        return ((InternalEList<?>)getVasStateChange()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyZDslPackage.PREDICATE__VAS_INPUT:
        return getVasInput();
      case MyZDslPackage.PREDICATE__BELONGS:
        return getBelongs();
      case MyZDslPackage.PREDICATE__BELONGS_VARIABLE:
        return getBelongsVariable();
      case MyZDslPackage.PREDICATE__VAS_OUTPUT:
        return getVasOutput();
      case MyZDslPackage.PREDICATE__VAS_STATE_CHANGE:
        return getVasStateChange();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyZDslPackage.PREDICATE__VAS_INPUT:
        getVasInput().clear();
        getVasInput().addAll((Collection<? extends Variables>)newValue);
        return;
      case MyZDslPackage.PREDICATE__BELONGS:
        setBelongs((String)newValue);
        return;
      case MyZDslPackage.PREDICATE__BELONGS_VARIABLE:
        setBelongsVariable((Variables)newValue);
        return;
      case MyZDslPackage.PREDICATE__VAS_OUTPUT:
        getVasOutput().clear();
        getVasOutput().addAll((Collection<? extends PredicatePostCondition2>)newValue);
        return;
      case MyZDslPackage.PREDICATE__VAS_STATE_CHANGE:
        getVasStateChange().clear();
        getVasStateChange().addAll((Collection<? extends PredicatePostCondition1>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyZDslPackage.PREDICATE__VAS_INPUT:
        getVasInput().clear();
        return;
      case MyZDslPackage.PREDICATE__BELONGS:
        setBelongs(BELONGS_EDEFAULT);
        return;
      case MyZDslPackage.PREDICATE__BELONGS_VARIABLE:
        setBelongsVariable((Variables)null);
        return;
      case MyZDslPackage.PREDICATE__VAS_OUTPUT:
        getVasOutput().clear();
        return;
      case MyZDslPackage.PREDICATE__VAS_STATE_CHANGE:
        getVasStateChange().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyZDslPackage.PREDICATE__VAS_INPUT:
        return vasInput != null && !vasInput.isEmpty();
      case MyZDslPackage.PREDICATE__BELONGS:
        return BELONGS_EDEFAULT == null ? belongs != null : !BELONGS_EDEFAULT.equals(belongs);
      case MyZDslPackage.PREDICATE__BELONGS_VARIABLE:
        return belongsVariable != null;
      case MyZDslPackage.PREDICATE__VAS_OUTPUT:
        return vasOutput != null && !vasOutput.isEmpty();
      case MyZDslPackage.PREDICATE__VAS_STATE_CHANGE:
        return vasStateChange != null && !vasStateChange.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (belongs: ");
    result.append(belongs);
    result.append(')');
    return result.toString();
  }

} //PredicateImpl

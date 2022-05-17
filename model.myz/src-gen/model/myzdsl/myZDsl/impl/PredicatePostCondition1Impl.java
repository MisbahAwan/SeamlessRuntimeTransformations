/**
 * generated by Xtext 2.25.0
 */
package model.myzdsl.myZDsl.impl;

import model.myzdsl.myZDsl.MyZDslPackage;
import model.myzdsl.myZDsl.PredicatePostCondition1;
import model.myzdsl.myZDsl.Variables;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Post Condition1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicatePostCondition1Impl#getCondition11 <em>Condition11</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicatePostCondition1Impl#getCondition12 <em>Condition12</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.PredicatePostCondition1Impl#getCondition13 <em>Condition13</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicatePostCondition1Impl extends MinimalEObjectImpl.Container implements PredicatePostCondition1
{
  /**
   * The cached value of the '{@link #getCondition11() <em>Condition11</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition11()
   * @generated
   * @ordered
   */
  protected Variables condition11;

  /**
   * The cached value of the '{@link #getCondition12() <em>Condition12</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition12()
   * @generated
   * @ordered
   */
  protected Variables condition12;

  /**
   * The cached value of the '{@link #getCondition13() <em>Condition13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition13()
   * @generated
   * @ordered
   */
  protected Variables condition13;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicatePostCondition1Impl()
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
    return MyZDslPackage.Literals.PREDICATE_POST_CONDITION1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variables getCondition11()
  {
    return condition11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition11(Variables newCondition11, NotificationChain msgs)
  {
    Variables oldCondition11 = condition11;
    condition11 = newCondition11;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11, oldCondition11, newCondition11);
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
  public void setCondition11(Variables newCondition11)
  {
    if (newCondition11 != condition11)
    {
      NotificationChain msgs = null;
      if (condition11 != null)
        msgs = ((InternalEObject)condition11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11, null, msgs);
      if (newCondition11 != null)
        msgs = ((InternalEObject)newCondition11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11, null, msgs);
      msgs = basicSetCondition11(newCondition11, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11, newCondition11, newCondition11));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variables getCondition12()
  {
    return condition12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition12(Variables newCondition12, NotificationChain msgs)
  {
    Variables oldCondition12 = condition12;
    condition12 = newCondition12;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12, oldCondition12, newCondition12);
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
  public void setCondition12(Variables newCondition12)
  {
    if (newCondition12 != condition12)
    {
      NotificationChain msgs = null;
      if (condition12 != null)
        msgs = ((InternalEObject)condition12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12, null, msgs);
      if (newCondition12 != null)
        msgs = ((InternalEObject)newCondition12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12, null, msgs);
      msgs = basicSetCondition12(newCondition12, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12, newCondition12, newCondition12));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variables getCondition13()
  {
    return condition13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition13(Variables newCondition13, NotificationChain msgs)
  {
    Variables oldCondition13 = condition13;
    condition13 = newCondition13;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13, oldCondition13, newCondition13);
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
  public void setCondition13(Variables newCondition13)
  {
    if (newCondition13 != condition13)
    {
      NotificationChain msgs = null;
      if (condition13 != null)
        msgs = ((InternalEObject)condition13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13, null, msgs);
      if (newCondition13 != null)
        msgs = ((InternalEObject)newCondition13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13, null, msgs);
      msgs = basicSetCondition13(newCondition13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13, newCondition13, newCondition13));
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
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11:
        return basicSetCondition11(null, msgs);
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12:
        return basicSetCondition12(null, msgs);
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13:
        return basicSetCondition13(null, msgs);
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
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11:
        return getCondition11();
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12:
        return getCondition12();
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13:
        return getCondition13();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11:
        setCondition11((Variables)newValue);
        return;
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12:
        setCondition12((Variables)newValue);
        return;
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13:
        setCondition13((Variables)newValue);
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
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11:
        setCondition11((Variables)null);
        return;
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12:
        setCondition12((Variables)null);
        return;
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13:
        setCondition13((Variables)null);
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
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION11:
        return condition11 != null;
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION12:
        return condition12 != null;
      case MyZDslPackage.PREDICATE_POST_CONDITION1__CONDITION13:
        return condition13 != null;
    }
    return super.eIsSet(featureID);
  }

} //PredicatePostCondition1Impl
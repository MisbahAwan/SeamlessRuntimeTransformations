/**
 * generated by Xtext 2.25.0
 */
package model.myzdsl.myZDsl.impl;

import java.util.Collection;

import model.myzdsl.myZDsl.InitialState;
import model.myzdsl.myZDsl.MyZDslPackage;
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
 * An implementation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.myzdsl.myZDsl.impl.InitialStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.InitialStateImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link model.myzdsl.myZDsl.impl.InitialStateImpl#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialStateImpl extends MinimalEObjectImpl.Container implements InitialState
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variables> variables;

  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected EList<Variables> pred;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialStateImpl()
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
    return MyZDslPackage.Literals.INITIAL_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyZDslPackage.INITIAL_STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variables> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variables>(Variables.class, this, MyZDslPackage.INITIAL_STATE__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variables> getPred()
  {
    if (pred == null)
    {
      pred = new EObjectContainmentEList<Variables>(Variables.class, this, MyZDslPackage.INITIAL_STATE__PRED);
    }
    return pred;
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
      case MyZDslPackage.INITIAL_STATE__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case MyZDslPackage.INITIAL_STATE__PRED:
        return ((InternalEList<?>)getPred()).basicRemove(otherEnd, msgs);
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
      case MyZDslPackage.INITIAL_STATE__NAME:
        return getName();
      case MyZDslPackage.INITIAL_STATE__VARIABLES:
        return getVariables();
      case MyZDslPackage.INITIAL_STATE__PRED:
        return getPred();
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
      case MyZDslPackage.INITIAL_STATE__NAME:
        setName((String)newValue);
        return;
      case MyZDslPackage.INITIAL_STATE__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variables>)newValue);
        return;
      case MyZDslPackage.INITIAL_STATE__PRED:
        getPred().clear();
        getPred().addAll((Collection<? extends Variables>)newValue);
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
      case MyZDslPackage.INITIAL_STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyZDslPackage.INITIAL_STATE__VARIABLES:
        getVariables().clear();
        return;
      case MyZDslPackage.INITIAL_STATE__PRED:
        getPred().clear();
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
      case MyZDslPackage.INITIAL_STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyZDslPackage.INITIAL_STATE__VARIABLES:
        return variables != null && !variables.isEmpty();
      case MyZDslPackage.INITIAL_STATE__PRED:
        return pred != null && !pred.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InitialStateImpl

/**
 * generated by Xtext 2.25.0
 */
package model.myzdsl.myZDsl.impl;

import model.myzdsl.myZDsl.InitialState;
import model.myzdsl.myZDsl.MyZDslFactory;
import model.myzdsl.myZDsl.MyZDslPackage;
import model.myzdsl.myZDsl.MyZModel;
import model.myzdsl.myZDsl.Predicate;
import model.myzdsl.myZDsl.PredicatePostCondition1;
import model.myzdsl.myZDsl.PredicatePostCondition2;
import model.myzdsl.myZDsl.Schema;
import model.myzdsl.myZDsl.SystemStateSpace;
import model.myzdsl.myZDsl.SystemStateSpacePredicate;
import model.myzdsl.myZDsl.Variables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyZDslPackageImpl extends EPackageImpl implements MyZDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myZModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemStateSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemStateSpacePredicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicatePostCondition1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicatePostCondition2EClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see model.myzdsl.myZDsl.MyZDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyZDslPackageImpl()
  {
    super(eNS_URI, MyZDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MyZDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyZDslPackage init()
  {
    if (isInited) return (MyZDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyZDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMyZDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MyZDslPackageImpl theMyZDslPackage = registeredMyZDslPackage instanceof MyZDslPackageImpl ? (MyZDslPackageImpl)registeredMyZDslPackage : new MyZDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMyZDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyZDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyZDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyZDslPackage.eNS_URI, theMyZDslPackage);
    return theMyZDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMyZModel()
  {
    return myZModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMyZModel_Systemstatespace()
  {
    return (EReference)myZModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMyZModel_Initialstate()
  {
    return (EReference)myZModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMyZModel_Schemas()
  {
    return (EReference)myZModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSystemStateSpace()
  {
    return systemStateSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSystemStateSpace_Name()
  {
    return (EAttribute)systemStateSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemStateSpace_Variables()
  {
    return (EReference)systemStateSpaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemStateSpace_Predicate()
  {
    return (EReference)systemStateSpaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSystemStateSpacePredicate()
  {
    return systemStateSpacePredicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemStateSpacePredicate_Vas()
  {
    return (EReference)systemStateSpacePredicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSystemStateSpacePredicate_Function()
  {
    return (EAttribute)systemStateSpacePredicateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemStateSpacePredicate_PredicateVar()
  {
    return (EReference)systemStateSpacePredicateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitialState()
  {
    return initialStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInitialState_Name()
  {
    return (EAttribute)initialStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialState_Variables()
  {
    return (EReference)initialStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialState_Pred()
  {
    return (EReference)initialStateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSchema()
  {
    return schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSchema_Name()
  {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSchema_State()
  {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSchema_NameSchema()
  {
    return (EAttribute)schemaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSchema_VarsInput()
  {
    return (EReference)schemaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSchema_VarsOutput()
  {
    return (EReference)schemaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSchema_Predicates()
  {
    return (EReference)schemaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPredicate()
  {
    return predicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicate_VasInput()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPredicate_Belongs()
  {
    return (EAttribute)predicateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicate_BelongsVariable()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicate_VasOutput()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicate_VasStateChange()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariables()
  {
    return variablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariables_Name()
  {
    return (EAttribute)variablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPredicatePostCondition1()
  {
    return predicatePostCondition1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicatePostCondition1_Condition11()
  {
    return (EReference)predicatePostCondition1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicatePostCondition1_Condition12()
  {
    return (EReference)predicatePostCondition1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicatePostCondition1_Condition13()
  {
    return (EReference)predicatePostCondition1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPredicatePostCondition2()
  {
    return predicatePostCondition2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicatePostCondition2_Condition21()
  {
    return (EReference)predicatePostCondition2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicatePostCondition2_Condition22()
  {
    return (EReference)predicatePostCondition2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPredicatePostCondition2_Condition23()
  {
    return (EReference)predicatePostCondition2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyZDslFactory getMyZDslFactory()
  {
    return (MyZDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    myZModelEClass = createEClass(MY_ZMODEL);
    createEReference(myZModelEClass, MY_ZMODEL__SYSTEMSTATESPACE);
    createEReference(myZModelEClass, MY_ZMODEL__INITIALSTATE);
    createEReference(myZModelEClass, MY_ZMODEL__SCHEMAS);

    systemStateSpaceEClass = createEClass(SYSTEM_STATE_SPACE);
    createEAttribute(systemStateSpaceEClass, SYSTEM_STATE_SPACE__NAME);
    createEReference(systemStateSpaceEClass, SYSTEM_STATE_SPACE__VARIABLES);
    createEReference(systemStateSpaceEClass, SYSTEM_STATE_SPACE__PREDICATE);

    systemStateSpacePredicateEClass = createEClass(SYSTEM_STATE_SPACE_PREDICATE);
    createEReference(systemStateSpacePredicateEClass, SYSTEM_STATE_SPACE_PREDICATE__VAS);
    createEAttribute(systemStateSpacePredicateEClass, SYSTEM_STATE_SPACE_PREDICATE__FUNCTION);
    createEReference(systemStateSpacePredicateEClass, SYSTEM_STATE_SPACE_PREDICATE__PREDICATE_VAR);

    initialStateEClass = createEClass(INITIAL_STATE);
    createEAttribute(initialStateEClass, INITIAL_STATE__NAME);
    createEReference(initialStateEClass, INITIAL_STATE__VARIABLES);
    createEReference(initialStateEClass, INITIAL_STATE__PRED);

    schemaEClass = createEClass(SCHEMA);
    createEAttribute(schemaEClass, SCHEMA__NAME);
    createEAttribute(schemaEClass, SCHEMA__STATE);
    createEAttribute(schemaEClass, SCHEMA__NAME_SCHEMA);
    createEReference(schemaEClass, SCHEMA__VARS_INPUT);
    createEReference(schemaEClass, SCHEMA__VARS_OUTPUT);
    createEReference(schemaEClass, SCHEMA__PREDICATES);

    predicateEClass = createEClass(PREDICATE);
    createEReference(predicateEClass, PREDICATE__VAS_INPUT);
    createEAttribute(predicateEClass, PREDICATE__BELONGS);
    createEReference(predicateEClass, PREDICATE__BELONGS_VARIABLE);
    createEReference(predicateEClass, PREDICATE__VAS_OUTPUT);
    createEReference(predicateEClass, PREDICATE__VAS_STATE_CHANGE);

    variablesEClass = createEClass(VARIABLES);
    createEAttribute(variablesEClass, VARIABLES__NAME);

    predicatePostCondition1EClass = createEClass(PREDICATE_POST_CONDITION1);
    createEReference(predicatePostCondition1EClass, PREDICATE_POST_CONDITION1__CONDITION11);
    createEReference(predicatePostCondition1EClass, PREDICATE_POST_CONDITION1__CONDITION12);
    createEReference(predicatePostCondition1EClass, PREDICATE_POST_CONDITION1__CONDITION13);

    predicatePostCondition2EClass = createEClass(PREDICATE_POST_CONDITION2);
    createEReference(predicatePostCondition2EClass, PREDICATE_POST_CONDITION2__CONDITION21);
    createEReference(predicatePostCondition2EClass, PREDICATE_POST_CONDITION2__CONDITION22);
    createEReference(predicatePostCondition2EClass, PREDICATE_POST_CONDITION2__CONDITION23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(myZModelEClass, MyZModel.class, "MyZModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMyZModel_Systemstatespace(), this.getSystemStateSpace(), null, "systemstatespace", null, 0, -1, MyZModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyZModel_Initialstate(), this.getInitialState(), null, "initialstate", null, 0, -1, MyZModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyZModel_Schemas(), this.getSchema(), null, "schemas", null, 0, -1, MyZModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemStateSpaceEClass, SystemStateSpace.class, "SystemStateSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemStateSpace_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemStateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemStateSpace_Variables(), this.getVariables(), null, "variables", null, 0, -1, SystemStateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemStateSpace_Predicate(), this.getSystemStateSpacePredicate(), null, "predicate", null, 0, -1, SystemStateSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemStateSpacePredicateEClass, SystemStateSpacePredicate.class, "SystemStateSpacePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemStateSpacePredicate_Vas(), this.getVariables(), null, "vas", null, 0, -1, SystemStateSpacePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemStateSpacePredicate_Function(), ecorePackage.getEString(), "function", null, 0, 1, SystemStateSpacePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemStateSpacePredicate_PredicateVar(), this.getVariables(), null, "predicateVar", null, 0, 1, SystemStateSpacePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitialState_Name(), ecorePackage.getEString(), "name", null, 0, 1, InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialState_Variables(), this.getVariables(), null, "variables", null, 0, -1, InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialState_Pred(), this.getVariables(), null, "pred", null, 0, -1, InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchema_State(), ecorePackage.getEString(), "state", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchema_NameSchema(), ecorePackage.getEString(), "nameSchema", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchema_VarsInput(), this.getVariables(), null, "varsInput", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchema_VarsOutput(), this.getVariables(), null, "varsOutput", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchema_Predicates(), this.getPredicate(), null, "predicates", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicate_VasInput(), this.getVariables(), null, "vasInput", null, 0, -1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPredicate_Belongs(), ecorePackage.getEString(), "belongs", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicate_BelongsVariable(), this.getVariables(), null, "belongsVariable", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicate_VasOutput(), this.getPredicatePostCondition2(), null, "vasOutput", null, 0, -1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicate_VasStateChange(), this.getPredicatePostCondition1(), null, "vasStateChange", null, 0, -1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablesEClass, Variables.class, "Variables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariables_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicatePostCondition1EClass, PredicatePostCondition1.class, "PredicatePostCondition1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicatePostCondition1_Condition11(), this.getVariables(), null, "condition11", null, 0, 1, PredicatePostCondition1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicatePostCondition1_Condition12(), this.getVariables(), null, "condition12", null, 0, 1, PredicatePostCondition1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicatePostCondition1_Condition13(), this.getVariables(), null, "condition13", null, 0, 1, PredicatePostCondition1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicatePostCondition2EClass, PredicatePostCondition2.class, "PredicatePostCondition2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPredicatePostCondition2_Condition21(), this.getVariables(), null, "condition21", null, 0, 1, PredicatePostCondition2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicatePostCondition2_Condition22(), this.getVariables(), null, "condition22", null, 0, 1, PredicatePostCondition2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicatePostCondition2_Condition23(), this.getVariables(), null, "condition23", null, 0, 1, PredicatePostCondition2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyZDslPackageImpl

/**
 * generated by Xtext 2.26.0
 */
package security.xtext.bmpn.simple.bPSecDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.xtext.bmpn.simple.bPSecDsl.Policy#getName <em>Name</em>}</li>
 *   <li>{@link security.xtext.bmpn.simple.bPSecDsl.Policy#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see security.xtext.bmpn.simple.bPSecDsl.BPSecDslPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see security.xtext.bmpn.simple.bPSecDsl.BPSecDslPackage#getPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link security.xtext.bmpn.simple.bPSecDsl.Policy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link security.xtext.bmpn.simple.bPSecDsl.Declaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see security.xtext.bmpn.simple.bPSecDsl.BPSecDslPackage#getPolicy_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // Policy

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.tests;

import CWM.Core.tests.ClassTest;

import CWM.MiningCore.MiningData.AttributeUsageSet;
import CWM.MiningCore.MiningData.MiningDataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Usage Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeUsageSetTest extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeUsageSetTest.class);
	}

	/**
	 * Constructs a new Attribute Usage Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeUsageSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Usage Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeUsageSet getFixture() {
		return (AttributeUsageSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningDataFactory.eINSTANCE.createAttributeUsageSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AttributeUsageSetTest

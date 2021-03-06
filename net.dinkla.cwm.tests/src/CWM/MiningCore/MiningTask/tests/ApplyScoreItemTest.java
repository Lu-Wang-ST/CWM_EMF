/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.tests;

import CWM.MiningCore.MiningTask.ApplyScoreItem;
import CWM.MiningCore.MiningTask.MiningTaskFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Apply Score Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplyScoreItemTest extends ApplyContentItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplyScoreItemTest.class);
	}

	/**
	 * Constructs a new Apply Score Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyScoreItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Apply Score Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApplyScoreItem getFixture() {
		return (ApplyScoreItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningTaskFactory.eINSTANCE.createApplyScoreItem());
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

} //ApplyScoreItemTest

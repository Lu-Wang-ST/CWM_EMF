/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes.impl;

import CWM.Core.StructuralFeature;

import CWM.Core.impl.ModelElementImpl;

import CWM.KeysIndexes.KeyRelationship;
import CWM.KeysIndexes.KeysIndexesPackage;
import CWM.KeysIndexes.UniqueKey;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.impl.KeyRelationshipImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.KeyRelationshipImpl#getUniqueKey <em>Unique Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyRelationshipImpl extends ModelElementImpl implements KeyRelationship {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralFeature> feature;

	/**
	 * The cached value of the '{@link #getUniqueKey() <em>Unique Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueKey()
	 * @generated
	 * @ordered
	 */
	protected UniqueKey uniqueKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KeysIndexesPackage.Literals.KEY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> getFeature() {
		if (feature == null) {
			feature = new EObjectResolvingEList<StructuralFeature>(StructuralFeature.class, this, KeysIndexesPackage.KEY_RELATIONSHIP__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueKey getUniqueKey() {
		if (uniqueKey != null && uniqueKey.eIsProxy()) {
			InternalEObject oldUniqueKey = (InternalEObject)uniqueKey;
			uniqueKey = (UniqueKey)eResolveProxy(oldUniqueKey);
			if (uniqueKey != oldUniqueKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY, oldUniqueKey, uniqueKey));
			}
		}
		return uniqueKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueKey basicGetUniqueKey() {
		return uniqueKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniqueKey(UniqueKey newUniqueKey, NotificationChain msgs) {
		UniqueKey oldUniqueKey = uniqueKey;
		uniqueKey = newUniqueKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY, oldUniqueKey, newUniqueKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueKey(UniqueKey newUniqueKey) {
		if (newUniqueKey != uniqueKey) {
			NotificationChain msgs = null;
			if (uniqueKey != null)
				msgs = ((InternalEObject)uniqueKey).eInverseRemove(this, KeysIndexesPackage.UNIQUE_KEY__KEY_RELATIONSHIP, UniqueKey.class, msgs);
			if (newUniqueKey != null)
				msgs = ((InternalEObject)newUniqueKey).eInverseAdd(this, KeysIndexesPackage.UNIQUE_KEY__KEY_RELATIONSHIP, UniqueKey.class, msgs);
			msgs = basicSetUniqueKey(newUniqueKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY, newUniqueKey, newUniqueKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY:
				if (uniqueKey != null)
					msgs = ((InternalEObject)uniqueKey).eInverseRemove(this, KeysIndexesPackage.UNIQUE_KEY__KEY_RELATIONSHIP, UniqueKey.class, msgs);
				return basicSetUniqueKey((UniqueKey)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY:
				return basicSetUniqueKey(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KeysIndexesPackage.KEY_RELATIONSHIP__FEATURE:
				return getFeature();
			case KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY:
				if (resolve) return getUniqueKey();
				return basicGetUniqueKey();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KeysIndexesPackage.KEY_RELATIONSHIP__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends StructuralFeature>)newValue);
				return;
			case KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY:
				setUniqueKey((UniqueKey)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case KeysIndexesPackage.KEY_RELATIONSHIP__FEATURE:
				getFeature().clear();
				return;
			case KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY:
				setUniqueKey((UniqueKey)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KeysIndexesPackage.KEY_RELATIONSHIP__FEATURE:
				return feature != null && !feature.isEmpty();
			case KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY:
				return uniqueKey != null;
		}
		return super.eIsSet(featureID);
	}

} //KeyRelationshipImpl

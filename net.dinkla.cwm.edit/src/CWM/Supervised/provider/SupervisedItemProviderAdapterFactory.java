/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.provider;

import CWM.Supervised.util.SupervisedAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SupervisedItemProviderAdapterFactory extends SupervisedAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisedItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.Supervised.LiftAnalysisPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiftAnalysisPointItemProvider liftAnalysisPointItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.Supervised.LiftAnalysisPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiftAnalysisPointAdapter() {
		if (liftAnalysisPointItemProvider == null) {
			liftAnalysisPointItemProvider = new LiftAnalysisPointItemProvider(this);
		}

		return liftAnalysisPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.Supervised.LiftAnalysis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiftAnalysisItemProvider liftAnalysisItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.Supervised.LiftAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiftAnalysisAdapter() {
		if (liftAnalysisItemProvider == null) {
			liftAnalysisItemProvider = new LiftAnalysisItemProvider(this);
		}

		return liftAnalysisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.Supervised.MiningTestTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTestTaskItemProvider miningTestTaskItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.Supervised.MiningTestTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiningTestTaskAdapter() {
		if (miningTestTaskItemProvider == null) {
			miningTestTaskItemProvider = new MiningTestTaskItemProvider(this);
		}

		return miningTestTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.Supervised.SupervisedFunctionSettings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupervisedFunctionSettingsItemProvider supervisedFunctionSettingsItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.Supervised.SupervisedFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSupervisedFunctionSettingsAdapter() {
		if (supervisedFunctionSettingsItemProvider == null) {
			supervisedFunctionSettingsItemProvider = new SupervisedFunctionSettingsItemProvider(this);
		}

		return supervisedFunctionSettingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.Supervised.MiningTestResult} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTestResultItemProvider miningTestResultItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.Supervised.MiningTestResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiningTestResultAdapter() {
		if (miningTestResultItemProvider == null) {
			miningTestResultItemProvider = new MiningTestResultItemProvider(this);
		}

		return miningTestResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CWM.Supervised.Supervised_container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Supervised_containerItemProvider supervised_containerItemProvider;

	/**
	 * This creates an adapter for a {@link CWM.Supervised.Supervised_container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSupervised_containerAdapter() {
		if (supervised_containerItemProvider == null) {
			supervised_containerItemProvider = new Supervised_containerItemProvider(this);
		}

		return supervised_containerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (liftAnalysisPointItemProvider != null) liftAnalysisPointItemProvider.dispose();
		if (liftAnalysisItemProvider != null) liftAnalysisItemProvider.dispose();
		if (miningTestTaskItemProvider != null) miningTestTaskItemProvider.dispose();
		if (supervisedFunctionSettingsItemProvider != null) supervisedFunctionSettingsItemProvider.dispose();
		if (miningTestResultItemProvider != null) miningTestResultItemProvider.dispose();
		if (supervised_containerItemProvider != null) supervised_containerItemProvider.dispose();
	}

}

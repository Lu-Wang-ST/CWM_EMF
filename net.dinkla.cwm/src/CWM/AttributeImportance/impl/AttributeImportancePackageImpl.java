/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance.impl;

import CWM.Approximation.ApproximationPackage;

import CWM.Approximation.impl.ApproximationPackageImpl;

import CWM.AssociationRules.AssociationRulesPackage;

import CWM.AssociationRules.impl.AssociationRulesPackageImpl;

import CWM.AttributeImportance.AttributeImportanceFactory;
import CWM.AttributeImportance.AttributeImportancePackage;
import CWM.AttributeImportance.AttributeImportanceSettings;
import CWM.AttributeImportance.AttributeImportance_container;

import CWM.Behavioral.BehavioralPackage;

import CWM.Behavioral.impl.BehavioralPackageImpl;

import CWM.BusinessInformation.BusinessInformationPackage;

import CWM.BusinessInformation.impl.BusinessInformationPackageImpl;

import CWM.BusinessNomenclature.BusinessNomenclaturePackage;

import CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl;

import CWM.CWMComplete.CWMCompletePackage;

import CWM.CWMComplete.impl.CWMCompletePackageImpl;

import CWM.CWMPackage;

import CWM.Classification.ClassificationPackage;

import CWM.Classification.impl.ClassificationPackageImpl;

import CWM.Clustering.ClusteringPackage;

import CWM.Clustering.impl.ClusteringPackageImpl;

import CWM.Core.CorePackage;

import CWM.Core.impl.CorePackageImpl;

import CWM.CwmInstance.CwmInstancePackage;

import CWM.CwmInstance.impl.CwmInstancePackageImpl;

import CWM.CwmTransformation.CwmTransformationPackage;

import CWM.CwmTransformation.impl.CwmTransformationPackageImpl;

import CWM.CwmXml.CwmXmlPackage;

import CWM.CwmXml.impl.CwmXmlPackageImpl;

import CWM.DataTypes.DataTypesPackage;

import CWM.DataTypes.impl.DataTypesPackageImpl;

import CWM.Expressions.ExpressionsPackage;

import CWM.Expressions.impl.ExpressionsPackageImpl;

import CWM.InformationVisualization.InformationVisualizationPackage;

import CWM.InformationVisualization.impl.InformationVisualizationPackageImpl;

import CWM.KeysIndexes.KeysIndexesPackage;

import CWM.KeysIndexes.impl.KeysIndexesPackageImpl;

import CWM.MiningCore.EntryPoint.EntryPointPackage;

import CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl;

import CWM.MiningCore.MiningCorePackage;

import CWM.MiningCore.MiningData.MiningDataPackage;

import CWM.MiningCore.MiningData.impl.MiningDataPackageImpl;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage;

import CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl;

import CWM.MiningCore.MiningModel.MiningModelPackage;

import CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl;

import CWM.MiningCore.MiningResult.MiningResultPackage;

import CWM.MiningCore.MiningResult.impl.MiningResultPackageImpl;

import CWM.MiningCore.MiningTask.MiningTaskPackage;

import CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl;

import CWM.MiningCore.impl.MiningCorePackageImpl;

import CWM.Multidimensional.MultidimensionalPackage;

import CWM.Multidimensional.impl.MultidimensionalPackageImpl;

import CWM.Olap.OlapPackage;

import CWM.Olap.impl.OlapPackageImpl;

import CWM.Record.RecordPackage;

import CWM.Record.impl.RecordPackageImpl;

import CWM.Relational.Enumerations.EnumerationsPackage;

import CWM.Relational.Enumerations.impl.EnumerationsPackageImpl;

import CWM.Relational.RelationalPackage;

import CWM.Relational.impl.RelationalPackageImpl;

import CWM.Relationships.RelationshipsPackage;

import CWM.Relationships.impl.RelationshipsPackageImpl;

import CWM.SoftwareDeployment.SoftwareDeploymentPackage;

import CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl;

import CWM.Supervised.SupervisedPackage;

import CWM.Supervised.impl.SupervisedPackageImpl;

import CWM.TypeMapping.TypeMappingPackage;

import CWM.TypeMapping.impl.TypeMappingPackageImpl;

import CWM.WarehouseOperation.WarehouseOperationPackage;

import CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl;

import CWM.WarehouseProcess.DataType.DataTypePackage;

import CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl;

import CWM.WarehouseProcess.Events.EventsPackage;

import CWM.WarehouseProcess.Events.impl.EventsPackageImpl;

import CWM.WarehouseProcess.WarehouseProcessPackage;

import CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl;

import CWM.impl.CWMPackageImpl;

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
public class AttributeImportancePackageImpl extends EPackageImpl implements AttributeImportancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeImportanceSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeImportance_containerEClass = null;

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
	 * @see CWM.AttributeImportance.AttributeImportancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AttributeImportancePackageImpl() {
		super(eNS_URI, AttributeImportanceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AttributeImportancePackage init() {
		if (isInited) return (AttributeImportancePackage)EPackage.Registry.INSTANCE.getEPackage(AttributeImportancePackage.eNS_URI);

		// Obtain or create and register package
		AttributeImportancePackageImpl theAttributeImportancePackage = (AttributeImportancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AttributeImportancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AttributeImportancePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CWMPackageImpl theCWMPackage = (CWMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CWMPackage.eNS_URI) instanceof CWMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CWMPackage.eNS_URI) : CWMPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		BehavioralPackageImpl theBehavioralPackage = (BehavioralPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehavioralPackage.eNS_URI) instanceof BehavioralPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehavioralPackage.eNS_URI) : BehavioralPackage.eINSTANCE);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI) instanceof RelationshipsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI) : RelationshipsPackage.eINSTANCE);
		CwmInstancePackageImpl theCwmInstancePackage = (CwmInstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CwmInstancePackage.eNS_URI) instanceof CwmInstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CwmInstancePackage.eNS_URI) : CwmInstancePackage.eINSTANCE);
		BusinessInformationPackageImpl theBusinessInformationPackage = (BusinessInformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessInformationPackage.eNS_URI) instanceof BusinessInformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessInformationPackage.eNS_URI) : BusinessInformationPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		KeysIndexesPackageImpl theKeysIndexesPackage = (KeysIndexesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KeysIndexesPackage.eNS_URI) instanceof KeysIndexesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KeysIndexesPackage.eNS_URI) : KeysIndexesPackage.eINSTANCE);
		SoftwareDeploymentPackageImpl theSoftwareDeploymentPackage = (SoftwareDeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareDeploymentPackage.eNS_URI) instanceof SoftwareDeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareDeploymentPackage.eNS_URI) : SoftwareDeploymentPackage.eINSTANCE);
		TypeMappingPackageImpl theTypeMappingPackage = (TypeMappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypeMappingPackage.eNS_URI) instanceof TypeMappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypeMappingPackage.eNS_URI) : TypeMappingPackage.eINSTANCE);
		RelationalPackageImpl theRelationalPackage = (RelationalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI) instanceof RelationalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI) : RelationalPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);
		RecordPackageImpl theRecordPackage = (RecordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI) instanceof RecordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI) : RecordPackage.eINSTANCE);
		MultidimensionalPackageImpl theMultidimensionalPackage = (MultidimensionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultidimensionalPackage.eNS_URI) instanceof MultidimensionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultidimensionalPackage.eNS_URI) : MultidimensionalPackage.eINSTANCE);
		CwmXmlPackageImpl theCwmXmlPackage = (CwmXmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CwmXmlPackage.eNS_URI) instanceof CwmXmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CwmXmlPackage.eNS_URI) : CwmXmlPackage.eINSTANCE);
		CwmTransformationPackageImpl theCwmTransformationPackage = (CwmTransformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CwmTransformationPackage.eNS_URI) instanceof CwmTransformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CwmTransformationPackage.eNS_URI) : CwmTransformationPackage.eINSTANCE);
		OlapPackageImpl theOlapPackage = (OlapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI) instanceof OlapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI) : OlapPackage.eINSTANCE);
		MiningCorePackageImpl theMiningCorePackage = (MiningCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningCorePackage.eNS_URI) instanceof MiningCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningCorePackage.eNS_URI) : MiningCorePackage.eINSTANCE);
		MiningDataPackageImpl theMiningDataPackage = (MiningDataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningDataPackage.eNS_URI) instanceof MiningDataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningDataPackage.eNS_URI) : MiningDataPackage.eINSTANCE);
		MiningFunctionSettingsPackageImpl theMiningFunctionSettingsPackage = (MiningFunctionSettingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningFunctionSettingsPackage.eNS_URI) instanceof MiningFunctionSettingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningFunctionSettingsPackage.eNS_URI) : MiningFunctionSettingsPackage.eINSTANCE);
		MiningModelPackageImpl theMiningModelPackage = (MiningModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningModelPackage.eNS_URI) instanceof MiningModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningModelPackage.eNS_URI) : MiningModelPackage.eINSTANCE);
		MiningResultPackageImpl theMiningResultPackage = (MiningResultPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningResultPackage.eNS_URI) instanceof MiningResultPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningResultPackage.eNS_URI) : MiningResultPackage.eINSTANCE);
		MiningTaskPackageImpl theMiningTaskPackage = (MiningTaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningTaskPackage.eNS_URI) instanceof MiningTaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningTaskPackage.eNS_URI) : MiningTaskPackage.eINSTANCE);
		EntryPointPackageImpl theEntryPointPackage = (EntryPointPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntryPointPackage.eNS_URI) instanceof EntryPointPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntryPointPackage.eNS_URI) : EntryPointPackage.eINSTANCE);
		ClusteringPackageImpl theClusteringPackage = (ClusteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClusteringPackage.eNS_URI) instanceof ClusteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClusteringPackage.eNS_URI) : ClusteringPackage.eINSTANCE);
		AssociationRulesPackageImpl theAssociationRulesPackage = (AssociationRulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssociationRulesPackage.eNS_URI) instanceof AssociationRulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssociationRulesPackage.eNS_URI) : AssociationRulesPackage.eINSTANCE);
		SupervisedPackageImpl theSupervisedPackage = (SupervisedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SupervisedPackage.eNS_URI) instanceof SupervisedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SupervisedPackage.eNS_URI) : SupervisedPackage.eINSTANCE);
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) : ClassificationPackage.eINSTANCE);
		ApproximationPackageImpl theApproximationPackage = (ApproximationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApproximationPackage.eNS_URI) instanceof ApproximationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApproximationPackage.eNS_URI) : ApproximationPackage.eINSTANCE);
		InformationVisualizationPackageImpl theInformationVisualizationPackage = (InformationVisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationVisualizationPackage.eNS_URI) instanceof InformationVisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationVisualizationPackage.eNS_URI) : InformationVisualizationPackage.eINSTANCE);
		BusinessNomenclaturePackageImpl theBusinessNomenclaturePackage = (BusinessNomenclaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessNomenclaturePackage.eNS_URI) instanceof BusinessNomenclaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessNomenclaturePackage.eNS_URI) : BusinessNomenclaturePackage.eINSTANCE);
		WarehouseProcessPackageImpl theWarehouseProcessPackage = (WarehouseProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WarehouseProcessPackage.eNS_URI) instanceof WarehouseProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WarehouseProcessPackage.eNS_URI) : WarehouseProcessPackage.eINSTANCE);
		DataTypePackageImpl theDataTypePackage = (DataTypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypePackage.eNS_URI) instanceof DataTypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypePackage.eNS_URI) : DataTypePackage.eINSTANCE);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
		WarehouseOperationPackageImpl theWarehouseOperationPackage = (WarehouseOperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WarehouseOperationPackage.eNS_URI) instanceof WarehouseOperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WarehouseOperationPackage.eNS_URI) : WarehouseOperationPackage.eINSTANCE);
		CWMCompletePackageImpl theCWMCompletePackage = (CWMCompletePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CWMCompletePackage.eNS_URI) instanceof CWMCompletePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CWMCompletePackage.eNS_URI) : CWMCompletePackage.eINSTANCE);

		// Create package meta-data objects
		theAttributeImportancePackage.createPackageContents();
		theCWMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theBehavioralPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();
		theCwmInstancePackage.createPackageContents();
		theBusinessInformationPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theKeysIndexesPackage.createPackageContents();
		theSoftwareDeploymentPackage.createPackageContents();
		theTypeMappingPackage.createPackageContents();
		theRelationalPackage.createPackageContents();
		theEnumerationsPackage.createPackageContents();
		theRecordPackage.createPackageContents();
		theMultidimensionalPackage.createPackageContents();
		theCwmXmlPackage.createPackageContents();
		theCwmTransformationPackage.createPackageContents();
		theOlapPackage.createPackageContents();
		theMiningCorePackage.createPackageContents();
		theMiningDataPackage.createPackageContents();
		theMiningFunctionSettingsPackage.createPackageContents();
		theMiningModelPackage.createPackageContents();
		theMiningResultPackage.createPackageContents();
		theMiningTaskPackage.createPackageContents();
		theEntryPointPackage.createPackageContents();
		theClusteringPackage.createPackageContents();
		theAssociationRulesPackage.createPackageContents();
		theSupervisedPackage.createPackageContents();
		theClassificationPackage.createPackageContents();
		theApproximationPackage.createPackageContents();
		theInformationVisualizationPackage.createPackageContents();
		theBusinessNomenclaturePackage.createPackageContents();
		theWarehouseProcessPackage.createPackageContents();
		theDataTypePackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theWarehouseOperationPackage.createPackageContents();
		theCWMCompletePackage.createPackageContents();

		// Initialize created meta-data
		theAttributeImportancePackage.initializePackageContents();
		theCWMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theBehavioralPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();
		theCwmInstancePackage.initializePackageContents();
		theBusinessInformationPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theKeysIndexesPackage.initializePackageContents();
		theSoftwareDeploymentPackage.initializePackageContents();
		theTypeMappingPackage.initializePackageContents();
		theRelationalPackage.initializePackageContents();
		theEnumerationsPackage.initializePackageContents();
		theRecordPackage.initializePackageContents();
		theMultidimensionalPackage.initializePackageContents();
		theCwmXmlPackage.initializePackageContents();
		theCwmTransformationPackage.initializePackageContents();
		theOlapPackage.initializePackageContents();
		theMiningCorePackage.initializePackageContents();
		theMiningDataPackage.initializePackageContents();
		theMiningFunctionSettingsPackage.initializePackageContents();
		theMiningModelPackage.initializePackageContents();
		theMiningResultPackage.initializePackageContents();
		theMiningTaskPackage.initializePackageContents();
		theEntryPointPackage.initializePackageContents();
		theClusteringPackage.initializePackageContents();
		theAssociationRulesPackage.initializePackageContents();
		theSupervisedPackage.initializePackageContents();
		theClassificationPackage.initializePackageContents();
		theApproximationPackage.initializePackageContents();
		theInformationVisualizationPackage.initializePackageContents();
		theBusinessNomenclaturePackage.initializePackageContents();
		theWarehouseProcessPackage.initializePackageContents();
		theDataTypePackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theWarehouseOperationPackage.initializePackageContents();
		theCWMCompletePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAttributeImportancePackage.freeze();

		return theAttributeImportancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeImportanceSettings() {
		return attributeImportanceSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeImportanceSettings_MaximumResultSize() {
		return (EAttribute)attributeImportanceSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeImportanceSettings_ReturnTop() {
		return (EAttribute)attributeImportanceSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeImportance_container() {
		return attributeImportance_containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeImportance_container_AttributeImportanceSettings() {
		return (EReference)attributeImportance_containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeImportanceFactory getAttributeImportanceFactory() {
		return (AttributeImportanceFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeImportanceSettingsEClass = createEClass(ATTRIBUTE_IMPORTANCE_SETTINGS);
		createEAttribute(attributeImportanceSettingsEClass, ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE);
		createEAttribute(attributeImportanceSettingsEClass, ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP);

		attributeImportance_containerEClass = createEClass(ATTRIBUTE_IMPORTANCE_CONTAINER);
		createEReference(attributeImportance_containerEClass, ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SupervisedPackage theSupervisedPackage = (SupervisedPackage)EPackage.Registry.INSTANCE.getEPackage(SupervisedPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeImportanceSettingsEClass.getESuperTypes().add(theSupervisedPackage.getSupervisedFunctionSettings());

		// Initialize classes and features; add operations and parameters
		initEClass(attributeImportanceSettingsEClass, AttributeImportanceSettings.class, "AttributeImportanceSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeImportanceSettings_MaximumResultSize(), theCorePackage.getInteger(), "maximumResultSize", null, 1, 1, AttributeImportanceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttributeImportanceSettings_ReturnTop(), theCorePackage.getBoolean(), "returnTop", null, 1, 1, AttributeImportanceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeImportance_containerEClass, AttributeImportance_container.class, "AttributeImportance_container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeImportance_container_AttributeImportanceSettings(), this.getAttributeImportanceSettings(), null, "AttributeImportanceSettings", null, 0, -1, AttributeImportance_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AttributeImportancePackageImpl

/**
 */
package istar.provider;


import istar.ISTAR;
import istar.IstarFactory;
import istar.IstarPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link istar.ISTAR} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ISTARItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTARItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addModelNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ISTAR_modelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ISTAR_modelName_feature", "_UI_ISTAR_type"),
				 IstarPackage.Literals.ISTAR__MODEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IstarPackage.Literals.ISTAR__HAS_NODE);
			childrenFeatures.add(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ISTAR.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ISTAR"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ISTAR)object).getModelName();
		return label == null || label.length() == 0 ?
			getString("_UI_ISTAR_type") :
			getString("_UI_ISTAR_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ISTAR.class)) {
			case IstarPackage.ISTAR__MODEL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IstarPackage.ISTAR__HAS_NODE:
			case IstarPackage.ISTAR__HAS_RELATIONSHIP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createSoftgoal()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_NODE,
				 IstarFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createISA()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createIsPartOf()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createPlays()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createCovers()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createOccupies()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createINS()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createMake()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createHelp()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createHurt()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createSomePlus()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createSomeMinus()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createUnknown()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createMeansEnd()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createDecompositionLink()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR__HAS_RELATIONSHIP,
				 IstarFactory.eINSTANCE.createDependencyLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IstarEditPlugin.INSTANCE;
	}

}

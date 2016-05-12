/*
 * 
 */
package istar.diagram.providers;

import istar.IstarPackage;
import istar.diagram.edit.parts.ActorEditPart;
import istar.diagram.edit.parts.AgentEditPart;
import istar.diagram.edit.parts.AndEditPart;
import istar.diagram.edit.parts.Belief2EditPart;
import istar.diagram.edit.parts.BeliefEditPart;
import istar.diagram.edit.parts.BreakEditPart;
import istar.diagram.edit.parts.CoversEditPart;
import istar.diagram.edit.parts.DecompositionLinkEditPart;
import istar.diagram.edit.parts.DependencyLinkEditPart;
import istar.diagram.edit.parts.Goal2EditPart;
import istar.diagram.edit.parts.GoalEditPart;
import istar.diagram.edit.parts.HelpEditPart;
import istar.diagram.edit.parts.HurtEditPart;
import istar.diagram.edit.parts.INSEditPart;
import istar.diagram.edit.parts.ISAEditPart;
import istar.diagram.edit.parts.ISTAREditPart;
import istar.diagram.edit.parts.IsPartOfEditPart;
import istar.diagram.edit.parts.MakeEditPart;
import istar.diagram.edit.parts.MeansEndEditPart;
import istar.diagram.edit.parts.OccupiesEditPart;
import istar.diagram.edit.parts.OrEditPart;
import istar.diagram.edit.parts.PlaysEditPart;
import istar.diagram.edit.parts.PositionEditPart;
import istar.diagram.edit.parts.Resource2EditPart;
import istar.diagram.edit.parts.ResourceEditPart;
import istar.diagram.edit.parts.RoleEditPart;
import istar.diagram.edit.parts.Softgoal2EditPart;
import istar.diagram.edit.parts.SoftgoalEditPart;
import istar.diagram.edit.parts.SomeMinusEditPart;
import istar.diagram.edit.parts.SomePlusEditPart;
import istar.diagram.edit.parts.Task2EditPart;
import istar.diagram.edit.parts.TaskEditPart;
import istar.diagram.edit.parts.UnknownEditPart;
import istar.diagram.part.IstarDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IstarElementTypes {

	/**
	 * @generated
	 */
	private IstarElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			IstarDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ISTAR_1000 = getElementType("iStarPrototype.diagram.ISTAR_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2011 = getElementType("iStarPrototype.diagram.Actor_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Agent_2012 = getElementType("iStarPrototype.diagram.Agent_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Position_2013 = getElementType("iStarPrototype.diagram.Position_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2014 = getElementType("iStarPrototype.diagram.Role_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2015 = getElementType("iStarPrototype.diagram.Goal_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Softgoal_2016 = getElementType("iStarPrototype.diagram.Softgoal_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Task_2017 = getElementType("iStarPrototype.diagram.Task_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_2018 = getElementType("iStarPrototype.diagram.Resource_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Belief_2019 = getElementType("iStarPrototype.diagram.Belief_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_3006 = getElementType("iStarPrototype.diagram.Goal_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Softgoal_3007 = getElementType("iStarPrototype.diagram.Softgoal_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Task_3008 = getElementType("iStarPrototype.diagram.Task_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_3009 = getElementType("iStarPrototype.diagram.Resource_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Belief_3010 = getElementType("iStarPrototype.diagram.Belief_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ISA_4019 = getElementType("iStarPrototype.diagram.ISA_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsPartOf_4020 = getElementType("iStarPrototype.diagram.IsPartOf_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plays_4021 = getElementType("iStarPrototype.diagram.Plays_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Covers_4022 = getElementType("iStarPrototype.diagram.Covers_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Occupies_4023 = getElementType("iStarPrototype.diagram.Occupies_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType INS_4024 = getElementType("iStarPrototype.diagram.INS_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Make_4025 = getElementType("iStarPrototype.diagram.Make_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Break_4026 = getElementType("iStarPrototype.diagram.Break_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Help_4027 = getElementType("iStarPrototype.diagram.Help_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Hurt_4028 = getElementType("iStarPrototype.diagram.Hurt_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SomePlus_4029 = getElementType("iStarPrototype.diagram.SomePlus_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SomeMinus_4030 = getElementType("iStarPrototype.diagram.SomeMinus_4030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType And_4031 = getElementType("iStarPrototype.diagram.And_4031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Or_4032 = getElementType("iStarPrototype.diagram.Or_4032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Unknown_4033 = getElementType("iStarPrototype.diagram.Unknown_4033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MeansEnd_4034 = getElementType("iStarPrototype.diagram.MeansEnd_4034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DecompositionLink_4035 = getElementType("iStarPrototype.diagram.DecompositionLink_4035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyLink_4036 = getElementType("iStarPrototype.diagram.DependencyLink_4036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ISTAR_1000, IstarPackage.eINSTANCE.getISTAR());

			elements.put(Actor_2011, IstarPackage.eINSTANCE.getActor());

			elements.put(Agent_2012, IstarPackage.eINSTANCE.getAgent());

			elements.put(Position_2013, IstarPackage.eINSTANCE.getPosition());

			elements.put(Role_2014, IstarPackage.eINSTANCE.getRole());

			elements.put(Goal_2015, IstarPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_2016, IstarPackage.eINSTANCE.getSoftgoal());

			elements.put(Task_2017, IstarPackage.eINSTANCE.getTask());

			elements.put(Resource_2018, IstarPackage.eINSTANCE.getResource());

			elements.put(Belief_2019, IstarPackage.eINSTANCE.getBelief());

			elements.put(Goal_3006, IstarPackage.eINSTANCE.getGoal());

			elements.put(Softgoal_3007, IstarPackage.eINSTANCE.getSoftgoal());

			elements.put(Task_3008, IstarPackage.eINSTANCE.getTask());

			elements.put(Resource_3009, IstarPackage.eINSTANCE.getResource());

			elements.put(Belief_3010, IstarPackage.eINSTANCE.getBelief());

			elements.put(ISA_4019, IstarPackage.eINSTANCE.getISA());

			elements.put(IsPartOf_4020, IstarPackage.eINSTANCE.getIsPartOf());

			elements.put(Plays_4021, IstarPackage.eINSTANCE.getPlays());

			elements.put(Covers_4022, IstarPackage.eINSTANCE.getCovers());

			elements.put(Occupies_4023, IstarPackage.eINSTANCE.getOccupies());

			elements.put(INS_4024, IstarPackage.eINSTANCE.getINS());

			elements.put(Make_4025, IstarPackage.eINSTANCE.getMake());

			elements.put(Break_4026, IstarPackage.eINSTANCE.getBreak());

			elements.put(Help_4027, IstarPackage.eINSTANCE.getHelp());

			elements.put(Hurt_4028, IstarPackage.eINSTANCE.getHurt());

			elements.put(SomePlus_4029, IstarPackage.eINSTANCE.getSomePlus());

			elements.put(SomeMinus_4030, IstarPackage.eINSTANCE.getSomeMinus());

			elements.put(And_4031, IstarPackage.eINSTANCE.getAnd());

			elements.put(Or_4032, IstarPackage.eINSTANCE.getOr());

			elements.put(Unknown_4033, IstarPackage.eINSTANCE.getUnknown());

			elements.put(MeansEnd_4034, IstarPackage.eINSTANCE.getMeansEnd());

			elements.put(DecompositionLink_4035,
					IstarPackage.eINSTANCE.getDecompositionLink());

			elements.put(DependencyLink_4036,
					IstarPackage.eINSTANCE.getDependencyLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ISTAR_1000);
			KNOWN_ELEMENT_TYPES.add(Actor_2011);
			KNOWN_ELEMENT_TYPES.add(Agent_2012);
			KNOWN_ELEMENT_TYPES.add(Position_2013);
			KNOWN_ELEMENT_TYPES.add(Role_2014);
			KNOWN_ELEMENT_TYPES.add(Goal_2015);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2016);
			KNOWN_ELEMENT_TYPES.add(Task_2017);
			KNOWN_ELEMENT_TYPES.add(Resource_2018);
			KNOWN_ELEMENT_TYPES.add(Belief_2019);
			KNOWN_ELEMENT_TYPES.add(Goal_3006);
			KNOWN_ELEMENT_TYPES.add(Softgoal_3007);
			KNOWN_ELEMENT_TYPES.add(Task_3008);
			KNOWN_ELEMENT_TYPES.add(Resource_3009);
			KNOWN_ELEMENT_TYPES.add(Belief_3010);
			KNOWN_ELEMENT_TYPES.add(ISA_4019);
			KNOWN_ELEMENT_TYPES.add(IsPartOf_4020);
			KNOWN_ELEMENT_TYPES.add(Plays_4021);
			KNOWN_ELEMENT_TYPES.add(Covers_4022);
			KNOWN_ELEMENT_TYPES.add(Occupies_4023);
			KNOWN_ELEMENT_TYPES.add(INS_4024);
			KNOWN_ELEMENT_TYPES.add(Make_4025);
			KNOWN_ELEMENT_TYPES.add(Break_4026);
			KNOWN_ELEMENT_TYPES.add(Help_4027);
			KNOWN_ELEMENT_TYPES.add(Hurt_4028);
			KNOWN_ELEMENT_TYPES.add(SomePlus_4029);
			KNOWN_ELEMENT_TYPES.add(SomeMinus_4030);
			KNOWN_ELEMENT_TYPES.add(And_4031);
			KNOWN_ELEMENT_TYPES.add(Or_4032);
			KNOWN_ELEMENT_TYPES.add(Unknown_4033);
			KNOWN_ELEMENT_TYPES.add(MeansEnd_4034);
			KNOWN_ELEMENT_TYPES.add(DecompositionLink_4035);
			KNOWN_ELEMENT_TYPES.add(DependencyLink_4036);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ISTAREditPart.VISUAL_ID:
			return ISTAR_1000;
		case ActorEditPart.VISUAL_ID:
			return Actor_2011;
		case AgentEditPart.VISUAL_ID:
			return Agent_2012;
		case PositionEditPart.VISUAL_ID:
			return Position_2013;
		case RoleEditPart.VISUAL_ID:
			return Role_2014;
		case GoalEditPart.VISUAL_ID:
			return Goal_2015;
		case SoftgoalEditPart.VISUAL_ID:
			return Softgoal_2016;
		case TaskEditPart.VISUAL_ID:
			return Task_2017;
		case ResourceEditPart.VISUAL_ID:
			return Resource_2018;
		case BeliefEditPart.VISUAL_ID:
			return Belief_2019;
		case Goal2EditPart.VISUAL_ID:
			return Goal_3006;
		case Softgoal2EditPart.VISUAL_ID:
			return Softgoal_3007;
		case Task2EditPart.VISUAL_ID:
			return Task_3008;
		case Resource2EditPart.VISUAL_ID:
			return Resource_3009;
		case Belief2EditPart.VISUAL_ID:
			return Belief_3010;
		case ISAEditPart.VISUAL_ID:
			return ISA_4019;
		case IsPartOfEditPart.VISUAL_ID:
			return IsPartOf_4020;
		case PlaysEditPart.VISUAL_ID:
			return Plays_4021;
		case CoversEditPart.VISUAL_ID:
			return Covers_4022;
		case OccupiesEditPart.VISUAL_ID:
			return Occupies_4023;
		case INSEditPart.VISUAL_ID:
			return INS_4024;
		case MakeEditPart.VISUAL_ID:
			return Make_4025;
		case BreakEditPart.VISUAL_ID:
			return Break_4026;
		case HelpEditPart.VISUAL_ID:
			return Help_4027;
		case HurtEditPart.VISUAL_ID:
			return Hurt_4028;
		case SomePlusEditPart.VISUAL_ID:
			return SomePlus_4029;
		case SomeMinusEditPart.VISUAL_ID:
			return SomeMinus_4030;
		case AndEditPart.VISUAL_ID:
			return And_4031;
		case OrEditPart.VISUAL_ID:
			return Or_4032;
		case UnknownEditPart.VISUAL_ID:
			return Unknown_4033;
		case MeansEndEditPart.VISUAL_ID:
			return MeansEnd_4034;
		case DecompositionLinkEditPart.VISUAL_ID:
			return DecompositionLink_4035;
		case DependencyLinkEditPart.VISUAL_ID:
			return DependencyLink_4036;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return istar.diagram.providers.IstarElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return istar.diagram.providers.IstarElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return istar.diagram.providers.IstarElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}

/*
 * 
 */
package istar.diagram.part;

import istar.IstarPackage;
import istar.diagram.edit.parts.ActorActorHasElementCompartmentEditPart;
import istar.diagram.edit.parts.ActorEditPart;
import istar.diagram.edit.parts.ActorNodeNameEditPart;
import istar.diagram.edit.parts.AgentAgentHasElementCompartmentEditPart;
import istar.diagram.edit.parts.AgentEditPart;
import istar.diagram.edit.parts.AgentNodeNameEditPart;
import istar.diagram.edit.parts.AndEditPart;
import istar.diagram.edit.parts.AndRelationshipNameEditPart;
import istar.diagram.edit.parts.Belief2EditPart;
import istar.diagram.edit.parts.BeliefEditPart;
import istar.diagram.edit.parts.BeliefNodeName2EditPart;
import istar.diagram.edit.parts.BeliefNodeNameEditPart;
import istar.diagram.edit.parts.BreakEditPart;
import istar.diagram.edit.parts.BreakRelationshipNameEditPart;
import istar.diagram.edit.parts.CoversEditPart;
import istar.diagram.edit.parts.CoversRelationshipNameEditPart;
import istar.diagram.edit.parts.DecompositionLinkEditPart;
import istar.diagram.edit.parts.DependencyLinkDependencyNameEditPart;
import istar.diagram.edit.parts.DependencyLinkEditPart;
import istar.diagram.edit.parts.Goal2EditPart;
import istar.diagram.edit.parts.GoalEditPart;
import istar.diagram.edit.parts.GoalNodeName2EditPart;
import istar.diagram.edit.parts.GoalNodeNameEditPart;
import istar.diagram.edit.parts.HelpEditPart;
import istar.diagram.edit.parts.HelpRelationshipNameEditPart;
import istar.diagram.edit.parts.HurtEditPart;
import istar.diagram.edit.parts.HurtRelationshipNameEditPart;
import istar.diagram.edit.parts.INSEditPart;
import istar.diagram.edit.parts.INSRelationshipNameEditPart;
import istar.diagram.edit.parts.ISAEditPart;
import istar.diagram.edit.parts.ISARelationshipNameEditPart;
import istar.diagram.edit.parts.ISTAREditPart;
import istar.diagram.edit.parts.IsPartOfEditPart;
import istar.diagram.edit.parts.IsPartOfRelationshipNameEditPart;
import istar.diagram.edit.parts.MakeEditPart;
import istar.diagram.edit.parts.MakeRelationshipNameEditPart;
import istar.diagram.edit.parts.MeansEndEditPart;
import istar.diagram.edit.parts.OccupiesEditPart;
import istar.diagram.edit.parts.OccupiesRelationshipNameEditPart;
import istar.diagram.edit.parts.OrEditPart;
import istar.diagram.edit.parts.OrRelationshipNameEditPart;
import istar.diagram.edit.parts.PlaysEditPart;
import istar.diagram.edit.parts.PlaysRelationshipNameEditPart;
import istar.diagram.edit.parts.PositionEditPart;
import istar.diagram.edit.parts.PositionNodeNameEditPart;
import istar.diagram.edit.parts.PositionPositionHasElementCompartmentEditPart;
import istar.diagram.edit.parts.Resource2EditPart;
import istar.diagram.edit.parts.ResourceEditPart;
import istar.diagram.edit.parts.ResourceNodeName2EditPart;
import istar.diagram.edit.parts.ResourceNodeNameEditPart;
import istar.diagram.edit.parts.RoleEditPart;
import istar.diagram.edit.parts.RoleNodeNameEditPart;
import istar.diagram.edit.parts.RoleRoleHasElementCompartmentEditPart;
import istar.diagram.edit.parts.Softgoal2EditPart;
import istar.diagram.edit.parts.SoftgoalEditPart;
import istar.diagram.edit.parts.SoftgoalNodeName2EditPart;
import istar.diagram.edit.parts.SoftgoalNodeNameEditPart;
import istar.diagram.edit.parts.SomeMinusEditPart;
import istar.diagram.edit.parts.SomeMinusRelationshipNameEditPart;
import istar.diagram.edit.parts.SomePlusEditPart;
import istar.diagram.edit.parts.SomePlusRelationshipNameEditPart;
import istar.diagram.edit.parts.Task2EditPart;
import istar.diagram.edit.parts.TaskEditPart;
import istar.diagram.edit.parts.TaskNodeName2EditPart;
import istar.diagram.edit.parts.TaskNodeNameEditPart;
import istar.diagram.edit.parts.UnknownEditPart;
import istar.diagram.edit.parts.UnknownRelationshipNameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class IstarVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "iStarPrototype.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ISTAREditPart.MODEL_ID.equals(view.getType())) {
				return ISTAREditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return istar.diagram.part.IstarVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (IstarPackage.eINSTANCE.getISTAR().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((istar.ISTAR) domainElement)) {
			return ISTAREditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = istar.diagram.part.IstarVisualIDRegistry
				.getModelID(containerView);
		if (!ISTAREditPart.MODEL_ID.equals(containerModelID)
				&& !"istar".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ISTAREditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = istar.diagram.part.IstarVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ISTAREditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ISTAREditPart.VISUAL_ID:
			if (IstarPackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getAgent().isSuperTypeOf(
					domainElement.eClass())) {
				return AgentEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getPosition().isSuperTypeOf(
					domainElement.eClass())) {
				return PositionEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return GoalEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())) {
				return SoftgoalEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())) {
				return TaskEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return ResourceEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getBelief().isSuperTypeOf(
					domainElement.eClass())) {
				return BeliefEditPart.VISUAL_ID;
			}
			break;
		case ActorActorHasElementCompartmentEditPart.VISUAL_ID:
			if (IstarPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Goal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Softgoal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())) {
				return Task2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return Resource2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getBelief().isSuperTypeOf(
					domainElement.eClass())) {
				return Belief2EditPart.VISUAL_ID;
			}
			break;
		case AgentAgentHasElementCompartmentEditPart.VISUAL_ID:
			if (IstarPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Goal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Softgoal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())) {
				return Task2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return Resource2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getBelief().isSuperTypeOf(
					domainElement.eClass())) {
				return Belief2EditPart.VISUAL_ID;
			}
			break;
		case PositionPositionHasElementCompartmentEditPart.VISUAL_ID:
			if (IstarPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Goal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Softgoal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())) {
				return Task2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return Resource2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getBelief().isSuperTypeOf(
					domainElement.eClass())) {
				return Belief2EditPart.VISUAL_ID;
			}
			break;
		case RoleRoleHasElementCompartmentEditPart.VISUAL_ID:
			if (IstarPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Goal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getSoftgoal().isSuperTypeOf(
					domainElement.eClass())) {
				return Softgoal2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getTask().isSuperTypeOf(
					domainElement.eClass())) {
				return Task2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return Resource2EditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getBelief().isSuperTypeOf(
					domainElement.eClass())) {
				return Belief2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = istar.diagram.part.IstarVisualIDRegistry
				.getModelID(containerView);
		if (!ISTAREditPart.MODEL_ID.equals(containerModelID)
				&& !"istar".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ISTAREditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = istar.diagram.part.IstarVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ISTAREditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ISTAREditPart.VISUAL_ID:
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PositionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoftgoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BeliefEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorActorHasElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgentEditPart.VISUAL_ID:
			if (AgentNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgentAgentHasElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PositionEditPart.VISUAL_ID:
			if (PositionNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PositionPositionHasElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleRoleHasElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalEditPart.VISUAL_ID:
			if (GoalNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SoftgoalEditPart.VISUAL_ID:
			if (SoftgoalNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TaskEditPart.VISUAL_ID:
			if (TaskNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ResourceEditPart.VISUAL_ID:
			if (ResourceNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BeliefEditPart.VISUAL_ID:
			if (BeliefNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Goal2EditPart.VISUAL_ID:
			if (GoalNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Softgoal2EditPart.VISUAL_ID:
			if (SoftgoalNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Task2EditPart.VISUAL_ID:
			if (TaskNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Resource2EditPart.VISUAL_ID:
			if (ResourceNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Belief2EditPart.VISUAL_ID:
			if (BeliefNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorActorHasElementCompartmentEditPart.VISUAL_ID:
			if (Goal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Belief2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgentAgentHasElementCompartmentEditPart.VISUAL_ID:
			if (Goal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Belief2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PositionPositionHasElementCompartmentEditPart.VISUAL_ID:
			if (Goal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Belief2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleRoleHasElementCompartmentEditPart.VISUAL_ID:
			if (Goal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Softgoal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Task2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Belief2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ISAEditPart.VISUAL_ID:
			if (ISARelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IsPartOfEditPart.VISUAL_ID:
			if (IsPartOfRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlaysEditPart.VISUAL_ID:
			if (PlaysRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoversEditPart.VISUAL_ID:
			if (CoversRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OccupiesEditPart.VISUAL_ID:
			if (OccupiesRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case INSEditPart.VISUAL_ID:
			if (INSRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MakeEditPart.VISUAL_ID:
			if (MakeRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BreakEditPart.VISUAL_ID:
			if (BreakRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HelpEditPart.VISUAL_ID:
			if (HelpRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HurtEditPart.VISUAL_ID:
			if (HurtRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SomePlusEditPart.VISUAL_ID:
			if (SomePlusRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SomeMinusEditPart.VISUAL_ID:
			if (SomeMinusRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AndEditPart.VISUAL_ID:
			if (AndRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OrEditPart.VISUAL_ID:
			if (OrRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnknownEditPart.VISUAL_ID:
			if (UnknownRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyLinkEditPart.VISUAL_ID:
			if (DependencyLinkDependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (IstarPackage.eINSTANCE.getISA().isSuperTypeOf(
				domainElement.eClass())) {
			return ISAEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getIsPartOf().isSuperTypeOf(
				domainElement.eClass())) {
			return IsPartOfEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getPlays().isSuperTypeOf(
				domainElement.eClass())) {
			return PlaysEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getCovers().isSuperTypeOf(
				domainElement.eClass())) {
			return CoversEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getOccupies().isSuperTypeOf(
				domainElement.eClass())) {
			return OccupiesEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getINS().isSuperTypeOf(
				domainElement.eClass())) {
			return INSEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getMake().isSuperTypeOf(
				domainElement.eClass())) {
			return MakeEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getBreak().isSuperTypeOf(
				domainElement.eClass())) {
			return BreakEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getHelp().isSuperTypeOf(
				domainElement.eClass())) {
			return HelpEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getHurt().isSuperTypeOf(
				domainElement.eClass())) {
			return HurtEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getSomePlus().isSuperTypeOf(
				domainElement.eClass())) {
			return SomePlusEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getSomeMinus().isSuperTypeOf(
				domainElement.eClass())) {
			return SomeMinusEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getAnd().isSuperTypeOf(
				domainElement.eClass())) {
			return AndEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getOr()
				.isSuperTypeOf(domainElement.eClass())) {
			return OrEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getUnknown().isSuperTypeOf(
				domainElement.eClass())) {
			return UnknownEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getMeansEnd().isSuperTypeOf(
				domainElement.eClass())) {
			return MeansEndEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getDecompositionLink().isSuperTypeOf(
				domainElement.eClass())) {
			return DecompositionLinkEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getDependencyLink().isSuperTypeOf(
				domainElement.eClass())) {
			return DependencyLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(istar.ISTAR element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ActorActorHasElementCompartmentEditPart.VISUAL_ID:
		case AgentAgentHasElementCompartmentEditPart.VISUAL_ID:
		case PositionPositionHasElementCompartmentEditPart.VISUAL_ID:
		case RoleRoleHasElementCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ISTAREditPart.VISUAL_ID:
			return false;
		case GoalEditPart.VISUAL_ID:
		case SoftgoalEditPart.VISUAL_ID:
		case TaskEditPart.VISUAL_ID:
		case ResourceEditPart.VISUAL_ID:
		case BeliefEditPart.VISUAL_ID:
		case Goal2EditPart.VISUAL_ID:
		case Softgoal2EditPart.VISUAL_ID:
		case Task2EditPart.VISUAL_ID:
		case Resource2EditPart.VISUAL_ID:
		case Belief2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return istar.diagram.part.IstarVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return istar.diagram.part.IstarVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return istar.diagram.part.IstarVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return istar.diagram.part.IstarVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return istar.diagram.part.IstarVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return istar.diagram.part.IstarVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}

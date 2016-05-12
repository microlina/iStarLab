/*
 * 
 */
package istar.diagram.edit.parts;

import istar.diagram.part.IstarVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class IstarEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (IstarVisualIDRegistry.getVisualID(view)) {

			case ISTAREditPart.VISUAL_ID:
				return new ISTAREditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNodeNameEditPart.VISUAL_ID:
				return new ActorNodeNameEditPart(view);

			case AgentEditPart.VISUAL_ID:
				return new AgentEditPart(view);

			case AgentNodeNameEditPart.VISUAL_ID:
				return new AgentNodeNameEditPart(view);

			case PositionEditPart.VISUAL_ID:
				return new PositionEditPart(view);

			case PositionNodeNameEditPart.VISUAL_ID:
				return new PositionNodeNameEditPart(view);

			case RoleEditPart.VISUAL_ID:
				return new RoleEditPart(view);

			case RoleNodeNameEditPart.VISUAL_ID:
				return new RoleNodeNameEditPart(view);

			case GoalEditPart.VISUAL_ID:
				return new GoalEditPart(view);

			case GoalNodeNameEditPart.VISUAL_ID:
				return new GoalNodeNameEditPart(view);

			case SoftgoalEditPart.VISUAL_ID:
				return new SoftgoalEditPart(view);

			case SoftgoalNodeNameEditPart.VISUAL_ID:
				return new SoftgoalNodeNameEditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case TaskNodeNameEditPart.VISUAL_ID:
				return new TaskNodeNameEditPart(view);

			case ResourceEditPart.VISUAL_ID:
				return new ResourceEditPart(view);

			case ResourceNodeNameEditPart.VISUAL_ID:
				return new ResourceNodeNameEditPart(view);

			case BeliefEditPart.VISUAL_ID:
				return new BeliefEditPart(view);

			case BeliefNodeNameEditPart.VISUAL_ID:
				return new BeliefNodeNameEditPart(view);

			case Goal2EditPart.VISUAL_ID:
				return new Goal2EditPart(view);

			case GoalNodeName2EditPart.VISUAL_ID:
				return new GoalNodeName2EditPart(view);

			case Softgoal2EditPart.VISUAL_ID:
				return new Softgoal2EditPart(view);

			case SoftgoalNodeName2EditPart.VISUAL_ID:
				return new SoftgoalNodeName2EditPart(view);

			case Task2EditPart.VISUAL_ID:
				return new Task2EditPart(view);

			case TaskNodeName2EditPart.VISUAL_ID:
				return new TaskNodeName2EditPart(view);

			case Resource2EditPart.VISUAL_ID:
				return new Resource2EditPart(view);

			case ResourceNodeName2EditPart.VISUAL_ID:
				return new ResourceNodeName2EditPart(view);

			case Belief2EditPart.VISUAL_ID:
				return new Belief2EditPart(view);

			case BeliefNodeName2EditPart.VISUAL_ID:
				return new BeliefNodeName2EditPart(view);

			case ActorActorHasElementCompartmentEditPart.VISUAL_ID:
				return new ActorActorHasElementCompartmentEditPart(view);

			case AgentAgentHasElementCompartmentEditPart.VISUAL_ID:
				return new AgentAgentHasElementCompartmentEditPart(view);

			case PositionPositionHasElementCompartmentEditPart.VISUAL_ID:
				return new PositionPositionHasElementCompartmentEditPart(view);

			case RoleRoleHasElementCompartmentEditPart.VISUAL_ID:
				return new RoleRoleHasElementCompartmentEditPart(view);

			case ISAEditPart.VISUAL_ID:
				return new ISAEditPart(view);

			case ISARelationshipNameEditPart.VISUAL_ID:
				return new ISARelationshipNameEditPart(view);

			case IsPartOfEditPart.VISUAL_ID:
				return new IsPartOfEditPart(view);

			case IsPartOfRelationshipNameEditPart.VISUAL_ID:
				return new IsPartOfRelationshipNameEditPart(view);

			case PlaysEditPart.VISUAL_ID:
				return new PlaysEditPart(view);

			case PlaysRelationshipNameEditPart.VISUAL_ID:
				return new PlaysRelationshipNameEditPart(view);

			case CoversEditPart.VISUAL_ID:
				return new CoversEditPart(view);

			case CoversRelationshipNameEditPart.VISUAL_ID:
				return new CoversRelationshipNameEditPart(view);

			case OccupiesEditPart.VISUAL_ID:
				return new OccupiesEditPart(view);

			case OccupiesRelationshipNameEditPart.VISUAL_ID:
				return new OccupiesRelationshipNameEditPart(view);

			case INSEditPart.VISUAL_ID:
				return new INSEditPart(view);

			case INSRelationshipNameEditPart.VISUAL_ID:
				return new INSRelationshipNameEditPart(view);

			case MakeEditPart.VISUAL_ID:
				return new MakeEditPart(view);

			case MakeRelationshipNameEditPart.VISUAL_ID:
				return new MakeRelationshipNameEditPart(view);

			case BreakEditPart.VISUAL_ID:
				return new BreakEditPart(view);

			case BreakRelationshipNameEditPart.VISUAL_ID:
				return new BreakRelationshipNameEditPart(view);

			case HelpEditPart.VISUAL_ID:
				return new HelpEditPart(view);

			case HelpRelationshipNameEditPart.VISUAL_ID:
				return new HelpRelationshipNameEditPart(view);

			case HurtEditPart.VISUAL_ID:
				return new HurtEditPart(view);

			case HurtRelationshipNameEditPart.VISUAL_ID:
				return new HurtRelationshipNameEditPart(view);

			case SomePlusEditPart.VISUAL_ID:
				return new SomePlusEditPart(view);

			case SomePlusRelationshipNameEditPart.VISUAL_ID:
				return new SomePlusRelationshipNameEditPart(view);

			case SomeMinusEditPart.VISUAL_ID:
				return new SomeMinusEditPart(view);

			case SomeMinusRelationshipNameEditPart.VISUAL_ID:
				return new SomeMinusRelationshipNameEditPart(view);

			case AndEditPart.VISUAL_ID:
				return new AndEditPart(view);

			case AndRelationshipNameEditPart.VISUAL_ID:
				return new AndRelationshipNameEditPart(view);

			case OrEditPart.VISUAL_ID:
				return new OrEditPart(view);

			case OrRelationshipNameEditPart.VISUAL_ID:
				return new OrRelationshipNameEditPart(view);

			case UnknownEditPart.VISUAL_ID:
				return new UnknownEditPart(view);

			case UnknownRelationshipNameEditPart.VISUAL_ID:
				return new UnknownRelationshipNameEditPart(view);

			case MeansEndEditPart.VISUAL_ID:
				return new MeansEndEditPart(view);

			case DecompositionLinkEditPart.VISUAL_ID:
				return new DecompositionLinkEditPart(view);

			case DependencyLinkEditPart.VISUAL_ID:
				return new DependencyLinkEditPart(view);

			case DependencyLinkDependencyNameEditPart.VISUAL_ID:
				return new DependencyLinkDependencyNameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}

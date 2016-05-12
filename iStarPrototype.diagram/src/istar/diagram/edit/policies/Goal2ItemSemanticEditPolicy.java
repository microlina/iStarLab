/*
 * 
 */
package istar.diagram.edit.policies;

import istar.diagram.edit.commands.AndCreateCommand;
import istar.diagram.edit.commands.AndReorientCommand;
import istar.diagram.edit.commands.BreakCreateCommand;
import istar.diagram.edit.commands.BreakReorientCommand;
import istar.diagram.edit.commands.DecompositionLinkCreateCommand;
import istar.diagram.edit.commands.DecompositionLinkReorientCommand;
import istar.diagram.edit.commands.DependencyLinkCreateCommand;
import istar.diagram.edit.commands.DependencyLinkReorientCommand;
import istar.diagram.edit.commands.HelpCreateCommand;
import istar.diagram.edit.commands.HelpReorientCommand;
import istar.diagram.edit.commands.HurtCreateCommand;
import istar.diagram.edit.commands.HurtReorientCommand;
import istar.diagram.edit.commands.MakeCreateCommand;
import istar.diagram.edit.commands.MakeReorientCommand;
import istar.diagram.edit.commands.MeansEndCreateCommand;
import istar.diagram.edit.commands.MeansEndReorientCommand;
import istar.diagram.edit.commands.OrCreateCommand;
import istar.diagram.edit.commands.OrReorientCommand;
import istar.diagram.edit.commands.SomeMinusCreateCommand;
import istar.diagram.edit.commands.SomeMinusReorientCommand;
import istar.diagram.edit.commands.SomePlusCreateCommand;
import istar.diagram.edit.commands.SomePlusReorientCommand;
import istar.diagram.edit.commands.UnknownCreateCommand;
import istar.diagram.edit.commands.UnknownReorientCommand;
import istar.diagram.edit.parts.AndEditPart;
import istar.diagram.edit.parts.BreakEditPart;
import istar.diagram.edit.parts.DecompositionLinkEditPart;
import istar.diagram.edit.parts.DependencyLinkEditPart;
import istar.diagram.edit.parts.HelpEditPart;
import istar.diagram.edit.parts.HurtEditPart;
import istar.diagram.edit.parts.MakeEditPart;
import istar.diagram.edit.parts.MeansEndEditPart;
import istar.diagram.edit.parts.OrEditPart;
import istar.diagram.edit.parts.SomeMinusEditPart;
import istar.diagram.edit.parts.SomePlusEditPart;
import istar.diagram.edit.parts.UnknownEditPart;
import istar.diagram.part.IstarVisualIDRegistry;
import istar.diagram.providers.IstarElementTypes;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Goal2ItemSemanticEditPolicy extends
		IstarBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Goal2ItemSemanticEditPolicy() {
		super(IstarElementTypes.Goal_3006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (IstarVisualIDRegistry.getVisualID(incomingLink) == MeansEndEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(incomingLink) == DecompositionLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(incomingLink) == DependencyLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == MakeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == BreakEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == HelpEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == HurtEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == SomePlusEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == SomeMinusEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == AndEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == OrEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == UnknownEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == DependencyLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IstarElementTypes.Make_4025 == req.getElementType()) {
			return getGEFWrapper(new MakeCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (IstarElementTypes.Break_4026 == req.getElementType()) {
			return getGEFWrapper(new BreakCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (IstarElementTypes.Help_4027 == req.getElementType()) {
			return getGEFWrapper(new HelpCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (IstarElementTypes.Hurt_4028 == req.getElementType()) {
			return getGEFWrapper(new HurtCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (IstarElementTypes.SomePlus_4029 == req.getElementType()) {
			return getGEFWrapper(new SomePlusCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.SomeMinus_4030 == req.getElementType()) {
			return getGEFWrapper(new SomeMinusCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.And_4031 == req.getElementType()) {
			return getGEFWrapper(new AndCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (IstarElementTypes.Or_4032 == req.getElementType()) {
			return getGEFWrapper(new OrCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (IstarElementTypes.Unknown_4033 == req.getElementType()) {
			return getGEFWrapper(new UnknownCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (IstarElementTypes.MeansEnd_4034 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.DecompositionLink_4035 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.DependencyLink_4036 == req.getElementType()) {
			return getGEFWrapper(new DependencyLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IstarElementTypes.Make_4025 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.Break_4026 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.Help_4027 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.Hurt_4028 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.SomePlus_4029 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.SomeMinus_4030 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.And_4031 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.Or_4032 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.Unknown_4033 == req.getElementType()) {
			return null;
		}
		if (IstarElementTypes.MeansEnd_4034 == req.getElementType()) {
			return getGEFWrapper(new MeansEndCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.DecompositionLink_4035 == req.getElementType()) {
			return getGEFWrapper(new DecompositionLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.DependencyLink_4036 == req.getElementType()) {
			return getGEFWrapper(new DependencyLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MakeEditPart.VISUAL_ID:
			return getGEFWrapper(new MakeReorientCommand(req));
		case BreakEditPart.VISUAL_ID:
			return getGEFWrapper(new BreakReorientCommand(req));
		case HelpEditPart.VISUAL_ID:
			return getGEFWrapper(new HelpReorientCommand(req));
		case HurtEditPart.VISUAL_ID:
			return getGEFWrapper(new HurtReorientCommand(req));
		case SomePlusEditPart.VISUAL_ID:
			return getGEFWrapper(new SomePlusReorientCommand(req));
		case SomeMinusEditPart.VISUAL_ID:
			return getGEFWrapper(new SomeMinusReorientCommand(req));
		case AndEditPart.VISUAL_ID:
			return getGEFWrapper(new AndReorientCommand(req));
		case OrEditPart.VISUAL_ID:
			return getGEFWrapper(new OrReorientCommand(req));
		case UnknownEditPart.VISUAL_ID:
			return getGEFWrapper(new UnknownReorientCommand(req));
		case MeansEndEditPart.VISUAL_ID:
			return getGEFWrapper(new MeansEndReorientCommand(req));
		case DecompositionLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new DecompositionLinkReorientCommand(req));
		case DependencyLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}

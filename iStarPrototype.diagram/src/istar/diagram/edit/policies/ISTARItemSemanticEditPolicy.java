/*
 * 
 */
package istar.diagram.edit.policies;

import istar.diagram.edit.commands.ActorCreateCommand;
import istar.diagram.edit.commands.AgentCreateCommand;
import istar.diagram.edit.commands.BeliefCreateCommand;
import istar.diagram.edit.commands.GoalCreateCommand;
import istar.diagram.edit.commands.PositionCreateCommand;
import istar.diagram.edit.commands.ResourceCreateCommand;
import istar.diagram.edit.commands.RoleCreateCommand;
import istar.diagram.edit.commands.SoftgoalCreateCommand;
import istar.diagram.edit.commands.TaskCreateCommand;
import istar.diagram.providers.IstarElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ISTARItemSemanticEditPolicy extends
		IstarBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ISTARItemSemanticEditPolicy() {
		super(IstarElementTypes.ISTAR_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (IstarElementTypes.Actor_2011 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (IstarElementTypes.Agent_2012 == req.getElementType()) {
			return getGEFWrapper(new AgentCreateCommand(req));
		}
		if (IstarElementTypes.Position_2013 == req.getElementType()) {
			return getGEFWrapper(new PositionCreateCommand(req));
		}
		if (IstarElementTypes.Role_2014 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (IstarElementTypes.Goal_2015 == req.getElementType()) {
			return getGEFWrapper(new GoalCreateCommand(req));
		}
		if (IstarElementTypes.Softgoal_2016 == req.getElementType()) {
			return getGEFWrapper(new SoftgoalCreateCommand(req));
		}
		if (IstarElementTypes.Task_2017 == req.getElementType()) {
			return getGEFWrapper(new TaskCreateCommand(req));
		}
		if (IstarElementTypes.Resource_2018 == req.getElementType()) {
			return getGEFWrapper(new ResourceCreateCommand(req));
		}
		if (IstarElementTypes.Belief_2019 == req.getElementType()) {
			return getGEFWrapper(new BeliefCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}

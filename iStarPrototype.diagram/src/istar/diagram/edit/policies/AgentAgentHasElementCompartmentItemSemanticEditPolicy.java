/*
 * 
 */
package istar.diagram.edit.policies;

import istar.diagram.edit.commands.Belief2CreateCommand;
import istar.diagram.edit.commands.Goal2CreateCommand;
import istar.diagram.edit.commands.Resource2CreateCommand;
import istar.diagram.edit.commands.Softgoal2CreateCommand;
import istar.diagram.edit.commands.Task2CreateCommand;
import istar.diagram.providers.IstarElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AgentAgentHasElementCompartmentItemSemanticEditPolicy extends
		IstarBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AgentAgentHasElementCompartmentItemSemanticEditPolicy() {
		super(IstarElementTypes.Agent_2012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (IstarElementTypes.Goal_3006 == req.getElementType()) {
			return getGEFWrapper(new Goal2CreateCommand(req));
		}
		if (IstarElementTypes.Softgoal_3007 == req.getElementType()) {
			return getGEFWrapper(new Softgoal2CreateCommand(req));
		}
		if (IstarElementTypes.Task_3008 == req.getElementType()) {
			return getGEFWrapper(new Task2CreateCommand(req));
		}
		if (IstarElementTypes.Resource_3009 == req.getElementType()) {
			return getGEFWrapper(new Resource2CreateCommand(req));
		}
		if (IstarElementTypes.Belief_3010 == req.getElementType()) {
			return getGEFWrapper(new Belief2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
